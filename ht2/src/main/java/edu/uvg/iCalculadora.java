package edu.uvg;
public interface iCalculadora {
    
    // Método para evaluar una expresión matemática y devolver el resultado como un entero
    // Puede lanzar una excepción en caso de error en la evaluación
    int evaluate(String expresion) throws Exception;
}

