package tp7_herencia_polimorfismo.ejercicio04;

public class Gato extends Animal {

    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public String hacerSonido() {
        return "MIAU";
    }
}
