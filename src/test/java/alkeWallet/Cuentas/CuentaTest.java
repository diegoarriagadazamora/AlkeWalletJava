package alkeWallet.Cuentas; 

import static org.junit.jupiter.api.Assertions.assertEquals; 
import org.junit.jupiter.api.Test; 

public class CuentaTest { 

    @Test // Indica que el siguiente método es una prueba unitaria
    
    // Método de prueba para el método depositar
    public void testDepositar() { 
        
        // Creación de una nueva cuenta con saldo inicial de 100.0
        Cuenta cuenta = new Cuenta(100.0); 
        
        // Definición de la cantidad a depositar
        double cantidad = 50.0; 
        
        // Se deposita la cantidad
        cuenta.depositar(cantidad); 
        
         // Verificación de que el saldo después del depósito sea 150.0
        assertEquals(150.0, cuenta.consultarSaldo(), 0.01);
        // Se utiliza un delta de 0.01 para comparar valores dobles
    }

    @Test 
    // Método de prueba para el método retirar
    public void testRetirar() { 
        
        // Creación de una nueva cuenta con saldo inicial de 100.0
        Cuenta cuenta = new Cuenta(100.0);
        // Definición de la cantidad a retirar
        double cantidad = 50.0; 
        
        // Se retira la cantidad
        cuenta.retirar(cantidad); 
        
        // Verificación de que el saldo después del retiro sea 50.0
        assertEquals(50.0, cuenta.consultarSaldo(), 0.01); 
    }

    @Test 
    // Método de prueba para el retiro con saldo insuficiente
    public void testRetirarConSaldoInsuficiente() { 
        
        // Creación de una nueva cuenta con saldo inicial de 100.0
        Cuenta cuenta = new Cuenta(100.0); 
        
        // Definición de una cantidad mayor que el saldo
        double cantidad = 150.0; 
        
        // Se intenta retirar la cantidad
        cuenta.retirar(cantidad); 
        
        // Verificación de que el saldo no cambió (sigue siendo 100.0)
        assertEquals(100.0, cuenta.consultarSaldo(), 0.01); 
    }

    @Test 
    // Método de prueba para consultar el saldo
    public void testConsultarSaldo() { 
        
        // Creación de una nueva cuenta con saldo inicial de 100.0
        Cuenta cuenta = new Cuenta(100.0); 
        
        // Verificación de que el saldo es 100.0
        assertEquals(100.0, cuenta.consultarSaldo(), 0.01); 
    }
}
