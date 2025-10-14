package tp7_herencia_polimorfismo.ejercicio02;

import java.awt.*;

public class ejercicio02Main {
    public static void main(String[] args) {
        Figura[] figuras = {
                new Circulo("Circulo 1", 3.7),
                new Circulo("Circulo 2", 4.2),
                new Rectangulo("Rectangulo 1", 6.5, 5.0),
                new Rectangulo("Rectangulo 2", 3.5, 5.5)
        };

        for (Figura figura : figuras) {
            System.out.println(figura.getNombre() + " tiene un área de: " + figura.calcularArea());
        }

    }
}
