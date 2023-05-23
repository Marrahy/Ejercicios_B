package EJ3;

import java.util.ArrayList;

public class CuentaCorriente {
    
    //Atributos
    protected String titular;
    protected double saldo;
    protected double comisionOperacion = 1;
    protected double comisionMensual = 5;
    protected double interesMensual = 0.01;

    protected ArrayList<CuentaCorriente> cuentas = new ArrayList<>();

    //Constructor
    public CuentaCorriente(String titular, double saldo) {
        setTitular(titular);
        setSaldo(saldo);
    }

    //Constrcutor vacio
    public CuentaCorriente() {
        
    }

    //Setters
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setComisionMensual(double comisionMensual) {
        this.comisionMensual = comisionMensual;
    }
    public void setComisionOperacion(double comisionOperacion) {
        this.comisionOperacion = comisionOperacion;
    }
    public void setInteresMensual(double interesMensual) {
        this.interesMensual = interesMensual;
    }

    //Getters
    public String getTitular() {
        return titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public double getComisionMensual() {
        return comisionMensual;
    }
    public double getComisionOperacion() {
        return comisionOperacion;
    }
    public double getInteresMensual() {
        return interesMensual;
    }

    //Metodos
    public void init() {
        CuentaCorriente cuenta1 = new CuentaCorriente("Albert", 5000.0);
        CuentaCorriente cuenta2 = new CuentaAhorro("Nacho", 2500.0);
        CuentaCorriente cuenta3 = new CuentaPro("Duncan", 500.50);

        cuentas.add(cuenta1);
        cuentas.add(cuenta2);
        cuentas.add(cuenta3);
    }

    public boolean ingresar(double dinero, int posicion) {
        for (int i = 0; i < cuentas.size(); i++) {
            if (posicion == i) {
                this.saldo += dinero;
                this.saldo -= comisionOperacion;    
            }
        }
        return true;
        // } else {
        //     System.out.println("Introduce un número válido.");
        //     return false;
        // }
    }

    public boolean retirar(double dinero, int posicion) {
        for (int i = 0; i < cuentas.size(); i++) {
            if (posicion == i) {
                this.saldo -= dinero;
                this.saldo -= comisionOperacion;
            }
        }
        return true;
        // } else {
        //     System.out.println("Introduce un número válido.");
        //     System.out.println("Si el número introducido es válido, fíjate en que la cuenta tenga saldo.");
        //     return false;
        // }
    }

    public void actualizarMensualidad() {
        saldo += saldo * interesMensual;
        saldo -= comisionMensual;
    }

    public void mostrarCuentas() {
        for (CuentaCorriente c : cuentas) {
            System.out.println(getClass().getSimpleName() + " --> " + "Nombre: " + c.getTitular() + ". " + " Saldo: " + c.getSaldo() + "$" + ".");
        }
    }
}
