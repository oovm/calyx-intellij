package com.github.cucapra.ide.icons

import com.intellij.ide.IconProvider
import com.intellij.openapi.util.IconLoader
import com.intellij.psi.PsiElement
import javax.swing.Icon

class CalyxIcons : IconProvider() {
    override fun getIcon(element: PsiElement, flags: Int): Icon? {
        return null
    }
    companion object {
        val FILE = IconLoader.getIcon("/icons/vomlIcon.svg", CalyxIcons::class.java)
    }
}
