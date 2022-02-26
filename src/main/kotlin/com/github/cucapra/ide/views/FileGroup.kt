package com.github.cucapra.ide.views

import com.intellij.openapi.project.Project
import com.intellij.usages.impl.FileStructureGroupRuleProvider
import com.intellij.usages.rules.UsageGroupingRule

class FileGroup: FileStructureGroupRuleProvider {
    override fun getUsageGroupingRule(project: Project): UsageGroupingRule? {
        TODO("Not yet implemented")
    }
}