package tp1_introduccion_a_java;

import java.util.Scanner;

/* Escribe un programa que solicite dos números enteros y realice las siguientes operaciones:
Suma
Resta
Multiplicación
División
Muestra los resultados en la consola.
*/

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();

        int suma = num1 + num2;
        System.out.println("Suma: " + suma);

        int resta = num1 - num2;
        System.out.println("Resta: " + resta);

        int multiplicacion = num1 * num2;
        System.out.println("Multiplicación: " + multiplicacion);

        if (num2 == 0) {
            System.out.print("No se puede dividir por cero");
            return;
        }

        double division = (double) num1 / num2;
        System.out.println("División: " + division);

        scanner.close();
    }
}
