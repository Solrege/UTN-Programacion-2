package tp5_uml.ejercicio06;

public class Reserva {
    private String fecha;
    private String hora;
    // asociación unidireccional: Reserva -> Cliente
    private Cliente cliente;
    // agregación: Reserva -> Mesa
    private Mesa mesa;

    public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    @Override
    public String toString() {
        return "Reserva[fecha=" + fecha + ", hora=" + hora + ", cliente=" + cliente + ", mesa=" + mesa + "]";
    }
}
