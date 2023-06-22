package eu.nejento.furlangcalculator.calculator;

import java.util.HashMap;
import java.util.Locale;

public class FurlangVisitorImpl extends FurlangBaseVisitor<String> {

    private static final HashMap<String, Integer> furryNumbers = new HashMap<String, Integer>() {{
        put("Pes", 0);
        put("Kočka", 1);
        put("Mýval", 2);
        put("Vlk", 3);
        put("Liška", 4);
        put("Lev", 5);
        put("Drak", 6);
        put("Jelen", 7);
        put("Kůň", 8);
        put("Protogen", 9);
    }};

    private static final HashMap<Integer, String> numberFurries = new HashMap<Integer, String>() {{
        put(0, "Pes");
        put(1, "Kočka");
        put(2, "Mýval");
        put(3, "Vlk");
        put(4, "Liška");
        put(5, "Lev");
        put(6, "Drak");
        put(7, "Jelen");
        put(8, "Kůň");
        put(9, "Protogen");
    }};

    private String furryToInt(String furry) {
        String furries = furry.substring(1);
        StringBuilder sb = new StringBuilder();
        while (furries.length() > 0) {
            boolean didFind = false;
            for (int i = 0; i < furryNumbers.size(); i++) {
                if (furries.startsWith(numberFurries.get(i))) {
                    sb.append(i);
                    furries = furries.substring(numberFurries.get(i).length());
                    didFind = true;
                }
            }
            if (!didFind) {
                System.out.println("Invalid furry number (" + furry + ")");
                return null;
            }
        }
        return sb.toString();
    }

