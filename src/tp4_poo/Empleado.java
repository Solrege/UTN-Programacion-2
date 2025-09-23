package tp4_poo;

public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;

    // ----- CONSTRUCTORES -----

    public Empleado(String nombre, String puesto, double salario) {
        totalEmpleados++;
        this.id = totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public Empleado(String nombre, String puesto) {
        totalEmpleados++;
        this.id = totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 500000.00;
    }

    // ----- GETTERS Y SETTRS -----
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // ----- TOSTRING -----
    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario +
                '}';
    }

    // ----- METODOS -----
    public void actualizarSalario(int porcentaje) {
        salario += salario * porcentaje / 100;
    }

    public void actualizarSalario(double cantidad) {
        salario += cantidad;
    }

    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

}
