package com.github.cucapra.futil

import com.github.cucapra.ide.CalyxBundle
import com.intellij.lang.Language
import com.intellij.util.keyFMap.KeyFMap

object FutilLanguage : Language("futil") {
    override fun getDisplayName(): String = CalyxBundle.message("filetype.futil.name")
    override fun getMimeTypes(): Array<String> = arrayOf("text/x-futil")
}
