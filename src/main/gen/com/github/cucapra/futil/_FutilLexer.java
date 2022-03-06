/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package com.github.cucapra.futil;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.github.cucapra.futil.psi.FutilTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>Futil.flex</tt>
 */
public class _FutilLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [12, 6, 3]
   * Total runtime size is 16960 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>9]<<6)|((ch>>3)&0x3f)]<<3)|(ch&0x7)];
  }

  /* The ZZ_CMAP_Z table has 2176 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1"+
    "\20\5\21\1\22\1\21\1\23\1\21\14\24\1\25\50\24\1\26\2\24\1\27\1\30\1\31\1\32"+
    "\25\24\1\33\20\21\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1"+
    "\21\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\21\1\24\1\56\1\57\5\21\2\24\1\60"+
    "\7\21\1\24\1\61\20\21\1\24\1\62\1\21\1\63\13\24\1\64\1\24\1\65\22\21\1\66"+
    "\5\21\1\67\11\21\1\70\1\71\1\72\1\73\1\21\1\74\2\21\1\75\3\21\1\76\2\21\1"+
    "\77\10\21\123\24\1\100\7\24\1\101\1\102\12\24\1\103\24\21\1\24\1\104\u0582"+
    "\21\1\105\u017f\21");

  /* The ZZ_CMAP_Y table has 4480 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\2\0\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\3"+
    "\0\1\17\1\20\1\21\1\20\2\10\1\22\3\10\1\22\71\10\1\23\1\10\1\24\1\0\1\25\1"+
    "\26\2\0\16\27\1\30\1\31\1\32\1\33\2\10\1\34\11\10\1\35\21\10\1\36\1\37\24"+
    "\10\1\40\3\10\1\22\1\41\1\40\4\10\1\0\1\42\4\27\1\43\1\44\1\0\3\10\2\45\3"+
    "\0\1\27\1\46\5\10\1\47\3\27\1\50\1\51\13\10\1\52\1\53\1\54\1\55\1\27\1\56"+
    "\2\0\1\57\3\10\3\27\1\60\12\10\1\61\1\27\1\62\1\0\1\27\1\63\3\10\1\47\1\64"+
    "\1\20\2\10\1\61\1\65\1\66\1\67\2\0\3\10\1\70\10\0\2\10\1\30\1\71\2\0\1\72"+
    "\1\27\1\73\3\27\1\74\6\10\1\75\2\27\1\76\1\10\1\77\1\27\1\40\1\10\1\100\1"+
    "\101\1\102\2\10\1\103\1\104\1\105\1\53\1\106\1\107\1\110\1\77\1\27\1\24\1"+
    "\0\1\111\1\112\1\102\2\10\1\103\1\113\1\114\1\115\1\116\1\117\1\120\1\121"+
    "\1\27\1\122\1\0\1\111\1\35\1\34\2\10\1\103\1\123\1\105\1\43\1\124\1\125\1"+
    "\0\1\77\1\27\1\0\1\41\1\111\1\101\1\102\2\10\1\103\1\123\1\105\1\53\1\116"+
    "\1\121\1\110\1\77\1\27\1\41\1\0\1\126\1\127\1\130\1\131\1\132\1\127\1\10\1"+
    "\133\1\134\1\135\1\136\1\0\1\121\1\27\2\0\1\137\1\30\1\103\2\10\1\103\1\10"+
    "\1\140\1\141\1\135\1\142\1\45\1\77\1\27\2\0\1\100\1\30\1\103\2\10\1\103\1"+
    "\143\1\105\1\141\1\135\1\142\1\144\1\77\1\27\1\145\1\0\1\111\1\30\1\103\4"+
    "\10\1\146\1\141\1\147\1\150\1\151\1\77\1\27\1\0\1\37\1\152\1\10\1\22\1\37"+
    "\2\10\1\34\1\153\1\22\1\154\1\155\1\27\1\121\1\27\1\156\1\0\1\40\5\10\1\157"+
    "\1\46\1\160\1\161\1\27\1\162\4\0\1\163\1\164\1\165\1\40\1\166\1\167\1\157"+
    "\1\170\1\171\1\172\1\27\1\173\4\0\1\125\2\0\1\162\1\27\1\162\1\174\1\175\1"+
    "\10\1\40\3\10\1\25\1\42\1\27\1\141\1\176\1\27\1\42\3\27\1\177\1\200\7\0\5"+
    "\10\1\47\1\27\1\201\1\27\1\162\1\61\1\202\1\203\1\204\1\205\1\10\1\206\1\207"+
    "\1\27\1\172\4\10\1\35\1\210\5\10\1\211\51\10\1\130\1\22\1\130\5\10\1\130\4"+
    "\10\1\130\1\22\1\130\1\10\1\22\7\10\1\130\10\10\1\212\1\0\1\42\1\162\1\0\2"+
    "\10\2\0\12\10\2\71\1\40\114\10\1\101\2\10\1\213\2\10\1\45\11\10\1\127\1\10"+
    "\1\125\1\10\1\30\1\214\1\0\2\10\1\214\1\0\2\10\1\215\1\0\1\10\1\30\1\216\1"+
    "\0\6\10\1\217\3\27\1\220\1\221\1\27\1\162\3\0\1\222\1\27\1\162\13\10\1\0\5"+
    "\10\1\223\10\10\1\71\1\0\3\10\1\22\1\27\1\224\1\27\1\224\1\121\1\27\3\10\1"+
    "\71\1\25\1\0\5\10\1\225\3\10\1\24\1\27\1\46\4\0\2\10\1\160\1\224\6\10\1\176"+
    "\1\161\3\27\1\53\1\27\1\162\1\27\1\162\1\151\1\0\1\27\1\172\10\0\1\226\5\10"+
    "\1\217\1\27\1\226\1\225\1\27\1\162\1\0\1\227\1\224\1\0\1\230\3\10\1\76\1\204"+
    "\1\27\1\63\4\10\1\61\1\27\1\224\1\0\4\10\1\217\2\27\1\0\1\27\1\231\1\27\1"+
    "\63\3\10\1\71\1\10\1\125\10\0\1\232\2\27\1\233\1\234\1\162\30\10\6\27\1\172"+
    "\1\227\42\10\2\71\4\10\2\71\1\10\1\235\3\10\1\71\6\10\1\30\1\171\1\236\1\25"+
    "\1\237\1\225\1\10\1\25\1\236\1\25\1\240\1\241\3\0\1\242\1\0\1\107\1\243\1"+
    "\0\1\244\1\245\2\0\1\41\1\151\2\0\1\10\1\25\6\0\1\27\1\177\1\246\1\27\1\243"+
    "\1\0\1\247\1\37\1\153\1\71\1\26\1\103\1\10\1\250\1\251\1\252\2\0\5\10\1\125"+
    "\116\0\5\10\1\22\5\10\1\22\20\10\1\25\1\253\1\254\1\0\4\10\1\35\1\210\7\10"+
    "\1\151\1\0\1\107\2\10\1\22\1\0\10\22\4\27\1\255\3\0\1\40\1\206\1\256\1\25"+
    "\1\40\11\10\1\22\1\257\1\40\12\10\1\211\1\251\4\10\1\71\1\40\12\10\1\22\2"+
    "\0\3\10\1\45\6\0\170\10\1\71\11\0\72\10\1\71\5\0\21\10\1\25\10\0\5\10\1\71"+
    "\41\10\1\25\2\10\1\27\1\254\2\0\5\10\1\160\1\72\1\260\3\10\1\61\12\10\1\162"+
    "\3\0\1\151\1\10\1\37\14\10\1\102\3\10\1\22\1\10\7\0\1\151\1\10\1\261\1\262"+
    "\2\10\1\47\3\0\6\10\1\225\1\0\1\63\5\10\1\217\1\27\1\172\1\0\1\27\1\162\2"+
    "\27\1\63\1\263\1\27\1\63\2\10\1\61\1\172\2\10\1\160\1\27\1\224\1\0\3\10\1"+
    "\25\1\74\5\10\1\47\1\27\1\243\1\151\1\27\1\162\1\264\1\10\1\27\1\265\5\10"+
    "\1\76\1\161\1\0\1\262\1\266\1\27\1\162\2\10\1\22\1\267\6\10\1\203\1\270\1"+
    "\223\2\0\1\271\1\10\1\47\1\272\1\0\3\273\1\0\2\22\5\10\1\211\1\71\1\0\16\10"+
    "\1\47\1\274\1\27\1\162\64\10\1\225\1\0\2\10\1\22\1\275\5\10\1\225\40\0\55"+
    "\10\1\71\15\10\1\24\4\0\1\22\1\0\1\275\1\276\1\10\1\103\1\22\1\171\1\277\15"+
    "\10\1\24\3\0\1\275\20\10\1\71\1\165\32\10\1\71\2\0\10\10\1\37\6\10\5\0\1\10"+
    "\1\24\2\27\2\0\2\27\1\300\2\0\1\301\4\0\1\302\1\235\17\10\1\25\2\0\1\27\1"+
    "\162\1\40\2\10\1\303\1\40\2\10\1\45\1\304\6\10\1\61\3\10\1\22\3\37\1\305\4"+
    "\0\1\10\1\143\2\10\1\22\2\10\1\306\1\10\1\71\1\10\1\71\4\0\17\10\1\45\10\0"+
    "\6\10\1\25\20\0\1\307\20\0\3\10\1\25\6\10\1\125\1\0\1\243\3\0\4\10\2\0\3\10"+
    "\1\45\4\10\1\61\1\46\3\10\1\71\4\10\1\225\1\10\1\256\5\0\23\10\1\71\1\27\1"+
    "\162\4\10\1\225\4\10\1\225\5\10\1\0\6\10\1\225\23\0\46\10\1\22\1\0\2\10\1"+
    "\71\1\0\1\10\23\0\1\71\1\103\4\10\1\35\1\310\2\10\1\71\1\0\2\10\1\22\1\0\3"+
    "\10\1\22\10\0\2\10\1\311\1\0\2\10\1\71\1\0\3\10\1\24\10\0\7\10\1\304\10\0"+
    "\1\312\1\72\1\143\1\40\2\10\1\225\1\115\4\0\3\10\1\25\3\10\1\25\4\0\1\10\1"+
    "\40\2\10\1\313\3\0\6\10\1\71\1\0\2\10\1\71\1\0\2\10\1\45\1\0\2\10\1\24\15"+
    "\0\11\10\1\125\6\0\6\10\1\45\1\0\6\10\1\45\41\0\1\230\6\10\1\27\1\161\3\0"+
    "\1\121\1\27\1\0\1\107\1\230\5\10\1\27\1\46\2\0\3\10\1\125\1\27\1\162\1\230"+
    "\3\10\1\160\1\27\1\141\1\27\2\0\4\10\1\314\1\0\1\230\5\10\1\47\1\27\1\315"+
    "\1\316\1\27\1\317\4\0\2\10\1\34\2\10\1\217\1\27\1\200\10\0\1\22\1\320\1\10"+
    "\1\35\1\10\1\125\5\10\1\160\1\27\1\46\1\27\1\162\1\137\1\101\1\102\2\10\1"+
    "\103\1\123\1\105\1\53\1\116\1\136\1\251\1\77\2\177\21\0\6\10\1\176\1\27\1"+
    "\201\1\45\1\27\1\162\4\0\6\10\2\27\1\321\1\0\1\27\1\162\24\0\5\10\1\160\1"+
    "\172\1\27\1\243\2\0\1\266\4\0\6\10\2\27\1\322\1\0\1\27\1\162\4\0\5\10\1\47"+
    "\1\27\1\0\1\27\1\162\6\0\3\10\1\323\1\27\1\224\1\27\1\162\54\0\10\10\1\27"+
    "\1\162\1\0\1\151\70\0\7\10\1\125\40\0\1\10\1\103\3\10\1\160\1\161\1\27\1\125"+
    "\1\0\1\27\1\162\2\0\1\37\3\10\1\324\2\27\1\42\1\161\51\0\63\10\1\24\14\0\15"+
    "\10\1\22\2\0\30\10\1\225\27\0\5\10\1\22\72\0\10\10\1\22\67\0\7\10\1\125\3"+
    "\10\1\22\1\27\1\162\14\0\3\10\1\71\1\177\1\0\6\10\1\161\1\0\1\225\1\0\1\27"+
    "\1\162\1\275\2\10\1\251\2\10\56\0\10\10\1\25\1\0\1\76\4\27\1\161\1\0\1\107"+
    "\1\230\1\10\10\0\1\125\3\0\75\10\1\25\2\0\36\10\1\45\41\0\1\24\77\0\15\10"+
    "\1\45\1\10\1\25\1\10\1\125\1\10\1\325\130\0\1\301\1\326\1\46\1\227\1\327\1"+
    "\224\3\0\1\330\22\0\1\316\67\0\12\10\1\30\10\10\1\30\1\331\1\332\1\10\1\333"+
    "\1\143\7\10\1\35\1\334\2\30\3\10\1\335\1\171\1\37\1\103\51\10\1\71\3\10\1"+
    "\103\2\10\1\211\3\10\1\211\2\10\1\30\3\10\1\30\2\10\1\22\3\10\1\22\3\10\1"+
    "\103\3\10\1\103\2\10\1\211\1\336\14\27\1\161\1\227\5\27\1\177\1\307\1\0\1"+
    "\244\2\0\1\227\1\42\1\27\52\0\1\161\2\27\1\337\1\340\1\46\72\0\30\10\1\25"+
    "\1\0\1\161\5\0\10\10\1\217\1\46\1\27\1\162\24\0\1\143\3\10\1\163\1\40\1\211"+
    "\1\341\1\247\1\342\1\163\1\235\1\163\2\211\1\120\1\10\1\34\1\10\1\225\1\343"+
    "\1\34\1\10\1\225\50\0\32\10\1\22\5\0\106\10\1\25\1\0\33\10\1\71\120\10\1\24"+
    "\53\0\3\10\1\71\134\0\36\27\2\0");

  /* The ZZ_CMAP_A table has 1824 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\3\1\2\2\1\1\2\2\0\1\3\1\0\1\22\1\5\1\52\3\0\1\35\1\36\1\6\1\34\1\51"+
    "\1\53\1\32\1\4\1\24\11\27\1\47\1\50\1\43\1\46\1\44\1\0\1\21\1\26\1\30\2\26"+
    "\1\33\1\30\10\17\1\25\10\17\1\25\2\17\1\37\1\23\1\40\1\45\1\31\1\0\1\14\1"+
    "\30\2\26\1\12\1\13\5\17\1\15\2\17\1\25\2\17\1\10\1\16\1\7\1\11\2\17\1\25\2"+
    "\17\1\41\1\0\1\42\7\0\1\1\2\0\1\3\11\0\1\17\12\0\1\17\1\0\1\20\7\17\1\0\2"+
    "\17\4\0\4\17\6\0\5\17\7\0\1\17\1\0\1\17\1\0\10\20\5\17\1\0\2\17\3\0\3\17\1"+
    "\0\1\17\6\0\1\17\1\20\3\17\1\0\1\17\1\0\4\17\1\0\13\17\1\0\3\17\1\0\5\20\2"+
    "\0\6\17\1\0\7\17\1\0\1\17\7\0\15\20\1\0\1\20\1\0\2\20\1\0\2\20\1\0\1\20\3"+
    "\17\5\0\3\20\5\0\3\17\7\20\4\0\2\17\1\20\13\17\1\0\1\17\7\20\2\0\6\20\2\17"+
    "\2\20\1\0\4\20\2\17\2\20\3\17\2\0\2\17\1\20\6\17\3\20\2\0\11\17\3\20\1\17"+
    "\6\0\2\20\6\17\4\20\2\17\2\0\2\20\1\17\11\20\1\17\3\20\1\17\5\20\2\0\1\17"+
    "\3\20\4\0\6\17\6\0\6\20\1\0\11\20\6\17\3\20\1\17\2\20\1\17\7\20\2\17\2\20"+
    "\2\0\2\20\1\17\3\20\1\0\10\17\2\0\2\17\2\0\6\17\1\0\7\17\1\0\1\17\3\0\4\17"+
    "\2\0\1\20\1\17\3\20\2\0\3\20\1\17\10\0\1\20\4\0\2\17\1\0\1\17\1\0\3\20\1\0"+
    "\6\17\4\0\2\17\1\0\2\17\1\0\2\17\1\0\2\17\2\0\1\20\1\0\5\20\4\0\2\20\2\0\3"+
    "\20\3\0\1\20\7\0\4\17\1\0\1\17\7\0\4\20\3\17\1\20\2\0\1\17\1\0\2\17\1\0\3"+
    "\17\2\20\1\0\3\20\2\0\1\17\11\0\1\20\1\17\1\0\6\17\3\0\3\17\1\0\4\17\3\0\2"+
    "\17\1\0\1\17\1\0\2\17\3\0\2\17\3\0\2\17\4\0\5\20\3\0\3\20\1\0\4\20\2\0\1\17"+
    "\6\0\5\20\1\0\5\17\3\0\1\17\7\20\1\0\2\20\5\0\2\20\1\0\4\17\1\0\3\17\6\0\1"+
    "\17\2\0\2\17\5\0\3\17\2\0\1\17\3\20\1\0\4\20\1\17\5\0\3\17\1\20\7\0\1\17\2"+
    "\0\2\20\1\0\7\17\1\0\1\17\4\0\1\20\4\0\6\20\1\0\1\20\3\0\2\20\4\0\1\17\1\20"+
    "\1\17\5\20\7\17\10\20\1\0\2\20\7\0\2\17\1\0\1\17\2\0\2\17\1\0\1\17\2\0\1\17"+
    "\6\0\4\17\1\0\3\17\1\0\1\17\1\0\1\17\2\0\2\17\1\0\3\17\2\20\1\0\2\20\1\17"+
    "\2\0\5\17\1\0\1\17\1\0\6\20\2\0\2\20\2\0\4\17\5\0\1\20\1\0\1\20\1\0\1\20\4"+
    "\0\2\20\5\17\10\20\11\0\1\20\1\0\7\20\1\17\2\20\4\17\3\20\1\17\3\20\2\17\7"+
    "\20\3\17\4\20\5\17\14\20\1\17\1\20\5\0\1\17\2\0\3\17\1\0\7\17\2\0\3\20\1\3"+
    "\11\17\3\20\3\0\2\17\2\20\4\0\1\17\1\0\2\20\4\0\4\17\10\20\3\0\1\17\4\0\1"+
    "\17\1\20\5\0\3\20\2\0\1\17\1\20\1\17\5\0\4\20\4\0\4\17\4\0\5\20\3\17\3\0\10"+
    "\20\5\17\2\20\3\0\3\17\3\20\1\0\5\20\4\17\1\20\4\17\3\20\2\17\2\0\1\17\1\0"+
    "\1\17\1\0\1\17\1\0\1\17\2\0\3\17\1\0\6\17\2\0\2\17\13\3\5\0\2\1\5\0\1\3\1"+
    "\20\13\0\1\20\12\0\1\3\1\0\1\20\3\0\3\20\2\0\1\17\4\0\3\17\2\0\4\17\5\0\5"+
    "\17\4\0\1\17\4\0\4\17\3\20\2\17\4\0\1\3\4\0\3\17\1\0\5\17\3\0\2\20\2\0\3\17"+
    "\6\20\1\0\3\17\1\20\3\17\1\20\4\17\1\20\4\17\3\0\1\17\1\0\1\17\2\0\5\17\1"+
    "\20\2\17\2\20\5\17\1\0\4\17\2\20\4\0\1\17\3\20\2\17\1\20\5\17\2\20\3\0\3\17"+
    "\4\0\3\17\2\20\2\0\6\17\1\0\3\20\1\0\2\20\5\0\5\17\5\0\1\17\1\20\3\17\1\0"+
    "\2\17\1\0\2\17\3\0\2\20\10\0\3\20\1\0\1\17\1\0\1\17\3\0\4\17\4\0\1\20\6\0"+
    "\2\17\2\0\3\17\3\0\3\17\1\0\2\17\1\0\1\17\5\0\1\20\2\0\1\17\3\0\1\17\2\0\4"+
    "\17\1\0\2\17\2\0\1\17\3\20\1\0\2\20\1\0\5\17\2\20\1\0\3\17\1\20\2\0\1\17\1"+
    "\0\1\20\4\17\5\0\3\20\3\0\2\20\1\17\1\0\1\17\3\0\1\17\1\0\4\17\1\0\1\17\4"+
    "\20\2\17\1\0\1\17\1\20\3\0\1\17\3\0\2\17\3\0\3\20\2\0\6\20\2\17\3\0\2\20\1"+
    "\0\2\20\3\0\6\20\2\0\3\20\2\0\4\20\4\0\1\17\2\0\2\17\2\0\4\17\1\0\4\17\1\0"+
    "\1\17\1\0\6\17\2\0\5\17\1\0\4\17\1\0\4\17\2\0\3\20\2\0\7\20\1\0\2\20\1\0\2"+
    "\20\1\0\1\17\1\0\1\17\5\0\1\17\1\0\1\17\1\0\3\17\1\0\3\17\1\0\3\17");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\1\1\3\1\4\3\5\1\6"+
    "\1\7\1\10\2\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\1\13\1\0\2\5\1\0\1\32"+
    "\4\0\1\11\1\33\1\0\2\5\1\34\1\35\1\36"+
    "\1\37\2\0\1\35";

  private static int [] zzUnpackAction() {
    int [] result = new int[52];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\54\0\130\0\204\0\260\0\54\0\334\0\u0108"+
    "\0\u0134\0\54\0\u0160\0\54\0\u018c\0\u01b8\0\54\0\54"+
    "\0\54\0\54\0\54\0\54\0\54\0\54\0\54\0\54"+
    "\0\54\0\54\0\54\0\54\0\54\0\54\0\u01e4\0\u0210"+
    "\0\u023c\0\u0268\0\u0160\0\54\0\u0294\0\u02c0\0\u02ec\0\u0318"+
    "\0\u0344\0\54\0\u0370\0\u039c\0\u03c8\0\u03f4\0\u0420\0\54"+
    "\0\u0108\0\u044c\0\u0478\0\u0478";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[52];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\3\3\1\4\1\5\1\6\1\7\3\10\1\11"+
    "\4\10\1\2\1\12\1\13\1\14\1\15\2\10\1\16"+
    "\2\10\1\17\1\10\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\1\36\1\37\55\0\3\3\54\0\1\5\1\0"+
    "\1\40\45\0\2\5\1\0\51\5\7\0\1\10\1\41"+
    "\10\10\3\0\6\10\1\0\1\10\27\0\12\10\3\0"+
    "\6\10\1\0\1\10\27\0\5\10\1\42\4\10\3\0"+
    "\6\10\1\0\1\10\20\0\22\43\1\44\1\45\30\43"+
    "\13\0\1\46\10\0\1\47\1\46\1\0\1\47\1\46"+
    "\1\0\1\50\45\0\1\16\2\0\1\16\1\0\1\51"+
    "\1\50\65\0\1\52\7\0\6\40\1\53\45\40\7\0"+
    "\2\10\1\54\7\10\3\0\6\10\1\0\1\10\27\0"+
    "\6\10\1\55\3\10\3\0\6\10\1\0\1\10\20\0"+
    "\1\43\2\0\51\43\12\0\3\56\7\0\1\56\1\0"+
    "\3\56\2\0\1\56\44\0\1\47\2\0\1\47\2\0"+
    "\1\50\45\0\1\57\2\0\1\57\50\0\1\51\2\0"+
    "\1\51\1\0\1\51\22\0\4\40\1\60\1\40\1\53"+
    "\45\40\7\0\3\10\1\61\6\10\3\0\6\10\1\0"+
    "\1\10\27\0\7\10\1\54\2\10\3\0\6\10\1\0"+
    "\1\10\32\0\3\56\7\0\1\56\1\0\4\56\1\0"+
    "\1\56\32\0\1\62\11\0\1\57\2\0\1\57\3\0"+
    "\1\62\54\0\1\63\16\0\1\63\24\0\1\64\2\0"+
    "\1\64\24\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1188];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\3\1\1\11\3\1\1\11\1\1\1\11"+
    "\2\1\20\11\1\1\1\0\2\1\1\0\1\11\4\0"+
    "\1\1\1\11\1\0\4\1\1\11\1\1\2\0\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[52];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
public _FutilLexer() {
    this((java.io.Reader)null);
}


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _FutilLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return NON_ESCAPE;
            } 
            // fall through
          case 32: break;
          case 2: 
            { return WHITE_SPACE;
            } 
            // fall through
          case 33: break;
          case 3: 
            { return COMMENT;
            } 
            // fall through
          case 34: break;
          case 4: 
            { return STAR;
            } 
            // fall through
          case 35: break;
          case 5: 
            { return SYMBOL;
            } 
            // fall through
          case 36: break;
          case 6: 
            { return AT;
            } 
            // fall through
          case 37: break;
          case 7: 
            { return QUOTATION;
            } 
            // fall through
          case 38: break;
          case 8: 
            { return ESCAPE;
            } 
            // fall through
          case 39: break;
          case 9: 
            { return INTEGER;
            } 
            // fall through
          case 40: break;
          case 10: 
            { return DOT;
            } 
            // fall through
          case 41: break;
          case 11: 
            { return SIGN;
            } 
            // fall through
          case 42: break;
          case 12: 
            { return PARENTHESIS_L;
            } 
            // fall through
          case 43: break;
          case 13: 
            { return PARENTHESIS_R;
            } 
            // fall through
          case 44: break;
          case 14: 
            { return BRACKET_L;
            } 
            // fall through
          case 45: break;
          case 15: 
            { return BRACKET_R;
            } 
            // fall through
          case 46: break;
          case 16: 
            { return BRACE_L;
            } 
            // fall through
          case 47: break;
          case 17: 
            { return BRACE_R;
            } 
            // fall through
          case 48: break;
          case 18: 
            { return ANGLE_L;
            } 
            // fall through
          case 49: break;
          case 19: 
            { return ANGLE_R;
            } 
            // fall through
          case 50: break;
          case 20: 
            { return ACCENT;
            } 
            // fall through
          case 51: break;
          case 21: 
            { return EQ;
            } 
            // fall through
          case 52: break;
          case 22: 
            { return COLON;
            } 
            // fall through
          case 53: break;
          case 23: 
            { return SEMICOLON;
            } 
            // fall through
          case 54: break;
          case 24: 
            { return COMMA;
            } 
            // fall through
          case 55: break;
          case 25: 
            { return CITE;
            } 
            // fall through
          case 56: break;
          case 26: 
            { return STRING;
            } 
            // fall through
          case 57: break;
          case 27: 
            { return TO;
            } 
            // fall through
          case 58: break;
          case 28: 
            { return BYTE;
            } 
            // fall through
          case 59: break;
          case 29: 
            { return DECIMAL;
            } 
            // fall through
          case 60: break;
          case 30: 
            { return BLOCK_COMMENT;
            } 
            // fall through
          case 61: break;
          case 31: 
            { return BOOLEAN;
            } 
            // fall through
          case 62: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
