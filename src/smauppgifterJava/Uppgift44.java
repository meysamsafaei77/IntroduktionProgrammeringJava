package smauppgifterJava;
/*44. Skapa ett program som skriver ut n! (fakulteten). n ska läsas in.
Ex: 3! = 1 * 2 * 3 5! = 1 * 2 * 3 * 4 * 5
*/
public class Uppgift44 {
    public static void main(String[] args) {

        // Skriv två variabeln n och produkt
        int n = 5;
        long produkt = 1;

        // Fortsätt så länge summan är mindre eller lika med n
        for (int i = 1; i <= n ; i++) {

            // Ränka produkt * i och sedan öka i till nästa varv
            produkt = produkt * i;

        }
        System.out.println("\nProdukten blev: " + produkt);
    }
}
