package com.github.cucapra.futil.file

import com.github.cucapra.futil.FutilLanguage
import com.github.cucapra.ide.CalyxBundle
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement

class FutilFileNode(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, FutilLanguage) {
    override fun getFileType(): FileType = FutilFileType
}