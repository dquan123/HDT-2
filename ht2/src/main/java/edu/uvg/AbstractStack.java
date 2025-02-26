package edu.uvg;

public abstract class AbstractStack<T> implements iStack<T> {
    @Override
    public boolean isEmpty() { //Método que retorna el tamano igual a 0.
        return size() == 0;
    }
}
