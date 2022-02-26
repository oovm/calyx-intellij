package com.github.cucapra.ide.todo

import com.github.cucapra.futil.psi.FutilLexerAdapter
import com.github.cucapra.futil.file.FutilFileNode
import com.github.cucapra.futil.psi.FutilParserDefinition
import com.intellij.lexer.Lexer
import com.intellij.psi.PsiFile
import com.intellij.psi.impl.search.IndexPatternBuilder
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet

class VomlTodoIndexPatternBuilder : IndexPatternBuilder {
    override fun getIndexingLexer(file: PsiFile): Lexer? =
        if (file is FutilFileNode) FutilLexerAdapter() else null

    override fun getCommentTokenSet(file: PsiFile): TokenSet? {
        return if (file is FutilFileNode) FutilParserDefinition.commentTokens else null
    }

    override fun getCommentStartDelta(tokenType: IElementType?): Int {
        return if (tokenType in FutilParserDefinition.commentTokens) 2 else 0
    }

    override fun getCommentEndDelta(tokenType: IElementType?): Int = 0
}
