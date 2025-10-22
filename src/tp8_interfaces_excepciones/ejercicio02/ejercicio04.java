package tp8_interfaces_excepciones.ejercicio02;

import java.util.Scanner;

public class ejercicio04 {
    public static void main(String[] args) {
        //4. Excepción personalizada
        //Crear EdadInvalidaException. Lanzarla si la edad es menor a 0 o mayor
        //a 120. Capturarla y mostrar mensaje.

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();
            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("Edad fuera de rango permitido.");
            }
            System.out.println("Edad válida: " + edad);
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
