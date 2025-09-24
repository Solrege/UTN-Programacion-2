package tp5_uml.ejercicio05;

public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;  // composición: Computadora contiene una PlacaMadre
    private Propietario propietario; // asociacion bidireccional con Propietario

    // El constructor crea internamente la PlacaMadre (composición)
    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modeloPlaca, chipset);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }

    public void setPlacaMadre(PlacaMadre placaMadre) {
        this.placaMadre = placaMadre;
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
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", numeroSerie='" + numeroSerie + '\'' +
                ", placaMadre=" + placaMadre +
                ", propietario=" + propietario +
                '}';
    }
}
