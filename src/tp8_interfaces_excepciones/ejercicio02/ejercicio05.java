package tp8_interfaces_excepciones.ejercicio02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ejercicio05 {
    public static void main(String[] args) {
        //5. Uso de try-with-resources
        //Leer un archivo con BufferedReader usando try-with-resources.
        //Manejar IOException correctamente

        String path = "/home/sol/Documents/utn/programacion2/programacion-2/src/tp8_interfaces_excepciones/ejercicio02/archivo.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
