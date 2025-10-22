package tp8_interfaces_excepciones.ejercicio01;

public class TarjetaCredito implements Pago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con tarjeta por $" + monto);
    }
}
