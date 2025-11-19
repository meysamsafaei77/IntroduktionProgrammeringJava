package oop.circle;
// Skapa ett objekt i din main-metod och skriv ut arean och omkrets.

// Använd denna metod i main-metoden för att jämföra två cirklar.

public class CircleMain {

    public static void main(String[] args) {

        // Objekt
        Circle cirkeln = new Circle(4.5);
        Circle otherCirkeln = new Circle(3);

        // Anropa metod för både cirkeln och skriv ut resultatet på area och omkrets
        // Jämför cirkeln A och B s radie och skriv ut vilken är störst.
        System.out.println("CirkelA's radie är : "+ cirkeln.getRadie());
        System.out.println("CirkelB's radie är : "+ otherCirkeln.getRadie());

        System.out.printf("CirkelA's area blir: %.2f cm\n", cirkeln.calculateArea());
        System.out.printf("CirkelB's area blir: %.2f cm\n", otherCirkeln.calculateArea());

        System.out.println("CrikelA är större än CirkelB "+ cirkeln.isBiggerThan(otherCirkeln));

        System.out.printf("CirkelA's omkrets blir: %.2f cm\n", cirkeln.calculateCircumference());
        System.out.printf("CirkelB's omkrets blir: %.2f cm\n", otherCirkeln.calculateCircumference());

    }

}
