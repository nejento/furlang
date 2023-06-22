// Generated from D:/Projects/Java DEV/furlang/furlangCalculator/src/main/antlr4/eu/nejento/furlangcalculator/calculator\Furlang.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FurlangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FurlangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FurlangParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(FurlangParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parexpr}
	 * labeled alternative in {@link FurlangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParexpr(FurlangParser.ParexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leafexpr}
	 * labeled alternative in {@link FurlangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeafexpr(FurlangParser.LeafexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opexpr}
	 * labeled alternative in {@link FurlangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpexpr(FurlangParser.OpexprContext ctx);
}