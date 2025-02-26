package edu.uvg;

public interface iStack<T> {

    void push(T item); //Método para meter valores a la pila

    T pop() throws Exception; //Método para extraer valores de la pila

    boolean isEmpty(); //Método para saber si la lista no está vacía

    T UltimoValor() throws Exception; //Método para conocer el último valor de la pila sin extraerlo

    int size(); //Método para conocer cuántos items hay en la pila
}
