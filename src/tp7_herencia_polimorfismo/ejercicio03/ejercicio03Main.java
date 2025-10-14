package tp7_herencia_polimorfismo.ejercicio03;

public class ejercicio03Main {
    public static void main(String[] args) {
        Empleado[] empleado = {
                new EmpleadoPlanta("Laura", 150000.00, 15000.00),
                new EmpleadoPlanta("Pepe", 120000.00, 12000.00),
                new EmpleadoTemporal("Juan", 25.5, 65.0),
                new EmpleadoTemporal("Carla", 31.5, 65.0 )
        };

        for (Empleado e : empleado) {
            System.out.println(e.getNombre() + " tiene un sueldo de: " + e.calcularSueldo());

            if (e instanceof EmpleadoPlanta) {
                System.out.println("Es empleado de planta.");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("Es empleado temporal.");
            }
        }
    }
}
