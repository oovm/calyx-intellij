// This is a generated file. Not intended for manual editing.
package com.github.cucapra.futil.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FutilInheritStatement extends PsiElement {

  @Nullable
  FutilPredefinedSymbol getPredefinedSymbol();

  @Nullable
  FutilStringInline getStringInline();

  @Nullable
  FutilStringPrefix getStringPrefix();

  @NotNull
  PsiElement getInherit();

}
