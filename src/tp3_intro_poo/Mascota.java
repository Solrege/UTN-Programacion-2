package tp3_intro_poo;

public class Mascota {
    String nombre;
    String especie;
    int edad;

    Mascota(String nombre, String especie, int edad) {
        setNombre(nombre);
        setEspecie(especie);
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            System.out.println("La edad no puede ser negativa");
            return;
        }

        this.edad = edad;
    }

    void mostrarInfo() {
        System.out.println("\n----- DATOS DE TU MASCOTA -----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
        System.out.println("-------------------------------");
    }

    void cumplirAnios() {
        edad++;
        System.out.println(nombre + " ha cumplido años. Ahora tiene: " + edad);
    }


}
