package tp1_introduccion_a_java;

import java.util.Scanner;

/* Escribe un programa que solicite al usuario ingresar su nombre y edad,
y luego los muestre en pantalla.
Usa Scanner para capturar los datos. */

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        System.out.println("Hola " + nombre + "! Tu edad es: " + edad);

        scanner.close();

    }
}
