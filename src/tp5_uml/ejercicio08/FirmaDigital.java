package tp5_uml.ejercicio08;

public class FirmaDigital {
    private int codigoHash;
    private String fecha;
    // agregación: FirmaDigital -> Usuario
    private Usuario usuario;

    public FirmaDigital(int codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public int getCodigoHash() {
        return codigoHash;
    }

    public String getFecha() {
        return fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return "FirmaDigital[codigoHash=" + codigoHash + ", fecha=" + fecha + ", usuario=" + usuario + "]";
    }

    // Tell, Don't Ask: la firma se encarga de imprimir su usuario/estado
    public void imprimirInfo() {
        System.out.println("FirmaDigital -> codigoHash=" + codigoHash + ", fecha=" + fecha + ", usuario=" + usuario);
    }
}
