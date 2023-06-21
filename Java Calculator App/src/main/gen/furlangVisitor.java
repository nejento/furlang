// Generated from D:/Projects/Java DEV/furlang/Java Calculator App/src/main/antlr4/eu/nejento/furlangCalculator/calculator\furlang.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link furlangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface furlangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link furlangParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(furlangParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parexpr}
	 * labeled alternative in {@link furlangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParexpr(furlangParser.ParexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leafexpr}
	 * labeled alternative in {@link furlangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeafexpr(furlangParser.LeafexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opexpr}
	 * labeled alternative in {@link furlangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpexpr(furlangParser.OpexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link furlangParser#leaf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeaf(furlangParser.LeafContext ctx);
}