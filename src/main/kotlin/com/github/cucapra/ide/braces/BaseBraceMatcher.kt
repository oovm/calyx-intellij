package com.github.cucapra.ide.braces

import com.github.cucapra.futil.psi.FutilParserDefinition
import com.github.cucapra.futil.psi.FutilTypes
import com.github.cucapra.futil.psi.tokenSetOf
import com.intellij.lang.BracePair
import com.intellij.lang.PairedBraceMatcher
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet

class BaseBraceMatcher : PairedBraceMatcher {
    override fun getPairs(): Array<BracePair> = PAIRS

    override fun isPairedBracesAllowedBeforeType(lbraceType: IElementType, next: IElementType?): Boolean =
        next in InsertPairBraceBefore

    override fun getCodeConstructStart(file: PsiFile?, openingBraceOffset: Int): Int = openingBraceOffset

    companion object {
        private val PAIRS = arrayOf(
            BracePair(FutilTypes.BRACE_L, FutilTypes.BRACE_R, true),
            BracePair(FutilTypes.BRACKET_L, FutilTypes.BRACKET_R, true),
            BracePair(FutilTypes.PARENTHESIS_L, FutilTypes.PARENTHESIS_R, true),
        )

        private val InsertPairBraceBefore = TokenSet.orSet(
            FutilParserDefinition.commentTokens,
            tokenSetOf(
                TokenType.WHITE_SPACE,
                FutilTypes.COMMA,
                FutilTypes.PARENTHESIS_R,
                FutilTypes.BRACKET_R,
                FutilTypes.BRACE_R,
                FutilTypes.BRACE_L
            )
        )
    }
}
