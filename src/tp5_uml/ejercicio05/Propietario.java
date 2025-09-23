package tp5_uml.ejercicio05;

public class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora; // asociación bidireccional

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    // package-private: controlamos la bidireccionalidad desde Computadora
    void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    @Override
    public String toString() {
        return "Propietario[nombre=" + nombre + ", dni=" + dni + "]";
    }
}
