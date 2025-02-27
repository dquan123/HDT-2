package edu.uvg;

public class StackFactory<T> {
    public IStack<T> getStack(String type) {
        switch (type.toLowerCase()) {
            case "arraylist":
                return new StackArrayList<>();
            case "vector":
                return new StackVector<>();
            default:
                throw new IllegalArgumentException("Tipo de stack no soportado");
        }
    }
}