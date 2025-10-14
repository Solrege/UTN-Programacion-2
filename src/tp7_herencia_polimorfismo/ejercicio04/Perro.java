package tp7_herencia_polimorfismo.ejercicio04;

public class Perro extends Animal {

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public String hacerSonido() {
        return "GUAU";
    }
}
