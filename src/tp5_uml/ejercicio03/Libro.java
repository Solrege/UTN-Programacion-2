package ejercicios_tp5;

public class Libro {
    private String titulo;
    private int isbn;
    // asociación unidireccional: Libro -> Autor
    private Autor autor;
    // agregación: Libro -> Editorial
    private Editorial editorial;

    public Libro(String titulo, int isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getIsbn() {
        return isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    @Override
    public String toString() {
        return "Libro[titulo=" + titulo + ", isbn=" + isbn + ", autor=" + autor + ", editorial=" + editorial + "]";
    }
}
