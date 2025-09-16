package ejercicios_tp5;

public class ejercicio_2 {
    
    public static void main (String [] args) {
        // Agregación: Celular -> Bateria
        Bateria bateria = new Bateria("BT-1000", 4000);
        Celular celular = new Celular("359881234567890", "MarcaX", "ModeloY", bateria);

        // Asociación bidireccional: Celular <-> Usuario
        Usuario user = new Usuario("Ana Gomez", "33445566");
        celular.setUsuario(user);

        // Comprobaciones mínimas
        System.out.println(celular);
        System.out.println("Usuario del celular: " + celular.getUsuario());
        System.out.println("Celular del usuario: " + user.getCelular());
    }
}
