package tp5_uml.ejercicio07;

public class ejercicio_7 {
    
    public static void main (String [] args) {
        // Agregación : Vehiculo -> Motor
        Motor motor = new Motor("V6", "SN-998877");

        // Asociación bidireccional : Vehiculo <-> Conductor
        Conductor conductor = new Conductor("Diego Ramirez", true);

        Vehiculo vehiculo = new Vehiculo("ABC123", "ModeloX", motor);
        vehiculo.setConductor(conductor);

        System.out.println(vehiculo);
        System.out.println("Motor del vehiculo: " + vehiculo.getMotor());
        System.out.println("Conductor del vehiculo: " + vehiculo.getConductor());
    }
}
