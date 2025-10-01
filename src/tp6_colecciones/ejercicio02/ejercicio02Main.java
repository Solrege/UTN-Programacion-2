package tp6_colecciones.ejercicio02;

public class ejercicio02Main {
    public static void main(String[] args) {
        //1. Creamos una biblioteca.
        Biblioteca biblioteca = new Biblioteca("Mi Biblioteca");

        //2. Crear al menos tres autores
        Autor a1 = new Autor("A100", "JRR Tolkien", "Sudafricano");
        Autor a2 = new Autor("A200", "JK Rowling", "Escocesa");
        Autor a3 = new Autor("A300", "Patrick Rothfuss", "Estadounidense");

        //3. Agregar 5 libros asociados a alguno de los Autores a la biblioteca.
        biblioteca.agregarLibro("ISBN100", "El Silmarillion", 1977, a1);
        biblioteca.agregarLibro("ISBN101", "El Hobbit", 1937, a1);
        biblioteca.agregarLibro("ISBN102", "Harry Potter y la Orden del Fénix", 2003, a2);
        biblioteca.agregarLibro("ISBN103", "En el nombre del viento", 2007, a3);
        biblioteca.agregarLibro("ISBN104", "El temor de un hombre sabio", 2011, a3);

        //4. Listar todos los libros con su información y la del autor.
        System.out.println("Lista de libros en la biblioteca:");
        biblioteca.listarLibros();

        //5. Buscar un libro por su ISBN y mostrar su información.
        System.out.println("Buscar Libro por su ISBN");
        Libro busqueda = biblioteca.buscarLibroPorIsbn("ISBN100");

        if (busqueda != null) {
            busqueda.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado");
        }

        //6. Filtrar y mostrar los libros publicados en un año específico.
        System.out.println("Filtrando por año 1977:");
        for (Libro libro : biblioteca.filtrarLibrosPorAnio(1977)) {
            libro.mostrarInfo();
        }

        //7. Eliminar un libro por su ISBN y listar los libros restantes.
        System.out.println("Eliminando libro por ISBN");
        System.out.println("Lista actualizada de libros en la biblioteca:");
        biblioteca.eliminarLibro("ISBN101");
        biblioteca.listarLibros();

        //8. Mostrar la cantidad total de libros en la biblioteca.
        System.out.println("La biblioteca tiene: " + biblioteca.obtenerCantidadLibros() + " libros");

        //9. Listar todos los autores de los libros disponibles en la biblioteca
        System.out.println("----------------");
        System.out.println("Los autores disponibles son:");
        for (Autor autor : biblioteca.mostrarAutoresDisponibles()) {
            autor.mostrarInfo();
        };

    }
}
