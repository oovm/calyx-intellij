package com.github.cucapra.futil.psi

import com.github.cucapra.futil.VomlLanguage
import com.intellij.psi.tree.IElementType

class FutilElementType(debugName: String) : IElementType(debugName, com.github.cucapra.futil.VomlLanguage.INSTANCE) {
    override fun toString(): String = "FutilToken.${super.toString()}"
}
