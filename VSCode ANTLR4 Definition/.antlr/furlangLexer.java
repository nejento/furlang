// Generated from /home/nejento/PRK/furlang/furlang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class furlangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, TYPE=6, BINDEC=7, DECBIN=8, FURRY=9, 
		NON_ZERO_DIGIT=10, DIGIT=11, INT_DEFAULT=12, INT=13, BINARY_DEFAULT=14, 
		BINARY=15, STRING=16, ANIMALLIST=17, ANIMALS=18, ANIMAL=19, COMMENT=20, 
		NEWLINE=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "TYPE", "BINDEC", "DECBIN", "FURRY", 
			"NON_ZERO_DIGIT", "DIGIT", "INT_DEFAULT", "INT", "BINARY_DEFAULT", "BINARY", 
			"STRING", "ANIMALLIST", "ANIMALS", "ANIMAL", "COMMENT", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'+'", "'%'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "TYPE", "BINDEC", "DECBIN", "FURRY", 
			"NON_ZERO_DIGIT", "DIGIT", "INT_DEFAULT", "INT", "BINARY_DEFAULT", "BINARY", 
			"STRING", "ANIMALLIST", "ANIMALS", "ANIMAL", "COMMENT", "NEWLINE", "WS"
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


	public furlangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "furlang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u00d7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7B\n\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\5\fh\n\f\3\r\3\r\7\rl\n\r\f\r\16\ro\13\r\3\16\3\16\5\16s\n\16\3\17"+
		"\3\17\3\17\6\17x\n\17\r\17\16\17y\3\20\3\20\5\20~\n\20\3\21\3\21\7\21"+
		"\u0082\n\21\f\21\16\21\u0085\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00b5\n\22"+
		"\3\23\3\23\3\23\3\23\5\23\u00bb\n\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\7\25\u00c4\n\25\f\25\16\25\u00c7\13\25\3\25\3\25\3\25\3\26\6\26\u00cd"+
		"\n\26\r\26\16\26\u00ce\3\27\6\27\u00d2\n\27\r\27\16\27\u00d3\3\27\3\27"+
		"\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\6\3\2$$\4\2##%%\4\2\f\f"+
		"\17\17\4\2\13\13\"\"\2\u00f0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2\2\2\7\63\3\2\2\2\t\65\3\2\2\2\13"+
		"\67\3\2\2\2\rA\3\2\2\2\17C\3\2\2\2\21N\3\2\2\2\23Y\3\2\2\2\25c\3\2\2\2"+
		"\27g\3\2\2\2\31i\3\2\2\2\33r\3\2\2\2\35t\3\2\2\2\37}\3\2\2\2!\177\3\2"+
		"\2\2#\u00b4\3\2\2\2%\u00ba\3\2\2\2\'\u00bc\3\2\2\2)\u00bf\3\2\2\2+\u00cc"+
		"\3\2\2\2-\u00d1\3\2\2\2/\60\7,\2\2\60\4\3\2\2\2\61\62\7-\2\2\62\6\3\2"+
		"\2\2\63\64\7\'\2\2\64\b\3\2\2\2\65\66\7*\2\2\66\n\3\2\2\2\678\7+\2\28"+
		"\f\3\2\2\29B\5\33\16\2:B\5\37\20\2;B\5!\21\2<B\5\'\24\2=B\5)\25\2>B\5"+
		"\17\b\2?B\5\21\t\2@B\5\23\n\2A9\3\2\2\2A:\3\2\2\2A;\3\2\2\2A<\3\2\2\2"+
		"A=\3\2\2\2A>\3\2\2\2A?\3\2\2\2A@\3\2\2\2B\16\3\2\2\2CD\7d\2\2DE\7k\2\2"+
		"EF\7p\2\2FG\7f\2\2GH\7g\2\2HI\7e\2\2IJ\7*\2\2JK\3\2\2\2KL\5\37\20\2LM"+
		"\7+\2\2M\20\3\2\2\2NO\7f\2\2OP\7g\2\2PQ\7e\2\2QR\7d\2\2RS\7k\2\2ST\7p"+
		"\2\2TU\7*\2\2UV\3\2\2\2VW\5\33\16\2WX\7+\2\2X\22\3\2\2\2YZ\7h\2\2Z[\7"+
		"w\2\2[\\\7t\2\2\\]\7t\2\2]^\7{\2\2^_\7*\2\2_`\3\2\2\2`a\5\33\16\2ab\7"+
		"+\2\2b\24\3\2\2\2cd\4\63;\2d\26\3\2\2\2eh\7\62\2\2fh\5\25\13\2ge\3\2\2"+
		"\2gf\3\2\2\2h\30\3\2\2\2im\5\25\13\2jl\5\27\f\2kj\3\2\2\2lo\3\2\2\2mk"+
		"\3\2\2\2mn\3\2\2\2n\32\3\2\2\2om\3\2\2\2ps\5\31\r\2qs\5\17\b\2rp\3\2\2"+
		"\2rq\3\2\2\2s\34\3\2\2\2tu\7d\2\2uw\4\62\63\2vx\4\62\63\2wv\3\2\2\2xy"+
		"\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\36\3\2\2\2{~\5\35\17\2|~\5\21\t\2}{\3\2"+
		"\2\2}|\3\2\2\2~ \3\2\2\2\177\u0083\7$\2\2\u0080\u0082\n\2\2\2\u0081\u0080"+
		"\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7$\2\2\u0087\"\3\2\2\2"+
		"\u0088\u0089\7R\2\2\u0089\u008a\7g\2\2\u008a\u00b5\7u\2\2\u008b\u008c"+
		"\7M\2\2\u008c\u008d\7q\2\2\u008d\u008e\7\u010f\2\2\u008e\u008f\7m\2\2"+
		"\u008f\u00b5\7c\2\2\u0090\u0091\7O\2\2\u0091\u0092\7\u00ff\2\2\u0092\u0093"+
		"\7x\2\2\u0093\u0094\7c\2\2\u0094\u00b5\7n\2\2\u0095\u0096\7X\2\2\u0096"+
		"\u0097\7n\2\2\u0097\u00b5\7m\2\2\u0098\u0099\7N\2\2\u0099\u009a\7k\2\2"+
		"\u009a\u009b\7\u0163\2\2\u009b\u009c\7m\2\2\u009c\u00b5\7c\2\2\u009d\u009e"+
		"\7N\2\2\u009e\u009f\7g\2\2\u009f\u00b5\7x\2\2\u00a0\u00a1\7F\2\2\u00a1"+
		"\u00a2\7t\2\2\u00a2\u00a3\7c\2\2\u00a3\u00b5\7m\2\2\u00a4\u00a5\7L\2\2"+
		"\u00a5\u00a6\7g\2\2\u00a6\u00a7\7n\2\2\u00a7\u00a8\7g\2\2\u00a8\u00b5"+
		"\7p\2\2\u00a9\u00aa\7M\2\2\u00aa\u00ab\7\u0171\2\2\u00ab\u00b5\7\u014a"+
		"\2\2\u00ac\u00ad\7R\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7q\2\2\u00af\u00b0"+
		"\7v\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7i\2\2\u00b2\u00b3\7g\2\2\u00b3"+
		"\u00b5\7p\2\2\u00b4\u0088\3\2\2\2\u00b4\u008b\3\2\2\2\u00b4\u0090\3\2"+
		"\2\2\u00b4\u0095\3\2\2\2\u00b4\u0098\3\2\2\2\u00b4\u009d\3\2\2\2\u00b4"+
		"\u00a0\3\2\2\2\u00b4\u00a4\3\2\2\2\u00b4\u00a9\3\2\2\2\u00b4\u00ac\3\2"+
		"\2\2\u00b5$\3\2\2\2\u00b6\u00bb\5#\22\2\u00b7\u00b8\5#\22\2\u00b8\u00b9"+
		"\5%\23\2\u00b9\u00bb\3\2\2\2\u00ba\u00b6\3\2\2\2\u00ba\u00b7\3\2\2\2\u00bb"+
		"&\3\2\2\2\u00bc\u00bd\7h\2\2\u00bd\u00be\5%\23\2\u00be(\3\2\2\2\u00bf"+
		"\u00c0\7%\2\2\u00c0\u00c1\7#\2\2\u00c1\u00c5\3\2\2\2\u00c2\u00c4\n\3\2"+
		"\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6"+
		"\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7#\2\2\u00c9"+
		"\u00ca\7%\2\2\u00ca*\3\2\2\2\u00cb\u00cd\t\4\2\2\u00cc\u00cb\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf,\3\2\2\2"+
		"\u00d0\u00d2\t\5\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1"+
		"\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\b\27\2\2"+
		"\u00d6.\3\2\2\2\17\2Agmry}\u0083\u00b4\u00ba\u00c5\u00ce\u00d3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}