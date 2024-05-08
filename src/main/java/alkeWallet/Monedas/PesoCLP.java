package alkeWallet.Monedas;




/**
 *
 * Principio de Substitución de Liskov: Las clases PesoCLP, Euro y USD son extenciones
 * de la interfaz Moneda y pueden ser utilizadas en lugar de la interfaz base sin cambiar el comportamiento esperado.

 * @author m3t3rpr3t3r
 */

public class PesoCLP implements Moneda {
    
    @Override 
    public double factorConversion() {
        return 1; // La conversión a peso chileno no requiere factor de conversión
    }

    @Override
    public double convertir(double monto) {
        return monto;
    }
}
