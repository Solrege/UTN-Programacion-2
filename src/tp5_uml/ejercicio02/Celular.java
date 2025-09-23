package tp5_uml.ejercicio02;

public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria; // agregación: Celular tiene una Bateria
    private Usuario usuario; // asociación bidireccional con Usuario

    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    // establecer usuario y mantener la bidireccionalidad
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;

        if (usuario != null && usuario.getCelular() != this) {
            usuario.setCelular(this);
        }
    }

    @Override
    public String toString() {
        return "Celular{" +
                "imei='" + imei + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", bateria=" + bateria +
                ", usuario=" + usuario +
                '}';
    }
}
