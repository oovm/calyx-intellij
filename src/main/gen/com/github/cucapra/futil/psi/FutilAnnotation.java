// This is a generated file. Not intended for manual editing.
package com.github.cucapra.futil.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FutilAnnotation extends PsiElement {

  @NotNull
  FutilAnnotationMark getAnnotationMark();

  @NotNull
  List<FutilKeySymbol> getKeySymbolList();

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
