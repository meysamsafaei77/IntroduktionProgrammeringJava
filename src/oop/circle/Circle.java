package oop.circle;
// Skapa en klass Circle. Konstruktorn ska ta in radien som ett attribut.
// Skapa en metod calculateArea som returnerar cirkelns area.
// Skapa en metod calculateCircumference som returnerar cirkelns omkrets.

// 	Utöka Circle. Lägg till en metod isBiggerThan som tar in en annan
// 	Circle och returnerar om den aktuella cirkeln har större area än
// 	den andra cirkeln.

public class Circle {

    // Attribut
    private double radie;
    private double pi= 3.14;

    // Konstruktorn
    public Circle (double radieN) {

        radie = radieN;

    }

    // Metod för hämta radie och pi
    public double getRadie() {

        return radie;
    }

    public double getPi () {

        return pi;
    }

    // Metod för att räkna area och omkrets på cirkeln
    public double calculateArea () {

        // Räkna area
         double area = pi * (radie*radie);
        return area;
    }

    public double calculateCircumference () {

        // Räkna omkrets
        double omkrets = pi* (2*radie);
        return omkrets;
    }

    // Metod för jämföra 2 cirkeln
    public boolean isBiggerThan(Circle otherCirkeln) {

        // Villkor
        if (this.calculateArea() > otherCirkeln.calculateArea()) {

            return true;

        } else {
            return false;

        }
    }
}
