package tp_4_poo;

import java.sql.SQLOutput;

public class mainEmpleado {
    public static void main(String[] args) {
        // Instanciar varios objetos usando ambos constructores.
        Empleado e1 = new Empleado("Frodo Bolsón", "Jefe", 650000.00);
        Empleado e2 = new Empleado("Samwise Ganyi", "Jardinero", 550000.00);
        Empleado e3 = new Empleado("Merry Brandigamo", "Delegado");
        Empleado e4 = new Empleado("Pippin Tuk", "Delegado");

        System.out.println("\n-------------------------------");
        System.out.println("Instancia del objeto Empleado");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);

        // Aplicar los métodos actualizarSalario() sobre distintos empleados
        e1.actualizarSalario(10);
        e2.actualizarSalario(50000.00);
        e3.actualizarSalario(5);
        e4.actualizarSalario(100000.00);

        System.out.println("\n-------------------------------");
        System.out.println("Actualizando Salarios");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);

        // Mostrar el total de empleados creados con mostrarTotalEmpleados()
        System.out.println("\n-------------------------------");
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());

        System.out.println("\n-------------------------------");
        System.out.println("Otra Instancia");
        Empleado e5 = new Empleado("Gandalf", "Jefe del jefe", 1000000.00);
        System.out.println(e5);
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
}
