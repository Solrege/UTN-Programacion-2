package tp5_uml.ejercicio06;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva {
    private LocalDate fecha;
    private LocalTime hora;
    private Cliente cliente; // asociación unidireccional: Reserva -> Cliente
    private Mesa mesa; // agregación: Reserva -> Mesa

    public Reserva(LocalDate fecha, LocalTime hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", cliente=" + cliente +
                ", mesa=" + mesa +
                '}';
    }
}
