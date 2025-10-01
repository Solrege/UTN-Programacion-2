package tp6_colecciones.ejercicio02;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros = new ArrayList<Libro>();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    // AGREGACION BIBLIOTECA --> LIBRO
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro libro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(libro);
    }

    public void listarLibros(){
        if (this.libros.isEmpty()){
            System.out.println("Libros no encontrados");
            return;
        }

        for (Libro libro : libros){
            libro.mostrarInfo();
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros){
            if (libro.getIsbn().equals(isbn)){

                return libro;
            }
        }

        return null;
    }

    public void eliminarLibro(String isbn) {
        Libro libro = buscarLibroPorIsbn(isbn);

        if (libro == null){
            System.out.println("No se puede eliminar el producto, ISBN inexistente " + isbn);

            return;
        }

        libros.remove(libro);
        System.out.println("Libro eliminado con ISBN " + isbn);
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public List<Libro> filtrarLibrosPorAnio(int anio) {
        List<Libro> librosPorAnio = new ArrayList<>();

        for (Libro libro : libros){
            if (libro.getAnioPublicacion() == anio){
                librosPorAnio.add(libro);
            }
        }

        return librosPorAnio;
    }

    public List<Autor> mostrarAutoresDisponibles() {
        List<Autor> autoresDisponibles = new ArrayList<>();

        for (Libro libro : libros){
            Autor autor = libro.getAutor();
            if (!autoresDisponibles.contains(autor)){
                autoresDisponibles.add(autor);
            }
        }

        return autoresDisponibles;
    }
}
