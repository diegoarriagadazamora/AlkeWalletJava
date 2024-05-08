package alkeWallet.Monedas;


/**
 *
 * Principio de Substitución de Liskov: Las clases PesoCLP, Euro y USD son extenciones de la interfaz Moneda
 * y pueden ser utilizadas en lugar de la interfaz base sin cambiar el comportamiento esperado.

 * @author m3t3rpr3t3r
 */

public class USD implements Moneda {
    @Override
    public double factorConversion() {
        return 958.01; // Al 30/04/2024
    }

    @Override
    public double convertir(double monto) {
        return monto / factorConversion();
    }
}