package eu.nejento.furlangCalculator.calculator;

import org.antlr.v4.runtime.Token;

import java.util.Locale;

public class CalculatorVisitorImpl extends furlangBaseVisitor<String> {

    @Override
    public String visitOpexpr(furlangParser.OpexprContext ctx) {

        String left = null;
        if (ctx.left != null) {
            left = this.visit(ctx.left);
        }
        String right = null;
        if (ctx.right != null) {
            right = this.visit(ctx.right);
        }
        if (ctx.operator == null) {
            System.out.print("An operator of +, -, % is required to perform the operation\n");
            return null;
        }
        Token operator = ctx.operator;

        return "0";
    }

    @Override
    public String visitLeafexpr(furlangParser.LeafexprContext ctx) {
        return ctx.toString();
    }

    @Override
    public String visitParexpr(furlangParser.ParexprContext ctx) {
        return this.visit(ctx.expr());
    }




}
