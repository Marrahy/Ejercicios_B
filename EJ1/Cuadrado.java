package EJ1;

public class Cuadrado extends Figura{

    //Atributos
    protected double lado;

    public Cuadrado(double lado) {
        setLado(lado);
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public double area() {
        area = Math.pow(lado, 2);
        return super.area();
    }
}
