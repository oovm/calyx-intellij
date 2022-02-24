package com.github.cucapra.futil.psi

import com.intellij.psi.tree.IElementType

class FutilElementType(debugName: String) : IElementType(debugName, com.github.cucapra.futil.FutilLanguage.INSTANCE) {
    override fun toString(): String = "FutilToken.${super.toString()}"
}
