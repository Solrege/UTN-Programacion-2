package tp1_introduccion_a_java;

 /* Crea un programa que declare las siguientes variables con valores asignados:
String nombre
int edad
double altura
boolean estudiante
Imprime los valores en pantalla usando System.out.println().
*/

public class Ejercicio3 {
    public static void main(String[] args) {
        String nombre = "Sol";
        int edad = 25;
        double altura = 1.68;
        boolean estudiante = true;

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("¿Es estudiante?: " + estudiante);
    }
}
