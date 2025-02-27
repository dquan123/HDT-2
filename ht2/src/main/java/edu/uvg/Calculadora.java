package edu.uvg;

public class Calculadora {
    private static Calculadora instance;
    private App calculator;
    
    private Calculadora() {
        calculator = new App();
    }
    
    public static Calculadora getInstance() {
        if (instance == null) {
            instance = new Calculadora();
        }
        return instance;
    }
    
    public int evaluate(String expression) throws Exception {
        return calculator.evaluate(expression);
    }
}