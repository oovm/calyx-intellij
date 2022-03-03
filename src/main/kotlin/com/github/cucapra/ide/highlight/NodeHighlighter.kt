package com.github.cucapra.ide.highlight

import com.github.cucapra.futil.file.FutilFileNode
import com.github.cucapra.futil.psi.FutilAnnotationMark
import com.github.cucapra.futil.psi.FutilImport
import com.github.cucapra.futil.psi.FutilRecursiveVisitor
import com.intellij.codeInsight.daemon.impl.HighlightInfo
import com.intellij.codeInsight.daemon.impl.HighlightInfoType
import com.intellij.codeInsight.daemon.impl.HighlightVisitor
import com.intellij.codeInsight.daemon.impl.analysis.HighlightInfoHolder
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile

class NodeHighlighter : FutilRecursiveVisitor(), HighlightVisitor {
    private var infoHolder: HighlightInfoHolder? = null


    override fun visitImport(o: FutilImport) {
        highlight(o, CalyxColor.KEYWORD)
    }

    override fun visitAnnotationMark(o: FutilAnnotationMark) {
        highlight(o, CalyxColor.SYM_ANNOTATION)
    }

    private fun highlight(element: PsiElement, color: CalyxColor) {
        val builder = HighlightInfo.newHighlightInfo(HighlightInfoType.INFORMATION)
        builder.textAttributes(color.textAttributesKey)
        builder.range(element)

        infoHolder?.add(builder.create())
    }

    override fun analyze(
        file: PsiFile,
        updateWholeFile: Boolean,
        holder: HighlightInfoHolder,
        action: Runnable
    ): Boolean {
        infoHolder = holder
        action.run()

        return true
    }

    override fun clone(): HighlightVisitor = NodeHighlighter()

    override fun suitableForFile(file: PsiFile): Boolean = file is FutilFileNode

    override fun visit(element: PsiElement) = element.accept(this)
}