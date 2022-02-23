// This is a generated file. Not intended for manual editing.
package com.github.cucapra.futil.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FutilStatements extends PsiElement {

  @Nullable
  FutilComponentStatement getComponentStatement();

  @Nullable
  FutilGroupStatement getGroupStatement();

  @Nullable
  FutilImportStatement getImportStatement();

  @Nullable
  PsiElement getSemicolon();

}
