// This is a generated file. Not intended for manual editing.
package com.github.cucapra.futil.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FutilParStatement extends PsiElement {

  @Nullable
  FutilPar getPar();

  @Nullable
  FutilSeq getSeq();

  @NotNull
  FutilBrace getBrace();

  @NotNull
  PsiElement getBraceR();

}
