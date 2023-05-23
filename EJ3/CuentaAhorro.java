package EJ3;

public class CuentaAhorro extends CuentaCorriente {

    //Atributos
    private final int maxOperaciones = 3;
    private int contadorOperaciones = 0;
    
    //Constructor
    public CuentaAhorro(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public boolean ingresar(double dinero, int posicion) {
        if (contadorOperaciones != maxOperaciones) {
            System.out.println("Operación realizada con éxito!");
            contadorOperaciones++;
            return super.ingresar(dinero, posicion);
        } else {
            System.out.println("No puedes hacer más operaciones.");
            return false;
        }
    }

    @Override
    public boolean retirar(double dinero, int posicion) {
        if (contadorOperaciones != maxOperaciones) {
            System.out.println("Operación realizada con éxito!");
            contadorOperaciones++;
            return super.ingresar(dinero, posicion);
        } else {
            System.out.println("No puedes hacer más operaciones.");
            return false;
        }
    }

    @Override
    public void mostrarCuentas() {
        super.mostrarCuentas();
    }
}
