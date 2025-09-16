package tp5_uml.ejercicio09;

import java.time.LocalDate;
import java.time.LocalTime;

public class ejercicio09 {
    public static void main(String[] args) {
        Paciente p1 = new Paciente("Juan García", "OSDE", 1236854);
        Profesional pr1 = new Profesional("Carla Gómez", "Clínica Médica");

        CitaMedica cita1 = new CitaMedica(
                LocalDate.of(2025, 9, 16),
                LocalTime.of(10, 30));

        cita1.setPaciente(p1);
        cita1.setProfesional(pr1);

        System.out.println(cita1);
    }
}
