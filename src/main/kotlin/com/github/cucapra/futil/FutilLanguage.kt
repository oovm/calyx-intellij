package com.github.cucapra.futil

import com.intellij.lang.Language

object FutilLanguage : Language("futil") {

    override fun getDisplayName(): String {
        return super.getDisplayName()
    }

    override fun getMimeTypes(): Array<String> {
        return arrayOf("text/x-futil")
    }
}

