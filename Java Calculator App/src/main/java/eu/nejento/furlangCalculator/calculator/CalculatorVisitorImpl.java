package eu.nejento.furlangCalculator.calculator;

import java.util.Locale;

public class CalculatorVisitorImpl extends furlangBaseVisitor<Double> {

    private String handleInt(String left, String operator, String right){
        int L = 0;
        if (left != null) {
            L = Integer.parseInt(left);
        }

        int R = Integer.parseInt(right);

        switch (operator) {
            case "+":
                return Integer.toString(L + R);
            case "*":
                return Integer.toString(L * R);
            case "&":
                return Integer.toString(L & R);
            default:
                System.out.print("Calculator does not support " + operator + "\n");
                return null;
        }
    }

    private String handleVar(String left, String operator, String right){
        int L = 0;
        if(left != null){
            if(!left.startsWith("a")){          // znamená že to je třeba 20a, což by se mělo změnit na 20
                left = left.replace("a", "");
            } else{
                left = left.replace('a', '1'); // pro připad kdy tam je jen a, by se mělo změnit na 1
            }
            L = Integer.parseInt(left);
        }

        if(!right.startsWith("a")){          // znamená že to je třeba 20a, což by se mělo změnit na 20
            right = right.replace("a", "");
        } else{
            right = right.replace('a', '1'); // pro připad kdy tam je jen a, by se mělo změnit na 1
        }
        int R = Integer.parseInt(right);

        switch (operator) {
            case "+":
                return Integer.toString(L + R) + "a";
            case "*":
                return Integer.toString(L * R) + "a";
            case "&":
                return Integer.toString(L & R) + "a";
            case "|":
                return Integer.toString(L | R) + "a";
            case "^":
                return Integer.toString(L ^ R) + "a";
            case "~":
                return Integer.toString(~R) + "a";
            default:
                System.out.print("Calculator does not support " + operator + "\n");
                return null;
        }
    }

    @Override
    public Double visitOpexpr(furlangParser.OpexprContext ctx) {

        String left = null;
        if (ctx.left != null) {
            left = String.valueOf(this.visit(ctx.left));
        }

        String right = null;
        if (ctx.right != null) {
            right = String.valueOf(this.visit(ctx.right));
        }

        if (ctx.operator == null) {
            System.out.print("An operator of +, -, &, |, ^, ~ is required to perform the operation\n");
            return null;
        }
        String operator = ctx.operator.getText();

        if (right.toLowerCase().startsWith("b")) {
            if (left == null || left.toLowerCase().startsWith("0b")){
                return handleBool(left, operator, right);
            }
            System.out.println("Can't mix bool and not bool together\n");
            return null;
        } else if(left != null && left.toLowerCase().startsWith("b")){
            if (right.toLowerCase(Locale.ROOT).startsWith("b")){
                return handleBool(left, operator, right);
            }
            System.out.println("Can't mix bool and not bool together\n");
            return null;
        }

        if (right.contains("a")){
            if (left == null || left.contains("a")){
                return handleVar(left, operator, right);
            }
            System.out.println("Chyba mixování proměných a zbytku");
            return null;
        } else if(left != null && left.contains("a")){
            if(right.contains("a")){
                return handleVar(left, operator, right);
            }
            System.out.println("Chyba mixování proměných a zbytku");
            return null;
        }

        return handleInt(left, operator, right);




        if (ctx.operator  == null) {
            throw new UnsupportedOperationException("K provedení operace je potřeba operátor +, % nebo %");
        }
        String operator = ctx.operator.getText();
        double left = Double.parseDouble(ctx.left.getText());
        double right = Double.parseDouble(ctx.right.getText());

        return switch (operator) {
            case "+" -> left + right;
            case "-" -> left - right;
            case "/" -> left / right;
            case "*" -> left * right;
            default -> throw new UnsupportedOperationException("Calculator does not support " + operator);
        };
    }

    @Override
    public Double visitParexpr(furlangParser.ParexprContext ctx) {
        return this.visit(ctx.expr());
    }

    @Override
    public String visitLeafexpr(furlangParser.LeafexprContext ctx) {
        return ctx.getText();
    }
}