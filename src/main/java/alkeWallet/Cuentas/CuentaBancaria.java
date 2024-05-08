package alkeWallet.Cuentas;

/**
 * 
 *Principio de Responsabilidad Única: Esta interfaz tiene una única responsabilidad,
 *definir los métodos básicos de una cuenta bancaria.

 * @author m3t3rpr3t3r
 */

//Metodos depositar, retirar y consultarsaldo

public interface CuentaBancaria {
    
    void depositar(double cantidad);
    void retirar(double cantidad);
    double consultarSaldo();

}