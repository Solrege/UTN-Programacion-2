package tp5_uml.ejercicio01;

public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto; // composición: Pasaporte contiene a foto
    private Titular titular;  // asociación bidireccional con Titular

    public Pasaporte(String numero, String fechaEmision, String foto, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;

        // Al ser composicion, se encarga de crear el objeto contenido.
        this.foto = new Foto(foto, formato);
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }

    public Titular getTitular() {
        return titular;
    }

    // establece la asociación y mantiene la bidireccionalidad
    public void setTitular(Titular titular) {
        this.titular = titular;

        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }

    @Override
    public String toString() {
        return "Pasaporte[numero=" + numero + ", fechaEmision=" + fechaEmision + ", foto=" + foto + "]";
    }
}
