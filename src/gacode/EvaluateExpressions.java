/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
