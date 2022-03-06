package com.github.cucapra.ide.completion

import com.intellij.codeInsight.completion.CompletionParameters
import com.intellij.codeInsight.completion.CompletionProvider
import com.intellij.codeInsight.completion.CompletionResultSet
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.openapi.editor.EditorModificationUtil
import com.intellij.util.ProcessingContext

class ProvideAnnotation : CompletionProvider<CompletionParameters>() {
    override fun addCompletions(
        parameters: CompletionParameters,
        context: ProcessingContext,
        resultSet: CompletionResultSet
    ) {
        resultSet.addElement(
            LookupElementBuilder.create("external")
                .withInsertHandler { ctx, _ ->
                    EditorModificationUtil.moveCaretRelatively(ctx.editor, -1)
                }
        )
        resultSet.addElement(LookupElementBuilder.create("None()"))
    }
}