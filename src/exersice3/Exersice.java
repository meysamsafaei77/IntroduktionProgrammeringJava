package exersice3;

public class Exersice {
    public static void main(String[] args) {
        // Skriv ut alla tal ifrån 1-100

        int tal = 1;

        System.out.println("Tal 1-100");

        while(tal <= 100) {


            System.out.print(tal +" ");
            tal = tal + 1;
            //tal++;
        }
        System.out.println();
        System.out.println();

        // Skriv ut alla jämna tal ifrån 1-100

        int jamntal = 2;

        System.out.println("Jämna tal 1-100");

        while(jamntal <= 100) {


            System.out.print(jamntal + " ");
            jamntal += 2;
        }

        /* Skriv ut alla fibonnacci-tal ifrån 1-100.
        Fibonnacci-tal är de två senaste talen adderat och börjar med 1, 1 som första två tal.
        Exempel: 1, 1, 2, 3, 5, 8, 13, 21…
        */

        System.out.println();
        System.out.println();
        System.out.println("Fibonnacci-tal 1-100");

        int fibotal1 = 1;

        System.out.print(fibotal1 + " ");

        int fibotal2= 1;

        while (fibotal2 <= 100) {

            System.out.print(fibotal2 + " ");
            int fibotalTotal = fibotal1 + fibotal2;
            fibotal1 = fibotal2;
            fibotal2 = fibotalTotal;
        }

    }
}
