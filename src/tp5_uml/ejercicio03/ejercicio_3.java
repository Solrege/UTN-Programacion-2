package ejercicios_tp5;

public class ejercicio_3 {
    
    public static void main (String [] args) {
        // Asociación unidireccional : Libro -> Autor
        Autor autor = new Autor("Gabriel Garcia Marquez", "Colombiana");
        // Agregación : Libro -> Editorial
        Editorial editorial = new Editorial("Editorial ABC", "Calle Falsa 123");

        // (Se crea el Libro referenciando Autor y Editorial)
        Libro libro = new Libro("Cien Años de Soledad", 123456, autor, editorial);

        // Comprobaciones minimas 
        System.out.println(libro);
        System.out.println("Autor del libro: " + libro.getAutor());
        System.out.println("Editorial del libro: " + libro.getEditorial());
    }
}
