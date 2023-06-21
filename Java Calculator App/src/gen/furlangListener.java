// Generated from D:/Projects/Java DEV/furlang/Java Calculator App/src/main/antlr4/eu/nejento/furlangCalculator/calculator\furlang.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link furlangParser}.
 */
public interface furlangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link furlangParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(furlangParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link furlangParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(furlangParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link furlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(furlangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link furlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(furlangParser.ExprContext ctx);
}