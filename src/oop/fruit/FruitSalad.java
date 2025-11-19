package oop.fruit;
//Skapa tre olika Fruit ifrån main-metod i en annan klass FruitSalad

public class FruitSalad {

    public static void main(String[] args) {

        // Skapa tre olika Fruit
        Fruit apple = new Fruit("Green");
        Fruit watermelon = new Fruit("Red");
        Fruit banana = new Fruit("Yellow");

        // Anropa metoderna för att skriva ut färgen
        apple.printColor();
        watermelon.printColor();
        banana.printColor();

    }
}
