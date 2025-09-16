package tp5_uml.ejercicio10;

public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad; // Composición
    private Titular titular; // Asociación bidireccional

    public CuentaBancaria(String cbu, double saldo, String clave) {
        this.cbu = cbu;
        this.saldo = saldo;

        // Al ser composicion, se encarga de crear el objeto contenido.
        this.claveSeguridad = new ClaveSeguridad(clave);
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ClaveSeguridad getClaveSeguridad() {
        return claveSeguridad;
    }

    public void setClaveSeguridad(String nuevaClave) {
        this.claveSeguridad.actualizarCodigo(nuevaClave);
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;

        // Validacion bidireccional
        if (titular != null && titular.getCuenta() != this) {
            titular.setCuenta(this);
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "cbu='" + cbu + '\'' +
                ", saldo=" + saldo +
                ", claveSeguridad=" + claveSeguridad +
                ", titular=" + titular +
                '}';
    }
}
