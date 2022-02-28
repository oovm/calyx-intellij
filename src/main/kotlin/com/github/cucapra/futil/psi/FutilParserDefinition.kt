package com.github.cucapra.futil.psi

import com.github.cucapra.futil.FutilLanguage
import com.github.cucapra.futil.file.FutilFileNode
import com.github.cucapra.futil.parser.FutilParser
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet


object FutilParserDefinition : ParserDefinition {
    override fun createLexer(project: Project): Lexer = FutilLexerAdapter()

    override fun createParser(project: Project): PsiParser = FutilParser()

    override fun getFileNodeType(): IFileElementType = IFileElementType(FutilLanguage)

    override fun getCommentTokens(): TokenSet = TokenSet.create(FutilTypes.COMMENT, FutilTypes.BLOCK_COMMENT)

    override fun getStringLiteralElements(): TokenSet = TokenSet.create()

    override fun getWhitespaceTokens(): TokenSet = TokenSet.create(TokenType.WHITE_SPACE)

    override fun createElement(node: ASTNode): PsiElement = FutilTypes.Factory.createElement(node)

    override fun createFile(viewProvider: FileViewProvider): PsiFile = FutilFileNode(viewProvider)

    override fun spaceExistenceTypeBetweenTokens(left: ASTNode, right: ASTNode): ParserDefinition.SpaceRequirements {
        return ParserDefinition.SpaceRequirements.MAY
    }
}
