package edu.uvg;

public interface iStack<T> {

    void push(T item);

    T pop();

    boolean isEmpty();

    T peek();

    int size();
}
