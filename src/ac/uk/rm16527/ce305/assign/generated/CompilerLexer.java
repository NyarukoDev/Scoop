// Generated from F:/Users/Richie5000/Desktop/CE305/a2/src/ac/uk/rm16527/ce305/assign\Compiler.g4 by ANTLR 4.8
package ac.uk.rm16527.ce305.assign.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CompilerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, ADD=14, SUB=15, DIV=16, MUL=17, 
		MOD=18, POW=19, POINT=20, EQ=21, LESSEQ=22, LESS=23, GREATEREQ=24, GREATER=25, 
		SAME=26, NOTSAME=27, OR=28, AND=29, QUOTE=30, LOFPARAM=31, ROFPARAM=32, 
		TRUE=33, FALSE=34, TYPES=35, VOID=36, OTHERWISE=37, SAFE=38, DESCOPE=39, 
		NUMBER=40, UPPER=41, LOWER=42, WS=43, STRING=44, COMMENT=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "ADD", "SUB", "DIV", "MUL", "MOD", 
			"POW", "POINT", "EQ", "LESSEQ", "LESS", "GREATEREQ", "GREATER", "SAME", 
			"NOTSAME", "OR", "AND", "QUOTE", "LOFPARAM", "ROFPARAM", "TRUE", "FALSE", 
			"TYPES", "VOID", "OTHERWISE", "SAFE", "DESCOPE", "NUMBER", "UPPER", "LOWER", 
			"WS", "STRING", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'= '", "'SCOPE '", "'ITERATE '", "','", "';'", "'print '", 
			"'RESULT'", "'IF '", "' THEN'", "'ELSE '", "'ONFAIL'", "'--'", "'+'", 
			"'-'", "'/'", "'*'", "'%'", "'^'", "'.'", "' := '", "'<='", "'<'", "'>='", 
			"'>'", "'=='", "'!='", "' OR '", "' AND '", "'\"'", "'{'", "'}'", "'TRUE'", 
			"'FALSE'", null, "'VOID'", "'OTHERWISE'", "'SAFE'", "'DONE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "ADD", "SUB", "DIV", "MUL", "MOD", "POW", "POINT", "EQ", 
			"LESSEQ", "LESS", "GREATEREQ", "GREATER", "SAME", "NOTSAME", "OR", "AND", 
			"QUOTE", "LOFPARAM", "ROFPARAM", "TRUE", "FALSE", "TYPES", "VOID", "OTHERWISE", 
			"SAFE", "DESCOPE", "NUMBER", "UPPER", "LOWER", "WS", "STRING", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public CompilerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Compiler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u013f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3"+
		"#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u00f9\n$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\6)\u0115\n)\r)"+
		"\16)\u0116\3*\6*\u011a\n*\r*\16*\u011b\3+\6+\u011f\n+\r+\16+\u0120\3,"+
		"\6,\u0124\n,\r,\16,\u0125\3,\3,\3-\3-\3-\3-\7-\u012e\n-\f-\16-\u0131\13"+
		"-\3-\3-\3.\3.\3.\3.\5.\u0139\n.\3.\3.\3.\3.\3.\3\u012f\2/\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/\3\2\6\3\2\62;\3\2C\\\3\2c|\5\2\13\f\17\17\"\"\2"+
		"\u0148\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5_\3\2\2"+
		"\2\7b\3\2\2\2\ti\3\2\2\2\13r\3\2\2\2\rt\3\2\2\2\17v\3\2\2\2\21}\3\2\2"+
		"\2\23\u0084\3\2\2\2\25\u0088\3\2\2\2\27\u008e\3\2\2\2\31\u0094\3\2\2\2"+
		"\33\u009b\3\2\2\2\35\u009e\3\2\2\2\37\u00a0\3\2\2\2!\u00a2\3\2\2\2#\u00a4"+
		"\3\2\2\2%\u00a6\3\2\2\2\'\u00a8\3\2\2\2)\u00aa\3\2\2\2+\u00ac\3\2\2\2"+
		"-\u00b1\3\2\2\2/\u00b4\3\2\2\2\61\u00b6\3\2\2\2\63\u00b9\3\2\2\2\65\u00bb"+
		"\3\2\2\2\67\u00be\3\2\2\29\u00c1\3\2\2\2;\u00c6\3\2\2\2=\u00cc\3\2\2\2"+
		"?\u00ce\3\2\2\2A\u00d0\3\2\2\2C\u00d2\3\2\2\2E\u00d7\3\2\2\2G\u00f8\3"+
		"\2\2\2I\u00fa\3\2\2\2K\u00ff\3\2\2\2M\u0109\3\2\2\2O\u010e\3\2\2\2Q\u0114"+
		"\3\2\2\2S\u0119\3\2\2\2U\u011e\3\2\2\2W\u0123\3\2\2\2Y\u0129\3\2\2\2["+
		"\u0134\3\2\2\2]^\7\"\2\2^\4\3\2\2\2_`\7?\2\2`a\7\"\2\2a\6\3\2\2\2bc\7"+
		"U\2\2cd\7E\2\2de\7Q\2\2ef\7R\2\2fg\7G\2\2gh\7\"\2\2h\b\3\2\2\2ij\7K\2"+
		"\2jk\7V\2\2kl\7G\2\2lm\7T\2\2mn\7C\2\2no\7V\2\2op\7G\2\2pq\7\"\2\2q\n"+
		"\3\2\2\2rs\7.\2\2s\f\3\2\2\2tu\7=\2\2u\16\3\2\2\2vw\7r\2\2wx\7t\2\2xy"+
		"\7k\2\2yz\7p\2\2z{\7v\2\2{|\7\"\2\2|\20\3\2\2\2}~\7T\2\2~\177\7G\2\2\177"+
		"\u0080\7U\2\2\u0080\u0081\7W\2\2\u0081\u0082\7N\2\2\u0082\u0083\7V\2\2"+
		"\u0083\22\3\2\2\2\u0084\u0085\7K\2\2\u0085\u0086\7H\2\2\u0086\u0087\7"+
		"\"\2\2\u0087\24\3\2\2\2\u0088\u0089\7\"\2\2\u0089\u008a\7V\2\2\u008a\u008b"+
		"\7J\2\2\u008b\u008c\7G\2\2\u008c\u008d\7P\2\2\u008d\26\3\2\2\2\u008e\u008f"+
		"\7G\2\2\u008f\u0090\7N\2\2\u0090\u0091\7U\2\2\u0091\u0092\7G\2\2\u0092"+
		"\u0093\7\"\2\2\u0093\30\3\2\2\2\u0094\u0095\7Q\2\2\u0095\u0096\7P\2\2"+
		"\u0096\u0097\7H\2\2\u0097\u0098\7C\2\2\u0098\u0099\7K\2\2\u0099\u009a"+
		"\7N\2\2\u009a\32\3\2\2\2\u009b\u009c\7/\2\2\u009c\u009d\7/\2\2\u009d\34"+
		"\3\2\2\2\u009e\u009f\7-\2\2\u009f\36\3\2\2\2\u00a0\u00a1\7/\2\2\u00a1"+
		" \3\2\2\2\u00a2\u00a3\7\61\2\2\u00a3\"\3\2\2\2\u00a4\u00a5\7,\2\2\u00a5"+
		"$\3\2\2\2\u00a6\u00a7\7\'\2\2\u00a7&\3\2\2\2\u00a8\u00a9\7`\2\2\u00a9"+
		"(\3\2\2\2\u00aa\u00ab\7\60\2\2\u00ab*\3\2\2\2\u00ac\u00ad\7\"\2\2\u00ad"+
		"\u00ae\7<\2\2\u00ae\u00af\7?\2\2\u00af\u00b0\7\"\2\2\u00b0,\3\2\2\2\u00b1"+
		"\u00b2\7>\2\2\u00b2\u00b3\7?\2\2\u00b3.\3\2\2\2\u00b4\u00b5\7>\2\2\u00b5"+
		"\60\3\2\2\2\u00b6\u00b7\7@\2\2\u00b7\u00b8\7?\2\2\u00b8\62\3\2\2\2\u00b9"+
		"\u00ba\7@\2\2\u00ba\64\3\2\2\2\u00bb\u00bc\7?\2\2\u00bc\u00bd\7?\2\2\u00bd"+
		"\66\3\2\2\2\u00be\u00bf\7#\2\2\u00bf\u00c0\7?\2\2\u00c08\3\2\2\2\u00c1"+
		"\u00c2\7\"\2\2\u00c2\u00c3\7Q\2\2\u00c3\u00c4\7T\2\2\u00c4\u00c5\7\"\2"+
		"\2\u00c5:\3\2\2\2\u00c6\u00c7\7\"\2\2\u00c7\u00c8\7C\2\2\u00c8\u00c9\7"+
		"P\2\2\u00c9\u00ca\7F\2\2\u00ca\u00cb\7\"\2\2\u00cb<\3\2\2\2\u00cc\u00cd"+
		"\7$\2\2\u00cd>\3\2\2\2\u00ce\u00cf\7}\2\2\u00cf@\3\2\2\2\u00d0\u00d1\7"+
		"\177\2\2\u00d1B\3\2\2\2\u00d2\u00d3\7V\2\2\u00d3\u00d4\7T\2\2\u00d4\u00d5"+
		"\7W\2\2\u00d5\u00d6\7G\2\2\u00d6D\3\2\2\2\u00d7\u00d8\7H\2\2\u00d8\u00d9"+
		"\7C\2\2\u00d9\u00da\7N\2\2\u00da\u00db\7U\2\2\u00db\u00dc\7G\2\2\u00dc"+
		"F\3\2\2\2\u00dd\u00de\7K\2\2\u00de\u00df\7P\2\2\u00df\u00e0\7V\2\2\u00e0"+
		"\u00e1\7G\2\2\u00e1\u00e2\7I\2\2\u00e2\u00e3\7G\2\2\u00e3\u00f9\7T\2\2"+
		"\u00e4\u00e5\7F\2\2\u00e5\u00e6\7G\2\2\u00e6\u00e7\7E\2\2\u00e7\u00e8"+
		"\7K\2\2\u00e8\u00e9\7O\2\2\u00e9\u00ea\7C\2\2\u00ea\u00f9\7N\2\2\u00eb"+
		"\u00ec\7U\2\2\u00ec\u00ed\7V\2\2\u00ed\u00ee\7T\2\2\u00ee\u00ef\7K\2\2"+
		"\u00ef\u00f0\7P\2\2\u00f0\u00f9\7I\2\2\u00f1\u00f2\7D\2\2\u00f2\u00f3"+
		"\7Q\2\2\u00f3\u00f4\7Q\2\2\u00f4\u00f5\7N\2\2\u00f5\u00f6\7G\2\2\u00f6"+
		"\u00f7\7C\2\2\u00f7\u00f9\7P\2\2\u00f8\u00dd\3\2\2\2\u00f8\u00e4\3\2\2"+
		"\2\u00f8\u00eb\3\2\2\2\u00f8\u00f1\3\2\2\2\u00f9H\3\2\2\2\u00fa\u00fb"+
		"\7X\2\2\u00fb\u00fc\7Q\2\2\u00fc\u00fd\7K\2\2\u00fd\u00fe\7F\2\2\u00fe"+
		"J\3\2\2\2\u00ff\u0100\7Q\2\2\u0100\u0101\7V\2\2\u0101\u0102\7J\2\2\u0102"+
		"\u0103\7G\2\2\u0103\u0104\7T\2\2\u0104\u0105\7Y\2\2\u0105\u0106\7K\2\2"+
		"\u0106\u0107\7U\2\2\u0107\u0108\7G\2\2\u0108L\3\2\2\2\u0109\u010a\7U\2"+
		"\2\u010a\u010b\7C\2\2\u010b\u010c\7H\2\2\u010c\u010d\7G\2\2\u010dN\3\2"+
		"\2\2\u010e\u010f\7F\2\2\u010f\u0110\7Q\2\2\u0110\u0111\7P\2\2\u0111\u0112"+
		"\7G\2\2\u0112P\3\2\2\2\u0113\u0115\t\2\2\2\u0114\u0113\3\2\2\2\u0115\u0116"+
		"\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117R\3\2\2\2\u0118"+
		"\u011a\t\3\2\2\u0119\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0119\3\2"+
		"\2\2\u011b\u011c\3\2\2\2\u011cT\3\2\2\2\u011d\u011f\t\4\2\2\u011e\u011d"+
		"\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"V\3\2\2\2\u0122\u0124\t\5\2\2\u0123\u0122\3\2\2\2\u0124\u0125\3\2\2\2"+
		"\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128"+
		"\b,\2\2\u0128X\3\2\2\2\u0129\u012f\7$\2\2\u012a\u012b\7^\2\2\u012b\u012e"+
		"\7$\2\2\u012c\u012e\13\2\2\2\u012d\u012a\3\2\2\2\u012d\u012c\3\2\2\2\u012e"+
		"\u0131\3\2\2\2\u012f\u0130\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0132\3\2"+
		"\2\2\u0131\u012f\3\2\2\2\u0132\u0133\7$\2\2\u0133Z\3\2\2\2\u0134\u0135"+
		"\7/\2\2\u0135\u0136\7/\2\2\u0136\u0138\3\2\2\2\u0137\u0139\13\2\2\2\u0138"+
		"\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\7/"+
		"\2\2\u013b\u013c\7/\2\2\u013c\u013d\3\2\2\2\u013d\u013e\b.\2\2\u013e\\"+
		"\3\2\2\2\13\2\u00f8\u0116\u011b\u0120\u0125\u012d\u012f\u0138\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}