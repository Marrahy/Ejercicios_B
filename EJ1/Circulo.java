package EJ1;

public class Circulo extends Figura{

    //Atributos
    protected double radio;

    //Constructor
    public Circulo(double radio) {
        setRadio(radio);
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public double area() {
        area = Math.PI * Math.pow(radio, 2);
        return super.area();
    }
}
