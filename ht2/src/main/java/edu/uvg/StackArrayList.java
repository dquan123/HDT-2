package edu.uvg;

import java.util.ArrayList;

public class StackArrayList<T> extends AbstractStack<T>{

    private ArrayList<T> stack;

    public StackArrayList() {
        stack = new ArrayList<>();
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
}
