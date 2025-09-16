package ejercicios_tp5;

public class Computadora {
    private String marca;
    private String numeroSerie;
    // composición: Computadora contiene una PlacaMadre (pertenece a la Computadora)
    private PlacaMadre placaMadre;
    // asociacion bidireccional con Propietario
    private Propietario propietario;

    // Ahora el constructor crea internamente la PlacaMadre (composición)
    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modeloPlaca, chipset);
    }

    public String getMarca() {
        return marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    // establece propietario y mantiene la bidireccionalidad
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
    }

    @Override
    public String toString() {
        return "Computadora[marca=" + marca + ", numeroSerie=" + numeroSerie + ", placaMadre=" + placaMadre + "]";
    }
}
