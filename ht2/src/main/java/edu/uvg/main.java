package edu.uvg;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String ruta = "C:\\Users\\dquan\\OneDrive\\Documentos\\Diego Quan\\UVG\\Ciclo 3\\Algoritmos y Estructura de datos\\Hoja de trabajo 2\\HDT-2\\ht2\\src\\main\\java\\edu\\uvg\\Postfix.txt";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione implementación de pila:");
        System.out.println("1. ArrayList");
        System.out.println("2. Vector");
        System.out.println("3. Lista");
        System.out.print("Ingrese su opción: ");
        int opcion = scanner.nextInt();
        IStack<Integer> stack;

        if (opcion == 3) {
            System.out.println("Seleccione implementación de lista:");
            System.out.println("1. Lista simplemente encadenada");
            System.out.println("2. Lista doblemente encadenada");
            System.out.print("Ingrese su opción: ");
            int listaOpcion = scanner.nextInt();

            IList<Integer> list = (listaOpcion == 1) ? new SingleLinkedList<>() : new DoubleLinkedList<>();
            stack = new StackList<>(list);
        } else {
            String stackType = (opcion == 1) ? "arraylist" : "vector";
            StackFactory<Integer> stackFactory = new StackFactory<>();
            stack = stackFactory.getStack(stackType);
        }
        
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String infixExpresion = br.readLine().trim();
            if (infixExpresion.isEmpty()) {
                System.out.println("El archivo está vacío o contiene una línea vacía.");
                return;
            }

            System.out.println("Expresión infix leída: " + infixExpresion);
            String postfixExpresion = InfixToPostfixConverter.convert(infixExpresion);
            System.out.println("Expresión convertida a postfix: " + postfixExpresion);

            Calculadora calculator = Calculadora.getInstance();
            System.out.println("Resultado: " + calculator.evaluate(postfixExpresion));
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error en la evaluación: " + e.getMessage());
        }
    }
}