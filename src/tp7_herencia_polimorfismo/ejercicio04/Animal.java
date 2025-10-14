package tp7_herencia_polimorfismo.ejercicio04;

public class Animal {
    private  String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String hacerSonido() {
        return "Sonido de animal";
    };

    public  void describirAnimal() {
        System.out.println("El animal es: " + this.nombre);
    }

}
