package tp7_herencia_polimorfismo.ejercicio04;

public class Vaca extends Animal {

    public Vaca(String nombre) {
        super(nombre);
    }

    @Override
    public String hacerSonido() {
        return "MUUUU";
    }
}
