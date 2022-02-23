package com.github.cucapra.ide

import com.github.cucapra.language.psi.VomlTypes
import com.intellij.codeInsight.editorActions.SimpleTokenSetQuoteHandler

class VomlQuoteHandler : SimpleTokenSetQuoteHandler(VomlTypes.STRING_INLINE)
