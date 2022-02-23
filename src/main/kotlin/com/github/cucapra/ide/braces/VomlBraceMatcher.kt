package com.github.cucapra.ide.braces

import com.github.cucapra.futil.VomlFileType
import com.github.cucapra.futil.VomlLanguage
import com.intellij.codeInsight.highlighting.PairedBraceMatcherAdapter
import com.intellij.openapi.editor.highlighter.HighlighterIterator
import com.intellij.openapi.fileTypes.FileType

class VomlBraceMatcher : PairedBraceMatcherAdapter(VomlBaseBraceMatcher(), com.github.cucapra.futil.VomlLanguage.INSTANCE) {
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
        if (fileType != com.github.cucapra.futil.VomlFileType.INSTANCE) return false
        val pair = findPair(left, iterator, fileText, fileType)
        return pair != null
    }
}
