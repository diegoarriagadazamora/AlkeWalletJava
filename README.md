# Proyecto AlkeWallet

Este proyecto implementa una aplicación de gestión de cuentas bancarias y conversiones de moneda.

## Estructura del Proyecto

El proyecto está organizado en tres paquetes principales:

- `alkeWallet.Cuentas`: Contiene las clases relacionadas con las cuentas bancarias.
- `alkeWallet.Monedas`: Contiene las clases relacionadas con las monedas y sus conversiones.
- `alkeWallet.WalletApp`: Contiene la clase principal de la aplicación.

### Paquete alkeWallet.Cuentas

En este paquete se definen las siguientes clases e interfaz:

- `CuentaBancaria`: Interfaz que define el comportamiento básico de una cuenta bancaria.
- `Cuenta`: Clase que implementa la interfaz `CuentaBancaria`.
- `CuentaAhorro`: Clase que extiende `Cuenta` y representa una cuenta de ahorro.
- `CuentaCorriente`: Clase que extiende `Cuenta` y representa una cuenta corriente.

### Paquete alkeWallet.Monedas

Este paquete contiene las clases relacionadas con las monedas y sus conversiones:

- `Moneda`: Interfaz que define el comportamiento básico de una moneda.
- `Euro`, `USD`, `PesoCLP`: Clases que implementan la interfaz `Moneda` y representan diferentes tipos de monedas, los valores
  de Euro y USD fueron calculados el día 30/04/2023, día que se hizo la actividad. 

### Paquete alkeWallet.WalletApp

Este paquete contiene la clase principal de la aplicación:

- `WalletApp`: Clase que contiene el método `main()` para ejecutar la aplicación.

## Diagrama de Clases

Adjunto a un package llamado Diagrama dentro del proyecto
<a href="https://github.com/diegoarriagadazamora/AlkeWalletJava/blob/main/src/main/java/alkeWallet/Cuentas/diagrama/)">Diagrama</a>
                    
# Para inciar la aplicación;

- Al iniciar la aplicación, nos preguntará cuanto dinero queremos iniciar nuestra CuentaCorriente y cuál será nuestro limiteDeSobregiro.

- Luego debemos ingresar la cantidadInicial con que queremos iniciar nuestra cuentAhorro y cual será el % de interés por retiro.
- Lo demás será un menú interactivo y facil de entender que trabajará en base al saldoInicial que pondremos en cuentaCorriente.

- Se crearon como inicio solo 3 pruebas unitarias Junit a las siguiente clases; Cuenta, CuentaAhorro y a la moneda Euro (en futuro se harán más pruebas unitarias al resto de clases).

  P.d.: Se irá agregando más funcionalidades y mejoras con el tiempo.

