package com.github.cucapra.ide.braces

import com.github.cucapra.futil.FutilLanguage
import com.github.cucapra.futil.file.FutilFileType
import com.intellij.codeInsight.highlighting.PairedBraceMatcherAdapter
import com.intellij.openapi.editor.highlighter.HighlighterIterator
import com.intellij.openapi.fileTypes.FileType

class VomlBraceMatcher : PairedBraceMatcherAdapter(BaseBraceMatcher(), FutilLanguage) {
    override fun isLBraceToken(iterator: HighlighterIterator, fileText: CharSequence, fileType: FileType): Boolean =
        isBrace(iterator, fileText, fileType, true)

    override fun isRBraceToken(iterator: HighlighterIterator, fileText: CharSequence, fileType: FileType): Boolean =
        isBrace(iterator, fileText, fileType, false)

    private fun isBrace(
        iterator: HighlighterIterator,
        fileText: CharSequence,
        fileType: FileType,
        left: Boolean
    ): Boolean {
        if (fileType != FutilFileType) return false
        val pair = findPair(left, iterator, fileText, fileType)
        return pair != null
    }
}
