package eu.nejento.furlangcalculator.calculator;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class FurlangErrorListener extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        // method arguments should be used for more detailed report
        throw new RuntimeException("FurlangErrorListener: syntax error occurred");
    }
}
