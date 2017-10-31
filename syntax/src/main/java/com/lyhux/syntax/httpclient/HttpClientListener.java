// Generated from HttpClient.g4 by ANTLR 4.7

package com.lyhux.syntax.httpclient;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HttpClientParser}.
 */
public interface HttpClientListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HttpClientParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(HttpClientParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link HttpClientParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(HttpClientParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link HttpClientParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(HttpClientParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HttpClientParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(HttpClientParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HttpClientParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(HttpClientParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HttpClientParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(HttpClientParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HttpClientParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(HttpClientParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link HttpClientParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(HttpClientParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link HttpClientParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(HttpClientParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HttpClientParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(HttpClientParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HttpClientParser#signKeyword}.
	 * @param ctx the parse tree
	 */
	void enterSignKeyword(HttpClientParser.SignKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link HttpClientParser#signKeyword}.
	 * @param ctx the parse tree
	 */
	void exitSignKeyword(HttpClientParser.SignKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link HttpClientParser#blockKeyword}.
	 * @param ctx the parse tree
	 */
	void enterBlockKeyword(HttpClientParser.BlockKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link HttpClientParser#blockKeyword}.
	 * @param ctx the parse tree
	 */
	void exitBlockKeyword(HttpClientParser.BlockKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link HttpClientParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(HttpClientParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link HttpClientParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(HttpClientParser.PairContext ctx);
}