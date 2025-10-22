package tp8_interfaces_excepciones.ejercicio01;

public class mainEjercicio01 {
    public static void main(String[] args) {
        // EJEMPLO 1
        System.out.println("EJEMPLO 1");
        Cliente cliente = new Cliente("Jane Doe");
        Pedido pedido = new Pedido(cliente);

        pedido.agregarProducto(new Producto("Frutillas", 2000));
        pedido.agregarProducto(new Producto("Peras", 3000));
        double totalPedido = pedido.calcularTotal();

        System.out.println("Total del pedido: $" + totalPedido);
        System.out.println("--------------------------");
        System.out.println("Estado del pedido: " + pedido.getEstadoPedido());
        System.out.println("--------------------------");

        PayPal pago = new PayPal();
        pago.aplicarDescuento(totalPedido);
        System.out.println("--------------------------");

        pedido.cambiarEstado(EstadoPedido.PAGADO);
        System.out.println("--------------------------");

        System.out.println("Cliente: " + cliente.getNombre());
        pedido.mostrarProductos();
        System.out.println("Total del pedido: $" + totalPedido);
        System.out.println("Total con descuento: $" + pago.getMonto());
        System.out.println("Estado del pedido: " + pedido.getEstadoPedido());
        System.out.println("--------------------------");

        // EJEMPLO 2
        System.out.println("EJEMPLO 2");
        Cliente cliente2 = new Cliente("Jane Doe");
        Pedido pedido2 = new Pedido(cliente2);

        pedido2.agregarProducto(new Producto("Arándanos", 4000));
        pedido2.agregarProducto(new Producto("Manzanas", 2000));
        double totalPedido2 = pedido2.calcularTotal();

        System.out.println("Total del pedido: $" + totalPedido2);
        System.out.println("--------------------------");
        System.out.println("Estado del pedido: " + pedido2.getEstadoPedido());
        System.out.println("--------------------------");

        TarjetaCredito tc = new TarjetaCredito();
        tc.procesarPago(totalPedido2);
        System.out.println("--------------------------");

        pedido2.cambiarEstado(EstadoPedido.PAGADO);
        System.out.println("--------------------------");

        System.out.println("Cliente: " + cliente2.getNombre());
        pedido2.mostrarProductos();
        System.out.println("Total del pedido: $" + totalPedido2);
        System.out.println("Estado del pedido: " + pedido2.getEstadoPedido());
    }
}
