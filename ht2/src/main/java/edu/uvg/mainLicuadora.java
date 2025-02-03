package edu.uvg;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class mainLicuadora {
    public static void main(String[] args) {
        String ruta = "C:\\Users\\dquan\\OneDrive\\Documentos\\Diego Quan\\UVG\\Ciclo 3\\Algoritmos y Estructura de datos\\Hoja de trabajo 2\\HDT-2\\ht2\\src\\main\\java\\edu\\uvg\\Postfix.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) { //intenta leer el archivo .txt
            String linea = br.readLine(); //lee una linea y la guarda en el string linea
        }catch (IOException e) {//Si no logra leer el archivo arroja una excepción
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}

