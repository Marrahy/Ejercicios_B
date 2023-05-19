package Ej2;

import java.util.ArrayList;

public class Animal {
    
    static ArrayList<Animal> animales = new ArrayList<>();

    public static void main(String[] args) {

        animales.add(new Animal());
        animales.add(new Pajaro());
        animales.add(new Carpintero());
        animales.add(new Gallina());
        animales.add(new Payaso());
        animales.add(new Espada());

         for (Animal a: animales) {
            System.out.println(a.toString());
         }
    }

    public String toString() {
        return "canta " + getClass();
    }
}
