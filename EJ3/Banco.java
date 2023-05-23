package EJ3;

import java.util.Scanner;

public class Banco {

    private Scanner input = new Scanner(System.in);
    private boolean ejecutandose = true;
    private static CuentaCorriente iniciar = new CuentaCorriente();

    public static void main(String[] args) {
        
        Banco banco = new Banco();
        
        iniciar.init();
        banco.start();
    }

    public void start() {
        double dinero;
        int posicion;

        while (ejecutandose) {
            menu();

            switch (cogerOpcion()) {
                case 1:
                    posicion = cogerPosicion();
                    dinero = introducirDinero();
                    iniciar.ingresar(dinero, posicion);
                    break;
                case 2:
                    dinero = introducirDinero();
                    posicion = cogerPosicion();
                    iniciar.retirar(dinero, posicion);
                    break;
                case 3:
                    iniciar.mostrarCuentas();
                    break;
                case 4:
                    return;
            }    
        }
    }

    public void menu() {
        System.out.println();
        System.out.println("1. Ingresar.");
        System.out.println("2. Retirar.");
        System.out.println("3. Mostrar cuentas.");
        System.out.println("4. Salir.");
        System.out.println();
    }

    public int cogerOpcion() {
        System.out.print("Selecciona una opcion: ");
        int opcion = input.nextInt();
        System.out.println();

        return opcion;
    }

    public int cogerPosicion() {
        iniciar.mostrarCuentas();
        System.out.print("Selecciona una posición: ");
        int opcion = input.nextInt();
        System.out.println();

        return opcion - 1;
    }

    public double introducirDinero() {
        System.out.println();
        System.out.print("Introduce una cantidad: ");
        double dinero = input.nextDouble();
        System.out.println();

        return dinero;
    }
}
