package edu.uvg;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class mainLicuadora {
    public static void main(String[] args) {
        String ruta = "C:\\Users\\dquan\\OneDrive\\Documentos\\Diego Quan\\UVG\\Ciclo 3\\Algoritmos y Estructura de datos\\Hoja de trabajo 2\\HDT-2\\ht2\\src\\main\\java\\edu\\uvg\\Postfix.txt";
        
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) { //intenta leer el archivo
            App c = new App(); //Se crea el objeto tipo app
            String linea = br.readLine(); //Lee la línea y la guarda en el String linea
            
            if (linea == null || linea.isEmpty()) {//Verifica que las líneas tengan caracteres
                System.out.println("El archivo está vacío o contiene una línea vacía.");
                return;
            }
    
            System.out.println("Expresión leída: " + linea); //Confirma que la línea fue leída
            
            try { //intenta realizar el método evaluate
                System.out.println("Resultado: " + c.evaluate(linea)); // evalúa la línea leída
            } catch (Exception e) {//Si no logra evaluarla arroja una excepción
                System.out.println("Error al evaluar la expresión: " + e.getMessage());
            }
    
        } catch (IOException e) {//Si no logra leer el archivo arroja una excepción.
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    
}

