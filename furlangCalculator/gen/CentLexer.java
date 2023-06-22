// Generated from D:/Projects/Java DEV/furlang/furlangCalculator/src/main/antlr4/eu/nejento/furlangcalculator/calculator\Furlang.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CentLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, MULTI=4, PLUS=5, AND=6, OR=7, XOR=8, NOT=9, INT=10, 
		MINT=11, BINARY=12, MINUS=13, BINSTART=14, BINDIG=15, WS=16, NEWLINE=17, 
		ErrorChar=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "MULTI", "PLUS", "AND", "OR", "XOR", "NOT", "INT", 
			"MINT", "BINARY", "MINUS", "BINSTART", "BINDIG", "WS", "NEWLINE", "ErrorChar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'a'", "'*'", "'+'", "'&'", "'|'", "'^'", "'~'", 
			null, null, null, "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "MULTI", "PLUS", "AND", "OR", "XOR", "NOT", "INT", 
			"MINT", "BINARY", "MINUS", "BINSTART", "BINDIG", "WS", "NEWLINE", "ErrorChar"
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


	public CentLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Furlang.g4"; }

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
		"\u0004\u0000\u0012b\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0005\t:\b\t\n\t\f\t=\t\t\u0001\t\u0003\t@\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0004\u000bG\b\u000b\u000b\u000b\f\u000bH\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\rQ\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0004\u000fV\b\u000f\u000b\u000f\f\u000fW\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0004\u0010]\b\u0010\u000b\u0010\f\u0010^\u0001"+
		"\u0011\u0001\u0011\u0000\u0000\u0012\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"\u0001\u0000\u0002\u0002\u0000\t\t  \u0002\u0000\n\n\r\rg\u0000\u0001"+
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
		"\u0000\u0000\u0000\t-\u0001\u0000\u0000\u0000\u000b/\u0001\u0000\u0000"+
		"\u0000\r1\u0001\u0000\u0000\u0000\u000f3\u0001\u0000\u0000\u0000\u0011"+
		"5\u0001\u0000\u0000\u0000\u0013?\u0001\u0000\u0000\u0000\u0015A\u0001"+
		"\u0000\u0000\u0000\u0017D\u0001\u0000\u0000\u0000\u0019J\u0001\u0000\u0000"+
		"\u0000\u001bP\u0001\u0000\u0000\u0000\u001dR\u0001\u0000\u0000\u0000\u001f"+
		"U\u0001\u0000\u0000\u0000!\\\u0001\u0000\u0000\u0000#`\u0001\u0000\u0000"+
		"\u0000%&\u0005(\u0000\u0000&\u0002\u0001\u0000\u0000\u0000\'(\u0005)\u0000"+
		"\u0000(\u0004\u0001\u0000\u0000\u0000)*\u0005a\u0000\u0000*\u0006\u0001"+
		"\u0000\u0000\u0000+,\u0005*\u0000\u0000,\b\u0001\u0000\u0000\u0000-.\u0005"+
		"+\u0000\u0000.\n\u0001\u0000\u0000\u0000/0\u0005&\u0000\u00000\f\u0001"+
		"\u0000\u0000\u000012\u0005|\u0000\u00002\u000e\u0001\u0000\u0000\u0000"+
		"34\u0005^\u0000\u00004\u0010\u0001\u0000\u0000\u000056\u0005~\u0000\u0000"+
		"6\u0012\u0001\u0000\u0000\u00007;\u000219\u00008:\u000209\u000098\u0001"+
		"\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000"+
		";<\u0001\u0000\u0000\u0000<@\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000"+
		"\u0000>@\u00050\u0000\u0000?7\u0001\u0000\u0000\u0000?>\u0001\u0000\u0000"+
		"\u0000@\u0014\u0001\u0000\u0000\u0000AB\u0005-\u0000\u0000BC\u0003\u0013"+
		"\t\u0000C\u0016\u0001\u0000\u0000\u0000DF\u0003\u001b\r\u0000EG\u0003"+
		"\u001d\u000e\u0000FE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000"+
		"HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000I\u0018\u0001\u0000"+
		"\u0000\u0000JK\u0005-\u0000\u0000K\u001a\u0001\u0000\u0000\u0000LM\u0005"+
		"0\u0000\u0000MQ\u0005B\u0000\u0000NO\u00050\u0000\u0000OQ\u0005b\u0000"+
		"\u0000PL\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000Q\u001c\u0001"+
		"\u0000\u0000\u0000RS\u000201\u0000S\u001e\u0001\u0000\u0000\u0000TV\u0007"+
		"\u0000\u0000\u0000UT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000"+
		"WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000"+
		"\u0000YZ\u0006\u000f\u0000\u0000Z \u0001\u0000\u0000\u0000[]\u0007\u0001"+
		"\u0000\u0000\\[\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\\\u0001"+
		"\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_\"\u0001\u0000\u0000\u0000"+
		"`a\t\u0000\u0000\u0000a$\u0001\u0000\u0000\u0000\u0007\u0000;?HPW^\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}