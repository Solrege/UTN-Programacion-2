package ejercicios_tp5;

public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    // agregación: TarjetaDeCredito -> Banco
    private Banco banco;
    // asociacion bidireccional con Cliente
    private Cliente cliente;

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public Banco getBanco() {
        return banco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    // establecer cliente y mantener la bidireccionalidad
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (cliente != null && cliente.getTarjeta() != this) {
            cliente.setTarjeta(this);
        }
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito[numero=" + numero + ", fechaVencimiento=" + fechaVencimiento + ", banco=" + banco + "]";
    }
}
