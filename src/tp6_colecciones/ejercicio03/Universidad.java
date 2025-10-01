package tp6_colecciones.ejercicio03;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();

    public Universidad(String nombre) {
        this.nombre = nombre;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void agregarProfesor(Profesor p) {
        if (!profesores.contains(p)) {
            profesores.add(p);
        }
    }

    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
        }
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Profesor profe = buscarProfesorPorId(idProfesor);
        Curso curso = buscarCursoPorCodigo(codigoCurso);

        if (curso != null && profe != null) {
            curso.setProfesor(profe);
        }
    }

    public void listarProfesores() {
        for (Profesor p : profesores) {
            p.mostrarInfo();
        }
    }

    public void listarCursos() {
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getID().equals(id)) {

                return p;
            }
        }

        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equals(codigo)) {

                return c;
            }
        }

        return null;
    }

    public void eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);

        if (c == null) {
            System.out.println("No se puede eliminar, curso no encontrado: " + codigo);

            return;
        }

        // Eliminar curso del profesor
        if (c.getProfesor() != null) {
            c.getProfesor().eliminarCurso(c);
        }
        cursos.remove(c);
    }

    public void eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);

        if (p == null) {
            System.out.println("No se puede eliminar, profesor no encontrado: " + id);

            return;
        }

        // Setear en null los cursos que dictaba
        if (p.getCursos() != null) {
            for (Curso c : new ArrayList<>(p.getCursos())) {
                c.setProfesor(null);
            }
        }
        profesores.remove(p);
    }
}
