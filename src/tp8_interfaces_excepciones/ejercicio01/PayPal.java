package tp8_interfaces_excepciones.ejercicio01;

public class PayPal implements PagoConDescuento {
    private double monto;

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public void aplicarDescuento(double monto) {
        double descuento = 0.1;
        this.monto = monto  - (descuento * monto);
        System.out.println("El monto con descuento es de: " + this.monto);

    }
}
