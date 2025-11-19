package smauppgifterJava;

/*6. Skapa ett program som beräknar funktionen a*x*3 + 7 och skriver ut resultatet. A och x
ska vara definierade i var sin variabel.*/

public class Uppgift6 {
    public static void main(String[] args) {

        // Skapar variabeln a och x med sin eget värde.
        int a = 2;
        int x = 4;

        // beräkna resultat av summan
        int resultat = a * x * 3 + 7;

        // Skriv ut resultat
        System.out.println("När a = " + a + " och x = " + x + " blir resultatet: " + resultat);
        System.out.println();

        // Skapar variabeln a1 och x1 med sin eget värde.
        double a1 = 2.5;
        double x1 = 4.3;

        // beräkna resultat1 av summan
        double resultat1 = a1 * x1 * 3 + 7;

        // Skriv ut resultat1
        System.out.println("När a = " + a1 + " och x = " + x1 + " blir resultatet: " + resultat1);
    }
}
