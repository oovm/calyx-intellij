package com.github.cucapra.ide.highlight

import com.github.cucapra.futil.psi.FutilLexerAdapter
import com.github.cucapra.futil.psi.FutilTypes.*
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType

class TokenHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer = FutilLexerAdapter()

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        return pack(getTokenColor(tokenType)?.textAttributesKey)
    }

    private fun getTokenColor(tokenType: IElementType): CalyxColor? {
        return when (tokenType) {
            //
            IMPORT, AS -> CalyxColor.KEYWORD
            ANNOTATION, ANNOTATION_MARK -> CalyxColor.ANNOTATION
            //
            STRING_PREFIX -> CalyxColor.STRING_HINT
            NUMBER_SUFFIX -> CalyxColor.NUMBER_HINT
            TYPE_HINT -> CalyxColor.TYPE_HINT
            ANGLE_L, ANGLE_R, ACCENT -> CalyxColor.SYM_VARIABLE
            //
            PARENTHESIS_L, PARENTHESIS_R -> CalyxColor.PARENTHESES
            BRACKET_L, BRACKET_R -> CalyxColor.BRACKETS
            BRACE_L, BRACE_R -> CalyxColor.BRACES
            COLON, EQ -> CalyxColor.SET
            COMMA -> CalyxColor.COMMA
            // atom
            NULL -> CalyxColor.NULL
            BOOLEAN -> CalyxColor.BOOLEAN

            NUMBER_SUFFIX -> CalyxColor.NUMBER_HINT
            INTEGER -> CalyxColor.INTEGER
            DECIMAL, DECIMAL_BAD -> CalyxColor.DECIMAL

            STRING_PREFIX -> CalyxColor.STRING_HINT
            STRING, STRING_INLINE, STRING_MULTI -> CalyxColor.STRING
            // 注释
            COMMENT -> CalyxColor.LINE_COMMENT
            BLOCK_COMMENT -> CalyxColor.BLOCK_COMMENT
            // 错误
            TokenType.BAD_CHARACTER -> CalyxColor.BAD_CHARACTER
            else -> null
        }
    }
}
