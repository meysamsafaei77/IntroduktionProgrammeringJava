package oop.rektangel;
// Skapa en klass Rectangle. Konstruktorn ska ta in bredd och höjd som attribut.

// Skapa en metod calculateArea som returnerar rektangelns area.

// Skapa en metod calculatePerimeter som returnerar rektangelns omkrets.


public class Rectangle {

    // Attribut, instans variabeln
    private int hojd,bredd;

    // Konstruktorn
    public Rectangle (int hojd, int bredd) {

        this.hojd = hojd;
        this.bredd = bredd;
    }

    // Metod för area
    public int calculateArea() {

        int areaRektangel  = hojd * bredd;
        return areaRektangel;

    }

    // Metod för omkrets
    public int calculatePerimeter() {

        int omkretsRektangel  = 2*hojd + 2*bredd;
        return omkretsRektangel;

    }

    // Metod för kvadrat med boolean
    public boolean isSquare() {

        boolean isSquare= hojd == bredd;
        return isSquare;
    }
}
