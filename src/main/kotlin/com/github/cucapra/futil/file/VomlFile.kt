package com.github.cucapra.futil.file

import com.github.cucapra.futil.FutilLanguage
import com.github.cucapra.ide.CalyxBundle
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class VomlFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider,
    FutilLanguage.INSTANCE
) {
    override fun getFileType(): FileType =
        FutilFileType.INSTANCE

    override fun toString(): String = CalyxBundle.message("filetype.voml.create")
}