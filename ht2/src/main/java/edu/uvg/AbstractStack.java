package edu.uvg;

public abstract class AbstractStack<T> implements iStack<T> {
    @Override
    public boolean isEmpty() { //Método que retorna si el stack está vacío.
        return size() == 0; //Si el tamano es de 0 retorna 0
    }
}
