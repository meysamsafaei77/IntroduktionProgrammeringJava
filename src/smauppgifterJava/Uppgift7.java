package smauppgifterJava;

/*7. Skapa ett program som beräknar vad du ska betala för en tank bensin.
Indata är antal liter, pris per liter och eventuell rabatt i procent.
Utdata är priset som du ska betala.
Indatan kan vara definierade i variabler.*/

public class Uppgift7 {
    public static void main(String[] args) {

        //Skapa Variabeln liter, pris/liter och rabatt i % med sin värde
        double liter = 40;
        double prisPerLiter = 15.74;
        // rabatt = (5/100)
        double rabatt = 0.05;

        // Skapa variabeln grundPris, rabattBelopp och totalPris och beräkna varje.
        double grundPris = liter * prisPerLiter;
        double rabattBelopp = grundPris * rabatt;
        double totalPris =  grundPris - rabattBelopp;

        // Skriv ut resultat av beräkningar
        System.out.printf("Grundpris: %.2f kr\n", grundPris);
        System.out.printf("Rabatt: %.2f kr\n", rabattBelopp);
        System.out.printf("Att betala: %.2f kr\n", totalPris);
        System.out.println();

        // Skriv ut Priset som ska betalas (totalPris)
        System.out.println("Priset för att tanka " + liter + " liter med rabatt blir: "+ totalPris + " kr");
        System.out.println();

        // annat sätt att skriva ut
        System.out.printf("Priset för att tanka %.1f liter med rabatt blir: %.2f kr\n", liter, totalPris);


    }
}
