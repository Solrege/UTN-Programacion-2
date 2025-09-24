package tp5_uml.ejercicio08;

public class FirmaDigital {
    private int codigoHash;
    private String fecha;
    private Usuario usuario;// agregación: FirmaDigital -> Usuario

    public FirmaDigital(int codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public int getCodigoHash() {
        return codigoHash;
    }

    public void setCodigoHash(int codigoHash) {
        this.codigoHash = codigoHash;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "FirmaDigital{" +
                "codigoHash=" + codigoHash +
                ", fecha='" + fecha + '\'' +
                ", usuario=" + usuario +
                '}';
    }
}
