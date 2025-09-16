package tp5_uml.ejercicio13;

public class ejercicio13 {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Sol", "sol@miemail.com");
        GeneradorQR generador = new GeneradorQR();

        generador.generar("ABC123XYZ", usuario);
    }
}
