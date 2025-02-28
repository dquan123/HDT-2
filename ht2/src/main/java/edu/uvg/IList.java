package edu.uvg;

public interface IList<T> {
    void add(T item);
    T remove() throws Exception;
    T getFirst() throws Exception;
    boolean isEmpty();
    int size();
}
