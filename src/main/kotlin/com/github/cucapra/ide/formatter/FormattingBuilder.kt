package com.github.cucapra.ide.formatter

import com.intellij.formatting.*
import com.intellij.lang.ASTNode
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiFile

class FormattingBuilder : FormattingModelBuilder {
    override fun getRangeAffectingIndent(
        file: PsiFile?,
        offset: Int,
        elementAtOffset: ASTNode?
    ): TextRange? = null

    override fun createModel(
        formattingContext: FormattingContext
    ): FormattingModel {
        val settings = formattingContext.codeStyleSettings
        val element = formattingContext.psiElement
        val ctx = FormatterContext.create(settings)
        val block = createBlock(element.node, null, Indent.getNoneIndent(), null, ctx)
        return FormattingModelProvider.createFormattingModelForPsiFile(element.containingFile, block, settings)
    }

    companion object {
        fun createBlock(
            node: ASTNode,
            alignment: Alignment?,
            indent: Indent?,
            wrap: Wrap?,
            ctx: FormatterContext
        ): ASTBlock {
            return FormatterBlock(node, alignment, indent, wrap, ctx)
        }
    }
}
