package com.github.cucapra.futil.file

import com.github.cucapra.futil.FutilLanguage
import com.github.cucapra.ide.CalyxBundle
import com.github.cucapra.ide.icons.CalyxIcons
import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

object FutilFileType : LanguageFileType(FutilLanguage) {
    override fun getName(): String = CalyxBundle.message("filetype.voml.name")

    override fun getDescription(): String = CalyxBundle.message("filetype.voml.description")

    override fun getDefaultExtension(): String = "voml"

    override fun getIcon(): Icon = CalyxIcons.FILE
}