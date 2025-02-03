package edu.uvg;

/**
 * Hello world!
 *
 */
import java.util.Stack;

public class App implements iCalculadora {

    @Override
    public int evaluate(String expresion) throws Exception {
        if (expresion == null || expresion.isEmpty()) {
            throw new Exception("La expresión está vacía o es nula.");
        }

        Stack<Integer> stack = new Stack<>();
        String[] tokens = expresion.split(" ");

        for (String token : tokens) {
            if (esNumero(token)) {
                stack.push(Integer.parseInt(token));
            } else if (esOperador(token)) {
                if (stack.size() < 2) {
                    throw new Exception("No hay suficientes operandos para la operación.");
                }
                int b = stack.pop();
                int a = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        if (b == 0) {
                            throw new Exception("División por cero no permitida.");
                        }
                        stack.push(a / b);
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

        return stack.pop(); 
    }


    private boolean esNumero(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    private boolean esOperador(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }
}

