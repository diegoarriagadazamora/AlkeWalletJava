package alkeWallet.Cuentas;

/**
 *
 * Principio de Substitución de Liskov: La clase CuentaAhorro es una extención de la clase base Cuenta
 * y puede ser utilizada en lugar de la clase base sin cambiar el comportamiento esperado.

 * @author m3t3rpr3t3r
 */

public class CuentaAhorro extends Cuenta {
    
    private double tasaInteres;

    //Constructor de tasaInteres
    
    public CuentaAhorro(double saldoInicial, double tasaInteres) {
        super(saldoInicial);
        this.tasaInteres = tasaInteres;
    }

    // Método para aplicar intereses específico de una cuenta de ahorro
    public void aplicarInteres() {
        double intereses = super.consultarSaldo() * tasaInteres;
        super.depositar(intereses);
    }
    
    // Sobreescribimos el método retirar para incluir el cargo por retiro
    @Override
    public void retirar(double cantidad) {
        super.retirar(cantidad);
        // Aplicamos un cargo por retiro en cuentas de ahorro
        super.retirar(cantidad * 0.02); // Por ejemplo, un 2% del monto retirado
    }
    
}