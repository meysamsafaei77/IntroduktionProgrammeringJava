package smauppgifterJava;
/*36. Skapa ett program som räknar ut hur mycket man har på banken under vart och ett av
de följande 10 åren om man sätter in 1000 kr. Räntan ska sparas och är densamma för
alla åren.
*/

public class Uppgift36 {
    public static void main(String[] args) {

        // Skapa variabeln Belopp
        double saldo = 1000;
        double ranta = 0.02;
        int year = 1;

        // Skriv ut första året belopp
        System.out.println("\nTotala beloppet blir för " + year + " år " + saldo);

        // Fortsätt så länge år är mindre eller lika med 10
        while (year < 10) {

            // Räkna totala saldo. Öka saldo för nästa år. Öka år
            double summasaldo = saldo * ranta;
            saldo =summasaldo + saldo;
            year++;

            // Skriv ut beloppet för år 1-10
            System.out.println("\nTotala beloppet blir för " + year + " år " + saldo);

        }
    }
}
