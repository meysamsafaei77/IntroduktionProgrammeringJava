package oop.fruit;
// Skapa en class Fruit som beskriver olika frukter

public class Fruit {

    // Attributet som definieras i konstruktorn heter color och är fruktens färg
    private String color;

    // Konstruktorn
    public Fruit (String color) {

        this.color = color;

    }

    //Utöka Fruit så att det kan skriva ut färgen på frukten
    //Metod
    public void printColor () {

        System.out.println(color);

    }
}
