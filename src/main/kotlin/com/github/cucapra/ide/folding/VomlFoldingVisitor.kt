package com.github.cucapra.ide.folding

import com.github.cucapra.futil.psi.FutilRecursiveVisitor
import com.intellij.lang.folding.FoldingDescriptor
import com.intellij.psi.PsiComment
import com.intellij.psi.PsiElement

class VomlFoldingVisitor(private val descriptors: MutableList<FoldingDescriptor>) : FutilRecursiveVisitor() {
//    override fun visitObjectBody(o: VomlObjectBody) {
//        if (o.objectEntryList.isNotEmpty()) {
//            fold(o)
//            super.visitObjectBody(o)
//        }
//    }

    private fun fold(element: PsiElement) {
        descriptors += FoldingDescriptor(element.node, element.textRange)
    }
}
