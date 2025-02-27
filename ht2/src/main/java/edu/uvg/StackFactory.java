package edu.uvg;

public class StackFactory<T> {
    
    // Método que devuelve una implementación de IStack según el tipo especificado
    public iStack<T> getStack(String type) {
        switch (type.toLowerCase()) {  // Convierte el tipo a minúsculas para evitar errores por mayúsculas/minúsculas
            case "arraylist":
                return new StackArrayList<>();  // Retorna una pila basada en ArrayList
            case "vector":
                return new StackVector<>();  // Retorna una pila basada en Vector
            default:
                throw new IllegalArgumentException("Tipo de stack no soportado");  // Lanza una excepción si el tipo no es válido
        }
    }
}
