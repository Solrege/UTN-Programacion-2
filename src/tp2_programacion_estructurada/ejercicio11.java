package tp2_programacion_estructurada;

/* Declara una variable global Ejemplo de entrada/salida: = 0.10. Luego, crea un
métoo calcularDescuentoEspecial(double precio) que use la variable global para
calcular el descuento especial del 10%.
Dentro del métdo, declara una variable local descuentoAplicado, almacena
el valor del descuento y muestra el precio final con descuento. */

import java.util.Scanner;

public class ejercicio11 {
    static double DESCUENTO_ESPECIAL = 0.10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        if (precio <= 0) {
            System.out.println("El precio del producto no puede ser negativo");
            return;
        }

        calcularDescuentoEspecial(precio);
    }

    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
}
