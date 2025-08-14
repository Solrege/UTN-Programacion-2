package tp2_programacion_estructurada;

/* Escribe un programa en Java que pida al usuario tres números enteros y
determine cuál es el mayor */

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        int mayor;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingresa el tercer número: ");
        int num3 = scanner.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }

        System.out.println("El mayor número es: " + mayor);

        scanner.close();
    }
}
