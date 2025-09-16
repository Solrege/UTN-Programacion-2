package ejercicios_tp5;

public class Documento {
    private String titulo;
    private String contenido;
    // composición: Documento contiene una FirmaDigital (creada internamente)
    private final FirmaDigital firma;

    public Documento(String titulo, String contenido, int codigoHash, String fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = new FirmaDigital(codigoHash, fecha, usuario);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public FirmaDigital getFirma() {
        return firma;
    }

    @Override
    public String toString() {
        return "Documento[titulo=" + titulo + ", contenido=" + contenido + ", firma=" + firma + "]";
    }

    // Tell, Don't Ask: Documento delega a la FirmaDigital la impresión de su usuario/estado
    public void imprimirUsuarioDeFirma() {
        System.out.println("Documento: " + titulo + " -> Usuario de la firma:");
        firma.imprimirInfo();
    }
}
