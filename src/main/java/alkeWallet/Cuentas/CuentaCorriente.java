package alkeWallet.Cuentas;



/**
 *
 * Principio de Substitución de Liskov: La clase CuentaCorriente es una extención de la clase base Cuenta
 * y puede ser utilizada en lugar de la clase base sin cambiar el comportamiento esperado.
 * 
 * @author m3t3rpr3t3r
 */

public class CuentaCorriente extends Cuenta {
    
    private double limiteSobregiro;

    //constructor
    public CuentaCorriente(double saldoInicial, double limiteSobregiro) {
        super(saldoInicial);
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public void retirar(double cantidad) {
        if (cantidad <= (super.consultarSaldo() + limiteSobregiro)) {
            super.retirar(cantidad);
        } else {
            System.out.println("No se puede retirar, excede el límite de sobregiro");
        }
    }
}