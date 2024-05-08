package alkeWallet.Cuentas;

/**
 *
 * // Principio de Abierto/Cerrado: La clase base Cuenta está abierta para la extensión
 * (puede ser extendida por diferentes tipos de cuentas),
 * pero cerrada para la modificación (no necesita ser modificada para añadir nuevos tipos de cuentas).
 * 
 * @author m3t3rpr3t3r
 */

public class Cuenta implements CuentaBancaria {
    
    private double saldo;

    //Constructor de saldo
    public Cuenta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

 
    //Funciones @Override para llamar a los metodos
    @Override
    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    @Override
    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }
}