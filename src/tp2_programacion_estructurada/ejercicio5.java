package tp2_programacion_estructurada;

/* Escribe un programa que solicite números al usuario y sume solo los
números pares. El ciclo debe continuar hasta que el usuario ingrese el número
0, momento en el que se debe mostrar la suma total de los pares ingresados. */

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        int numero;
        int sumaPares = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = scanner.nextInt();

            if (numero % 2 == 0 && numero != 0) {
                sumaPares += numero;
            }

        } while (numero != 0);

        System.out.println("La suma de los números pares es: " + sumaPares);
        scanner.close();
    }
}
