package tp5_uml.ejercicio03;

public class Libro {
    private String titulo;
    private int isbn;
    private Autor autor; // asociación unidireccional: Libro -> Autor
    private Editorial editorial; // agregación: Libro -> Editorial

    public Libro(String titulo, int isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", isbn=" + isbn +
                ", autor=" + autor +
                ", editorial=" + editorial +
                '}';
    }
}
