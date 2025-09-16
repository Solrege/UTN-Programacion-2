package tp5_uml.ejercicio13;

public class GeneradorQR {

    // Dependencia de creación
    public void generar(String valor, Usuario usuario) {
        CodigoQR codigoQR = new CodigoQR(valor, usuario);

        System.out.println("Código QR generado: " + codigoQR);
    }

}
