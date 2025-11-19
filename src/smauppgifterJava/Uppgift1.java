package smauppgifterJava;

/*1. Skapa ett program som skriver ut kvadraten på ett tal som är definierat i en variabel.
Kvadraten är talet multiplicerat med sig själv.*/

public class Uppgift1 {

    public static void main(String[] args) {

        int tal = 11; // steg 1: vi skapar en variabel och ger den värdet 5
        int kvadrat = tal * tal; // steg 2: beräkna kvadraten

        // steg 3: skriv ut resultatet
        System.out.println("Kvaderaten av " + tal + " är " + kvadrat);
    }
}
