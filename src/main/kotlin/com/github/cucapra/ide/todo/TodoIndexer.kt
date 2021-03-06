package com.github.cucapra.ide.todo

import com.github.cucapra.futil.psi.FutilLexerAdapter
import com.github.cucapra.futil.psi.FutilParserDefinition
import com.intellij.lexer.Lexer
import com.intellij.psi.impl.cache.impl.BaseFilterLexer
import com.intellij.psi.impl.cache.impl.OccurrenceConsumer
import com.intellij.psi.impl.cache.impl.todo.LexerBasedTodoIndexer
import com.intellij.psi.search.UsageSearchContext

class TodoIndexer : LexerBasedTodoIndexer() {
    override fun createLexer(consumer: OccurrenceConsumer): Lexer {
        return object : BaseFilterLexer(FutilLexerAdapter(), consumer) {
            override fun advance() {
                if (myDelegate.tokenType in FutilParserDefinition.commentTokens) {
                    scanWordsInToken(UsageSearchContext.IN_COMMENTS.toInt(), false, false)
                    advanceTodoItemCountsInToken()
                }
                myDelegate.advance()
            }
        }
    }
}
