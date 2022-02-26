package com.github.cucapra.ide.annotator


import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.psi.PsiElement

class VomlScopeChecker : CheckerBase() {
    override fun check(element: PsiElement, holder: AnnotationHolder): CheckerAnnotatorResult =
        if (holder.isBatchMode) {
            CheckerAnnotatorResult.Ok
        } else {
            when (element) {
                else -> CheckerAnnotatorResult.Ok
            }
        }
}

