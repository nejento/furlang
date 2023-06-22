// Generated from D:/Projects/Java DEV/furlang/furlangCalculator/src/main/antlr4/eu/nejento/furlangcalculator/calculator\Furlang.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FurlangParser}.
 */
public interface FurlangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FurlangParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(FurlangParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link FurlangParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(FurlangParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parexpr}
	 * labeled alternative in {@link FurlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParexpr(FurlangParser.ParexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parexpr}
	 * labeled alternative in {@link FurlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParexpr(FurlangParser.ParexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leafexpr}
	 * labeled alternative in {@link FurlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLeafexpr(FurlangParser.LeafexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leafexpr}
	 * labeled alternative in {@link FurlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLeafexpr(FurlangParser.LeafexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opexpr}
	 * labeled alternative in {@link FurlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOpexpr(FurlangParser.OpexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opexpr}
	 * labeled alternative in {@link FurlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOpexpr(FurlangParser.OpexprContext ctx);
}