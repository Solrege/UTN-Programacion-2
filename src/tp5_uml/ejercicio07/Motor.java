package ejercicios_tp5;

public class Motor {
    private String tipo;
    private String numeroSerie;
    // asociación bidireccional con Vehiculo
    private Vehiculo vehiculo;

    public Motor(String tipo, String numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    // package-private: manejado por Vehiculo para mantener bidireccionalidad
    void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Motor[tipo=" + tipo + ", numeroSerie=" + numeroSerie + "]";
    }
}
