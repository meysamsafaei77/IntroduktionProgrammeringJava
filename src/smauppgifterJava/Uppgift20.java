package smauppgifterJava;
/*20. Skapa ett program som har sparat ett tal.
Om talet är mellan 0 och 9 ska kvadraten på talet skrivas ut.
Annars ska lämpligt felmeddelande ges.
*/

public class Uppgift20 {
    public static void main(String[] args) {

        // Skapa variablen tal med ett värde
        int tal = 2;

        // Villkor
        if (tal >= 0 && tal <= 9) {

            // Skriv ut kvarderaten
            System.out.println(tal * tal);
        } else {

            // Fel meddelande
            System.out.println("Error!");
        }
    }
}
