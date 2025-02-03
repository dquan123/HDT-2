package edu.uvg;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class mainLicuadora {
    public static void main(String[] args) {
        String ruta = "\"C:\\Users\\rogue\\OneDrive\\Escritorio\\hola mundo.txt\"";  //Ruta del archivo txt
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea = br.readLine();
            System.out.println(linea);
        }catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}

