package run2;

public class CuentaBancaria {

    String titular;
    double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    public CuentaBancaria() {
    }
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("DEPOSITO EXITOSO. NUEVO SALDO: " + saldo + "$");
        } else {
            System.out.println("LA CANTIDAD DEBE SER POSITIVA.");
        }
    }
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("RETIRO EXITOSO. NUEVO SALDO: " + saldo + "$");
        } else {
            System.out.println("FONDOS INSUFICIENTES.");
        }
    }
    public void informacionCuenta() {
        System.out.println("TITULAR: " + titular);
        System.out.println("SALDO ACTUAL: " + saldo + "$");
    }
}