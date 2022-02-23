package com.github.cucapra.ide.codeStyle

import com.github.cucapra.futil.VomlLanguage
import com.intellij.application.options.GenerationCodeStylePanel
import com.intellij.application.options.TabbedLanguageCodeStylePanel
import com.intellij.psi.codeStyle.CodeStyleSettings

class VomlCodeStyleMainPanel(currentSettings: CodeStyleSettings?, settings: CodeStyleSettings?) :
    TabbedLanguageCodeStylePanel(
        com.github.cucapra.futil.VomlLanguage.INSTANCE,
        currentSettings,
        settings
    ) {
    override fun initTabs(settings: CodeStyleSettings) {
        addIndentOptionsTab(settings)
        addWrappingAndBracesTab(settings)
        addTab(GenerationCodeStylePanel(settings, com.github.cucapra.futil.VomlLanguage.INSTANCE))
    }
}
