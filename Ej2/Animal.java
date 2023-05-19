package Ej2;

import java.util.ArrayList;

public class Animal {
    
    static ArrayList<Animal> animales = new ArrayList<>();

    public static void main(String[] args) {

        animales.add(new Animal());
        animales.add(new Pajaro());
        animales.add(new PajaroCarpintero());
        animales.add(new PajaroGallina());
        animales.add(new PezPayaso());
        animales.add(new PezEspada());

         for (Animal a: animales) {
            System.out.println(a.toString());
         }
    }

    public String toString() {
        return "canta " + getClass();
    }
}
