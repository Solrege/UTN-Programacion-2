package tp1_introduccion_a_java;

import java.util.Scanner;

/* Modifica el código para usar double en lugar de int y compara los resultados.  */

public class Ejercicio8ConDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        if (num2 == 0) {
            System.out.print("No se puede dividir por cero");
            return;
        }

        double resultado = num1 / num2;

        System.out.println("Resultado de la división con decimales: " + resultado);

        scanner.close();
    }
}
