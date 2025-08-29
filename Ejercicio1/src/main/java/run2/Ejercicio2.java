package run2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);

        CuentaBancaria cuentabancaria = new CuentaBancaria();

        System.out.print("INGRESE EL NOMBRE DEL TITULAR: ");
        cuentabancaria.titular = scanner.nextLine();

        System.out.print("INGRESE SU SALDO INICIAL: ");
        cuentabancaria.saldo = scanner.nextDouble();

        int opcion;
        do {
            System.out.println("\n----- Seleccione un opcion -----");
            System.out.println("1. Mostrar información de la cuenta");
            System.out.println("2. Depositar efectivo");
            System.out.println("3. Retirar efectivo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            limpiarPantalla();


            switch (opcion) {
                case 1:
                    cuentabancaria.informacionCuenta();
                    break;
                case 2:
                    System.out.print("INGRESE LA CANTIDAD A DEPOSITAR: ");
                    double deposito = scanner.nextDouble();
                    cuentabancaria.depositar(deposito);
                    break;
                case 3:
                    System.out.print("INGRESE UNA CANTIDAD A RETIRAR: ");
                    double retiro = scanner.nextDouble();
                    cuentabancaria.retirar(retiro);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("OPCION NO VALIDA.");
            }
        } while (opcion != 4);
        scanner.close();
    }
    public static void limpiarPantalla() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

}
