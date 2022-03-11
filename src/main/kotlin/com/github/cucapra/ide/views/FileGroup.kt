package com.github.cucapra.ide.views

import com.intellij.ide.projectView.ProjectViewNestingRulesProvider
import org.jetbrains.annotations.NotNull

/// FluentFileGroup: FileStructureGroupRuleProvider
class FileGroup : ProjectViewNestingRulesProvider {
    override fun addFileNestingRules(@NotNull consumer: ProjectViewNestingRulesProvider.Consumer) {
        consumer.addNestingRule(".futil", ".except")
    }
}