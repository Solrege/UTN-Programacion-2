package tp6_colecciones.ejercicio03;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        // Eliminar profesor actual si exsite
        if (this.profesor != null && this.profesor != profesor) {
            this.profesor.getCursos().remove(this);
        }

        this.profesor = profesor;

        if (profesor != null && !profesor.getCursos().contains(this)) {
            profesor.getCursos().add(this);
        }
    }

    public void mostrarInfo() {
        System.out.println("Curso: " + codigo + " - " + nombre);
        if (profesor == null) {
            System.out.println("No hay profesor asignado");
            System.out.println("-------------------");

            return;
        }
        System.out.println("Profesor: " + profesor);
        System.out.println("-------------------");
    }


    @Override
    public String toString() {
        return "Curso{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", profesor=" + profesor +
                '}';
    }
}
