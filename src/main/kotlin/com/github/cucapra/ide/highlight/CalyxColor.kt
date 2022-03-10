package com.github.cucapra.ide.highlight

import com.github.cucapra.ide.CalyxBundle
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.options.OptionsBundle
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.util.NlsContexts.AttributeDescriptor
import java.util.function.Supplier
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors as Default


@Suppress("UnstableApiUsage")
enum class CalyxColor(humanName: Supplier<@AttributeDescriptor String>, default: TextAttributesKey? = null) {
    // 特殊关键词
    KEYWORD(OptionsBundle.messagePointer("options.language.defaults.keyword"), Default.KEYWORD),
    SYM_ANNOTATION(CalyxBundle.messagePointer("color.token.annotation"), Default.METADATA),
    SYM_VARIABLE(CalyxBundle.messagePointer("color.token.variable"), Default.GLOBAL_VARIABLE),
    SYM_GROUP(CalyxBundle.messagePointer("color.token.group"), Default.CLASS_NAME),
    SYM_FIELD(CalyxBundle.messagePointer("color.token.group"), Default.STATIC_FIELD),
    SYM_FUNCTION(CalyxBundle.messagePointer("color.token.group"), Default.STATIC_METHOD),
    // 字面量
    NULL(CalyxBundle.messagePointer("color.token.null"), Default.KEYWORD),
    BOOLEAN(CalyxBundle.messagePointer("color.token.boolean"), Default.KEYWORD),
    NUMBER(CalyxBundle.messagePointer("color.token.number"), Default.NUMBER),
    BITS(CalyxBundle.messagePointer("color.token.bits"), Default.KEYWORD),
    STRING(CalyxBundle.messagePointer("color.token.string"), Default.STRING),
    IDENTIFIER(OptionsBundle.messagePointer("options.language.defaults.identifier"), Default.IDENTIFIER),
    //
    ANNOTATION(OptionsBundle.messagePointer("options.java.attribute.descriptor.annotation.name"), Default.METADATA),
    // 标点符号
    PARENTHESES(OptionsBundle.messagePointer("options.language.defaults.parentheses"), Default.PARENTHESES),
    BRACKETS(OptionsBundle.messagePointer("options.language.defaults.brackets"), Default.BRACKETS),
    BRACES(OptionsBundle.messagePointer("options.language.defaults.braces"), Default.BRACES),
    DOT(OptionsBundle.messagePointer("options.language.defaults.dot"), Default.DOT),
    COMMA(OptionsBundle.messagePointer("options.language.defaults.comma"), Default.COMMA),
    SET(CalyxBundle.messagePointer("color.token.set"), Default.OPERATION_SIGN),
    SEMICOLON(OptionsBundle.messagePointer("options.language.defaults.semicolon"), Default.SEMICOLON),

    // 注释
    LINE_COMMENT(OptionsBundle.messagePointer("options.language.defaults.line.comment"), Default.LINE_COMMENT),
    BLOCK_COMMENT(OptionsBundle.messagePointer("options.language.defaults.block.comment"), Default.BLOCK_COMMENT),

    // 错误
    BAD_CHARACTER(
        OptionsBundle.messagePointer("options.java.attribute.descriptor.bad.character"),
        HighlighterColors.BAD_CHARACTER
    ),


    // 废弃
    ;

    val textAttributesKey: TextAttributesKey = TextAttributesKey.createTextAttributesKey("voml.lang.$humanName", default)
    val attributesDescriptor: AttributesDescriptor = AttributesDescriptor(humanName, textAttributesKey)
    val testSeverity: HighlightSeverity = HighlightSeverity(name, HighlightSeverity.INFORMATION.myVal)
}
