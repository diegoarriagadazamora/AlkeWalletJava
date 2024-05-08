package alkeWallet.Cuentas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CuentaAhorroTest {

    @Test
    public void testAplicarInteres() {
        // Arrange
        double saldoInicial = 1000.0;
        double tasaInteres = 0.05; // Tasa de interés del 5%
        CuentaAhorro cuentaAhorro = new CuentaAhorro(saldoInicial, tasaInteres);

        
        cuentaAhorro.aplicarInteres();

        
        assertEquals(1050.0, cuentaAhorro.consultarSaldo(), 0.01);
    }

    @Test
    public void testRetirar() {
       
        double saldoInicial = 1000.0;
        double tasaInteres = 0.05; // Tasa de interés del 5%
        CuentaAhorro cuentaAhorro = new CuentaAhorro(saldoInicial, tasaInteres);
        double cantidadARetirar = 500.0;

       
        cuentaAhorro.retirar(cantidadARetirar);

       
        assertEquals(490.0, cuentaAhorro.consultarSaldo(), 0.01);
        // Después del retiro, se espera que el saldo sea 500 menos un 2% de cargo por retiro
    }
}