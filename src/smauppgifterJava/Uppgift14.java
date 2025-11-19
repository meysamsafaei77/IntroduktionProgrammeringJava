package smauppgifterJava;
/*14.Skapa ett program som sparar ett tal i en variabel
och skriver ut om det är udda eller jämnt.
*/
public class Uppgift14 {
    public static void main(String[] args) {

        // Skapa en variabeln med ett värde
        int number = 7;

        // Skapa villkor
        if (number % 2 == 0) {

            // Skriv ut text
            System.out.println("Talet är jämnt");
        } else {

            // Skriv ut text
            System.out.println("Talet är udda");
        }
    }
}
