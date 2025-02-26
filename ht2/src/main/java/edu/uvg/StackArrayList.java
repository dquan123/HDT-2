package edu.uvg;

import java.util.ArrayList;

public class StackArrayList<T> extends AbstractStack<T>{

    private ArrayList<T> stack; //Atributo tipo ArrayList

    public StackArrayList() { //Constructor de la clase, no recibe ningún atributo, únicamente se instancia.
        stack = new ArrayList<>(); //Cuando la clase se instancia inmediatamente existe el stack que es una arraylist.
    }

    @Override
    public void push(T item) {
        stack.add(item); //Se agrega el item a la arraylist
    }

    @Override
    public T pop() throws Exception {
        if (isEmpty()) throw new Exception("Stack vacío"); //Si está vacía la arraylist arroja una excepción
        return stack.remove(stack.size() - 1); //De lo contrario, retorna el último valor de la pila e inmediatamente se remueve de la pila.
    }

    @Override
    public T UltimoValor() throws Exception {
        if (isEmpty()) throw new Exception("Stack vacío");//Si la pila está vacía arroja una excepción.
        return stack.get(stack.size() - 1); //De lo contrario retorna el último valor de la pila pero sin eliminarlo.
    }

    @Override
    public int size() {
        return stack.size(); //Retorna el tamano de la pila, o dicho en otras palabras, retorna cuantos items tiene la pila actualmente.
    }
}

