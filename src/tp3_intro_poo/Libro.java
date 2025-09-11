package tp3_intro_poo;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        setTitulo(titulo);
        setAutor(autor);
        setAnioPublicacion(anioPublicacion);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion < 1 || anioPublicacion > java.time.Year.now().getValue()) {
            System.out.println("El año de publicación es incorrecto");
            return;
        }

        this.anioPublicacion = anioPublicacion;
    }

    public void mostrarInfo() {
        System.out.println("\n---- DATOS DEL LIBRO -----");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Anio Publicacion: " + getAnioPublicacion());
        System.out.println("-------------------------------");
    }
}

