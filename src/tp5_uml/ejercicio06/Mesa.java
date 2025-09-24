package tp5_uml.ejercicio06;

public class Mesa {
    private String numero;
    private int capacidad;

    public Mesa(String numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Mesa{" +
                "numero='" + numero + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }
}
