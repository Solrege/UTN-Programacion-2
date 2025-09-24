package tp5_uml.ejercicio06;

import java.time.LocalDate;
import java.time.LocalTime;

public class ejercicio_6 {
    
    public static void main (String [] args) {
        // Asociación unidireccional : Reserva -> Cliente
        Cliente cliente = new Cliente("Mariana Ruiz", "29988776");

        // Agregación : Reserva -> Mesa
        Mesa mesa = new Mesa("M5", 4);

        Reserva reserva = new Reserva(
                LocalDate.of(2025, 9, 16),
                LocalTime.of(10, 30),
                mesa);
        reserva.setCliente(cliente);

        System.out.println(reserva);
        System.out.println("Cliente de la reserva: " + reserva.getCliente());
        System.out.println("Mesa de la reserva: " + reserva.getMesa());
    }
}
