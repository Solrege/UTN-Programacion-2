package tp2_programacion_estructurada;

/* Crea un programa que:
a. Declare e inicialice un array con los precios de algunos productos.
b. Use una función recursiva para mostrar los precios originales.
c. Modifique el precio de un producto específico.
d. Use otra función recursiva para mostrar los valores modificados. */

public class ejercicio13 {
    public static void main(String[] args) {
        double[] precios = {129.99, 215.0, 149.99, 350.0, 99.99};

        System.out.println("Precios originales:");
        mostrarPrecios(precios, 0);

        precios[2] = 179.99;

        System.out.println("Precios modificados:");
        mostrarPrecios(precios, 0);
    }

    public static void mostrarPrecios(double[] precios, int indice) {
        if (indice >= precios.length) {
            return;
        }
        System.out.println("Precio: $" + precios[indice]);
        mostrarPrecios(precios, indice + 1);
    }
}
