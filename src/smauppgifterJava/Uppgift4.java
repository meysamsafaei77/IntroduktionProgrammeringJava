package smauppgifterJava;

/*4. Skapa ett program där tre tal är definierade i var sin variabel. Programmet beräknar
och skriver ut summan samt medelvärdet av de tre talen.*/

public class Uppgift4 {
    public static void main(String[] args) {

        // Skapar tre variabeln tal 1,tal 2 och tal 3 med sin eget värde.
        int tal1 = 3;
        int tal2 = 12;
        int tal3 = 26;

        // Skriv ut tre talen
        System.out.println("Tal 1 är: " + tal1);
        System.out.println("Tal 2 är: " + tal2);
        System.out.println("Tal 3 är: " + tal3);
        System.out.println();

        // Skapar variabler som beräknar summan och medelvärdet.
        double summa = tal1 + tal2 + tal3;
        double medelvarde = summa/3;

        // Printf betyder print formatted (skriv ut med format).
        // %.2f betyder: visa talet med 2 decimaler.
        // \n betyder: ny rad efter utskriften (det är som att trycka Enter).

        // Skriv ut summan och medelvärdet (avrunda med 2 decimaler) på de tre tal.
        System.out.println("Summan av tre tal är: " + summa);
        System.out.printf("Medelvärdet av tre tal blir ungifär:  %.2f\n ", medelvarde);

    }
}
