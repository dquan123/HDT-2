package edu.uvg;

import java.util.Vector;

public class StackVector<T> extends AbstractStack<T>{
    private Vector<T> stack;

    public StackVector() {
        stack = new Vector<>();
    }

    @Override
    public void push(T item) {
        stack.add(item);
    }

    @Override
    public T pop() throws Exception {
        if (isEmpty()) throw new Exception("Stack vacío");
        return stack.remove(stack.size() - 1);
    }

    @Override
    public T UltimoValor() throws Exception {
        if (isEmpty()) throw new Exception("Stack vacío");
        return stack.get(stack.size() - 1);
    }

    @Override
    public int size() {
        return stack.size();
    }
}

