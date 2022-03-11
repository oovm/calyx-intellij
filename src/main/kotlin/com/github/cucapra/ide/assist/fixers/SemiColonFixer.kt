package com.github.cucapra.ide.assist.fixers

import com.github.cucapra.futil.file.FutilFileNode
import com.intellij.lang.SmartEnterProcessorWithFixers
import com.intellij.openapi.editor.Editor
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile

/// Automatically hit `;` when entering
class SemiColonFixer : SmartEnterProcessorWithFixers.FixEnterProcessor() {
    override fun doEnter(atCaret: PsiElement, file: PsiFile, editor: Editor, modified: Boolean): Boolean {
        if (file !is FutilFileNode) return false
        plainEnter(editor)
        return true
    }
}