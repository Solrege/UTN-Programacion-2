package tp6_colecciones.ejercicio03;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String ID;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos = new ArrayList<>();

    public Profesor(String id, String nombre, String especialidad) {
        this.ID = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            if(c.getProfesor() != this) {
                c.setProfesor(this);
            }
        }
    }

    public void eliminarCurso(Curso c) {
        if (!cursos.contains(c)) {
            System.out.println("El curso no existe");

            return;
        }
        c.setProfesor(null);
        cursos.remove(c);
    }

    public void listarCursos() {
        for (Curso curso : cursos) {
            curso.mostrarInfo();
        }
    }

    public void mostrarInfo() {
        System.out.println("ID: " + ID);
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Cantidad de cursos: " + cursos.size());
        System.out.println("-------------------");
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "ID='" + ID + '\'' +
                ", nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}
