// This is a generated file. Not intended for manual editing.
package com.github.cucapra.futil.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FutilTable extends PsiElement {

  @NotNull
  List<FutilPair> getPairList();

  @Nullable
  FutilTypeHint getTypeHint();

  @NotNull
  List<FutilValue> getValueList();

  @Nullable
  PsiElement getBraceL();

  @Nullable
  PsiElement getBraceR();

  @Nullable
  PsiElement getBracketL();

  @Nullable
  PsiElement getBracketR();

  @Nullable
  PsiElement getParenthesisL();

  @Nullable
  PsiElement getParenthesisR();

}
