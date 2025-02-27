package edu.uvg;

import java.util.Stack;

public class Conversor {
    private static int Jerarquia(char operador) { //Este método retornará un int dependiendo del operador que encuentre, esto para posteriormente llevar a cabo la jerarquía de operaciones correctamente.
        switch (operador) {
            case '+': case '-': return 1; //Si es suma o resta retorna 1.
            case '*': case '/': return 2; //Si es multiplicación o división retorna 2.
            default: return -1; //Por defecto retorna -1.
        }
    }

    public static String Conversion(String infix) { //Recibe un String que es la expresión infix.
        StringBuilder postfix = new StringBuilder(); //Crea un string builder para el postfix.
        Stack<Character> stack = new Stack<>(); //Crea un stack de caracteres.
        StringBuilder cadenaNumeros = new StringBuilder(); //Crea un String Builder para leer la cadena.

        for (char c : infix.toCharArray()) {
            if (Character.isDigit(c)) {
                cadenaNumeros.append(c);
            } else if (c == ' ') {
                continue;
            } else {
                if (cadenaNumeros.length() > 0) {
                    postfix.append(cadenaNumeros).append(' ');
                    cadenaNumeros.setLength(0);
                }
                if (c == '(') {
                    stack.push(c);
                } else if (c == ')') {
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        postfix.append(stack.pop()).append(' ');
                    }
                    stack.pop();
                } else {
                    while (!stack.isEmpty() && Jerarquia(stack.peek()) >= Jerarquia(c)) {
                        postfix.append(stack.pop()).append(' ');
                    }
                    stack.push(c);
                }
            }
        }

        if (cadenaNumeros.length() > 0) {
            postfix.append(cadenaNumeros).append(' ');
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop()).append(' ');
        }

        return postfix.toString().trim();
    }
}
