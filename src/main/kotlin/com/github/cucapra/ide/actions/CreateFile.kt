package com.github.cucapra.ide.actions

import com.github.cucapra.futil.FutilLanguage
import com.github.cucapra.ide.CalyxBundle
import com.github.cucapra.ide.icons.CalyxIcons
import com.intellij.ide.actions.CreateFileFromTemplateAction
import com.intellij.ide.actions.CreateFileFromTemplateDialog
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiDirectory

class CreateFile : CreateFileFromTemplateAction(NAME, CalyxBundle.message("filetype.futil.create"), CalyxIcons.FILE) {
    override fun buildDialog(project: Project, directory: PsiDirectory, builder: CreateFileFromTemplateDialog.Builder) {
        builder
            .setTitle(NAME)
            .addKind("Empty file", CalyxIcons.FILE, "${FutilLanguage.displayName} File")
    }

    override fun getActionName(directory: PsiDirectory, newName: String, templateName: String): String = NAME

    companion object {
        private val NAME = CalyxBundle.message("filetype.futil.create")
    }
}
