package tp8_interfaces_excepciones.ejercicio01;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    private List<Producto> productos = new ArrayList<>();
    private Cliente cliente;
    private EstadoPedido estadoPedido;

    Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.estadoPedido = EstadoPedido.PENDIENTE;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void mostrarProductos() {
        System.out.println("Listado de productos: ");
        for (Producto producto : productos) {
            System.out.println(producto);
        };
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public EstadoPedido getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(EstadoPedido estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularTotal();
        }

        return total;
    }

    public void cambiarEstado(EstadoPedido nuevoEstado) {
        this.estadoPedido = nuevoEstado;
        cliente.notificar("El pedido ha cambiado de estado: " + nuevoEstado.getDescripcion());
    }
}
