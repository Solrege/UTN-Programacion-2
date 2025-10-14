package tp7_herencia_polimorfismo.ejercicio04;

public class ejercicio04Main {
    public static void main(String[] args) {
        Animal[] animales = {
                new Perro("Perro"),
                new Gato("Gato"),
                new Vaca("Vaca")
        };

        for (Animal animal : animales) {
            System.out.println("El animal " + animal.getNombre() +
                    " hace el siguiente sonido: " + animal.hacerSonido());
        }
    }
}
