package oop.rektangel;
// Skapa ett objekt i din main-metod och skriv ut arean och omkretsen.

// Anropa isSquare metod från din main-metod och skriv ut resultatet.

public class RectangleMain {

    public static void main(String[] args) {

        // Objekt rektangel
        Rectangle rektangel = new Rectangle(4,4);

        // Anropa metod och definers i variabeln
        int area = rektangel.calculateArea();
        int omkrets = rektangel.calculatePerimeter();
        boolean arKvadrat = rektangel.isSquare();

        // Skriv ut area och omkretsen på rektangel
        System.out.println("Arean på rektangel är: "+ area + " cm");
        System.out.println("Omkretsen på rektangel är: "+ omkrets + " cm");
        System.out.println();

        // Skriv ut resultatet
        System.out.println("Är rektangeln en kvadrat? " + arKvadrat);
    }

}
