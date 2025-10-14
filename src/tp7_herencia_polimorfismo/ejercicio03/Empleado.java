package tp7_herencia_polimorfismo.ejercicio03;

public abstract class Empleado {
    public String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public abstract double calcularSueldo();
}
