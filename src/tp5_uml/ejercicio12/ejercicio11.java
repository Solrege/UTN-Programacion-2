package tp5_uml.ejercicio12;

public class ejercicio11 {
    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Juan Pérez", "20123456789");
        Impuesto impuesto = new Impuesto(1000);

        impuesto.setContribuyente(contribuyente);

        Calculadora calculadora = new Calculadora();
        calculadora.calcular(impuesto);
    }

}
