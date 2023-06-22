package eu.nejento.furlangcalculator.calculator;

import java.util.Locale;

public class FurlangVisitorImpl extends FurlangBaseVisitor<String> {

    private String handleInt(String left, String operator, String right){
        int L = 0;
        if (left != null) {
            L = Integer.parseInt(left);
        }

        int R = Integer.parseInt(right);

        switch (operator) {
            case "+" -> {
                return Integer.toString(L + R);
            }
            case "*" -> {
                return Integer.toString(L * R);
            }
            case "%" -> {
                return Integer.toString(L & R);
            }
            default -> {
                System.out.print("Calculator does not support " + operator + "\n");
                return null;
            }
        }
    }

    @Override
    public String visitOpexpr(FurlangParser.OpexprContext ctx) {;

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
        String operator = ctx.operator.getText();

        return handleInt(left, operator, right);
    }

    @Override
    public String visitParexpr(FurlangParser.ParexprContext ctx) {
        return this.visit(ctx.expr());
    }

    @Override
    public String visitLeafexpr(FurlangParser.LeafexprContext ctx) {
        return ctx.getText();
    }
}
