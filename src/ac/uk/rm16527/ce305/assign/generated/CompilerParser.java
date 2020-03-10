// Generated from F:/Users/Richie5000/Desktop/CE305/a2/src/ac/uk/rm16527/ce305/assign\Compiler.g4 by ANTLR 4.8
package ac.uk.rm16527.ce305.assign.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CompilerParser extends Parser {
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
	public static final int
		RULE_start = 0, RULE_assign = 1, RULE_operatorAssign = 2, RULE_scope = 3, 
		RULE_iterate = 4, RULE_run = 5, RULE_print = 6, RULE_result = 7, RULE_ifStatement = 8, 
		RULE_elif = 9, RULE_elseStatement = 10, RULE_safe = 11, RULE_onFail = 12, 
		RULE_comment = 13, RULE_done = 14, RULE_boolJoiner = 15, RULE_boolOperator = 16, 
		RULE_boolVariable = 17, RULE_allTypes = 18, RULE_operator = 19, RULE_label = 20, 
		RULE_real = 21, RULE_string = 22, RULE_stringValidContent = 23, RULE_value = 24, 
		RULE_calc = 25, RULE_returnable = 26, RULE_parameters = 27, RULE_booleanStatement = 28, 
		RULE_boolGroups = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "assign", "operatorAssign", "scope", "iterate", "run", "print", 
			"result", "ifStatement", "elif", "elseStatement", "safe", "onFail", "comment", 
			"done", "boolJoiner", "boolOperator", "boolVariable", "allTypes", "operator", 
			"label", "real", "string", "stringValidContent", "value", "calc", "returnable", 
			"parameters", "booleanStatement", "boolGroups"
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

	@Override
	public String getGrammarFileName() { return "Compiler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CompilerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<OperatorAssignContext> operatorAssign() {
			return getRuleContexts(OperatorAssignContext.class);
		}
		public OperatorAssignContext operatorAssign(int i) {
			return getRuleContext(OperatorAssignContext.class,i);
		}
		public List<ScopeContext> scope() {
			return getRuleContexts(ScopeContext.class);
		}
		public ScopeContext scope(int i) {
			return getRuleContext(ScopeContext.class,i);
		}
		public List<IterateContext> iterate() {
			return getRuleContexts(IterateContext.class);
		}
		public IterateContext iterate(int i) {
			return getRuleContext(IterateContext.class,i);
		}
		public List<RunContext> run() {
			return getRuleContexts(RunContext.class);
		}
		public RunContext run(int i) {
			return getRuleContext(RunContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public List<ResultContext> result() {
			return getRuleContexts(ResultContext.class);
		}
		public ResultContext result(int i) {
			return getRuleContext(ResultContext.class,i);
		}
		public List<IfStatementContext> ifStatement() {
			return getRuleContexts(IfStatementContext.class);
		}
		public IfStatementContext ifStatement(int i) {
			return getRuleContext(IfStatementContext.class,i);
		}
		public List<ElifContext> elif() {
			return getRuleContexts(ElifContext.class);
		}
		public ElifContext elif(int i) {
			return getRuleContext(ElifContext.class,i);
		}
		public List<ElseStatementContext> elseStatement() {
			return getRuleContexts(ElseStatementContext.class);
		}
		public ElseStatementContext elseStatement(int i) {
			return getRuleContext(ElseStatementContext.class,i);
		}
		public List<SafeContext> safe() {
			return getRuleContexts(SafeContext.class);
		}
		public SafeContext safe(int i) {
			return getRuleContext(SafeContext.class,i);
		}
		public List<OnFailContext> onFail() {
			return getRuleContexts(OnFailContext.class);
		}
		public OnFailContext onFail(int i) {
			return getRuleContext(OnFailContext.class,i);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<DoneContext> done() {
			return getRuleContexts(DoneContext.class);
		}
		public DoneContext done(int i) {
			return getRuleContext(DoneContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(74);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(60);
					assign();
					}
					break;
				case 2:
					{
					setState(61);
					operatorAssign();
					}
					break;
				case 3:
					{
					setState(62);
					scope();
					}
					break;
				case 4:
					{
					setState(63);
					iterate();
					}
					break;
				case 5:
					{
					setState(64);
					run();
					}
					break;
				case 6:
					{
					setState(65);
					print();
					}
					break;
				case 7:
					{
					setState(66);
					result();
					}
					break;
				case 8:
					{
					setState(67);
					ifStatement();
					}
					break;
				case 9:
					{
					setState(68);
					elif();
					}
					break;
				case 10:
					{
					setState(69);
					elseStatement();
					}
					break;
				case 11:
					{
					setState(70);
					safe();
					}
					break;
				case 12:
					{
					setState(71);
					onFail();
					}
					break;
				case 13:
					{
					setState(72);
					comment();
					}
					break;
				case 14:
					{
					setState(73);
					done();
					}
					break;
				}
				}
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << LOFPARAM) | (1L << OTHERWISE) | (1L << SAFE) | (1L << DESCOPE) | (1L << LOWER))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode EQ() { return getToken(CompilerParser.EQ, 0); }
		public ReturnableContext returnable() {
			return getRuleContext(ReturnableContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			label();
			setState(79);
			match(EQ);
			setState(80);
			returnable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorAssignContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public ReturnableContext returnable() {
			return getRuleContext(ReturnableContext.class,0);
		}
		public OperatorAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterOperatorAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitOperatorAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitOperatorAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorAssignContext operatorAssign() throws RecognitionException {
		OperatorAssignContext _localctx = new OperatorAssignContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operatorAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			label();
			setState(83);
			match(T__0);
			setState(84);
			operator();
			setState(85);
			match(T__1);
			setState(86);
			returnable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScopeContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode LOFPARAM() { return getToken(CompilerParser.LOFPARAM, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode ROFPARAM() { return getToken(CompilerParser.ROFPARAM, 0); }
		public AllTypesContext allTypes() {
			return getRuleContext(AllTypesContext.class,0);
		}
		public ScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScopeContext scope() throws RecognitionException {
		ScopeContext _localctx = new ScopeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_scope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__2);
			setState(89);
			label();
			setState(90);
			match(LOFPARAM);
			setState(91);
			parameters();
			setState(92);
			match(ROFPARAM);
			setState(93);
			match(T__0);
			setState(94);
			allTypes();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterateContext extends ParserRuleContext {
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public BooleanStatementContext booleanStatement() {
			return getRuleContext(BooleanStatementContext.class,0);
		}
		public IterateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterIterate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitIterate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitIterate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterateContext iterate() throws RecognitionException {
		IterateContext _localctx = new IterateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_iterate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__3);
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(97);
				assign();
				}
				break;
			case 2:
				{
				setState(98);
				label();
				}
				break;
			}
			setState(101);
			match(T__4);
			{
			setState(102);
			booleanStatement();
			}
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(103);
				match(T__4);
				setState(104);
				assign();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RunContext extends ParserRuleContext {
		public TerminalNode LOFPARAM() { return getToken(CompilerParser.LOFPARAM, 0); }
		public TerminalNode ROFPARAM() { return getToken(CompilerParser.ROFPARAM, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public List<ReturnableContext> returnable() {
			return getRuleContexts(ReturnableContext.class);
		}
		public ReturnableContext returnable(int i) {
			return getRuleContext(ReturnableContext.class,i);
		}
		public RunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_run; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterRun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitRun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitRun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RunContext run() throws RecognitionException {
		RunContext _localctx = new RunContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_run);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(LOFPARAM);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUB) | (1L << LOFPARAM) | (1L << NUMBER) | (1L << LOWER) | (1L << STRING))) != 0)) {
				{
				setState(108);
				returnable();
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(109);
					match(T__5);
					setState(110);
					returnable();
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(118);
			match(ROFPARAM);
			setState(119);
			label();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public ReturnableContext returnable() {
			return getRuleContext(ReturnableContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__6);
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(122);
				returnable();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResultContext extends ParserRuleContext {
		public ReturnableContext returnable() {
			return getRuleContext(ReturnableContext.class,0);
		}
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitResult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__7);
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(126);
				match(T__0);
				setState(127);
				returnable();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public BooleanStatementContext booleanStatement() {
			return getRuleContext(BooleanStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__8);
			setState(131);
			booleanStatement();
			setState(132);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElifContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ElifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterElif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitElif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitElif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElifContext elif() throws RecognitionException {
		ElifContext _localctx = new ElifContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__10);
			setState(135);
			ifStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseStatementContext extends ParserRuleContext {
		public TerminalNode OTHERWISE() { return getToken(CompilerParser.OTHERWISE, 0); }
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(OTHERWISE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SafeContext extends ParserRuleContext {
		public TerminalNode SAFE() { return getToken(CompilerParser.SAFE, 0); }
		public SafeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_safe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterSafe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitSafe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitSafe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SafeContext safe() throws RecognitionException {
		SafeContext _localctx = new SafeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_safe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(SAFE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OnFailContext extends ParserRuleContext {
		public OnFailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onFail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterOnFail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitOnFail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitOnFail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnFailContext onFail() throws RecognitionException {
		OnFailContext _localctx = new OnFailContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_onFail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentContext extends ParserRuleContext {
		public List<StringValidContentContext> stringValidContent() {
			return getRuleContexts(StringValidContentContext.class);
		}
		public StringValidContentContext stringValidContent(int i) {
			return getRuleContext(StringValidContentContext.class,i);
		}
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(143);
				match(T__0);
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			match(T__12);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << POINT) | (1L << NUMBER) | (1L << UPPER) | (1L << LOWER))) != 0)) {
				{
				{
				setState(150);
				stringValidContent();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoneContext extends ParserRuleContext {
		public TerminalNode DESCOPE() { return getToken(CompilerParser.DESCOPE, 0); }
		public DoneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_done; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterDone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitDone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitDone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoneContext done() throws RecognitionException {
		DoneContext _localctx = new DoneContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_done);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(DESCOPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolJoinerContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(CompilerParser.OR, 0); }
		public TerminalNode AND() { return getToken(CompilerParser.AND, 0); }
		public BoolJoinerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolJoiner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterBoolJoiner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitBoolJoiner(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitBoolJoiner(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolJoinerContext boolJoiner() throws RecognitionException {
		BoolJoinerContext _localctx = new BoolJoinerContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_boolJoiner);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_la = _input.LA(1);
			if ( !(_la==OR || _la==AND) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolOperatorContext extends ParserRuleContext {
		public TerminalNode NOTSAME() { return getToken(CompilerParser.NOTSAME, 0); }
		public TerminalNode SAME() { return getToken(CompilerParser.SAME, 0); }
		public TerminalNode LESSEQ() { return getToken(CompilerParser.LESSEQ, 0); }
		public TerminalNode LESS() { return getToken(CompilerParser.LESS, 0); }
		public TerminalNode GREATEREQ() { return getToken(CompilerParser.GREATEREQ, 0); }
		public TerminalNode GREATER() { return getToken(CompilerParser.GREATER, 0); }
		public BoolOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterBoolOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitBoolOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitBoolOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolOperatorContext boolOperator() throws RecognitionException {
		BoolOperatorContext _localctx = new BoolOperatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_boolOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESSEQ) | (1L << LESS) | (1L << GREATEREQ) | (1L << GREATER) | (1L << SAME) | (1L << NOTSAME))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolVariableContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(CompilerParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CompilerParser.FALSE, 0); }
		public BoolVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterBoolVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitBoolVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitBoolVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolVariableContext boolVariable() throws RecognitionException {
		BoolVariableContext _localctx = new BoolVariableContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_boolVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AllTypesContext extends ParserRuleContext {
		public TerminalNode TYPES() { return getToken(CompilerParser.TYPES, 0); }
		public TerminalNode VOID() { return getToken(CompilerParser.VOID, 0); }
		public AllTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterAllTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitAllTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitAllTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllTypesContext allTypes() throws RecognitionException {
		AllTypesContext _localctx = new AllTypesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_allTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_la = _input.LA(1);
			if ( !(_la==TYPES || _la==VOID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(CompilerParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(CompilerParser.SUB, 0); }
		public TerminalNode DIV() { return getToken(CompilerParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(CompilerParser.MUL, 0); }
		public TerminalNode MOD() { return getToken(CompilerParser.MOD, 0); }
		public TerminalNode POW() { return getToken(CompilerParser.POW, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << DIV) | (1L << MUL) | (1L << MOD) | (1L << POW))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelContext extends ParserRuleContext {
		public List<TerminalNode> LOWER() { return getTokens(CompilerParser.LOWER); }
		public TerminalNode LOWER(int i) {
			return getToken(CompilerParser.LOWER, i);
		}
		public List<TerminalNode> UPPER() { return getTokens(CompilerParser.UPPER); }
		public TerminalNode UPPER(int i) {
			return getToken(CompilerParser.UPPER, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(CompilerParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(CompilerParser.NUMBER, i);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_label);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(LOWER);
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(171);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << UPPER) | (1L << LOWER))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RealContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(CompilerParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(CompilerParser.NUMBER, i);
		}
		public TerminalNode SUB() { return getToken(CompilerParser.SUB, 0); }
		public TerminalNode POINT() { return getToken(CompilerParser.POINT, 0); }
		public RealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitReal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealContext real() throws RecognitionException {
		RealContext _localctx = new RealContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_real);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUB) {
				{
				setState(177);
				match(SUB);
				}
			}

			setState(180);
			match(NUMBER);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POINT) {
				{
				setState(181);
				match(POINT);
				setState(182);
				match(NUMBER);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(CompilerParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringValidContentContext extends ParserRuleContext {
		public TerminalNode UPPER() { return getToken(CompilerParser.UPPER, 0); }
		public TerminalNode LOWER() { return getToken(CompilerParser.LOWER, 0); }
		public TerminalNode NUMBER() { return getToken(CompilerParser.NUMBER, 0); }
		public TerminalNode POINT() { return getToken(CompilerParser.POINT, 0); }
		public StringValidContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringValidContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterStringValidContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitStringValidContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitStringValidContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringValidContentContext stringValidContent() throws RecognitionException {
		StringValidContentContext _localctx = new StringValidContentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_stringValidContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << POINT) | (1L << NUMBER) | (1L << UPPER) | (1L << LOWER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
			case NUMBER:
				{
				setState(189);
				real();
				}
				break;
			case LOWER:
				{
				setState(190);
				label();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CalcContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<RunContext> run() {
			return getRuleContexts(RunContext.class);
		}
		public RunContext run(int i) {
			return getRuleContext(RunContext.class,i);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public CalcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterCalc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitCalc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitCalc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcContext calc() throws RecognitionException {
		CalcContext _localctx = new CalcContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_calc);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
			case NUMBER:
			case LOWER:
				{
				setState(193);
				value();
				}
				break;
			case LOFPARAM:
				{
				setState(194);
				run();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(203);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__4:
						{
						{
						setState(197);
						match(T__4);
						setState(200);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case SUB:
						case NUMBER:
						case LOWER:
							{
							setState(198);
							value();
							}
							break;
						case LOFPARAM:
							{
							setState(199);
							run();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						}
						break;
					case ADD:
					case SUB:
					case DIV:
					case MUL:
					case MOD:
					case POW:
						{
						setState(202);
						operator();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnableContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public RunContext run() {
			return getRuleContext(RunContext.class,0);
		}
		public CalcContext calc() {
			return getRuleContext(CalcContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ReturnableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterReturnable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitReturnable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitReturnable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnableContext returnable() throws RecognitionException {
		ReturnableContext _localctx = new ReturnableContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_returnable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(208);
				value();
				}
				break;
			case 2:
				{
				setState(209);
				run();
				}
				break;
			case 3:
				{
				setState(210);
				calc();
				}
				break;
			case 4:
				{
				setState(211);
				string();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public List<TerminalNode> TYPES() { return getTokens(CompilerParser.TYPES); }
		public TerminalNode TYPES(int i) {
			return getToken(CompilerParser.TYPES, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOWER) {
				{
				setState(214);
				label();
				setState(215);
				match(T__0);
				setState(216);
				match(TYPES);
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(217);
					match(T__4);
					setState(218);
					label();
					setState(219);
					match(T__0);
					setState(220);
					match(TYPES);
					}
					}
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanStatementContext extends ParserRuleContext {
		public List<BoolGroupsContext> boolGroups() {
			return getRuleContexts(BoolGroupsContext.class);
		}
		public BoolGroupsContext boolGroups(int i) {
			return getRuleContext(BoolGroupsContext.class,i);
		}
		public List<BoolJoinerContext> boolJoiner() {
			return getRuleContexts(BoolJoinerContext.class);
		}
		public BoolJoinerContext boolJoiner(int i) {
			return getRuleContext(BoolJoinerContext.class,i);
		}
		public BooleanStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterBooleanStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitBooleanStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitBooleanStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanStatementContext booleanStatement() throws RecognitionException {
		BooleanStatementContext _localctx = new BooleanStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_booleanStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			boolGroups();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR || _la==AND) {
				{
				{
				setState(230);
				boolJoiner();
				setState(231);
				boolGroups();
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolGroupsContext extends ParserRuleContext {
		public BoolVariableContext boolVariable() {
			return getRuleContext(BoolVariableContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public List<ReturnableContext> returnable() {
			return getRuleContexts(ReturnableContext.class);
		}
		public ReturnableContext returnable(int i) {
			return getRuleContext(ReturnableContext.class,i);
		}
		public BoolOperatorContext boolOperator() {
			return getRuleContext(BoolOperatorContext.class,0);
		}
		public BoolGroupsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolGroups; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).enterBoolGroups(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompilerListener ) ((CompilerListener)listener).exitBoolGroups(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CompilerVisitor ) return ((CompilerVisitor<? extends T>)visitor).visitBoolGroups(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolGroupsContext boolGroups() throws RecognitionException {
		BoolGroupsContext _localctx = new BoolGroupsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_boolGroups);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(238);
				boolVariable();
				}
				break;
			case 2:
				{
				setState(239);
				label();
				}
				break;
			case 3:
				{
				{
				setState(240);
				returnable();
				setState(241);
				boolOperator();
				setState(242);
				returnable();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u00f9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\6\2M\n\2\r\2\16\2N\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\5\6f\n\6\3\6\3\6\3\6\3\6\5\6l\n\6\3\7\3\7\3\7\3\7\7\7r\n\7"+
		"\f\7\16\7u\13\7\5\7w\n\7\3\7\3\7\3\7\3\b\3\b\5\b~\n\b\3\t\3\t\3\t\5\t"+
		"\u0083\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\7\17\u0093\n\17\f\17\16\17\u0096\13\17\3\17\3\17\7\17\u009a\n\17\f"+
		"\17\16\17\u009d\13\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\7\26\u00af\n\26\f\26\16\26\u00b2\13\26"+
		"\3\27\5\27\u00b5\n\27\3\27\3\27\3\27\5\27\u00ba\n\27\3\30\3\30\3\31\3"+
		"\31\3\32\3\32\5\32\u00c2\n\32\3\33\3\33\5\33\u00c6\n\33\3\33\3\33\3\33"+
		"\5\33\u00cb\n\33\3\33\7\33\u00ce\n\33\f\33\16\33\u00d1\13\33\3\34\3\34"+
		"\3\34\3\34\5\34\u00d7\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35"+
		"\u00e1\n\35\f\35\16\35\u00e4\13\35\5\35\u00e6\n\35\3\36\3\36\3\36\3\36"+
		"\7\36\u00ec\n\36\f\36\16\36\u00ef\13\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\5\37\u00f7\n\37\3\37\2\2 \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\668:<\2\t\3\2\36\37\3\2\30\35\3\2#$\3\2%&\3\2\20\25\3\2"+
		"*,\5\2\3\3\26\26*,\2\u0100\2L\3\2\2\2\4P\3\2\2\2\6T\3\2\2\2\bZ\3\2\2\2"+
		"\nb\3\2\2\2\fm\3\2\2\2\16{\3\2\2\2\20\177\3\2\2\2\22\u0084\3\2\2\2\24"+
		"\u0088\3\2\2\2\26\u008b\3\2\2\2\30\u008d\3\2\2\2\32\u008f\3\2\2\2\34\u0094"+
		"\3\2\2\2\36\u00a0\3\2\2\2 \u00a2\3\2\2\2\"\u00a4\3\2\2\2$\u00a6\3\2\2"+
		"\2&\u00a8\3\2\2\2(\u00aa\3\2\2\2*\u00ac\3\2\2\2,\u00b4\3\2\2\2.\u00bb"+
		"\3\2\2\2\60\u00bd\3\2\2\2\62\u00c1\3\2\2\2\64\u00c5\3\2\2\2\66\u00d6\3"+
		"\2\2\28\u00e5\3\2\2\2:\u00e7\3\2\2\2<\u00f6\3\2\2\2>M\5\4\3\2?M\5\6\4"+
		"\2@M\5\b\5\2AM\5\n\6\2BM\5\f\7\2CM\5\16\b\2DM\5\20\t\2EM\5\22\n\2FM\5"+
		"\24\13\2GM\5\26\f\2HM\5\30\r\2IM\5\32\16\2JM\5\34\17\2KM\5\36\20\2L>\3"+
		"\2\2\2L?\3\2\2\2L@\3\2\2\2LA\3\2\2\2LB\3\2\2\2LC\3\2\2\2LD\3\2\2\2LE\3"+
		"\2\2\2LF\3\2\2\2LG\3\2\2\2LH\3\2\2\2LI\3\2\2\2LJ\3\2\2\2LK\3\2\2\2MN\3"+
		"\2\2\2NL\3\2\2\2NO\3\2\2\2O\3\3\2\2\2PQ\5*\26\2QR\7\27\2\2RS\5\66\34\2"+
		"S\5\3\2\2\2TU\5*\26\2UV\7\3\2\2VW\5(\25\2WX\7\4\2\2XY\5\66\34\2Y\7\3\2"+
		"\2\2Z[\7\5\2\2[\\\5*\26\2\\]\7!\2\2]^\58\35\2^_\7\"\2\2_`\7\3\2\2`a\5"+
		"&\24\2a\t\3\2\2\2be\7\6\2\2cf\5\4\3\2df\5*\26\2ec\3\2\2\2ed\3\2\2\2fg"+
		"\3\2\2\2gh\7\7\2\2hk\5:\36\2ij\7\7\2\2jl\5\4\3\2ki\3\2\2\2kl\3\2\2\2l"+
		"\13\3\2\2\2mv\7!\2\2ns\5\66\34\2op\7\b\2\2pr\5\66\34\2qo\3\2\2\2ru\3\2"+
		"\2\2sq\3\2\2\2st\3\2\2\2tw\3\2\2\2us\3\2\2\2vn\3\2\2\2vw\3\2\2\2wx\3\2"+
		"\2\2xy\7\"\2\2yz\5*\26\2z\r\3\2\2\2{}\7\t\2\2|~\5\66\34\2}|\3\2\2\2}~"+
		"\3\2\2\2~\17\3\2\2\2\177\u0082\7\n\2\2\u0080\u0081\7\3\2\2\u0081\u0083"+
		"\5\66\34\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\21\3\2\2\2\u0084"+
		"\u0085\7\13\2\2\u0085\u0086\5:\36\2\u0086\u0087\7\f\2\2\u0087\23\3\2\2"+
		"\2\u0088\u0089\7\r\2\2\u0089\u008a\5\22\n\2\u008a\25\3\2\2\2\u008b\u008c"+
		"\7\'\2\2\u008c\27\3\2\2\2\u008d\u008e\7(\2\2\u008e\31\3\2\2\2\u008f\u0090"+
		"\7\16\2\2\u0090\33\3\2\2\2\u0091\u0093\7\3\2\2\u0092\u0091\3\2\2\2\u0093"+
		"\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2"+
		"\2\2\u0096\u0094\3\2\2\2\u0097\u009b\7\17\2\2\u0098\u009a\5\60\31\2\u0099"+
		"\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7\17\2\2\u009f"+
		"\35\3\2\2\2\u00a0\u00a1\7)\2\2\u00a1\37\3\2\2\2\u00a2\u00a3\t\2\2\2\u00a3"+
		"!\3\2\2\2\u00a4\u00a5\t\3\2\2\u00a5#\3\2\2\2\u00a6\u00a7\t\4\2\2\u00a7"+
		"%\3\2\2\2\u00a8\u00a9\t\5\2\2\u00a9\'\3\2\2\2\u00aa\u00ab\t\6\2\2\u00ab"+
		")\3\2\2\2\u00ac\u00b0\7,\2\2\u00ad\u00af\t\7\2\2\u00ae\u00ad\3\2\2\2\u00af"+
		"\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1+\3\2\2\2"+
		"\u00b2\u00b0\3\2\2\2\u00b3\u00b5\7\21\2\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5"+
		"\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b9\7*\2\2\u00b7\u00b8\7\26\2\2\u00b8"+
		"\u00ba\7*\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba-\3\2\2\2\u00bb"+
		"\u00bc\7.\2\2\u00bc/\3\2\2\2\u00bd\u00be\t\b\2\2\u00be\61\3\2\2\2\u00bf"+
		"\u00c2\5,\27\2\u00c0\u00c2\5*\26\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2"+
		"\2\2\u00c2\63\3\2\2\2\u00c3\u00c6\5\62\32\2\u00c4\u00c6\5\f\7\2\u00c5"+
		"\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00cf\3\2\2\2\u00c7\u00ca\7\7"+
		"\2\2\u00c8\u00cb\5\62\32\2\u00c9\u00cb\5\f\7\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ce\5(\25\2\u00cd\u00c7\3\2"+
		"\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\65\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d7\5\62\32"+
		"\2\u00d3\u00d7\5\f\7\2\u00d4\u00d7\5\64\33\2\u00d5\u00d7\5.\30\2\u00d6"+
		"\u00d2\3\2\2\2\u00d6\u00d3\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2"+
		"\2\2\u00d7\67\3\2\2\2\u00d8\u00d9\5*\26\2\u00d9\u00da\7\3\2\2\u00da\u00e2"+
		"\7%\2\2\u00db\u00dc\7\7\2\2\u00dc\u00dd\5*\26\2\u00dd\u00de\7\3\2\2\u00de"+
		"\u00df\7%\2\2\u00df\u00e1\3\2\2\2\u00e0\u00db\3\2\2\2\u00e1\u00e4\3\2"+
		"\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e5\u00d8\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e69\3\2\2\2"+
		"\u00e7\u00ed\5<\37\2\u00e8\u00e9\5 \21\2\u00e9\u00ea\5<\37\2\u00ea\u00ec"+
		"\3\2\2\2\u00eb\u00e8\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee;\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f7\5$\23\2"+
		"\u00f1\u00f7\5*\26\2\u00f2\u00f3\5\66\34\2\u00f3\u00f4\5\"\22\2\u00f4"+
		"\u00f5\5\66\34\2\u00f5\u00f7\3\2\2\2\u00f6\u00f0\3\2\2\2\u00f6\u00f1\3"+
		"\2\2\2\u00f6\u00f2\3\2\2\2\u00f7=\3\2\2\2\31LNeksv}\u0082\u0094\u009b"+
		"\u00b0\u00b4\u00b9\u00c1\u00c5\u00ca\u00cd\u00cf\u00d6\u00e2\u00e5\u00ed"+
		"\u00f6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}