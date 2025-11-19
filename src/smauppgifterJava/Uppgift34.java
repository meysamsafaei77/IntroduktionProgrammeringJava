package smauppgifterJava;
/*34. Skapa ett program som skriver ut ett tal i taget med start ifrån 0. När summan av alla
tidigare tal är mer än 50 ska programmet avsluta.
*/

public class Uppgift34 {
    public static void main(String[] args) {

        // Skapa två variabeln summa och tal
        int summa = 0;
        int tal = 0;

        // Fortsätt så länge summan är 50 eller mindre
        while (summa <= 50) {

            // Skriv ut talet
            System.out.print(tal + " ");

            // Addera talet till summan. Öka talet för nästa varv
            summa = summa + tal;
            tal = tal + 1;
        }

        System.out.println("\nSumman blev: " + summa);

        /* DETTA ÄR FEL!!!  //Skriv ut text
        System.out.println("Summan av alla tal från 0 som blir 50");

        // For loop
        for(int i = 0; i <50 ; i++) {

            // Skriv ut i
            System.out.print( (i+1) + " ");

            // Räkna i
            i = i+i;
        }

         */


    }
}
