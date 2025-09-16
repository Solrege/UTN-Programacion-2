package tp5_uml.ejercicio10;

public class ejercicio10 {
    public static void main(String[] args) {
        Titular titular = new Titular("Juan Pérez", "12345678");
        CuentaBancaria cuenta = new CuentaBancaria("312654987123", 15000.0, "1234");

        // Establecer relacion bilateral
        cuenta.setTitular(titular);

        System.out.println(titular);
        System.out.println(cuenta);

        // Actualizar clave
        cuenta.setClaveSeguridad("7890");
        System.out.println("Clave actualizada: " + cuenta.getClaveSeguridad());

        System.out.println(cuenta);
    }
}
