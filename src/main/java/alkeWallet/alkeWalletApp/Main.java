package alkeWallet.alkeWalletApp;


import alkeWallet.Cuentas.CuentaAhorro;
import alkeWallet.Cuentas.CuentaCorriente;

import alkeWallet.Monedas.Euro;
import alkeWallet.Monedas.USD;
import alkeWallet.Monedas.PesoCLP;
import alkeWallet.Monedas.Moneda;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inicialización del scanner para entrada de usuario
        Scanner scanner = new Scanner(System.in);
        double saldoInicial, cantidad, tasaInteres, limiteSobregiro;

        // Solicitar saldo inicial y límite de sobregiro para la cuenta corriente
        saldoInicial = solicitarValor(scanner, "Ingrese el saldo inicial de la cuenta corriente:");
        limiteSobregiro = solicitarValor(scanner, "Ingrese el límite de sobregiro para la cuenta corriente:");
        // Crear cuenta corriente con los valores ingresados
        CuentaCorriente cuentaCorriente = new CuentaCorriente(saldoInicial, limiteSobregiro);

        // Solicitar saldo inicial y tasa de interés para la cuenta de ahorro
        saldoInicial = solicitarValor(scanner, "Ingrese el saldo inicial de la cuenta de ahorro:");
        tasaInteres = solicitarValor(scanner, "Ingrese la tasa de interés para la cuenta de ahorro:");
        // Crear cuenta de ahorro con los valores ingresados
        CuentaAhorro cuentaAhorro = new CuentaAhorro(saldoInicial, tasaInteres);

        // Inicialización de la variable de opción de menú
        int opcion = -1;
        // Ciclo del menú
        while (opcion != 0) {
            // Mostrar las opciones del menú
            mostrarMenu();
            // Leer la opción del usuario
            opcion = scanner.nextInt();
            // Realizar acciones basadas en la opción seleccionada
            switch (opcion) {
                case 1, 2, 4, 5 -> {
                    // Solicitar y realizar depósito o retiro en la cuenta corriente o de ahorro
                    cantidad = solicitarValor(scanner, (opcion == 1 || opcion == 4) ? "Ingrese la cantidad a depositar:" : "Ingrese la cantidad a retirar:");
                    if (opcion == 1) cuentaCorriente.depositar(cantidad);
                    else if (opcion == 2) cuentaCorriente.retirar(cantidad);
                    else if (opcion == 4) cuentaAhorro.depositar(cantidad);
                    else cuentaAhorro.retirar(cantidad);
                }
                case 3 -> System.out.println("Saldo actual de la cuenta corriente: " + cuentaCorriente.consultarSaldo());
                case 6 -> System.out.println("Saldo actual de la cuenta de ahorro: " + cuentaAhorro.consultarSaldo());
                case 7, 8, 9 -> {
                    // Realizar la conversión de saldo a la moneda seleccionada
                    Moneda moneda = null;
                    String nombreMoneda = "";
                    if (opcion == 7) {
                        moneda = new PesoCLP();
                        nombreMoneda = "Peso CLP";
                    } else if (opcion == 8) {
                        moneda = new USD();
                        nombreMoneda = "Dólar USD";
                    } else if (opcion == 9) {
                        moneda = new Euro();
                        nombreMoneda = "Euro EUR";
                    }
                    double saldoConvertido = moneda.convertir(cuentaCorriente.consultarSaldo());
                   
                    // Imprimir el saldo convertido junto con el nombre de la moneda
                    System.out.println("El saldo convertido a " + nombreMoneda + " es: $" + saldoConvertido);
                }
                case 0 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción inválida. Inténtelo de nuevo.");
            }
        }
        // Cerrar el scanner al salir del programa
        scanner.close();
    }

    // Método para mostrar las opciones del menú
    private static void mostrarMenu() {
        System.out.println("\nSeleccione una opción:");
        System.out.println("1. Depositar en cuenta corriente");
        System.out.println("2. Retirar de cuenta corriente");
        System.out.println("3. Consultar saldo de cuenta corriente");
        System.out.println("4. Depositar en cuenta de ahorro");
        System.out.println("5. Retirar de cuenta de ahorro");
        System.out.println("6. Consultar saldo de cuenta de ahorro");
        System.out.println("7. Convertir saldo a Peso CLP");
        System.out.println("8. Convertir saldo a Dólar USD");
        System.out.println("9. Convertir saldo a Euro EUR");
        System.out.println("0. Salir");
    }

    // Método para solicitar un valor al usuario
    private static double solicitarValor(Scanner scanner, String mensaje) {
        System.out.println(mensaje);
        return scanner.nextDouble();
    }
}