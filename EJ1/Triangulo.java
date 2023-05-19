package Ejercicios_B.EJ1;

public class Triangulo extends Figura{

    //Atributos
    protected double base;
    protected double altura;

    public Triangulo(double base, double altura) {
        setAltura(altura);
        setBase(base);
    }

    public void setBase(double base) {
        this.base = base;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }
    public double getLado() {
        return base;
    }

    @Override
    public double area() {
        area = base * altura;
        return super.area();
    }
}
