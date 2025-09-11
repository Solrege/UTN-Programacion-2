package tp3_intro_poo;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    Estudiante(String nombre, String apellido, String curso, double calificacion) {
        setNombre(nombre);
        setApellido(apellido);
        setCurso(curso);
        setCalificacion(calificacion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        if (calificacion < 0) {
            calificacion = 0;
            return;
        }

        this.calificacion = calificacion;
    }

    public void mostrarInfo() {
        System.out.println("\n---- DATOS DEL ESTUDIANTE ----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);
        System.out.println("-------------------------------");
    }

    public void subirCalificacion(double puntos) {
        setCalificacion(calificacion + puntos);
        System.out.println(nombre + " subió su calificación " + puntos +
                "puntos. Ahora su calificacion es: " + calificacion);
    }

    public void bajarCalificacion(double puntos) {
        setCalificacion(calificacion - puntos);
        if (calificacion < 0) calificacion = 0;
        System.out.println(nombre + " bajó su calificación " + puntos +
                "puntos. Ahora su calificacion es: " + calificacion);
    }


}
