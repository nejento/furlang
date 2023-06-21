package eu.nejento.furlangCalculator.calculator;

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

        return "0";
    }

    @Override
    public String visitParexpr(furlangParser.ParexprContext ctx) {
        return super.visitParexpr(ctx);
    }

    @Override
    public String visitRoot(furlangParser.RootContext ctx) {
        return super.visitRoot(ctx);
    }

}
