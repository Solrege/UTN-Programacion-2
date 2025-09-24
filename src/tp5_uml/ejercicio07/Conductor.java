package tp5_uml.ejercicio07;

public class Conductor {
    private String nombre;
    private boolean licencia;
    private Vehiculo vehiculo;

    public Conductor(String nombre, boolean licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isLicencia() {
        return licencia;
    }

    public void setLicencia(boolean licencia) {
        this.licencia = licencia;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;

        if (vehiculo != null && vehiculo.getConductor() != this) {
            vehiculo.setConductor(this);
        }
    }

    @Override
    public String toString() {
        return "Conductor{" +
                "nombre='" + nombre + '\'' +
                ", licencia=" + licencia +
                '}';
    }
}
