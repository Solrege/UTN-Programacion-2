package tp8_interfaces_excepciones.ejercicio02;

import java.util.Scanner;

public class ejercicio02 {
    public static void main(String[] args) {
        // Conversión de cadena a número
        // Leer texto del usuario e intentar convertirlo a int. Manejar
        //NumberFormatException si no es válido
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número: ");
            String texto = scanner.nextLine();
            int numero = Integer.parseInt(texto);
            System.out.println("Número ingresado: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada no válida.");
        }

    }
}
