package tp5_uml.ejercicio09;

public class Paciente {
    private String nombre;
    private String obraSocial;
    private int nroAfiliado;

    public Paciente(String nombre, String obraSocial, int nroAfiliado) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
        this.nroAfiliado = nroAfiliado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }

    public int getNroAfiliado() {
        return nroAfiliado;
    }

    public void setNroAfiliado(int nroAfiliado) {
        this.nroAfiliado = nroAfiliado;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", obraSocial='" + obraSocial + '\'' +
                ", nroAfiliado=" + nroAfiliado +
                '}';
    }
}
