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
	 * Enter a parse tree produced by the {@code parexpr}
	 * labeled alternative in {@link furlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParexpr(furlangParser.ParexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parexpr}
	 * labeled alternative in {@link furlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParexpr(furlangParser.ParexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leafexpr}
	 * labeled alternative in {@link furlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLeafexpr(furlangParser.LeafexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leafexpr}
	 * labeled alternative in {@link furlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLeafexpr(furlangParser.LeafexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opexpr}
	 * labeled alternative in {@link furlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOpexpr(furlangParser.OpexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opexpr}
	 * labeled alternative in {@link furlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOpexpr(furlangParser.OpexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link furlangParser#leaf}.
	 * @param ctx the parse tree
	 */
	void enterLeaf(furlangParser.LeafContext ctx);
	/**
	 * Exit a parse tree produced by {@link furlangParser#leaf}.
	 * @param ctx the parse tree
	 */
	void exitLeaf(furlangParser.LeafContext ctx);
}