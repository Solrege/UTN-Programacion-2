package ejercicios_tp5;

public class ejercicio_5 {
    
    public static void main (String [] args) {
    // Composición : Computadora contiene una PlacaMadre

        // Asociación bidireccional : Computadora <-> Propietario
        Propietario prop = new Propietario("Carlos Lopez", "44556677");

        // Se pasa modelo y chipset; la Computadora crea la PlacaMadre internamente
        Computadora pc = new Computadora("MarcaZ", "SN12345", "ASUS-Prime", "Z590");
        pc.setPropietario(prop);


        System.out.println("Placa Madre de la PC: " + pc.getPlacaMadre());
        System.out.println();
        System.out.println("Propietario de la PC: " + pc.getPropietario());
        System.out.println("PC del propietario: " + prop.getComputadora());
    }
}
