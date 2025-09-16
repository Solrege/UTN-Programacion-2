package tp5_uml.ejercicio06;

public class Cliente_6 {
    private String nombre;
    private String telefono;

    public Cliente_6(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Cliente[nombre=" + nombre + ", telefono=" + telefono + "]";
    }
}
