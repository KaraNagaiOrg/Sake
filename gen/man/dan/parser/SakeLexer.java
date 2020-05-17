// Generated from /home/danila/source/Sake/src/man/dan/parser/SakeLexer.g4 by ANTLR 4.8
package man.dan.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SakeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, SEISU=2, RONRI=3, SHINRI=4, OSU=5, RIPPOTAI=6, HAIRETSU=7, JIGEN=8, 
		NAGASA=9, SHUSHI=10, KIDO=11, KANSU=12, SORENARA=13, MODORU=14, SHUKI=15, 
		SENDEN=16, RUIKEI=17, UNDEFINED=18, FIELD=19, TOX=20, TOY=21, TOZ=22, 
		TOKABE=23, PLUS=24, MINUS=25, GREATER=26, LESS=27, ID=28, NEWLINE=29, 
		COMMENT=30, ENDEXPR=31, WS=32, END_BLOCK=33, UP=34, DOWN=35, LEFTWARD=36, 
		RIGHTWARD=37, FORWARD=38, BACK=39, BREAK=40, LOOKUP=41, LOOKDOWN=42, LOOKLEFT=43, 
		LOOKRIGHT=44, LOOKFW=45, LOOKBACK=46;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "SEISU", "RONRI", "SHINRI", "OSU", "RIPPOTAI", "HAIRETSU", "JIGEN", 
			"NAGASA", "SHUSHI", "KIDO", "KANSU", "SORENARA", "MODORU", "SHUKI", "SENDEN", 
			"RUIKEI", "UNDEFINED", "FIELD", "TOX", "TOY", "TOZ", "TOKABE", "PLUS", 
			"MINUS", "GREATER", "LESS", "ID", "NEWLINE", "COMMENT", "ENDEXPR", "WS", 
			"END_BLOCK", "UP", "DOWN", "LEFTWARD", "RIGHTWARD", "FORWARD", "BACK", 
			"BREAK", "LOOKUP", "LOOKDOWN", "LOOKLEFT", "LOOKRIGHT", "LOOKFW", "LOOKBACK"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'seisu'", "'ronri'", "'shinri'", "'osu'", "'rippotai'", 
			"'hairetsu'", "'jigen'", "'nagasa'", "'shushi'", "'kido'", "'kansu'", 
			"'sorenara'", "'modoru'", "'shuki'", "'senden'", "'ruikei'", "'undefined'", 
			"'=>'", "'X'", "'Y'", "'Z'", "'kabe'", "'+'", "'-'", "'>'", "'<'", null, 
			null, null, "';'", null, null, "'^-^'", "'v-v'", "'<-<'", "'>->'", "'o-o'", 
			"'~-~'", "'>-<'", "'^-0'", "'v-0'", "'<-0'", "'>-0'", "'o-0'", "'~-0'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "SEISU", "RONRI", "SHINRI", "OSU", "RIPPOTAI", "HAIRETSU", 
			"JIGEN", "NAGASA", "SHUSHI", "KIDO", "KANSU", "SORENARA", "MODORU", "SHUKI", 
			"SENDEN", "RUIKEI", "UNDEFINED", "FIELD", "TOX", "TOY", "TOZ", "TOKABE", 
			"PLUS", "MINUS", "GREATER", "LESS", "ID", "NEWLINE", "COMMENT", "ENDEXPR", 
			"WS", "END_BLOCK", "UP", "DOWN", "LEFTWARD", "RIGHTWARD", "FORWARD", 
			"BACK", "BREAK", "LOOKUP", "LOOKDOWN", "LOOKLEFT", "LOOKRIGHT", "LOOKFW", 
			"LOOKBACK"
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


	public SakeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SakeLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u014d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\6\2a\n\2\r\2\16\2b\3\2\3\2\6\2g\n\2\r\2"+
		"\16\2h\5\2k\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\35\3\35\7\35\u00fb\n\35\f\35\16\35\u00fe\13"+
		"\35\3\36\5\36\u0101\n\36\3\36\3\36\3\36\3\36\3\37\3\37\7\37\u0109\n\37"+
		"\f\37\16\37\u010c\13\37\3 \3 \3!\6!\u0111\n!\r!\16!\u0112\3!\3!\3\"\3"+
		"\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'"+
		"\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-"+
		"\3-\3.\3.\3.\3.\3/\3/\3/\3/\2\2\60\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60\3\2\b\3\2\62;\4\2\62;CH\5\2C\\aac|\6\2\62;C\\aac|\4\2\f\f\17\17"+
		"\4\2\13\13\"\"\2\u0153\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\3j\3\2\2\2\5l\3\2\2\2\7r\3\2\2\2\tx\3\2\2\2\13\177\3\2\2\2\r\u0083"+
		"\3\2\2\2\17\u008c\3\2\2\2\21\u0095\3\2\2\2\23\u009b\3\2\2\2\25\u00a2\3"+
		"\2\2\2\27\u00a9\3\2\2\2\31\u00ae\3\2\2\2\33\u00b4\3\2\2\2\35\u00bd\3\2"+
		"\2\2\37\u00c4\3\2\2\2!\u00ca\3\2\2\2#\u00d1\3\2\2\2%\u00d8\3\2\2\2\'\u00e2"+
		"\3\2\2\2)\u00e5\3\2\2\2+\u00e7\3\2\2\2-\u00e9\3\2\2\2/\u00eb\3\2\2\2\61"+
		"\u00f0\3\2\2\2\63\u00f2\3\2\2\2\65\u00f4\3\2\2\2\67\u00f6\3\2\2\29\u00f8"+
		"\3\2\2\2;\u0100\3\2\2\2=\u0106\3\2\2\2?\u010d\3\2\2\2A\u0110\3\2\2\2C"+
		"\u0116\3\2\2\2E\u0119\3\2\2\2G\u011d\3\2\2\2I\u0121\3\2\2\2K\u0125\3\2"+
		"\2\2M\u0129\3\2\2\2O\u012d\3\2\2\2Q\u0131\3\2\2\2S\u0135\3\2\2\2U\u0139"+
		"\3\2\2\2W\u013d\3\2\2\2Y\u0141\3\2\2\2[\u0145\3\2\2\2]\u0149\3\2\2\2_"+
		"a\t\2\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2ck\3\2\2\2df\7z\2\2e"+
		"g\t\3\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2j`\3\2\2\2"+
		"jd\3\2\2\2k\4\3\2\2\2lm\7u\2\2mn\7g\2\2no\7k\2\2op\7u\2\2pq\7w\2\2q\6"+
		"\3\2\2\2rs\7t\2\2st\7q\2\2tu\7p\2\2uv\7t\2\2vw\7k\2\2w\b\3\2\2\2xy\7u"+
		"\2\2yz\7j\2\2z{\7k\2\2{|\7p\2\2|}\7t\2\2}~\7k\2\2~\n\3\2\2\2\177\u0080"+
		"\7q\2\2\u0080\u0081\7u\2\2\u0081\u0082\7w\2\2\u0082\f\3\2\2\2\u0083\u0084"+
		"\7t\2\2\u0084\u0085\7k\2\2\u0085\u0086\7r\2\2\u0086\u0087\7r\2\2\u0087"+
		"\u0088\7q\2\2\u0088\u0089\7v\2\2\u0089\u008a\7c\2\2\u008a\u008b\7k\2\2"+
		"\u008b\16\3\2\2\2\u008c\u008d\7j\2\2\u008d\u008e\7c\2\2\u008e\u008f\7"+
		"k\2\2\u008f\u0090\7t\2\2\u0090\u0091\7g\2\2\u0091\u0092\7v\2\2\u0092\u0093"+
		"\7u\2\2\u0093\u0094\7w\2\2\u0094\20\3\2\2\2\u0095\u0096\7l\2\2\u0096\u0097"+
		"\7k\2\2\u0097\u0098\7i\2\2\u0098\u0099\7g\2\2\u0099\u009a\7p\2\2\u009a"+
		"\22\3\2\2\2\u009b\u009c\7p\2\2\u009c\u009d\7c\2\2\u009d\u009e\7i\2\2\u009e"+
		"\u009f\7c\2\2\u009f\u00a0\7u\2\2\u00a0\u00a1\7c\2\2\u00a1\24\3\2\2\2\u00a2"+
		"\u00a3\7u\2\2\u00a3\u00a4\7j\2\2\u00a4\u00a5\7w\2\2\u00a5\u00a6\7u\2\2"+
		"\u00a6\u00a7\7j\2\2\u00a7\u00a8\7k\2\2\u00a8\26\3\2\2\2\u00a9\u00aa\7"+
		"m\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7f\2\2\u00ac\u00ad\7q\2\2\u00ad\30"+
		"\3\2\2\2\u00ae\u00af\7m\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7p\2\2\u00b1"+
		"\u00b2\7u\2\2\u00b2\u00b3\7w\2\2\u00b3\32\3\2\2\2\u00b4\u00b5\7u\2\2\u00b5"+
		"\u00b6\7q\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7p\2\2"+
		"\u00b9\u00ba\7c\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7c\2\2\u00bc\34\3\2"+
		"\2\2\u00bd\u00be\7o\2\2\u00be\u00bf\7q\2\2\u00bf\u00c0\7f\2\2\u00c0\u00c1"+
		"\7q\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7w\2\2\u00c3\36\3\2\2\2\u00c4\u00c5"+
		"\7u\2\2\u00c5\u00c6\7j\2\2\u00c6\u00c7\7w\2\2\u00c7\u00c8\7m\2\2\u00c8"+
		"\u00c9\7k\2\2\u00c9 \3\2\2\2\u00ca\u00cb\7u\2\2\u00cb\u00cc\7g\2\2\u00cc"+
		"\u00cd\7p\2\2\u00cd\u00ce\7f\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7p\2\2"+
		"\u00d0\"\3\2\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3\7w\2\2\u00d3\u00d4\7k"+
		"\2\2\u00d4\u00d5\7m\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7k\2\2\u00d7$\3"+
		"\2\2\2\u00d8\u00d9\7w\2\2\u00d9\u00da\7p\2\2\u00da\u00db\7f\2\2\u00db"+
		"\u00dc\7g\2\2\u00dc\u00dd\7h\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7p\2\2"+
		"\u00df\u00e0\7g\2\2\u00e0\u00e1\7f\2\2\u00e1&\3\2\2\2\u00e2\u00e3\7?\2"+
		"\2\u00e3\u00e4\7@\2\2\u00e4(\3\2\2\2\u00e5\u00e6\7Z\2\2\u00e6*\3\2\2\2"+
		"\u00e7\u00e8\7[\2\2\u00e8,\3\2\2\2\u00e9\u00ea\7\\\2\2\u00ea.\3\2\2\2"+
		"\u00eb\u00ec\7m\2\2\u00ec\u00ed\7c\2\2\u00ed\u00ee\7d\2\2\u00ee\u00ef"+
		"\7g\2\2\u00ef\60\3\2\2\2\u00f0\u00f1\7-\2\2\u00f1\62\3\2\2\2\u00f2\u00f3"+
		"\7/\2\2\u00f3\64\3\2\2\2\u00f4\u00f5\7@\2\2\u00f5\66\3\2\2\2\u00f6\u00f7"+
		"\7>\2\2\u00f78\3\2\2\2\u00f8\u00fc\t\4\2\2\u00f9\u00fb\t\5\2\2\u00fa\u00f9"+
		"\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		":\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0101\7\17\2\2\u0100\u00ff\3\2\2\2"+
		"\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\7\f\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\u0105\b\36\2\2\u0105<\3\2\2\2\u0106\u010a\7%\2\2\u0107"+
		"\u0109\n\6\2\2\u0108\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2"+
		"\2\2\u010a\u010b\3\2\2\2\u010b>\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e"+
		"\7=\2\2\u010e@\3\2\2\2\u010f\u0111\t\7\2\2\u0110\u010f\3\2\2\2\u0111\u0112"+
		"\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u0115\b!\2\2\u0115B\3\2\2\2\u0116\u0117\5\25\13\2\u0117\u0118\5? \2\u0118"+
		"D\3\2\2\2\u0119\u011a\7`\2\2\u011a\u011b\7/\2\2\u011b\u011c\7`\2\2\u011c"+
		"F\3\2\2\2\u011d\u011e\7x\2\2\u011e\u011f\7/\2\2\u011f\u0120\7x\2\2\u0120"+
		"H\3\2\2\2\u0121\u0122\7>\2\2\u0122\u0123\7/\2\2\u0123\u0124\7>\2\2\u0124"+
		"J\3\2\2\2\u0125\u0126\7@\2\2\u0126\u0127\7/\2\2\u0127\u0128\7@\2\2\u0128"+
		"L\3\2\2\2\u0129\u012a\7q\2\2\u012a\u012b\7/\2\2\u012b\u012c\7q\2\2\u012c"+
		"N\3\2\2\2\u012d\u012e\7\u0080\2\2\u012e\u012f\7/\2\2\u012f\u0130\7\u0080"+
		"\2\2\u0130P\3\2\2\2\u0131\u0132\7@\2\2\u0132\u0133\7/\2\2\u0133\u0134"+
		"\7>\2\2\u0134R\3\2\2\2\u0135\u0136\7`\2\2\u0136\u0137\7/\2\2\u0137\u0138"+
		"\7\62\2\2\u0138T\3\2\2\2\u0139\u013a\7x\2\2\u013a\u013b\7/\2\2\u013b\u013c"+
		"\7\62\2\2\u013cV\3\2\2\2\u013d\u013e\7>\2\2\u013e\u013f\7/\2\2\u013f\u0140"+
		"\7\62\2\2\u0140X\3\2\2\2\u0141\u0142\7@\2\2\u0142\u0143\7/\2\2\u0143\u0144"+
		"\7\62\2\2\u0144Z\3\2\2\2\u0145\u0146\7q\2\2\u0146\u0147\7/\2\2\u0147\u0148"+
		"\7\62\2\2\u0148\\\3\2\2\2\u0149\u014a\7\u0080\2\2\u014a\u014b\7/\2\2\u014b"+
		"\u014c\7\62\2\2\u014c^\3\2\2\2\n\2bhj\u00fc\u0100\u010a\u0112\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}