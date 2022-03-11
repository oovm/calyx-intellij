package com.github.cucapra.ide.codeStyle

import com.intellij.psi.codeStyle.CodeStyleSettings
import com.intellij.psi.codeStyle.CustomCodeStyleSettings

class CodeStyleCustom(settings: CodeStyleSettings?) : CustomCodeStyleSettings(
    "CustomCodeStyle",
    settings
)
