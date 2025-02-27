package edu.uvg;

public class Calculadora {
    private static Calculadora instance;  // Instancia única de la clase
    private App calculator;  // Objeto de la clase App que se encargará de evaluar expresiones
    
    // Constructor privado para evitar instanciación externa
    private Calculadora() {
        calculator = new App();  // Inicializa el objeto calculator
    }
    
    // Método estático que devuelve la única instancia de Calculadora
    public static Calculadora getInstance() {
        if (instance == null) {  // Si la instancia no ha sido creada, la crea
            instance = new Calculadora();
        }
        return instance;  // Retorna la instancia única
    }
    
    // Método que evalúa una expresión matemática utilizando el objeto 'calculator'
    public int evaluate(String expression) throws Exception {
        return calculator.evaluate(expression);  // Llama al método evaluate de la clase App
    }
}
