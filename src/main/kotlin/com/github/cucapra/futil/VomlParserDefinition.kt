package com.github.cucapra.futil

import com.github.cucapra.language._VomlLexer
import com.github.cucapra.language.parser.VomlParser
import com.github.cucapra.language.psi.VomlTypes
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.FlexAdapter
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet


class VomlLexerAdapter : FlexAdapter(_VomlLexer())


class VomlParserDefinition : ParserDefinition {
    override fun createLexer(project: Project): Lexer = com.github.cucapra.futil.VomlLexerAdapter()

    override fun createParser(project: Project): PsiParser = VomlParser()

    override fun getFileNodeType(): IFileElementType = com.github.cucapra.futil.VomlParserDefinition.Companion.FILE

    override fun getCommentTokens(): TokenSet = com.github.cucapra.futil.VomlParserDefinition.Companion.COMMENTS

    override fun getStringLiteralElements(): TokenSet =
        com.github.cucapra.futil.VomlParserDefinition.Companion.STRING_LITERALS

    override fun createElement(node: ASTNode): PsiElement = VomlTypes.Factory.createElement(node)

    override fun createFile(viewProvider: FileViewProvider): PsiFile =
        com.github.cucapra.futil.VomlFile(viewProvider)

    override fun spaceExistenceTypeBetweenTokens(left: ASTNode, right: ASTNode): ParserDefinition.SpaceRequirements =
        ParserDefinition.SpaceRequirements.MAY

    companion object {
        val COMMENTS = TokenSet.create(VomlTypes.COMMENT, VomlTypes.BLOCK_COMMENT)
        val STRING_LITERALS = TokenSet.create(VomlTypes.STRING_INLINE, VomlTypes.STRING_PREFIX, VomlTypes.STRING_MULTI)
        val FILE = IFileElementType(com.github.cucapra.futil.VomlLanguage.Companion.INSTANCE)
    }
}
