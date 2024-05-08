package alkeWallet.Monedas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class EuroTest {

    @Test
    public void testFactorConversion() {
        
        Euro euro = new Euro();

     
        // Verifica que el factor de conversión retorne el valor esperado
        assertEquals(1022.17, euro.factorConversion(), 0.01);
    }

    @Test
    public void testConvertir() {
        
        Euro euro = new Euro();
        double monto = 2044.34; // Monto en euros a convertir

        
        double resultado = euro.convertir(monto);

        
        // Verifica que la conversión de euros a CLP retorne el valor esperado
        assertEquals(monto / 1022.17, resultado, 0.01);
    }
}