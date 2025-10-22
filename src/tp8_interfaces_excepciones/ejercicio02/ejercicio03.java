package tp8_interfaces_excepciones.ejercicio02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ejercicio03 {
    public static void main(String[] args) {
        //3. Lectura de archivo
        //Leer un archivo de texto y mostrarlo.
        // Manejar FileNotFoundException si el archivo no existe.
        String path = "/home/sol/Documents/utn/programacion2/programacion-2/src/tp8_interfaces_excepciones/ejercicio02/archivo.txt";

        try {
            Scanner s = new Scanner(new File(path));
            while (s.hasNextLine()) {
                System.out.println(s.nextLine());
            }
            s.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: el archivo no existe.");
        }
    }
}
