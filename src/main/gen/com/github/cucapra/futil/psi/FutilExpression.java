// This is a generated file. Not intended for manual editing.
package com.github.cucapra.futil.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FutilExpression extends PsiElement {

  @Nullable
  FutilAnnotation getAnnotation();

  @Nullable
  FutilExportStatement getExportStatement();

  @Nullable
  FutilIncludeStatement getIncludeStatement();

  @Nullable
  FutilInheritStatement getInheritStatement();

  @Nullable
  FutilInsertItem getInsertItem();

  @Nullable
  FutilInsertPair getInsertPair();

  @Nullable
  FutilScope getScope();

  @Nullable
  PsiElement getBackTop();

  @Nullable
  PsiElement getSemicolon();

}
