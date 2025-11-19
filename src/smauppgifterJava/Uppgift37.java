package smauppgifterJava;
/*37. Skapa ett program som skriver ut talen 1, 2, 3 osv. Ett i taget.
Varje gång ett tal skrivs ut skall programmet kontrollera om alla
tidigare tal multiplicerat med varandra överstiger
10 000. I så fall skall programmet avslutas.
*/
public class Uppgift37 {
    public static void main(String[] args) {

        // Skapa två variabeln summa och tal
        long summa = 1;
        int tal = 1;

        // Fortsätt så länge summan är 10000 eller mindre
        while (summa <= 10000) {

            // Skriv ut talet
            System.out.print(tal + " ");

            // Ränka tal * tal och öka till nästa varv
            summa = summa * tal;
            tal++;
        }

        // Skriv summan av multiplication
        System.out.println("\nSumman blev: " + summa);
    }
}
