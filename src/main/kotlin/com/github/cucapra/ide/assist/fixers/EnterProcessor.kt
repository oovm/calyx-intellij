package com.github.cucapra.ide.assist.fixers

import com.intellij.lang.SmartEnterProcessorWithFixers
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile

class EnterProcessor : SmartEnterProcessorWithFixers() {
    init {
        addFixers(
            CommaFixer()
        )
        addEnterProcessors(
            SemiColonFixer()
        )
    }

    override fun doNotStepInto(element: PsiElement): Boolean {
        return true
    }

    override fun processDefaultEnter(project: Project, editor: Editor, file: PsiFile) {
        plainEnter(editor)
    }
}

