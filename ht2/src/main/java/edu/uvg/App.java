package edu.uvg;

/**
 * Hello world!
 *
 */
public class App implements iCalculadora
{
    public int suma(int n1, int n2){
        return n1 + n2;
    }
    public int resta(int n1, int n2){
        return n1 - n2;
    }
    public int division(int n1, int n2){
        return n1/n2;
    }
    public int multiplicacion(int n1, int n2){
        return n1*n2;
    }
    int evaluate(String expresion);

}
