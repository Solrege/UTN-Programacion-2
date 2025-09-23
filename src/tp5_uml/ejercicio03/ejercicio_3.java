package tp5_uml.ejercicio03;

public class ejercicio_3 {
    
    public static void main (String [] args) {
        // Asociación unidireccional : Libro -> Autor
        Autor autor = new Autor("J.R.R. Tolkien", "Sudafricano");

        // Agregación : Libro -> Editorial
        Editorial editorial = new Editorial("Editorial ABC", "Calle Falsa 123");

        // (Se crea el Libro referenciando Autor y Editorial)
        Libro libro = new Libro("El Hobbit", 123456, editorial);
        libro.setAutor(autor);

        // Comprobaciones minimas 
        System.out.println(libro);
        System.out.println("Autor del libro: " + libro.getAutor());
        System.out.println("Editorial del libro: " + libro.getEditorial());
    }
}
