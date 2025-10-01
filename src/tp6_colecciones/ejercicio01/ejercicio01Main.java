package tp6_colecciones.ejercicio01;

import java.util.List;

public class ejercicio01Main {
    public static void main(String[] args) {
        // Crear al menos cinco productos con diferentes categorías y agregarlos al inventario.
        Inventario inventario = new Inventario();

        Producto p1 = new Producto("100", "Café", 1080.0, 10, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("101", "Jeans", 5000.00, 15, CategoriaProducto.ROPA);
        Producto p3 = new Producto("102", "Tablet", 14999.99, 20, CategoriaProducto.ELECTRONICA);
        Producto p4 = new Producto("103", "Alfajor", 50.00, 7, CategoriaProducto.ALIMENTOS);
        Producto p5 = new Producto("104", "Camisa", 2100.00, 8, CategoriaProducto.ROPA);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        //2. Listar todos los productos mostrando su información y categoría.
        System.out.println("----------------------");
        inventario.listarProductos();

        //3. Buscar un producto por ID y mostrar su información.
        System.out.println("----------------------");
        System.out.println("Mostrando producto filtrado por ID:");
        Producto prodID = inventario.buscarProductoPorID(p1.getID());
        prodID.mostrarInfo();

        //4. Filtrar y mostrar productos que pertenezcan a una categoría específica.
        System.out.println("----------------------");
        System.out.println("Mostrando productos de una categoría:");
        List<Producto> prodPorCategoria = inventario.filtrarPorCategoria(p1.getCategoria());
        for (Producto prod : prodPorCategoria) {
            prod.mostrarInfo();
        }

        //5. Eliminar un producto por su ID y listar los productos restantes.
        System.out.println("----------------------");
        System.out.println("Eliminando un producto: ");
        inventario.eliminarProducto(p1.getID());
        inventario.listarProductos();

        //6. Actualizar el stock de un producto existente.
        System.out.println("----------------------");
        System.out.println("Actualizando stock:");
        inventario.actualizarStock(p2.getID(), 9);

        //7. Mostrar el total de stock disponible.
        System.out.println("----------------------");
        int total = inventario.obtenerTotalStock();
        System.out.println("Total de productos del inventario: " + total);

        //8. Obtener y mostrar el producto con mayor stock.
        System.out.println("----------------------");
        System.out.println("Producto con mayor stock:");
        Producto productoMayorStock = inventario.obtenerProductoConMayorStock();
        productoMayorStock.mostrarInfo();

        //9. Filtrar productos con precios entre $1000 y $3000.
        System.out.println("----------------------");
        System.out.println("Productos con precios entre 1000 y 3000:");
        List<Producto> filtro = inventario.filtrarProductosPorPrecio(1000.00, 3000.00);
        for (Producto producto : filtro) {
            producto.mostrarInfo();
        }

        //10. Mostrar las categorías disponibles con sus descripciones.
        System.out.println("----------------------");
        System.out.println("Las categorías son:");
        inventario.mostrarCategoriasDisponibles();
    }
}
