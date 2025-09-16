package ejercicios_tp5;

public class Conductor {
    private String nombre;
    private boolean licencia;

    public Conductor(String nombre, boolean licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean hasLicencia() {
        return licencia;
    }

    @Override
    public String toString() {
        return "Conductor[nombre=" + nombre + ", licencia=" + licencia + "]";
    }
}
