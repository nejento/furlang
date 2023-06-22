package eu.nejento.furlangcalculator.calculator;

import java.util.Locale;

public class FurlangVisitorImpl extends FurlangBaseVisitor<String> {

    private String handleInt(String left, String operator, String right) {
        int L = 0;
        if (left != null) L = Integer.parseInt(left);
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

    private String handleBool(String left, String operator, String right) {
        int LI = 0;
        if (left != null) LI = Integer.parseInt(left.substring(2), 2);
        int RI = Integer.parseInt(right.substring(2), 2);

        switch (operator) {
            case "+" -> {
                return "b" + Integer.toBinaryString(LI + RI);
            }
            case "*" -> {
                return "b" + Integer.toBinaryString(LI * RI);
            }
            case "%" -> {
                return "b" + Integer.toBinaryString(LI % RI);
            }
            default -> {
                System.out.print("Calculator does not support " + operator + "\n");
                return null;
            }
        }
    }

    @Override
    public String visitOpexpr(FurlangParser.OpexprContext ctx) {

        String left = null;
        if (ctx.left != null) {
            System.out.println("Left: " + ctx.left.getText());
            left = this.visit(ctx.left);
        }
        String right = null;
        if (ctx.right != null) {
            System.out.println("Right: " + ctx.right.getText());
            right = this.visit(ctx.right);
        }

        if (ctx.operator == null) {
            System.out.print("An operator of +, -, % is required to perform the operation\n");
            return null;
        }
        String operator = ctx.operator.getText();
        System.out.println("Operator: " + operator);

        boolean b = right.toLowerCase(Locale.ROOT).startsWith("b0") || right.toLowerCase(Locale.ROOT).startsWith("b1");
        if (b) {
            if (left == null || left.toLowerCase(Locale.ROOT).startsWith("b0") || left.toLowerCase(Locale.ROOT).startsWith("b1")) {
                return handleBool(left, operator, right);
            }
            System.out.println("Can't mix bool and not bool together\n");
            return null;
        } else if (left != null && (left.toLowerCase(Locale.ROOT).startsWith("b0") || left.toLowerCase(Locale.ROOT).startsWith("b1"))) {
            System.out.println("Can't mix bool and not bool together\n");
            return null;
        }

        System.out.println("Opexpr: " + ctx.getText());

        // Konkatenace stringů "String" + "String"
        if (left.toLowerCase(Locale.ROOT).startsWith("\"") && right.toLowerCase(Locale.ROOT).startsWith("\"") && operator.equals("+")) {
            return left.substring(1, left.length() - 1) + right.substring(1, right.length() - 1);
        }
        // Else multiplikace stringů s číslem "String" * 3 = "StringStringString"
        else if (left.toLowerCase(Locale.ROOT).startsWith("\"") && operator.equals("*")) {
            int R = Integer.parseInt(right);
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < R; i++) {
                result.append(left, 1, left.length() - 1);
            }
            return result.toString();
        }
        // Else multiplikace stringů s číslem, jen přehozené strany
        else if (right.toLowerCase(Locale.ROOT).startsWith("\"") && operator.equals("*")) {
            int L = Integer.parseInt(left);
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < L; i++) {
                result.append(right, 1, right.length() - 1);
            }
            return result.toString();
        } else {
            return handleInt(left, operator, right);
        }

    }

    @Override
    public String visitParexpr(FurlangParser.ParexprContext ctx) {
        System.out.println("Parexpr: " + ctx.getText());
        return this.visit(ctx.expr());
    }

    @Override
    public String visitLeafexpr(FurlangParser.LeafexprContext ctx) {
        System.out.println("Leafexpr: " + ctx.getText());

        // If leafexp is decbin(10) convert the decimal to binary number
        if (ctx.getText().toLowerCase(Locale.ROOT).startsWith("decbin(") && ctx.getText().endsWith(")"))
            return "b" + Integer.toBinaryString(Integer.parseInt(ctx.getText().substring(7, ctx.getText().length() - 1)));

        // If leafexp is bindec(b101) convert the binary to decimal number
        if (ctx.getText().toLowerCase(Locale.ROOT).startsWith("bindec(b") && ctx.getText().endsWith(")"))
            return Integer.toString(Integer.parseInt(ctx.getText().substring(8, ctx.getText().length() - 1), 2));

        return ctx.getText();
    }
}
