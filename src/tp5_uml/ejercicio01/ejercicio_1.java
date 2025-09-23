package tp5_uml.ejercicio01;

import java.time.LocalDate;

public class ejercicio_1 {
    
    public static void main (String [] args) {
        
        // composición: Pasaporte contiene una Foto
        Pasaporte pasaporte = new Pasaporte("A1234567", LocalDate.of(2025, 9, 16), "imagen_base64_o_ruta", "jpg");

        // asociación bidireccional: Titular <-> Pasaporte
        Titular titular = new Titular("Juan Perez", "12345678");
        pasaporte.setTitular(titular);

        // Mostrar datos mínimos
        System.out.println(pasaporte);
        System.out.println("Titular asociado: " + pasaporte.getTitular());
    }
}
