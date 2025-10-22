package tp8_interfaces_excepciones.ejercicio01;

public class Cliente implements Notificable{
    String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println(mensaje);
    }
}
