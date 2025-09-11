package tp3_intro_poo;

public class resolucion {
    public static void main(String[] args) {
        // Ejercicio 1) Registro de Estudiantes
        System.out.println("\n-------------------------------");
        System.out.println("Ejercicio 1) Registro de Estudiantes");
        Estudiante est1 = new Estudiante("Sol", "Rege", "Programación II", 8.5);
        est1.mostrarInfo();
        est1.subirCalificacion(1.0);
        est1.bajarCalificacion(0.5);
        est1.mostrarInfo();

        // Ejercicio 2) Registro de Mascotas
        System.out.println("\n-------------------------------");
        System.out.println("Ejercicio 2) Registro de Mascotas");
        Mascota m1 = new Mascota("Corey", "Gato", 4);
        m1.mostrarInfo();
        m1.cumplirAnios();
        m1.mostrarInfo();

        // Ejercicio 3) Encapsulamiento con Clase Libro
        System.out.println("\n-------------------------------");
        System.out.println("Ejercicio 3) Encapsulamiento con Clase Libro");
        Libro libro1 = new Libro("El Silmarillion", "J.R.R. Tolkien", 1980);
        libro1.setAnioPublicacion(3000);
        libro1.setAnioPublicacion(1977);
        libro1.mostrarInfo();

        // Ejercicio 4) Gestión de Gallinas
        System.out.println("\n-------------------------------");
        System.out.println("Ejercicio 4) Gestión de Gallinas");
        Gallinas g1 = new Gallinas(1, 1);
        Gallinas g2 = new Gallinas(2, 2);
        g1.ponerHuevo();
        g1.envejecer();
        g2.ponerHuevo();
        g2.ponerHuevo();
        g2.envejecer();

        System.out.println("\nGallina 1:");
        g1.mostrarEstado();
        System.out.println("\nGallina 2:");
        g2.mostrarEstado();

        // Ejercicio 5) Simulación de Nave Espacial
        System.out.println("\n-------------------------------");
        System.out.println("Ejercicio 5) Simulación de Nave Espacial");
        NaveEspacial nave = new NaveEspacial("Millenial Falcon", 50);

        System.out.println("\nEstado actual de la nave");
        nave.mostrarEstado();
        nave.avanzar(30);
        nave.recargarCombustible(20);
        nave.avanzar(30);

        System.out.println("\nEstado actual de la nave");
        nave.mostrarEstado();
    }
}
