package com.github.cucapra.ide.folding

import com.github.cucapra.futil.psi.*
import com.intellij.lang.folding.FoldingDescriptor
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement

class FoldingVisitor(private val descriptors: MutableList<FoldingDescriptor>) : FutilRecursiveVisitor() {
    override fun visitBrace(o: FutilBrace) {
        fold(o, o.firstChild.endOffset, o.lastChild.startOffset)
    }

    override fun visitParenthesis(o: FutilParenthesis) {
        fold(o, o.firstChild.endOffset, o.lastChild.startOffset)
    }


    private fun fold(element: PsiElement) {
        descriptors += FoldingDescriptor(element.node, element.textRange)
    }

    private fun fold(element: PsiElement, range: TextRange) {
        descriptors += FoldingDescriptor(element.node, range)
    }

    private fun fold(element: PsiElement, start: Int, end: Int) {
        if (start < end) {
            descriptors += FoldingDescriptor(element.node, TextRange.create(start, end))
        }
    }
}
