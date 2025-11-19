package smauppgifterJava;
/*21. Skapa ett program som testar om ett tal är mindre än -10 eller större än +10. I så fall
ska ett lämpligt meddelande ges.
*/

public class Uppgift21 {
    public static void main(String[] args) {

        // Skapa variablen tal med ett värde
        int tal = 3;

        // Villkor
        if (tal > 10 || tal < -10) {

            // Fel meddelande
            System.out.println("Error!");
        } else {
            // Skriv ut
            System.out.println(tal);
        }
    }
}
