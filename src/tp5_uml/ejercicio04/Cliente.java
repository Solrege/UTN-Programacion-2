package ejercicios_tp5;

public class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta; // asociación bidireccional

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public TarjetaDeCredito getTarjeta() {
        return tarjeta;
    }

    // package-private: controlamos la bidireccionalidad desde TarjetaDeCredito
    void setTarjeta(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
    }

    @Override
    public String toString() {
        return "Cliente[nombre=" + nombre + ", dni=" + dni + "]";
    }
}
