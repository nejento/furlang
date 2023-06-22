package eu.nejento.furlangcalculator.calculator;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Furlang {

    public static void main(String[] args) {

        Furlang calculator = new Furlang();

        String basePath = new File("").getAbsolutePath();

        String validTestPath = "\\src\\main\\resources\\valid.txt";
        String invalidTestPath = "\\src\\main\\resources\\invalid.txt";


        System.out.println("Testing valid expressions");
        File validFile = new File(basePath+validTestPath);
        try {
            Scanner validFileReader = new Scanner(validFile);
            while (validFileReader.hasNextLine()){
                String line = validFileReader.nextLine();
                System.out.println(line + " = " + calculator.calculate(line));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("\nTesting invalid expressions");

        File invalidFile = new File(basePath+invalidTestPath);
        Scanner invalidFileReader = null;
        try {
            invalidFileReader = new Scanner(invalidFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }

        while (invalidFileReader.hasNextLine()){
            String res = null;
            String line = null;
            try {
                line = invalidFileReader.nextLine();
                res = calculator.calculate(line);
            }
            catch (Exception e){
                System.out.println("Expression " + line + " couldn't be processed. Exception:" + e.toString());
            }
            System.out.println(line + " = " + res);
        }

        /*
        System.out.println(calculator.calculate("2 + 5\n") + " should be 7");  // 7
        System.out.println(calculator.calculate("2 + 5\n") + " should be 7");  // 7
        System.out.println(calculator.calculate("2 * 5\n") + " should be 10");  // 10
        System.out.println(calculator.calculate("2 + 5\n") + " should be 7");  // 7
        System.out.println(calculator.calculate("2 * 5\n") + " should be 10");  // -10
        System.out.println(calculator.calculate("3 % 5\n") + " should be 1");  // 011 & 101 = 001 => 1
        System.out.println(calculator.calculate("(2 + 5) * 3\n") + " should be 21");  // 7.0
        */
    }

    private String calculate(String source) {
        CodePointCharStream input = CharStreams.fromString(source);
        return compile(input);
    }

    private String compile(CharStream source) {
        FurlangErrorListener errorListener = new FurlangErrorListener();

        FurlangLexer lexer = new FurlangLexer(source);
        lexer.removeErrorListeners();
        lexer.addErrorListener( errorListener );

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        FurlangParser parser = new FurlangParser(tokenStream);
        parser.removeErrorListeners();
        parser.addErrorListener( errorListener );

        ParseTree tree = parser.expr();
        FurlangVisitorImpl visitor = new FurlangVisitorImpl();
        return visitor.visit(tree);
    }
}
