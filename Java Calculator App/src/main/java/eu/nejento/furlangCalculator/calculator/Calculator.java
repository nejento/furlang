package eu.nejento.furlangCalculator.calculator;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Calculator {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate("2 + 5"));  // 7.0
        System.out.println(calculator.calculate("2 * 5"));  // 10.0
        System.out.println(calculator.calculate("5 - 3"));  // 2.0
        System.out.println(calculator.calculate("5 / 3"));  // 1.6666666666666667
        System.out.println(calculator.calculate("5 # 3"));  // Error: line 1:2 token recognition error at: '#'
    }

    private String calculate(String source) {
        CodePointCharStream input = CharStreams.fromString(source);
        return compile(input);
    }

    private String compile(CharStream source) {
        ErrorListener errorListener = new ErrorListener();

        furlangLexer lexer = new furlangLexer(source);
        lexer.removeErrorListeners();
        lexer.addErrorListener( errorListener );

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        furlangParser parser = new furlangParser(tokenStream);
        parser.removeErrorListeners();
        parser.addErrorListener( errorListener );

        ParseTree tree = parser.expr();
        CalculatorVisitorImpl visitor = new CalculatorVisitorImpl();
        return visitor.visit(tree);
    }
}
