package edu.uvg;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Ruta del archivo que contiene la expresión infix a evaluar
        String ruta = "C:\\Users\\dquan\\OneDrive\\Documentos\\Diego Quan\\UVG\\Ciclo 3\\Algoritmos y Estructura de datos\\Hoja de trabajo 2\\HDT-2\\ht2\\src\\main\\java\\edu\\uvg\\Postfix.txt";
        Scanner scanner = new Scanner(System.in);

        // Menú para seleccionar la implementación de la pila
        System.out.println("Seleccione implementación de pila:");
        System.out.println("1. ArrayList");
        System.out.println("2. Vector");
        System.out.println("3. Lista");
        System.out.print("Ingrese su opción: ");
        int opcion = scanner.nextInt();
        iStack<Integer> stack; // Declaración de la pila

        // Si el usuario elige una lista como implementación de pila
        if (opcion == 3) {
            System.out.println("Seleccione implementación de lista:");
            System.out.println("1. Lista simplemente encadenada");
            System.out.println("2. Lista doblemente encadenada");
            System.out.print("Ingrese su opción: ");
            int listaOpcion = scanner.nextInt();

            // Se crea una lista según la opción elegida
            IList<Integer> list = (listaOpcion == 1) ? new SimpleEncadenadas<>() : new DobleEncadenadas<>();
            stack = new StackList<>(list); // Se usa la lista como base para la pila
        } else {
            // Si el usuario elige una implementación de pila estándar
            String stackType = (opcion == 1) ? "arraylist" : "vector"; // Determina el tipo de pila
            StackFactory<Integer> stackFactory = new StackFactory<>(); // Crea una fábrica de pilas
            stack = stackFactory.getStack(stackType); // Obtiene la implementación de pila correspondiente
        }
        
        // Lectura del archivo que contiene la expresión matemática en notación infix
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String infixExpresion = br.readLine().trim(); // Lee la primera línea y elimina espacios en blanco

            // Verifica si el archivo está vacío o contiene solo una línea vacía
            if (infixExpresion.isEmpty()) {
                System.out.println("El archivo está vacío o contiene una línea vacía.");
                return;
            }

            System.out.println("Expresión infix leída: " + infixExpresion);

            // Convierte la expresión de notación infix a notación postfix
            String postfixExpresion = Conversor.Conversion(infixExpresion);
            System.out.println("Expresión convertida a postfix: " + postfixExpresion);

            // Obtiene la instancia única de la calculadora y evalúa la expresión postfix
            Calculadora calculator = Calculadora.getInstance();
            System.out.println("Resultado: " + calculator.evaluate(postfixExpresion));

        } catch (IOException e) {
            // Manejo de error si ocurre un problema al leer el archivo
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (Exception e) {
            // Manejo de error si ocurre un problema al evaluar la expresión
            System.out.println("Error en la evaluación: " + e.getMessage());
        }
    }
}