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
            if (Character.isDigit(c)) { // Si el carácter es un número se agrega a la cadena de números.
                cadenaNumeros.append(c);
            } else if (c == ' ') { //Si el caracter es un espacio lo ignora
                continue;
            } else { //Si no es un número o un espacio, debe ser un parentesis, por lo tanto
                if (cadenaNumeros.length() > 0) { //Si hay un número en la cadena se agrega ala expresión
                    postfix.append(cadenaNumeros).append(' ');
                    cadenaNumeros.setLength(0);//Se limpia para el siguiente número.
                }
                if (c == '(') { //Si es un parentesis de apertura se agrega al stack
                    stack.push(c);
                } else if (c == ')') { //Si es un parentesis de cierre
                    while (!stack.isEmpty() && stack.peek() != '(') { //Desapila hasta encontrar el parentesis de apertura correspondiente
                        postfix.append(stack.pop()).append(' ');
                    }
                    stack.pop(); //Se elimina el parentesis de apertura
                } else { //Si es un operador
                    while (!stack.isEmpty() && Jerarquia(stack.peek()) >= Jerarquia(c)) { //Busca operadores en el stack con mayor o igual jerarquía.
                        postfix.append(stack.pop()).append(' ');
                    }
                    stack.push(c); //Apila el operador actual.
                }
            }
        }

        if (cadenaNumeros.length() > 0) { //Si hay un número acumulado se añade al resultado final
            postfix.append(cadenaNumeros).append(' ');
        }

        while (!stack.isEmpty()) { //Desapila los operadores restantes.
            postfix.append(stack.pop()).append(' ');
        }

        return postfix.toString().trim(); //Retorna el resultado final que es una expresión postfix.
    }
}
