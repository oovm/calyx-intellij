// This is a generated file. Not intended for manual editing.
package com.github.cucapra.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface VomlIncludeStatement extends PsiElement {

  @NotNull
  List<VomlKeySymbol> getKeySymbolList();

  @NotNull
  VomlStringInline getStringInline();

  @Nullable
  VomlStringPrefix getStringPrefix();

  @Nullable
  PsiElement getBraceL();

  @Nullable
  PsiElement getBraceR();

  @Nullable
  PsiElement getBracketL();

  @Nullable
  PsiElement getBracketR();

  @NotNull
  PsiElement getInclude();

  @Nullable
  PsiElement getParenthesisL();

  @Nullable
  PsiElement getParenthesisR();

}
