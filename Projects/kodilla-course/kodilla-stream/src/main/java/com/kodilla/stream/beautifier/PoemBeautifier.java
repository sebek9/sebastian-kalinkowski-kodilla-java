package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String a, String b, PoemDecorator poemDecorator){
        String result=poemDecorator.decorate(a,b);


        poemDecorator.decorate();
    }
}


//public class ExpressionExecutor {
    public void executeExpression(double a, double b, MathExpression mathExpression) {
        double result = mathExpression.calculateExpression(a, b);
        System.out.println("Result equals: " + result);
    }