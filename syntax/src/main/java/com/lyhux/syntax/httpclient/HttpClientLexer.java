// Generated from HttpClient.g4 by ANTLR 4.7

package com.lyhux.syntax.httpclient;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HttpClientLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, KEY=16, STRING=17, 
		WS=18, COMMENT=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "KEY", "STRING", 
		"ESC", "UNICODE", "HEX", "WS", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'='", "'method'", "'url'", "'out'", "'param'", "'header'", 
		"'cookie'", "'body'", "'form-data'", "'form-urlencoded'", "'task'", "'raw'", 
		"':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "KEY", "STRING", "WS", "COMMENT"
	};
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


	public HttpClientLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HttpClient.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u00b8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\21\6\21\u0084"+
		"\n\21\r\21\16\21\u0085\3\22\5\22\u0089\n\22\3\22\3\22\3\22\7\22\u008e"+
		"\n\22\f\22\16\22\u0091\13\22\3\22\3\22\3\23\3\23\3\23\5\23\u0098\n\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\6\26\u00a3\n\26\r\26\16"+
		"\26\u00a4\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u00ad\n\27\f\27\16\27\u00b0"+
		"\13\27\3\27\5\27\u00b3\n\27\3\27\3\27\3\27\3\27\3\u00ae\2\30\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\2\'\2)\2+\24-\25\3\2\7\7\2//\62;C\\aac|\4\2$$^^\n\2$$\61\61^^dd"+
		"hhppttvv\5\2\62;CHch\5\2\13\f\17\17\"\"\2\u00bc\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\3/\3\2\2\2\5\61\3\2\2\2\7\63\3\2\2\2\t\65\3\2\2\2\13<\3\2\2\2\r@"+
		"\3\2\2\2\17D\3\2\2\2\21J\3\2\2\2\23Q\3\2\2\2\25X\3\2\2\2\27]\3\2\2\2\31"+
		"g\3\2\2\2\33w\3\2\2\2\35|\3\2\2\2\37\u0080\3\2\2\2!\u0083\3\2\2\2#\u0088"+
		"\3\2\2\2%\u0094\3\2\2\2\'\u0099\3\2\2\2)\u009f\3\2\2\2+\u00a2\3\2\2\2"+
		"-\u00a8\3\2\2\2/\60\7}\2\2\60\4\3\2\2\2\61\62\7\177\2\2\62\6\3\2\2\2\63"+
		"\64\7?\2\2\64\b\3\2\2\2\65\66\7o\2\2\66\67\7g\2\2\678\7v\2\289\7j\2\2"+
		"9:\7q\2\2:;\7f\2\2;\n\3\2\2\2<=\7w\2\2=>\7t\2\2>?\7n\2\2?\f\3\2\2\2@A"+
		"\7q\2\2AB\7w\2\2BC\7v\2\2C\16\3\2\2\2DE\7r\2\2EF\7c\2\2FG\7t\2\2GH\7c"+
		"\2\2HI\7o\2\2I\20\3\2\2\2JK\7j\2\2KL\7g\2\2LM\7c\2\2MN\7f\2\2NO\7g\2\2"+
		"OP\7t\2\2P\22\3\2\2\2QR\7e\2\2RS\7q\2\2ST\7q\2\2TU\7m\2\2UV\7k\2\2VW\7"+
		"g\2\2W\24\3\2\2\2XY\7d\2\2YZ\7q\2\2Z[\7f\2\2[\\\7{\2\2\\\26\3\2\2\2]^"+
		"\7h\2\2^_\7q\2\2_`\7t\2\2`a\7o\2\2ab\7/\2\2bc\7f\2\2cd\7c\2\2de\7v\2\2"+
		"ef\7c\2\2f\30\3\2\2\2gh\7h\2\2hi\7q\2\2ij\7t\2\2jk\7o\2\2kl\7/\2\2lm\7"+
		"w\2\2mn\7t\2\2no\7n\2\2op\7g\2\2pq\7p\2\2qr\7e\2\2rs\7q\2\2st\7f\2\2t"+
		"u\7g\2\2uv\7f\2\2v\32\3\2\2\2wx\7v\2\2xy\7c\2\2yz\7u\2\2z{\7m\2\2{\34"+
		"\3\2\2\2|}\7t\2\2}~\7c\2\2~\177\7y\2\2\177\36\3\2\2\2\u0080\u0081\7<\2"+
		"\2\u0081 \3\2\2\2\u0082\u0084\t\2\2\2\u0083\u0082\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\"\3\2\2\2\u0087"+
		"\u0089\7B\2\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\u008f\7$\2\2\u008b\u008e\5%\23\2\u008c\u008e\n\3\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2"+
		"\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092"+
		"\u0093\7$\2\2\u0093$\3\2\2\2\u0094\u0097\7^\2\2\u0095\u0098\t\4\2\2\u0096"+
		"\u0098\5\'\24\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098&\3\2\2\2"+
		"\u0099\u009a\7w\2\2\u009a\u009b\5)\25\2\u009b\u009c\5)\25\2\u009c\u009d"+
		"\5)\25\2\u009d\u009e\5)\25\2\u009e(\3\2\2\2\u009f\u00a0\t\5\2\2\u00a0"+
		"*\3\2\2\2\u00a1\u00a3\t\6\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2"+
		"\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7"+
		"\b\26\2\2\u00a7,\3\2\2\2\u00a8\u00a9\7\61\2\2\u00a9\u00aa\7\61\2\2\u00aa"+
		"\u00ae\3\2\2\2\u00ab\u00ad\13\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3"+
		"\2\2\2\u00ae\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b1\u00b3\7\17\2\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3"+
		"\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\7\f\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b7\b\27\2\2\u00b7.\3\2\2\2\13\2\u0085\u0088\u008d\u008f\u0097\u00a4"+
		"\u00ae\u00b2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}