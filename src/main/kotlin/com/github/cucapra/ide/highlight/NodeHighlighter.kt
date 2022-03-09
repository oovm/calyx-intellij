package com.github.cucapra.ide.highlight

import com.github.cucapra.futil.file.FutilFileNode
import com.github.cucapra.futil.psi.*
import com.github.cucapra.futil.psi.impl.FutilIdentifierNode
import com.intellij.codeInsight.daemon.impl.HighlightInfo
import com.intellij.codeInsight.daemon.impl.HighlightInfoType
import com.intellij.codeInsight.daemon.impl.HighlightVisitor
import com.intellij.codeInsight.daemon.impl.analysis.HighlightInfoHolder
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.jetbrains.rd.util.restOrNull

class NodeHighlighter : FutilRecursiveVisitor(), HighlightVisitor {
    private var infoHolder: HighlightInfoHolder? = null


    override fun visitImport(o: FutilImport) {
        highlight(o, CalyxColor.KEYWORD)
    }

    override fun visitComponentStatement(o: FutilComponentStatement) {
        highlight(o.component, CalyxColor.KEYWORD)
        highlight(o.componentName.identifier, CalyxColor.SYM_FUNCTION)
    }

    override fun visitAnnotationMark(o: FutilAnnotationMark) {
        highlight(o, CalyxColor.SYM_ANNOTATION)
    }

    override fun visitGroupStatement(o: FutilGroupStatement) {
        highlight(o.group, CalyxColor.KEYWORD)
        highlight(o.identifier, CalyxColor.SYM_GROUP)
    }

    override fun visitSeqStatement(o: FutilSeqStatement) {
        highlight(o.seq, CalyxColor.KEYWORD)
        o.brace.children
            .filterIsInstance<FutilIdentifierNode>()
            .forEach {
                highlight(it, CalyxColor.SYM_GROUP)
            }
    }

    override fun visitWhileStatement(o: FutilWhileStatement) {
        highlight(o.`while`, CalyxColor.KEYWORD)
        o.with?.let { highlight(it, CalyxColor.KEYWORD) }
    }

    override fun visitNormalStatement(o: FutilNormalStatement) {
        highlight(o.identifier, CalyxColor.KEYWORD)
    }

    override fun visitExpression(o: FutilExpression) {
        val ids = o.lhs.namespace.identifierList;
        val slice = o.lhs.slice;
        if (slice != null) {
            ids.forEach {
                highlight(it, CalyxColor.SYM_GROUP)
            }
            slice
                .bracket.children
                .filterIsInstance<FutilIdentifierNode>()
                .forEach {
                    highlight(it, CalyxColor.SYM_GROUP)
                }
        }
        else if (ids.count() > 1) {
            highlight(ids.first(), CalyxColor.SYM_VARIABLE)
            ids.restOrNull()?.let { list ->
                list.forEach {
                    highlight(it, CalyxColor.SYM_FIELD)
                }
            }
        }
        else {
            highlight(ids.first(), CalyxColor.SYM_GROUP)
        }
    }

    override fun visitCall(o: FutilCall) {
        highlight(o.identifier, CalyxColor.SYM_FUNCTION)
    }

    override fun visitIdentifier(o: FutilIdentifier) {
        if (o.text == "done") {
            return highlight(o, CalyxColor.KEYWORD)
        }
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