    private String intToFurry(int number) {
        String numberString = Integer.toString(number);
        StringBuilder sb = new StringBuilder();
        sb.append("f");
        for (int i = 0; i < numberString.length(); i++) {
             sb.append(numberFurries.get(Integer.parseInt(numberString.substring(i, i + 1))));
        }
        return sb.toString();
    }

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
                System.out.println("Calculator does not support " + operator);
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
                System.out.println("Calculator does not support " + operator);
                return null;
            }
        }
    }

    public String handleLeftFurry(String left, String operator, String right) {
        // fVlk + 2 = fLev
        // fVlk + fPes = fKůň

        String L = furryToInt(left);
        if (L == null) return null;
        int Ln = Integer.parseInt(L);

        int Rn;
        if (right.toLowerCase(Locale.ROOT).startsWith("f")) {
            String R = furryToInt(right);
            if (R == null) return null;
            Rn = Integer.parseInt(R);
        } else Rn = Integer.parseInt(right);
        //System.out.println("handleLeftFurry Right: " + right + " Rn: " + Rn);

        switch (operator) {
            case "+" -> {
                //System.out.println("handleLeftFurry: " + intToFurry(Ln + Rn));
                return intToFurry(Ln + Rn);
            }
            case "*" -> {
                //System.out.println("handleLeftFurry: " + intToFurry(Ln * Rn));
                return intToFurry(Ln * Rn);
            }
            case "%" -> {
                //System.out.println("handleLeftFurry: " + intToFurry(Ln % Rn));
                return intToFurry(Ln % Rn);
            }
            default -> {
                System.out.println("Calculator does not support " + operator);
                return null;
            }
        }
    }

    private String handleRightFurry(String left, String operator, String right) {
        int Ln = 0;
        if (left.toLowerCase(Locale.ROOT).startsWith("f")) {
            String L = furryToInt(left);
            if (L != null) Integer.parseInt(L);
        } else Ln = Integer.parseInt(left);

        String R = furryToInt(right);
        int Rn = 0;
        if (R == null) return null;
        Rn = Integer.parseInt(R);

        switch (operator) {
            case "+" -> {
                //System.out.println("handleRightFurry: " + intToFurry(Ln + Rn));
                return Integer.toString(Ln + Rn);
            }
            case "*" -> {
                //System.out.println("handleRightFurry: " + intToFurry(Ln * Rn));
                return Integer.toString(Ln * Rn);
            }
            case "%" -> {
                //System.out.println("handleRightFurry: " + intToFurry(Ln % Rn));
                return Integer.toString(Ln % Rn);
            }
            default -> {
                System.out.println("Calculator does not support " + operator);
                return null;
            }
        }
    }

    private static boolean isNumeric(String strNum) {
        if (strNum == null) return false;
        try {
            int d = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    @Override
    public String visitOpexpr(FurlangParser.OpexprContext ctx) {

        String left = null;
        if (ctx.left != null) {
            //System.out.println("Left: " + ctx.left.getText());
            left = this.visit(ctx.left);
        }
        String right = null;
        if (ctx.right != null) {
            //System.out.println("Right: " + ctx.right.getText());
            right = this.visit(ctx.right);
        }

        if (ctx.operator == null) {
            System.out.print("An operator of +, -, % is required to perform the operation\n");
            return null;
        }
        String operator = ctx.operator.getText();
        //System.out.println("Operator: " + operator);

        //System.out.println("Opexpr: " + ctx.getText());

        boolean b = right.toLowerCase(Locale.ROOT).startsWith("b0") || right.toLowerCase(Locale.ROOT).startsWith("b1");
        if (b) {
            if (left == null || left.toLowerCase(Locale.ROOT).startsWith("b0") || left.toLowerCase(Locale.ROOT).startsWith("b1"))
                return handleBool(left, operator, right);
            System.out.println("Can't mix bool and not bool together\n");
            return null;
        } else if (left != null && (left.toLowerCase(Locale.ROOT).startsWith("b0") || left.toLowerCase(Locale.ROOT).startsWith("b1"))) {
            System.out.println("Can't mix bool and not bool together\n");
            return null;
        }

        // fVlk + 2 = fLev    //left furry operation
        // fVlk + fPes = fKůň //left furry operation
        // 2 + fVlk = 5       //right furry operation
        // null + fVlk = 3    //right furry operation
        if (left.toLowerCase(Locale.ROOT).startsWith("f")) {
            if (right.toLowerCase(Locale.ROOT).startsWith("f") || isNumeric(right)) {
                return handleLeftFurry(left, operator, right);
            } else if (right.toLowerCase(Locale.ROOT).startsWith("\"") && operator.equals("*")) {
                return right.substring(1, right.length() - 1).repeat(Integer.parseInt(furryToInt(left)));
            }
        } else if (right.toLowerCase(Locale.ROOT).startsWith("f")) {
            if (left.toLowerCase(Locale.ROOT).startsWith("f") || isNumeric(left)) {
                return handleRightFurry(left, operator, right);
            } else if (left.toLowerCase(Locale.ROOT).startsWith("\"") && operator.equals("*")) {
                return left.substring(1, left.length() - 1).repeat(Integer.parseInt(furryToInt(right)));
            }
        }


        // Konkatenace stringů "String" + "String"
        if (left.toLowerCase(Locale.ROOT).startsWith("\"") && right.toLowerCase(Locale.ROOT).startsWith("\"") && operator.equals("+")) {
            return left.substring(1, left.length() - 1) + right.substring(1, right.length() - 1);
        }
        // Else multiplikace stringů s číslem "String" * 3 = "StringStringString"
        else if (left.toLowerCase(Locale.ROOT).startsWith("\"") && operator.equals("*")) {
            return left.substring(1, left.length() - 1).repeat(Integer.parseInt(right));
        }
        // Else multiplikace stringů s číslem, jen přehozené strany
        else if (right.toLowerCase(Locale.ROOT).startsWith("\"") && operator.equals("*")) {
            return right.substring(1, right.length() - 1).repeat(Integer.parseInt(left));
        }

        return handleInt(left, operator, right);

    }

    @Override
    public String visitParexpr(FurlangParser.ParexprContext ctx) {
        //System.out.println("Parexpr: " + ctx.getText());
        //System.out.println(ctx.expr().getText());
        return this.visit(ctx.expr());
    }

    @Override
    public String visitLeafexpr(FurlangParser.LeafexprContext ctx) {
        //System.out.println("Leafexpr: " + ctx.getText());

        // If leafexp is decbin(10) convert the decimal to binary number
        if (ctx.getText().toLowerCase(Locale.ROOT).startsWith("decbin(") && ctx.getText().endsWith(")"))
            return "b" + Integer.toBinaryString(Integer.parseInt(ctx.getText().substring(7, ctx.getText().length() - 1)));

        // If leafexp is bindec(b101) convert the binary to decimal number
        if (ctx.getText().toLowerCase(Locale.ROOT).startsWith("bindec(b") && ctx.getText().endsWith(")"))
            return Integer.toString(Integer.parseInt(ctx.getText().substring(8, ctx.getText().length() - 1), 2));

        // If leafexp is furry(10) convert the decimal to furry number
        if (ctx.getText().toLowerCase(Locale.ROOT).startsWith("furry(") && ctx.getText().endsWith(")"))
            return intToFurry(Integer.parseInt(ctx.getText().substring(6, ctx.getText().length() - 1)));

        return ctx.getText();
    }
}
