package com.github.cucapra.ide.annotator

import com.github.cucapra.futil.psi.FutilTypes
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.psi.PsiElement
import com.intellij.psi.util.elementType

class StringEscapingAnnotator : AnnotatorBase() {
    override fun annotateInternal(element: PsiElement, holder: AnnotationHolder) {
        when (element.elementType) {
            FutilTypes.STRING -> annotateStringInline(element, holder)
            else -> {}
        }
    }

    private fun annotateStringInline(element: PsiElement, holder: AnnotationHolder) {
//        val message = "invalid escape";
//        holder.newAnnotation(HighlightSeverity.ERROR, message).create()
    }
}
