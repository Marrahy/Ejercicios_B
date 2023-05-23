package EJ3;

public class CuentaPro extends CuentaCorriente {

    //Constructor
    public CuentaPro(String titular, double saldo) {
        super(titular, saldo);
    }    

    @Override
    public boolean ingresar(double dinero, int posicion) {
        return super.ingresar(dinero, posicion);
    }
}
