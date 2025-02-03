package edu.uvg;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class mainLicuadora {
    public static void main(String[] args) {
        String ruta = "C:\\Users\\dquan\\OneDrive\\Documentos\\Diego Quan\\UVG\\Ciclo 3\\Algoritmos y Estructura de datos\\Hoja de trabajo 2\\HDT-2\\ht2\\src\\main\\java\\edu\\uvg\\Postfix.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea = br.readLine();
            System.out.println(linea);
        }catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}

