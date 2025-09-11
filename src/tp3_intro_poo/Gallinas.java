package tp3_intro_poo;

public class Gallinas {
    private int idGallina;
    private int edad;
    private int huevosPuestos;


    public Gallinas(int idGallina, int edad) {
        setIdGallina(idGallina);
        setEdad(edad);
        this.huevosPuestos = 0;
    }

    public int getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
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

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }

    public void ponerHuevo() {
        huevosPuestos++;
    }

    public void envejecer() {
        edad++;
    }

    public void mostrarEstado() {
        System.out.println("\n---- DATA DE LA GALLINA ----");
        System.out.println("ID: " + idGallina);
        System.out.println("Edad: " + edad);
        System.out.println("Huevos puestos: " + huevosPuestos);
        System.out.println("-------------------------------");
    }
}
