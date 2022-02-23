package com.github.cucapra.ide.actions

import com.github.cucapra.ide.icons.VomlIcons
import com.github.cucapra.ide.CalyxBundle
import com.intellij.ide.actions.CreateFileFromTemplateAction
import com.intellij.ide.actions.CreateFileFromTemplateDialog
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiDirectory

class VomlCreateFile : CreateFileFromTemplateAction(NAME, "Create new Voml file", VomlIcons.FILE) {
    override fun buildDialog(project: Project, directory: PsiDirectory, builder: CreateFileFromTemplateDialog.Builder) {
        builder
            .setTitle(NAME)
            .addKind("Empty file", VomlIcons.FILE, "Voml File")
    }

    override fun getActionName(directory: PsiDirectory, newName: String, templateName: String): String = NAME

    companion object {
        private val NAME = CalyxBundle.message("filetype.voml.create")
    }
}
