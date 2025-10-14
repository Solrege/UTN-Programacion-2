package tp7_herencia_polimorfismo.ejercicio03;

public class EmpleadoPlanta extends Empleado {
    private double sueldo;
    private double bono;

    public EmpleadoPlanta(String nombre, double sueldo, double bono) {
        super(nombre);
        this.sueldo = sueldo;
        this.bono = bono;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    @Override
    public double calcularSueldo() {
        return sueldo + bono;
    }
}
