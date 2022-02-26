package com.github.cucapra.ide.formatter

import com.github.cucapra.futil.FutilLanguage
import com.github.cucapra.futil.psi.FutilTypes
import com.intellij.formatting.SpacingBuilder
import com.intellij.psi.codeStyle.CodeStyleSettings
import com.intellij.psi.codeStyle.CommonCodeStyleSettings

data class FormatterContext(val commonSettings: CommonCodeStyleSettings, val spacingBuilder: SpacingBuilder) {
    companion object {
        fun create(settings: CodeStyleSettings): FormatterContext {
            val commonSettings = settings.getCommonSettings(FutilLanguage)
            return FormatterContext(commonSettings, createSpacingBuilder(commonSettings))
        }

        fun createSpacingBuilder(commonSettings: CommonCodeStyleSettings): SpacingBuilder =
            SpacingBuilder(commonSettings)
                // ,
                .after(FutilTypes.COMMA).spacing(1, 1, 0, true, 0)
                .before(FutilTypes.COMMA).spaceIf(false)
                // [ ]
                .after(FutilTypes.BRACKET_L).spaceIf(false)
                .before(FutilTypes.BRACKET_R).spaceIf(false)
                // { }
                .after(FutilTypes.BRACE_L).spaceIf(false)
                .before(FutilTypes.BRACE_R).spaceIf(false)
                // ( )
                .after(FutilTypes.PARENTHESIS_L).spaceIf(false)
                .before(FutilTypes.PARENTHESIS_R).spaceIf(false)
    }
}