package tp5_uml.ejercicio10;

import java.time.LocalDateTime;

public class ClaveSeguridad {
    private String codigo;
    private LocalDateTime ultimaModificacion;

    public ClaveSeguridad(String codigo) {
        this.codigo = codigo;
        this.ultimaModificacion = LocalDateTime.now();
    }

    public String getCodigo() {
        return codigo;
    }

    private void setCodigo(String codigo) {
        this.codigo = codigo;
        this.ultimaModificacion = LocalDateTime.now();
    }

    public LocalDateTime getUltimaModificacion() {
        return ultimaModificacion;
    }

    void actualizarCodigo(String nuevoCodigo) {
        setCodigo(nuevoCodigo);
    }

    @Override
    public String toString() {
        return "ClaveSeguridad{" +
                "codigo='" + codigo + '\'' +
                ", ultimaModificacion=" + ultimaModificacion +
                '}';
    }
}
