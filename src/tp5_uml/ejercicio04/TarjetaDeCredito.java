package tp5_uml.ejercicio04;

import java.time.LocalDate;

public class TarjetaDeCredito {
    private String numero;
    private LocalDate fechaVencimiento;
    private Banco banco; // agregación: TarjetaDeCredito -> Banco
    private Cliente cliente; // asociacion bidireccional con Cliente

    public TarjetaDeCredito(String numero, LocalDate fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    // establece la asociación y mantiene la bidireccionalidad
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;

        if (cliente != null && cliente.getTarjeta() != this) {
            cliente.setTarjeta(this);
        }
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" +
                "numero='" + numero + '\'' +
                ", fechaVencimiento='" + fechaVencimiento + '\'' +
                ", banco=" + banco +
                ", cliente=" + cliente +
                '}';
    }
}
