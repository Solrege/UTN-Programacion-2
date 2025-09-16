package tp5_uml.ejercicio14;

public class ejercicio14 {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Mejores Bandas de Rock", 90);
        EditorVideo editor = new EditorVideo();

        editor.exportar("MP4", proyecto);
    }
}
