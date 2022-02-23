package com.github.cucapra.futil

import com.github.cucapra.ide.CalyxBundle
import com.intellij.lang.Language
import com.github.cucapra.ide.icons.VomlIcons
import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class VomlLanguage private constructor() : Language("VOML") {
    companion object {
        @JvmStatic
        val INSTANCE = com.github.cucapra.futil.VomlLanguage()
    }
}
class VomlFileType private constructor() : LanguageFileType(com.github.cucapra.futil.VomlLanguage.Companion.INSTANCE) {
    override fun getName(): String = CalyxBundle.message("filetype.voml.name")

    override fun getDescription(): String = CalyxBundle.message("filetype.voml.description")

    override fun getDefaultExtension(): String = "voml"

    override fun getIcon(): Icon = VomlIcons.FILE

    companion object {
        @JvmStatic
        val INSTANCE = com.github.cucapra.futil.VomlFileType()
    }
}

class VomlFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider,
    com.github.cucapra.futil.VomlLanguage.Companion.INSTANCE
) {
    override fun getFileType(): FileType =
        com.github.cucapra.futil.VomlFileType.Companion.INSTANCE

    override fun toString(): String = CalyxBundle.message("filetype.voml.create")
}
