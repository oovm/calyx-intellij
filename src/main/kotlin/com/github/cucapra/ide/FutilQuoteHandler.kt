package com.github.cucapra.ide

import com.github.cucapra.futil.psi.FutilTypes
import com.intellij.codeInsight.editorActions.SimpleTokenSetQuoteHandler

class FutilQuoteHandler : SimpleTokenSetQuoteHandler(FutilTypes.STRING)
