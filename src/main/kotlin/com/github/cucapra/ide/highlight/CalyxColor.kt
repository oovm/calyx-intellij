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
    KEYWORD(CalyxBundle.messagePointer("color.settings.voml.keyword"), Default.KEYWORD),
    SYM_ANNOTATION(CalyxBundle.messagePointer("color.token.annotation"), Default.METADATA),
    SYM_VARIABLE(CalyxBundle.messagePointer("color.token.variable"), KEYWORD.textAttributesKey),
    SYM_GROUP(CalyxBundle.messagePointer("color.token.group"), KEYWORD.textAttributesKey),
    // 字面量
    NULL(CalyxBundle.messagePointer("color.settings.voml.null"), Default.KEYWORD),
    BOOLEAN(CalyxBundle.messagePointer("color.settings.voml.boolean"), Default.KEYWORD),
    NUMBER_HINT(CalyxBundle.messagePointer("color.settings.voml.number_hint"), Default.METADATA),
    DECIMAL(CalyxBundle.messagePointer("color.settings.voml.decimal"), Default.NUMBER),
    INTEGER(CalyxBundle.messagePointer("color.settings.voml.integer"), Default.NUMBER),
    STRING_HINT(CalyxBundle.messagePointer("color.settings.voml.string_hint"), Default.KEYWORD),
    STRING(CalyxBundle.messagePointer("color.settings.voml.string"), Default.STRING),
    IDENTIFIER(OptionsBundle.messagePointer("options.language.defaults.identifier"), Default.IDENTIFIER),
    //
    TYPE_HINT(CalyxBundle.messagePointer("color.settings.voml.type_hint"), Default.CLASS_NAME),
    KEY_SYMBOL(CalyxBundle.messagePointer("color.settings.voml.key_symbol"), Default.STATIC_FIELD),

    INSERT_MARK(CalyxBundle.messagePointer("color.settings.voml.insert_mark"), KEYWORD.textAttributesKey),
    ANNOTATION(OptionsBundle.messagePointer("options.java.attribute.descriptor.annotation.name"), Default.METADATA),
    // 元数据
    EXTENSION(OptionsBundle.messagePointer("options.language.defaults.metadata"), Default.METADATA),
    PREDEFINED(OptionsBundle.messagePointer("options.language.defaults.predefined"), Default.PREDEFINED_SYMBOL),
    // 标点符号
    PARENTHESES(OptionsBundle.messagePointer("options.language.defaults.parentheses"), Default.PARENTHESES),
    BRACKETS(OptionsBundle.messagePointer("options.language.defaults.brackets"), Default.BRACKETS),
    BRACES(OptionsBundle.messagePointer("options.language.defaults.braces"), Default.BRACES),
    DOT(OptionsBundle.messagePointer("options.language.defaults.dot"), Default.DOT),
    COMMA(OptionsBundle.messagePointer("options.language.defaults.comma"), Default.COMMA),
    SET(CalyxBundle.messagePointer("color.settings.voml.set"), Default.OPERATION_SIGN),
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
