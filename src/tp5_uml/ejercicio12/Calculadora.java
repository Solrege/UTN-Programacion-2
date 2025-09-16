package tp5_uml.ejercicio12;

public class Calculadora {
    public void calcular(Impuesto impuesto) {
        double monto = impuesto.getMonto();
        double total = monto * 1.21;

        System.out.println("Calculando impuesto para " +
                impuesto.getContribuyente().getNombre() +
                " - Monto final: $" + total);
    }
}
