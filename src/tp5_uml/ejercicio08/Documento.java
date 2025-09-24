package tp5_uml.ejercicio08;

public class Documento {
    private String titulo;
    private String contenido;
    private final FirmaDigital firma; // composición: Documento contiene una FirmaDigital (creada internamente)

    public Documento(String titulo, String contenido, int codigoHash, String fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = new FirmaDigital(codigoHash, fecha, usuario);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public FirmaDigital getFirma() {
        return firma;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "titulo='" + titulo + '\'' +
                ", contenido='" + contenido + '\'' +
                ", firma=" + firma +
                '}';
    }
}
