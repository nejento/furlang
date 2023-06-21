// Generated from eu\nejento\nLangCalculator\calculator\nLang.g4 by ANTLR 4.10.1
package eu.nejento.nLangCalculator.calculator;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link nLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface nLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link nLangParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(nLangParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parexpr}
	 * labeled alternative in {@link nLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParexpr(nLangParser.ParexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leafexpr}
	 * labeled alternative in {@link nLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeafexpr(nLangParser.LeafexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opexpr}
	 * labeled alternative in {@link nLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpexpr(nLangParser.OpexprContext ctx);
}