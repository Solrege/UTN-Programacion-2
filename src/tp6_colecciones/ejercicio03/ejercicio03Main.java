package tp6_colecciones.ejercicio03;

public class ejercicio03Main {
    public static void main(String[] args) {
        //1. Crear al menos 3 profesores y 5 cursos.
        Profesor p1 = new Profesor("P100", "Ariel Enferrel", "Sistemas");
        Profesor p2 = new Profesor("P101", "Christian Mut", "Matemática");
        Profesor p3 = new Profesor("P102", "Cinthia Rigoni", "Sistemas");

        Curso c1 = new Curso("C100", "Programacion 1" );
        Curso c2 = new Curso("C101", "Programacion 2" );
        Curso c3 = new Curso("C102", "Matemática" );
        Curso c4 = new Curso("C103", "Probabilidad y Estadística" );
        Curso c5 = new Curso("C104", "Base de Datos 1" );

        //2. Agregar profesores y cursos a la universidad.
        Universidad universidad = new Universidad("UTN");

        universidad.agregarProfesor(p1);
        universidad.agregarProfesor(p2);
        universidad.agregarProfesor(p3);

        universidad.agregarCurso(c1);
        universidad.agregarCurso(c2);
        universidad.agregarCurso(c3);
        universidad.agregarCurso(c4);
        universidad.agregarCurso(c5);

        //3. Asignar profesores a cursos usando asignarProfesorACurso(...).
        universidad.asignarProfesorACurso(c1.getCodigo(), p1.getID());
        universidad.asignarProfesorACurso(c2.getCodigo(), p3.getID());
        universidad.asignarProfesorACurso(c3.getCodigo(), p2.getID());
        universidad.asignarProfesorACurso(c4.getCodigo(), p2.getID());
        universidad.asignarProfesorACurso(c5.getCodigo(), p1.getID());

        //4. Listar cursos con su profesor y profesores con sus cursos.
        System.out.println("=====Mostrando cursos con sus profesores======");
        universidad.listarCursos();

        System.out.println("=====Mostrando profesores y sus cursos=====");
        universidad.listarProfesores();

        //5. Cambiar el profesor de un curso y verificar que ambos lados quedan sincronizados.
        universidad.asignarProfesorACurso(c1.getCodigo(), p3.getID());

        System.out.println("Mostrando actualización en Curso: ");
        universidad.buscarCursoPorCodigo(c1.getCodigo()).mostrarInfo();
        System.out.println("Mostrando actualización en Profesor: ");
        universidad.buscarProfesorPorId(c1.getProfesor().getID()).mostrarInfo();

        //6. Remover un curso y confirmar que ya no aparece en la lista del profesor.
        Profesor profeEliminamosCurso = c5.getProfesor();
        universidad.eliminarCurso(c5.getCodigo());

        System.out.println("Mostrando actualización en Profesor luego de remover su curso:");
        profeEliminamosCurso.mostrarInfo();

        //7. Remover un profesor y dejar profesor = null,
        universidad.eliminarProfesor(p3.getID());
        System.out.println("Listamos profesores con la actualizacion:");
        universidad.listarProfesores();
        System.out.println("Listamos cursos con la actualizacion:");
        universidad.listarCursos();

        //8. Mostrar un reporte: cantidad de cursos por profesor.

        for (Profesor p : universidad.getProfesores()) {
            System.out.println(p.getNombre() + ": " + p.getCursos().size() + " cursos");
        }
    }
}
