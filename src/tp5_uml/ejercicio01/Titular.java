package tp5_uml.ejercicio01;

public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte; // asociación: Titular conoce su Pasaporte (bidireccional)

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    // establecer asociación desde el lado del Titular
    void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;

        if (pasaporte != null && pasaporte.getTitular() != this) {
            pasaporte.setTitular(this);
        }
    }

    @Override
    public String toString() {
        return "Titular[nombre=" + nombre + ", dni=" + dni + "]";
    }
}
