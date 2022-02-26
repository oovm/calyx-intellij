package com.github.cucapra.futil.psi

import com.github.cucapra.futil.FutilLanguage
import com.intellij.psi.tree.IElementType

class FutilElementType(debugName: String) : IElementType(debugName, FutilLanguage) {
    override fun toString(): String = "FutilToken.${super.toString()}"
}
