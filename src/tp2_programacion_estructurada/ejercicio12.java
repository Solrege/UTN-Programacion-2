package tp2_programacion_estructurada;

/* Crea un programa que:
a. Declare e inicialice un array con los precios de algunos productos.
b. Muestre los valores originales de los precios.
c. Modifique el precio de un producto específico.
d. Muestre los valores modificados. */

public class ejercicio12 {
    public static void main(String[] args) {
        double[] precios = {129.99, 215.0, 149.99, 350.0, 99.99};

        System.out.println("Precios originales:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }

        precios[1] = 249.99;

        System.out.println("Precios modificados:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }
}
