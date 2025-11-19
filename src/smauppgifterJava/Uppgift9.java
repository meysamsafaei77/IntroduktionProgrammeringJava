package smauppgifterJava;

/*9. Skapa ett program där en cirkels radie är definierad i en variabel.
Cirkelns diameter, omkrets och area skall beräknas och skrivas ut. (anta att pi = 3.14).
*/

public class Uppgift9 {
    public static void main(String[] args) {

        // Skapa variabeln radie med ett värde och pi = 3.14.
        double radie= 5;
        double pi = 3.14;

        // Skapa variabeln för diameter, omkrets och area för cirkeln och beräkna varje.
        double diameter = radie *2;
        // eller omkrets = pi * diameter
        double omkrets = 2 * pi * radie;
        double area = pi * radie * radie;

        // Skriv ut resultatet
        System.out.println("När radie är: "+ radie + " cm");
        System.out.println();
        System.out.println("Diameter är: "+ diameter + " cm");

        //avrundar med 2 decimaler
        System.out.printf("Omkretsen är; %.2f cm\n", omkrets);

        // eller System.out.println("Arean är: "+ area +" cm");
        System.out.printf("Arean är: %.2f cm\n", area);

    }
}
