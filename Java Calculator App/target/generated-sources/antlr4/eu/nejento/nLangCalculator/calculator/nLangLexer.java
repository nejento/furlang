// Generated from eu\nejento\nLangCalculator\calculator\nLang.g4 by ANTLR 4.10.1
package eu.nejento.nLangCalculator.calculator;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class nLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, TYPE=6, BINDEC=7, DECBIN=8, NON_ZERO_DIGIT=9, 
		DIGIT=10, INT_DEFAULT=11, INT=12, BINARY_DEFAULT=13, BINARY=14, STRING=15, 
		COMMENT=16, NEWLINE=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "TYPE", "BINDEC", "DECBIN", "NON_ZERO_DIGIT", 
			"DIGIT", "INT_DEFAULT", "INT", "BINARY_DEFAULT", "BINARY", "STRING", 
			"COMMENT", "NEWLINE", "WS"
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
			null, null, null, null, null, null, "TYPE", "BINDEC", "DECBIN", "NON_ZERO_DIGIT", 
			"DIGIT", "INT_DEFAULT", "INT", "BINARY_DEFAULT", "BINARY", "STRING", 
			"COMMENT", "NEWLINE", "WS"
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


	public nLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "nLang.g4"; }

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
		"\u0004\u0000\u0012\u0089\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u00056\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0003\tR\b\t\u0001\n\u0001\n\u0005\nV\b\n\n\n\f\nY\t\n\u0001"+
		"\u000b\u0001\u000b\u0003\u000b]\b\u000b\u0001\f\u0001\f\u0004\fa\b\f\u000b"+
		"\f\f\fb\u0001\r\u0001\r\u0003\rg\b\r\u0001\u000e\u0001\u000e\u0005\u000e"+
		"k\b\u000e\n\u000e\f\u000en\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000fv\b\u000f\n\u000f\f\u000f"+
		"y\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0004\u0010"+
		"\u007f\b\u0010\u000b\u0010\f\u0010\u0080\u0001\u0011\u0004\u0011\u0084"+
		"\b\u0011\u000b\u0011\f\u0011\u0085\u0001\u0011\u0001\u0011\u0000\u0000"+
		"\u0012\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012\u0001\u0000\u0004\u0001\u0000\""+
		"\"\u0002\u0000!!##\u0002\u0000\n\n\r\r\u0002\u0000\t\t  \u0096\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0001%\u0001\u0000\u0000\u0000\u0003"+
		"\'\u0001\u0000\u0000\u0000\u0005)\u0001\u0000\u0000\u0000\u0007+\u0001"+
		"\u0000\u0000\u0000\t-\u0001\u0000\u0000\u0000\u000b5\u0001\u0000\u0000"+
		"\u0000\r7\u0001\u0000\u0000\u0000\u000fB\u0001\u0000\u0000\u0000\u0011"+
		"M\u0001\u0000\u0000\u0000\u0013Q\u0001\u0000\u0000\u0000\u0015S\u0001"+
		"\u0000\u0000\u0000\u0017\\\u0001\u0000\u0000\u0000\u0019^\u0001\u0000"+
		"\u0000\u0000\u001bf\u0001\u0000\u0000\u0000\u001dh\u0001\u0000\u0000\u0000"+
		"\u001fq\u0001\u0000\u0000\u0000!~\u0001\u0000\u0000\u0000#\u0083\u0001"+
		"\u0000\u0000\u0000%&\u0005*\u0000\u0000&\u0002\u0001\u0000\u0000\u0000"+
		"\'(\u0005+\u0000\u0000(\u0004\u0001\u0000\u0000\u0000)*\u0005%\u0000\u0000"+
		"*\u0006\u0001\u0000\u0000\u0000+,\u0005(\u0000\u0000,\b\u0001\u0000\u0000"+
		"\u0000-.\u0005)\u0000\u0000.\n\u0001\u0000\u0000\u0000/6\u0003\u0017\u000b"+
		"\u000006\u0003\u001b\r\u000016\u0003\u001d\u000e\u000026\u0003\u001f\u000f"+
		"\u000036\u0003\r\u0006\u000046\u0003\u000f\u0007\u00005/\u0001\u0000\u0000"+
		"\u000050\u0001\u0000\u0000\u000051\u0001\u0000\u0000\u000052\u0001\u0000"+
		"\u0000\u000053\u0001\u0000\u0000\u000054\u0001\u0000\u0000\u00006\f\u0001"+
		"\u0000\u0000\u000078\u0005b\u0000\u000089\u0005i\u0000\u00009:\u0005n"+
		"\u0000\u0000:;\u0005d\u0000\u0000;<\u0005e\u0000\u0000<=\u0005c\u0000"+
		"\u0000=>\u0005(\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0003\u001b\r"+
		"\u0000@A\u0005)\u0000\u0000A\u000e\u0001\u0000\u0000\u0000BC\u0005d\u0000"+
		"\u0000CD\u0005e\u0000\u0000DE\u0005c\u0000\u0000EF\u0005b\u0000\u0000"+
		"FG\u0005i\u0000\u0000GH\u0005n\u0000\u0000HI\u0005(\u0000\u0000IJ\u0001"+
		"\u0000\u0000\u0000JK\u0003\u0017\u000b\u0000KL\u0005)\u0000\u0000L\u0010"+
		"\u0001\u0000\u0000\u0000MN\u000219\u0000N\u0012\u0001\u0000\u0000\u0000"+
		"OR\u00050\u0000\u0000PR\u0003\u0011\b\u0000QO\u0001\u0000\u0000\u0000"+
		"QP\u0001\u0000\u0000\u0000R\u0014\u0001\u0000\u0000\u0000SW\u0003\u0011"+
		"\b\u0000TV\u0003\u0013\t\u0000UT\u0001\u0000\u0000\u0000VY\u0001\u0000"+
		"\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000X\u0016"+
		"\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Z]\u0003\u0015\n\u0000"+
		"[]\u0003\r\u0006\u0000\\Z\u0001\u0000\u0000\u0000\\[\u0001\u0000\u0000"+
		"\u0000]\u0018\u0001\u0000\u0000\u0000^`\u0005b\u0000\u0000_a\u000201\u0000"+
		"`_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000"+
		"\u0000bc\u0001\u0000\u0000\u0000c\u001a\u0001\u0000\u0000\u0000dg\u0003"+
		"\u0019\f\u0000eg\u0003\u000f\u0007\u0000fd\u0001\u0000\u0000\u0000fe\u0001"+
		"\u0000\u0000\u0000g\u001c\u0001\u0000\u0000\u0000hl\u0005\"\u0000\u0000"+
		"ik\b\u0000\u0000\u0000ji\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000"+
		"lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mo\u0001\u0000\u0000"+
		"\u0000nl\u0001\u0000\u0000\u0000op\u0005\"\u0000\u0000p\u001e\u0001\u0000"+
		"\u0000\u0000qr\u0005#\u0000\u0000rs\u0005!\u0000\u0000sw\u0001\u0000\u0000"+
		"\u0000tv\b\u0001\u0000\u0000ut\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000"+
		"\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xz\u0001\u0000"+
		"\u0000\u0000yw\u0001\u0000\u0000\u0000z{\u0005!\u0000\u0000{|\u0005#\u0000"+
		"\u0000| \u0001\u0000\u0000\u0000}\u007f\u0007\u0002\u0000\u0000~}\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080~\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\"\u0001\u0000\u0000"+
		"\u0000\u0082\u0084\u0007\u0003\u0000\u0000\u0083\u0082\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0006\u0011\u0000\u0000\u0088$\u0001\u0000\u0000\u0000"+
		"\u000b\u00005QW\\bflw\u0080\u0085\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}