package tp2_programacion_estructurada;

/* Escribe un programa en Java que solicite al usuario su edad y clasifique su
etapa de vida según la siguiente tabla:
Menor de 12 años: "Niño"
Entre 12 y 17 años: "Adolescente"
Entre 18 y 59 años: "Adulto"
60 años o más: "Adulto mayor" */

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        if (edad < 0) {
            System.out.println("La edad ingresada no puede ser negativa");
            return;
        }

        if (edad < 12) {
            System.out.println("Sos un niño");
        } else if (edad <= 17) {
            System.out.println("Sos un adolescente");
        } else if (edad <= 59) {
            System.out.println("Sos un adulto");
        } else {
            System.out.println("Sos un adulto mayor");
        }

        scanner.close();
    }
}
