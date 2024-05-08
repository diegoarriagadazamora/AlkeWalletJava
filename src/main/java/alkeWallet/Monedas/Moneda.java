package alkeWallet.Monedas;

/**
 *
 * Principio de Responsabilidad Única: Esta interfaz tiene una única responsabilidad,
 * definir los métodos necesarios para realizar la conversión de saldo a una moneda específica.

 * @author m3t3rpr3t3r
 */


public interface Moneda {
    double factorConversion();
    double convertir(double monto);
}
