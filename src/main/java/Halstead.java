// Generated from G:/InfProjekte/Halstead/src/main/java\Halstead.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Halstead extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPERATOR=1, IGNORE=2, OPERAND=3, RESERVED=4;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OPERATOR", "IGNORE", "OPERAND", "RESERVED", "OPERATORS", "TYPE_QUAL", 
			"SCSPEC", "CONSTANT", "TYPESPEC", "IDENTIFIER", "FLOAT", "STRING", "INT", 
			"INLINECOMMENT", "COMMENT", "INCLUDE", "SHOULD_SKIP", "DIGIT", "LETTER", 
			"LETTERBIG", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPERATOR", "IGNORE", "OPERAND", "RESERVED"
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


	public Halstead(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Halstead.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\6\u0289\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\5\2\62\n\2\3"+
		"\3\3\3\3\3\3\3\3\3\5\39\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4C\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5\u013a\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0177\n\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u018c\n"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u01c1\n\b\3\t\3\t\3\t\7\t\u01c6\n\t\f\t\16\t\u01c9\13\t\3\t\6\t\u01cc"+
		"\n\t\r\t\16\t\u01cd\3\t\5\t\u01d1\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0204\n\n\3\13\3\13\3\13\7\13\u0209\n\13"+
		"\f\13\16\13\u020c\13\13\3\f\6\f\u020f\n\f\r\f\16\f\u0210\3\f\3\f\7\f\u0215"+
		"\n\f\f\f\16\f\u0218\13\f\3\f\3\f\6\f\u021c\n\f\r\f\16\f\u021d\3\f\3\f"+
		"\6\f\u0222\n\f\r\f\16\f\u0223\3\f\3\f\7\f\u0228\n\f\f\f\16\f\u022b\13"+
		"\f\5\f\u022d\n\f\3\r\3\r\7\r\u0231\n\r\f\r\16\r\u0234\13\r\3\r\3\r\3\r"+
		"\7\r\u0239\n\r\f\r\16\r\u023c\13\r\3\r\5\r\u023f\n\r\3\16\6\16\u0242\n"+
		"\16\r\16\16\16\u0243\3\17\3\17\3\17\3\17\7\17\u024a\n\17\f\17\16\17\u024d"+
		"\13\17\3\20\3\20\3\20\3\20\7\20\u0253\n\20\f\20\16\20\u0256\13\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0265"+
		"\n\21\f\21\16\21\u0268\13\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\7\21\u0275\n\21\f\21\16\21\u0278\13\21\3\21\5\21\u027b\n"+
		"\21\3\22\3\22\3\22\5\22\u0280\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\7\u0232\u023a\u0254\u0266\u0276\2\27\3\3\5\4\7\5\t\6\13\2\r\2\17"+
		"\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2\3\2\13\4"+
		"\2**,,\5\2AA]]``\5\2==??\u0080\u0080\4\2\f\f\17\17\6\2++<<__\177\177\3"+
		"\2\62;\5\2C\\aac|\4\2C\\aa\5\2\13\f\17\17\"\"\2\u02f4\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\3\61\3\2\2\2\58\3\2\2\2\7B\3\2\2\2\t"+
		"\u0139\3\2\2\2\13\u0176\3\2\2\2\r\u018b\3\2\2\2\17\u01c0\3\2\2\2\21\u01d0"+
		"\3\2\2\2\23\u0203\3\2\2\2\25\u0205\3\2\2\2\27\u022c\3\2\2\2\31\u023e\3"+
		"\2\2\2\33\u0241\3\2\2\2\35\u0245\3\2\2\2\37\u024e\3\2\2\2!\u027a\3\2\2"+
		"\2#\u027f\3\2\2\2%\u0281\3\2\2\2\'\u0283\3\2\2\2)\u0285\3\2\2\2+\u0287"+
		"\3\2\2\2-\62\5\t\5\2.\62\5\17\b\2/\62\5\r\7\2\60\62\5\13\6\2\61-\3\2\2"+
		"\2\61.\3\2\2\2\61/\3\2\2\2\61\60\3\2\2\2\62\4\3\2\2\2\639\5\37\20\2\64"+
		"9\5\35\17\2\659\5#\22\2\669\5!\21\2\679\5+\26\28\63\3\2\2\28\64\3\2\2"+
		"\28\65\3\2\2\28\66\3\2\2\28\67\3\2\2\29:\3\2\2\2:;\b\3\2\2;\6\3\2\2\2"+
		"<C\5\23\n\2=C\5\25\13\2>C\5\33\16\2?C\5\27\f\2@C\5\21\t\2AC\5\31\r\2B"+
		"<\3\2\2\2B=\3\2\2\2B>\3\2\2\2B?\3\2\2\2B@\3\2\2\2BA\3\2\2\2C\b\3\2\2\2"+
		"DE\7c\2\2EF\7u\2\2F\u013a\7o\2\2GH\7d\2\2HI\7t\2\2IJ\7g\2\2JK\7c\2\2K"+
		"\u013a\7m\2\2LM\7e\2\2MN\7c\2\2NO\7u\2\2O\u013a\7g\2\2PQ\7e\2\2QR\7n\2"+
		"\2RS\7c\2\2ST\7u\2\2T\u013a\7u\2\2UV\7e\2\2VW\7q\2\2WX\7p\2\2XY\7v\2\2"+
		"YZ\7k\2\2Z[\7p\2\2[\\\7w\2\2\\\u013a\7g\2\2]^\7f\2\2^_\7g\2\2_`\7h\2\2"+
		"`a\7c\2\2ab\7w\2\2bc\7n\2\2c\u013a\7v\2\2de\7f\2\2ef\7g\2\2fg\7n\2\2g"+
		"h\7g\2\2hi\7v\2\2i\u013a\7g\2\2jk\7y\2\2kl\7j\2\2lm\7k\2\2mn\7n\2\2no"+
		"\7g\2\2o\u013a\7*\2\2pq\7g\2\2qr\7n\2\2rs\7u\2\2s\u013a\7g\2\2tu\7g\2"+
		"\2uv\7p\2\2vw\7w\2\2w\u013a\7o\2\2xy\7h\2\2yz\7q\2\2z{\7t\2\2{\u013a\7"+
		"*\2\2|}\7i\2\2}~\7q\2\2~\177\7v\2\2\177\u013a\7q\2\2\u0080\u0081\7k\2"+
		"\2\u0081\u0082\7h\2\2\u0082\u013a\7*\2\2\u0083\u0084\7p\2\2\u0084\u0085"+
		"\7g\2\2\u0085\u013a\7y\2\2\u0086\u0087\7q\2\2\u0087\u0088\7r\2\2\u0088"+
		"\u0089\7g\2\2\u0089\u008a\7t\2\2\u008a\u008b\7c\2\2\u008b\u008c\7v\2\2"+
		"\u008c\u008d\7q\2\2\u008d\u013a\7t\2\2\u008e\u008f\7r\2\2\u008f\u0090"+
		"\7t\2\2\u0090\u0091\7k\2\2\u0091\u0092\7x\2\2\u0092\u0093\7c\2\2\u0093"+
		"\u0094\7v\2\2\u0094\u013a\7g\2\2\u0095\u0096\7r\2\2\u0096\u0097\7t\2\2"+
		"\u0097\u0098\7q\2\2\u0098\u0099\7v\2\2\u0099\u009a\7g\2\2\u009a\u009b"+
		"\7e\2\2\u009b\u009c\7v\2\2\u009c\u009d\7g\2\2\u009d\u013a\7f\2\2\u009e"+
		"\u009f\7r\2\2\u009f\u00a0\7w\2\2\u00a0\u00a1\7d\2\2\u00a1\u00a2\7n\2\2"+
		"\u00a2\u00a3\7k\2\2\u00a3\u013a\7e\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6"+
		"\7g\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8\7w\2\2\u00a8\u00a9\7t\2\2\u00a9"+
		"\u013a\7p\2\2\u00aa\u00ab\7u\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7|\2\2"+
		"\u00ad\u00ae\7g\2\2\u00ae\u00af\7q\2\2\u00af\u013a\7h\2\2\u00b0\u00b1"+
		"\7u\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7w\2\2\u00b4"+
		"\u00b5\7e\2\2\u00b5\u013a\7v\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8\7y\2\2"+
		"\u00b8\u00b9\7k\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bb\7e\2\2\u00bb\u00bc"+
		"\7j\2\2\u00bc\u013a\7*\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7j\2\2\u00bf"+
		"\u00c0\7k\2\2\u00c0\u013a\7u\2\2\u00c1\u00c2\7w\2\2\u00c2\u00c3\7p\2\2"+
		"\u00c3\u00c4\7k\2\2\u00c4\u00c5\7q\2\2\u00c5\u013a\7p\2\2\u00c6\u00c7"+
		"\7p\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7o\2\2\u00c9\u00ca\7g\2\2\u00ca"+
		"\u00cb\7u\2\2\u00cb\u00cc\7r\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7e\2\2"+
		"\u00ce\u013a\7g\2\2\u00cf\u00d0\7w\2\2\u00d0\u00d1\7u\2\2\u00d1\u00d2"+
		"\7k\2\2\u00d2\u00d3\7p\2\2\u00d3\u013a\7i\2\2\u00d4\u00d5\7v\2\2\u00d5"+
		"\u00d6\7t\2\2\u00d6\u013a\7{\2\2\u00d7\u00d8\7e\2\2\u00d8\u00d9\7c\2\2"+
		"\u00d9\u00da\7v\2\2\u00da\u00db\7e\2\2\u00db\u013a\7j\2\2\u00dc\u00dd"+
		"\7v\2\2\u00dd\u00de\7j\2\2\u00de\u00df\7t\2\2\u00df\u00e0\7q\2\2\u00e0"+
		"\u013a\7y\2\2\u00e1\u00e2\7e\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4\7p\2\2"+
		"\u00e4\u00e5\7u\2\2\u00e5\u00e6\7v\2\2\u00e6\u00e7\7a\2\2\u00e7\u00e8"+
		"\7e\2\2\u00e8\u00e9\7c\2\2\u00e9\u00ea\7u\2\2\u00ea\u013a\7v\2\2\u00eb"+
		"\u00ec\7u\2\2\u00ec\u00ed\7v\2\2\u00ed\u00ee\7c\2\2\u00ee\u00ef\7v\2\2"+
		"\u00ef\u00f0\7k\2\2\u00f0\u00f1\7e\2\2\u00f1\u00f2\7a\2\2\u00f2\u00f3"+
		"\7e\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7u\2\2\u00f5\u013a\7v\2\2\u00f6"+
		"\u00f7\7f\2\2\u00f7\u00f8\7{\2\2\u00f8\u00f9\7p\2\2\u00f9\u00fa\7c\2\2"+
		"\u00fa\u00fb\7o\2\2\u00fb\u00fc\7k\2\2\u00fc\u00fd\7e\2\2\u00fd\u00fe"+
		"\7a\2\2\u00fe\u00ff\7e\2\2\u00ff\u0100\7c\2\2\u0100\u0101\7u\2\2\u0101"+
		"\u013a\7v\2\2\u0102\u0103\7t\2\2\u0103\u0104\7g\2\2\u0104\u0105\7k\2\2"+
		"\u0105\u0106\7p\2\2\u0106\u0107\7v\2\2\u0107\u0108\7g\2\2\u0108\u0109"+
		"\7t\2\2\u0109\u010a\7r\2\2\u010a\u010b\7t\2\2\u010b\u010c\7g\2\2\u010c"+
		"\u010d\7v\2\2\u010d\u010e\7a\2\2\u010e\u010f\7e\2\2\u010f\u0110\7c\2\2"+
		"\u0110\u0111\7u\2\2\u0111\u013a\7v\2\2\u0112\u0113\7v\2\2\u0113\u0114"+
		"\7{\2\2\u0114\u0115\7r\2\2\u0115\u0116\7g\2\2\u0116\u0117\7k\2\2\u0117"+
		"\u013a\7f\2\2\u0118\u0119\7v\2\2\u0119\u011a\7g\2\2\u011a\u011b\7o\2\2"+
		"\u011b\u011c\7r\2\2\u011c\u011d\7n\2\2\u011d\u011e\7c\2\2\u011e\u011f"+
		"\7v\2\2\u011f\u013a\7g\2\2\u0120\u0121\7g\2\2\u0121\u0122\7z\2\2\u0122"+
		"\u0123\7r\2\2\u0123\u0124\7n\2\2\u0124\u0125\7k\2\2\u0125\u0126\7e\2\2"+
		"\u0126\u0127\7k\2\2\u0127\u013a\7v\2\2\u0128\u0129\7v\2\2\u0129\u012a"+
		"\7t\2\2\u012a\u012b\7w\2\2\u012b\u013a\7g\2\2\u012c\u012d\7h\2\2\u012d"+
		"\u012e\7c\2\2\u012e\u012f\7n\2\2\u012f\u0130\7u\2\2\u0130\u013a\7g\2\2"+
		"\u0131\u0132\7v\2\2\u0132\u0133\7{\2\2\u0133\u0134\7r\2\2\u0134\u0135"+
		"\7g\2\2\u0135\u0136\7p\2\2\u0136\u0137\7c\2\2\u0137\u0138\7o\2\2\u0138"+
		"\u013a\7g\2\2\u0139D\3\2\2\2\u0139G\3\2\2\2\u0139L\3\2\2\2\u0139P\3\2"+
		"\2\2\u0139U\3\2\2\2\u0139]\3\2\2\2\u0139d\3\2\2\2\u0139j\3\2\2\2\u0139"+
		"p\3\2\2\2\u0139t\3\2\2\2\u0139x\3\2\2\2\u0139|\3\2\2\2\u0139\u0080\3\2"+
		"\2\2\u0139\u0083\3\2\2\2\u0139\u0086\3\2\2\2\u0139\u008e\3\2\2\2\u0139"+
		"\u0095\3\2\2\2\u0139\u009e\3\2\2\2\u0139\u00a4\3\2\2\2\u0139\u00aa\3\2"+
		"\2\2\u0139\u00b0\3\2\2\2\u0139\u00b6\3\2\2\2\u0139\u00bd\3\2\2\2\u0139"+
		"\u00c1\3\2\2\2\u0139\u00c6\3\2\2\2\u0139\u00cf\3\2\2\2\u0139\u00d4\3\2"+
		"\2\2\u0139\u00d7\3\2\2\2\u0139\u00dc\3\2\2\2\u0139\u00e1\3\2\2\2\u0139"+
		"\u00eb\3\2\2\2\u0139\u00f6\3\2\2\2\u0139\u0102\3\2\2\2\u0139\u0112\3\2"+
		"\2\2\u0139\u0118\3\2\2\2\u0139\u0120\3\2\2\2\u0139\u0128\3\2\2\2\u0139"+
		"\u012c\3\2\2\2\u0139\u0131\3\2\2\2\u013a\n\3\2\2\2\u013b\u0177\7#\2\2"+
		"\u013c\u013d\7#\2\2\u013d\u0177\7?\2\2\u013e\u0177\7\'\2\2\u013f\u0140"+
		"\7\'\2\2\u0140\u0177\7?\2\2\u0141\u0177\7(\2\2\u0142\u0143\7(\2\2\u0143"+
		"\u0177\7(\2\2\u0144\u0145\7(\2\2\u0145\u0177\7?\2\2\u0146\u0177\t\2\2"+
		"\2\u0147\u0148\7,\2\2\u0148\u0177\7?\2\2\u0149\u0177\7-\2\2\u014a\u014b"+
		"\7-\2\2\u014b\u0177\7-\2\2\u014c\u014d\7-\2\2\u014d\u0177\7?\2\2\u014e"+
		"\u0177\4./\2\u014f\u0150\7/\2\2\u0150\u0177\7/\2\2\u0151\u0152\7/\2\2"+
		"\u0152\u0177\7?\2\2\u0153\u0154\7/\2\2\u0154\u0177\7@\2\2\u0155\u0156"+
		"\7\60\2\2\u0156\u0157\7\60\2\2\u0157\u0177\7\60\2\2\u0158\u0177\7\61\2"+
		"\2\u0159\u015a\7\61\2\2\u015a\u0177\7?\2\2\u015b\u015c\7<\2\2\u015c\u0177"+
		"\7<\2\2\u015d\u0177\7>\2\2\u015e\u015f\7>\2\2\u015f\u0177\7>\2\2\u0160"+
		"\u0161\7>\2\2\u0161\u0162\7>\2\2\u0162\u0177\7?\2\2\u0163\u0164\7>\2\2"+
		"\u0164\u0177\7?\2\2\u0165\u0166\7?\2\2\u0166\u0177\7?\2\2\u0167\u0177"+
		"\7@\2\2\u0168\u0169\7@\2\2\u0169\u0177\7?\2\2\u016a\u016b\7@\2\2\u016b"+
		"\u0177\7@\2\2\u016c\u016d\7@\2\2\u016d\u016e\7@\2\2\u016e\u0177\7?\2\2"+
		"\u016f\u0177\t\3\2\2\u0170\u0171\7`\2\2\u0171\u0177\7?\2\2\u0172\u0177"+
		"\7}\2\2\u0173\u0174\7~\2\2\u0174\u0177\7~\2\2\u0175\u0177\t\4\2\2\u0176"+
		"\u013b\3\2\2\2\u0176\u013c\3\2\2\2\u0176\u013e\3\2\2\2\u0176\u013f\3\2"+
		"\2\2\u0176\u0141\3\2\2\2\u0176\u0142\3\2\2\2\u0176\u0144\3\2\2\2\u0176"+
		"\u0146\3\2\2\2\u0176\u0147\3\2\2\2\u0176\u0149\3\2\2\2\u0176\u014a\3\2"+
		"\2\2\u0176\u014c\3\2\2\2\u0176\u014e\3\2\2\2\u0176\u014f\3\2\2\2\u0176"+
		"\u0151\3\2\2\2\u0176\u0153\3\2\2\2\u0176\u0155\3\2\2\2\u0176\u0158\3\2"+
		"\2\2\u0176\u0159\3\2\2\2\u0176\u015b\3\2\2\2\u0176\u015d\3\2\2\2\u0176"+
		"\u015e\3\2\2\2\u0176\u0160\3\2\2\2\u0176\u0163\3\2\2\2\u0176\u0165\3\2"+
		"\2\2\u0176\u0167\3\2\2\2\u0176\u0168\3\2\2\2\u0176\u016a\3\2\2\2\u0176"+
		"\u016c\3\2\2\2\u0176\u016f\3\2\2\2\u0176\u0170\3\2\2\2\u0176\u0172\3\2"+
		"\2\2\u0176\u0173\3\2\2\2\u0176\u0175\3\2\2\2\u0177\f\3\2\2\2\u0178\u0179"+
		"\7e\2\2\u0179\u017a\7q\2\2\u017a\u017b\7p\2\2\u017b\u017c\7u\2\2\u017c"+
		"\u018c\7v\2\2\u017d\u017e\7h\2\2\u017e\u017f\7t\2\2\u017f\u0180\7k\2\2"+
		"\u0180\u0181\7g\2\2\u0181\u0182\7p\2\2\u0182\u018c\7f\2\2\u0183\u0184"+
		"\7x\2\2\u0184\u0185\7q\2\2\u0185\u0186\7n\2\2\u0186\u0187\7c\2\2\u0187"+
		"\u0188\7v\2\2\u0188\u0189\7k\2\2\u0189\u018a\7n\2\2\u018a\u018c\7g\2\2"+
		"\u018b\u0178\3\2\2\2\u018b\u017d\3\2\2\2\u018b\u0183\3\2\2\2\u018c\16"+
		"\3\2\2\2\u018d\u018e\7c\2\2\u018e\u018f\7w\2\2\u018f\u0190\7v\2\2\u0190"+
		"\u01c1\7q\2\2\u0191\u0192\7g\2\2\u0192\u0193\7z\2\2\u0193\u0194\7v\2\2"+
		"\u0194\u0195\7g\2\2\u0195\u0196\7t\2\2\u0196\u01c1\7p\2\2\u0197\u0198"+
		"\7k\2\2\u0198\u0199\7p\2\2\u0199\u019a\7n\2\2\u019a\u019b\7k\2\2\u019b"+
		"\u019c\7p\2\2\u019c\u01c1\7g\2\2\u019d\u019e\7t\2\2\u019e\u019f\7g\2\2"+
		"\u019f\u01a0\7i\2\2\u01a0\u01a1\7k\2\2\u01a1\u01a2\7u\2\2\u01a2\u01a3"+
		"\7v\2\2\u01a3\u01a4\7g\2\2\u01a4\u01c1\7t\2\2\u01a5\u01a6\7u\2\2\u01a6"+
		"\u01a7\7v\2\2\u01a7\u01a8\7c\2\2\u01a8\u01a9\7v\2\2\u01a9\u01aa\7k\2\2"+
		"\u01aa\u01c1\7e\2\2\u01ab\u01ac\7v\2\2\u01ac\u01ad\7{\2\2\u01ad\u01ae"+
		"\7r\2\2\u01ae\u01af\7g\2\2\u01af\u01b0\7f\2\2\u01b0\u01b1\7g\2\2\u01b1"+
		"\u01c1\7h\2\2\u01b2\u01b3\7x\2\2\u01b3\u01b4\7k\2\2\u01b4\u01b5\7t\2\2"+
		"\u01b5\u01b6\7v\2\2\u01b6\u01b7\7w\2\2\u01b7\u01b8\7c\2\2\u01b8\u01c1"+
		"\7n\2\2\u01b9\u01ba\7o\2\2\u01ba\u01bb\7v\2\2\u01bb\u01bc\7w\2\2\u01bc"+
		"\u01bd\7c\2\2\u01bd\u01be\7d\2\2\u01be\u01bf\7n\2\2\u01bf\u01c1\7g\2\2"+
		"\u01c0\u018d\3\2\2\2\u01c0\u0191\3\2\2\2\u01c0\u0197\3\2\2\2\u01c0\u019d"+
		"\3\2\2\2\u01c0\u01a5\3\2\2\2\u01c0\u01ab\3\2\2\2\u01c0\u01b2\3\2\2\2\u01c0"+
		"\u01b9\3\2\2\2\u01c1\20\3\2\2\2\u01c2\u01c7\5)\25\2\u01c3\u01c6\5)\25"+
		"\2\u01c4\u01c6\5%\23\2\u01c5\u01c3\3\2\2\2\u01c5\u01c4\3\2\2\2\u01c6\u01c9"+
		"\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01d1\3\2\2\2\u01c9"+
		"\u01c7\3\2\2\2\u01ca\u01cc\5%\23\2\u01cb\u01ca\3\2\2\2\u01cc\u01cd\3\2"+
		"\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf"+
		"\u01d1\5\27\f\2\u01d0\u01c2\3\2\2\2\u01d0\u01cb\3\2\2\2\u01d0\u01cf\3"+
		"\2\2\2\u01d1\22\3\2\2\2\u01d2\u01d3\7d\2\2\u01d3\u01d4\7q\2\2\u01d4\u01d5"+
		"\7q\2\2\u01d5\u0204\7n\2\2\u01d6\u01d7\7e\2\2\u01d7\u01d8\7j\2\2\u01d8"+
		"\u01d9\7c\2\2\u01d9\u0204\7t\2\2\u01da\u01db\7f\2\2\u01db\u01dc\7q\2\2"+
		"\u01dc\u01dd\7w\2\2\u01dd\u01de\7d\2\2\u01de\u01df\7n\2\2\u01df\u0204"+
		"\7g\2\2\u01e0\u01e1\7h\2\2\u01e1\u01e2\7n\2\2\u01e2\u01e3\7q\2\2\u01e3"+
		"\u01e4\7c\2\2\u01e4\u0204\7v\2\2\u01e5\u01e6\7k\2\2\u01e6\u01e7\7p\2\2"+
		"\u01e7\u0204\7v\2\2\u01e8\u01e9\7n\2\2\u01e9\u01ea\7q\2\2\u01ea\u01eb"+
		"\7p\2\2\u01eb\u0204\7i\2\2\u01ec\u01ed\7u\2\2\u01ed\u01ee\7j\2\2\u01ee"+
		"\u01ef\7q\2\2\u01ef\u01f0\7t\2\2\u01f0\u0204\7v\2\2\u01f1\u01f2\7u\2\2"+
		"\u01f2\u01f3\7k\2\2\u01f3\u01f4\7i\2\2\u01f4\u01f5\7p\2\2\u01f5\u01f6"+
		"\7g\2\2\u01f6\u0204\7f\2\2\u01f7\u01f8\7w\2\2\u01f8\u01f9\7p\2\2\u01f9"+
		"\u01fa\7u\2\2\u01fa\u01fb\7k\2\2\u01fb\u01fc\7i\2\2\u01fc\u01fd\7p\2\2"+
		"\u01fd\u01fe\7g\2\2\u01fe\u0204\7f\2\2\u01ff\u0200\7x\2\2\u0200\u0201"+
		"\7q\2\2\u0201\u0202\7k\2\2\u0202\u0204\7f\2\2\u0203\u01d2\3\2\2\2\u0203"+
		"\u01d6\3\2\2\2\u0203\u01da\3\2\2\2\u0203\u01e0\3\2\2\2\u0203\u01e5\3\2"+
		"\2\2\u0203\u01e8\3\2\2\2\u0203\u01ec\3\2\2\2\u0203\u01f1\3\2\2\2\u0203"+
		"\u01f7\3\2\2\2\u0203\u01ff\3\2\2\2\u0204\24\3\2\2\2\u0205\u020a\5\'\24"+
		"\2\u0206\u0209\5\'\24\2\u0207\u0209\5%\23\2\u0208\u0206\3\2\2\2\u0208"+
		"\u0207\3\2\2\2\u0209\u020c\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2"+
		"\2\2\u020b\26\3\2\2\2\u020c\u020a\3\2\2\2\u020d\u020f\5%\23\2\u020e\u020d"+
		"\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211"+
		"\u0212\3\2\2\2\u0212\u0216\7\60\2\2\u0213\u0215\5%\23\2\u0214\u0213\3"+
		"\2\2\2\u0215\u0218\3\2\2\2\u0216\u0214\3\2\2\2\u0216\u0217\3\2\2\2\u0217"+
		"\u022d\3\2\2\2\u0218\u0216\3\2\2\2\u0219\u021b\7\60\2\2\u021a\u021c\5"+
		"%\23\2\u021b\u021a\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021b\3\2\2\2\u021d"+
		"\u021e\3\2\2\2\u021e\u022d\3\2\2\2\u021f\u0221\7/\2\2\u0220\u0222\5%\23"+
		"\2\u0221\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0224"+
		"\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0229\7\60\2\2\u0226\u0228\5%\23\2"+
		"\u0227\u0226\3\2\2\2\u0228\u022b\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a"+
		"\3\2\2\2\u022a\u022d\3\2\2\2\u022b\u0229\3\2\2\2\u022c\u020e\3\2\2\2\u022c"+
		"\u0219\3\2\2\2\u022c\u021f\3\2\2\2\u022d\30\3\2\2\2\u022e\u0232\7$\2\2"+
		"\u022f\u0231\13\2\2\2\u0230\u022f\3\2\2\2\u0231\u0234\3\2\2\2\u0232\u0233"+
		"\3\2\2\2\u0232\u0230\3\2\2\2\u0233\u0235\3\2\2\2\u0234\u0232\3\2\2\2\u0235"+
		"\u023f\7$\2\2\u0236\u023a\7)\2\2\u0237\u0239\13\2\2\2\u0238\u0237\3\2"+
		"\2\2\u0239\u023c\3\2\2\2\u023a\u023b\3\2\2\2\u023a\u0238\3\2\2\2\u023b"+
		"\u023d\3\2\2\2\u023c\u023a\3\2\2\2\u023d\u023f\7)\2\2\u023e\u022e\3\2"+
		"\2\2\u023e\u0236\3\2\2\2\u023f\32\3\2\2\2\u0240\u0242\5%\23\2\u0241\u0240"+
		"\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0241\3\2\2\2\u0243\u0244\3\2\2\2\u0244"+
		"\34\3\2\2\2\u0245\u0246\7\61\2\2\u0246\u0247\7\61\2\2\u0247\u024b\3\2"+
		"\2\2\u0248\u024a\n\5\2\2\u0249\u0248\3\2\2\2\u024a\u024d\3\2\2\2\u024b"+
		"\u0249\3\2\2\2\u024b\u024c\3\2\2\2\u024c\36\3\2\2\2\u024d\u024b\3\2\2"+
		"\2\u024e\u024f\7\61\2\2\u024f\u0250\7,\2\2\u0250\u0254\3\2\2\2\u0251\u0253"+
		"\13\2\2\2\u0252\u0251\3\2\2\2\u0253\u0256\3\2\2\2\u0254\u0255\3\2\2\2"+
		"\u0254\u0252\3\2\2\2\u0255\u0257\3\2\2\2\u0256\u0254\3\2\2\2\u0257\u0258"+
		"\7,\2\2\u0258\u0259\7\61\2\2\u0259 \3\2\2\2\u025a\u025b\7%\2\2\u025b\u025c"+
		"\7K\2\2\u025c\u025d\7P\2\2\u025d\u025e\7E\2\2\u025e\u025f\7N\2\2\u025f"+
		"\u0260\7W\2\2\u0260\u0261\7F\2\2\u0261\u0262\7G\2\2\u0262\u0266\3\2\2"+
		"\2\u0263\u0265\13\2\2\2\u0264\u0263\3\2\2\2\u0265\u0268\3\2\2\2\u0266"+
		"\u0267\3\2\2\2\u0266\u0264\3\2\2\2\u0267\u0269\3\2\2\2\u0268\u0266\3\2"+
		"\2\2\u0269\u027b\7\f\2\2\u026a\u026b\7%\2\2\u026b\u026c\7k\2\2\u026c\u026d"+
		"\7p\2\2\u026d\u026e\7e\2\2\u026e\u026f\7n\2\2\u026f\u0270\7w\2\2\u0270"+
		"\u0271\7f\2\2\u0271\u0272\7g\2\2\u0272\u0276\3\2\2\2\u0273\u0275\13\2"+
		"\2\2\u0274\u0273\3\2\2\2\u0275\u0278\3\2\2\2\u0276\u0277\3\2\2\2\u0276"+
		"\u0274\3\2\2\2\u0277\u0279\3\2\2\2\u0278\u0276\3\2\2\2\u0279\u027b\7\f"+
		"\2\2\u027a\u025a\3\2\2\2\u027a\u026a\3\2\2\2\u027b\"\3\2\2\2\u027c\u0280"+
		"\t\6\2\2\u027d\u027e\7f\2\2\u027e\u0280\7q\2\2\u027f\u027c\3\2\2\2\u027f"+
		"\u027d\3\2\2\2\u0280$\3\2\2\2\u0281\u0282\t\7\2\2\u0282&\3\2\2\2\u0283"+
		"\u0284\t\b\2\2\u0284(\3\2\2\2\u0285\u0286\t\t\2\2\u0286*\3\2\2\2\u0287"+
		"\u0288\t\n\2\2\u0288,\3\2\2\2!\2\618B\u0139\u0176\u018b\u01c0\u01c5\u01c7"+
		"\u01cd\u01d0\u0203\u0208\u020a\u0210\u0216\u021d\u0223\u0229\u022c\u0232"+
		"\u023a\u023e\u0243\u024b\u0254\u0266\u0276\u027a\u027f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}