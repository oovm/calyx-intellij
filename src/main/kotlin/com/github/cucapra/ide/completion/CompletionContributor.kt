package com.github.cucapra.ide.completion

import com.github.cucapra.futil.psi.FutilTypes
import com.intellij.codeInsight.completion.*
import com.intellij.codeInsight.completion.CompletionContributor
import com.intellij.patterns.PlatformPatterns

class CompletionContributor : CompletionContributor() {
    init {
        extend(
            CompletionType.BASIC,
            PlatformPatterns.psiElement(FutilTypes.SYMBOL),
            ProvideSymbol()
        )
        extend(
            CompletionType.BASIC,
            PlatformPatterns.psiElement(FutilTypes.AT),
            ProvideSymbol()
        )
    }
}

