package tp1_introduccion_a_java;

import java.util.Scanner;

/* Manejar conversiones de tipo y división en Java.
Escribe un programa que divida dos números enteros ingresados por el usuario.
*/

public class Ejercicio8conINT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();

        if (num2 == 0) {
            System.out.print("No se puede dividir por cero");
            return;
        }

        int resultado = num1 / num2;

        System.out.println("Resultado de la división entera: " + resultado);

        scanner.close();
    }
}
