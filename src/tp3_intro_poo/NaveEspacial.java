package tp3_intro_poo;

public class NaveEspacial {
    private String nombre;
    private int combustible = 0;
    private final int COMBUSTIBLE_MAX = 100;

    // Constructor
    public NaveEspacial(String nombre, int combustible) {
        setNombre(nombre);
        setCombustible(combustible);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        if ((this.combustible + combustible) > COMBUSTIBLE_MAX) {
            System.out.println("El combustible se encuentra fuera de rango");
            return;
        }

        this.combustible += combustible;
    }

    public void mostrarEstado() {
        System.out.println("\n---- ESTADO DE LA NAVE ----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Combustible: " + combustible);
        System.out.println("-------------------------------");
    }

    public void despegar() {
        if (combustible < 10) {
            System.out.println("No hay combustible disponible para despegar");
            return;
        }

        combustible -= 10;
    }

    public void avanzar(int distancia) {
        int consumo = distancia * 2;

        if (combustible < consumo) {
            System.out.println("No hay suficiente combustible para avanzar");
            return;
        }

        combustible -= consumo;
    }

    public void recargarCombustible(int recarga) {
        setCombustible(recarga);
    }
}
