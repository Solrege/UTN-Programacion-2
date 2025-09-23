package tp5_uml.ejercicio07;

public class Vehiculo {
    private String patente;
    private String modelo;
    // agregación: Vehiculo -> Motor (Motor puede existir independientemente)
    private Motor motor;
    // asociado bidireccional con Conductor
    private Conductor conductor;

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public Conductor getConductor() {
        return conductor;
    }

    // establecer conductor (bidireccional) - mantenido por Vehiculo
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        // no hay enlace inverso en Conductor en este modelo; si lo hubiera, lo mantendríamos aquí
    }

    // establecer motor y mantener la bidireccionalidad con Motor
    public void setMotor(Motor motor) {
        this.motor = motor;
        if (motor != null && motor.getVehiculo() != this) {
            motor.setVehiculo(this);
        }
    }

    @Override
    public String toString() {
        return "Vehiculo[patente=" + patente + ", modelo=" + modelo + ", motor=" + motor + "]";
    }
}
