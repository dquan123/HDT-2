package edu.uvg;

import java.util.Vector;

public class StackVector<T> extends AbstractStack<T>{
    private Vector<T> stack; //Atributo de tipo Vector.

    public StackVector() { //Constructor de la clase, no recibe ningún atributo, únicamente se instancia.
        stack = new Vector<>(); //Cuando la clase se instancia inmediatamente existe el stack que es un vector.
    }

    @Override
    public void push(T item) {
        stack.add(item); //Agrega el item al vector.
    }

    @Override
    public T pop() throws Exception {
        if (isEmpty()) throw new Exception("Stack vacío"); //Si está vacía la pila arroja una excepción
        return stack.remove(stack.size() - 1); //De lo contrario, retorna el último valor de la pila e inmediatamente se remueve de la pila.
    }

    @Override
    public T UltimoValor() throws Exception {
        if (isEmpty()) throw new Exception("Stack vacío"); //Si está vacía la pila arroja una excepción
        return stack.get(stack.size() - 1); //De lo contrario, retorna el último valor de la pila sin removerlo de la pila.
    }

    @Override
    public int size() {
        return stack.size(); //Retorna el tamano de la pila, o dicho en otras palabras, retorna cuantos items tiene la pila actualmente.
    }
}

