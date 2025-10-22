package tp8_interfaces_excepciones.ejercicio01;

public enum EstadoPedido {
    PENDIENTE("Pendiente de pago"),
    PAGADO("Pago recibido"),
    ENTREGADO("Entregado al cliente"),
    CANCELADO("Pedido cancelado");

    private final String descripcion;

    EstadoPedido(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}

