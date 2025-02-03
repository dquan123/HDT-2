package edu.uvg;

import java.util.Stack;

/**
 * Implementación de una calculadora que evalúa expresiones en notación postfija (RPN).
 * La evaluación se realiza utilizando una pila (Stack).
 * 
 * @author [Tu Nombre]
 */
public class App implements iCalculadora {

    /**
     * Evalúa una expresión en notación postfija y devuelve el resultado.
     * 
     * @param expresion La expresión en formato postfijo, con operadores y operandos separados por espacios.
     * @return El resultado de evaluar la expresión.
     * @throws Exception Si la expresión está mal formada, hay división por cero o no hay suficientes operandos.
     */
    @Override
    public int evaluate(String expresion) throws Exception {
        if (expresion == null || expresion.isEmpty()) {
            throw new Exception("La expresión está vacía o es nula.");
        }

        Stack<Integer> stack = new Stack<>();
        String[] tokens = expresion.split(" "); // Divide la expresión en tokens separados por espacios.

        for (String token : tokens) {
            if (esNumero(token)) {
                stack.push(Integer.parseInt(token)); // Agrega el número a la pila.
            } else if (esOperador(token)) {
                if (stack.size() < 2) {
                    throw new Exception("No hay suficientes operandos para la operación.");
                }
                int b = stack.pop(); // Extrae el segundo operando.
                int a = stack.pop(); // Extrae el primer operando.

                switch (token) {
                    case "+":
                        stack.push(a + b); // Suma
                        break;
                    case "-":
                        stack.push(a - b); // Resta
                        break;
                    case "*":
                        stack.push(a * b); // Multiplicación
                        break;
                    case "/":
                        if (b == 0) {
                            throw new Exception("División por cero no permitida.");
                        }
                        stack.push(a / b); // División
                        break;
                    default:
                        throw new Exception("Operador desconocido: " + token);
                }
            } else {
                throw new Exception("Token inválido en la expresión: " + token);
            }
        }

        if (stack.size() != 1) {
            throw new Exception("Expresión mal formada.");
        }

        return stack.pop(); // Retorna el resultado final.
    }

    /**
     * Verifica si un token es un número entero válido.
     * 
     * @param token El token a evaluar.
     * @return true si el token es un número entero, false en caso contrario.
     */
    private boolean esNumero(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Verifica si un token es un operador matemático válido (+, -, *, /).
     * 
     * @param token El token a evaluar.
     * @return true si el token es un operador válido, false en caso contrario.
     */
    private boolean esOperador(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }
}
