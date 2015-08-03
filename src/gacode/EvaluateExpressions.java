
package gacode;

public class EvaluateExpressions {
    double result;
 
    static boolean isValidExpression(String expr) {
        org.nfunk.jep.JEP myParser = new org.nfunk.jep.JEP();
        myParser.addVariable("x", 1);
        myParser.parseExpression(expr);
        if(myParser.hasError())
            return false;
        return true;
    }
    
    static double evaluate(String expr, double varX) {
        org.nfunk.jep.JEP myParser = new org.nfunk.jep.JEP();
        myParser.addVariable("x", varX);
        myParser.parseExpression(expr);
        if(myParser.hasError())
            return 0; 
        return myParser.getValue();
    }
}
