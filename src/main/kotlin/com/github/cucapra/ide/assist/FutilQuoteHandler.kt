package com.github.cucapra.ide.assist

import com.github.cucapra.futil.psi.FutilTypes
import com.intellij.codeInsight.editorActions.SimpleTokenSetQuoteHandler
import com.intellij.openapi.editor.highlighter.HighlighterIterator

class FutilQuoteHandler : SimpleTokenSetQuoteHandler(FutilTypes.STRING) {
    override fun isOpeningQuote(iterator: HighlighterIterator?, offset: Int): Boolean {
        return super.isOpeningQuote(iterator, offset)
    }
}
