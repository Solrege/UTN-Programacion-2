package tp8_interfaces_excepciones.ejercicio02;

import java.io.*;
import java.util.Scanner;

public class ejercicio01 {
    public static void main(String[] args) {
        // 1. División segura
        //Solicitar dos números y dividirlos.
        // Manejar ArithmeticException si el divisor es cero.
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese numerador: ");
            int a = sc.nextInt();
            System.out.print("Ingrese divisor: ");
            int b = sc.nextInt();

            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir por cero.");
        }
    }
}
