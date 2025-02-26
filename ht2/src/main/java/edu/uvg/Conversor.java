package edu.uvg;

public class Conversor {
    private static int Jerarquia(char operador) { //Este método retornará un int dependiendo del operador que encuentre, esto para posteriormente llevar a cabo la jerarquía de operaciones correctamente.
        switch (operador) {
            case '+': case '-': return 1; //Si es suma o resta retorna 1.
            case '*': case '/': return 2; //Si es multiplicación o división retorna 2.
            default: return -1; //Por defecto retorna -1.
        }
    }
}
