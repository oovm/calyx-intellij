package com.github.cucapra.ide.highlight

import com.github.cucapra.ide.CalyxBundle
import com.github.cucapra.ide.icons.CalyxIcons
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage

class ColorSettingsPage : ColorSettingsPage {
    private val annotatorTags = CalyxColor
        .values()
        .associateBy({ it.name }, { it.textAttributesKey })

    override fun getAttributeDescriptors() = CalyxColor
        .values()
        .map { it.attributesDescriptor }
        .toTypedArray()

    override fun getColorDescriptors(): Array<ColorDescriptor> = ColorDescriptor.EMPTY_ARRAY

    override fun getDisplayName() = CalyxBundle.message("filetype.futil.name")

    override fun getIcon() = CalyxIcons.FILE

    override fun getHighlighter() = TokenHighlighter()

    override fun getAdditionalHighlightingTagToDescriptorMap() = annotatorTags

    override fun getDemoText() = javaClass.getResource("/messages/highlight.rml")!!.readText()


}
