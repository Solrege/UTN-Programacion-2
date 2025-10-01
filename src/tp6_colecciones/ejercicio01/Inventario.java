package tp6_colecciones.ejercicio01;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    };

    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario");

            return;
        }

        System.out.println("Listado de productos del inventario:");
        for (Producto prod : productos) {
            prod.mostrarInfo();
        }
    };

    public Producto buscarProductoPorID(String ID) {
        for (Producto prod : productos) {
            if (prod.getID().equals(ID)) {

                return prod;
            }
        }

        return null;
    };

    public void eliminarProducto(String ID) {
        Producto prod = buscarProductoPorID(ID);

        if (prod == null) {
            System.out.println("No se puede eliminar el producto, id inexistente: " + ID);

            return;
        }

        productos.remove(prod);
        System.out.println("Se elimino correctamente el producto con ID: " + ID);
    };

    public void actualizarStock(String ID, int nuevaCantidad) {
        Producto prod = buscarProductoPorID(ID);

        if (prod == null) {
            System.out.println("No se puede actualizar el stock, id inexistente: " + ID);

            return;
        }

        prod.setCantidad(nuevaCantidad);
        System.out.println("El stock del producto con ID " + ID + " se actualizó correctamente a: " + prod.getCantidad());
    }

    public List<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        List<Producto> filtroCategorias = new ArrayList<>();

        for (Producto prod : productos) {
            if (prod.getCategoria().equals(categoria)) {
                filtroCategorias.add(prod);
            }
        }

        return filtroCategorias;
    };

    public int obtenerTotalStock() {
        int total = 0;

        for (Producto prod : productos) {
            total += prod.getCantidad();
        }

        return total;
    };

    public Producto obtenerProductoConMayorStock() {
        int maxStock = -1;
        Producto productoConMayorStock = null;

        for (Producto prod : productos) {
            if (prod.getCantidad() > maxStock) {
                maxStock = prod.getCantidad();
                productoConMayorStock = prod;
            }
        }

        return productoConMayorStock;
    };

    public List<Producto> filtrarProductosPorPrecio(double min, double max) {
        List<Producto> productosPorPrecio = new ArrayList<>();
        for (Producto prod : productos) {
            if (prod.getPrecio() >= min && prod.getPrecio() <= max) {
                productosPorPrecio.add(prod);
            }
        }

        return productosPorPrecio;
    };

    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto categoria : CategoriaProducto.values()) {
            System.out.println(categoria + ": " + categoria.getDescripcion());
        }
    };
}
