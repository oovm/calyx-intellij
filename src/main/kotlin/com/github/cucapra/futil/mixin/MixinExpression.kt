package com.github.cucapra.futil.mixin

import com.github.cucapra.futil.psi.FutilExpression
import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.navigation.ItemPresentation
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNameIdentifierOwner
import javax.swing.Icon

abstract class MixinExpression(node: ASTNode) : ASTWrapperPsiElement(node),
    PsiNameIdentifierOwner,
    FutilExpression {

    override fun getName(): String {
        return this.lhs.namespace.text
    }

    override fun getIcon(flags: Int): Icon? {
        return super.getIcon(flags)
    }

    override fun getPresentation(): ItemPresentation? {
        return super.getPresentation()
    }

    override fun getNameIdentifier(): PsiElement? {
        return if (this.lhs.slice == null && this.lhs.namespace.identifierList.count() == 1) {
            this.lhs.namespace.firstChild
        }
        else {
            null
        }
    }

    override fun setName(name: String): PsiElement {
        TODO("Not yet implemented")
    }
}