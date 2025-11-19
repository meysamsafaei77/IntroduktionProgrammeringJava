package smauppgifterJava;
/*17. Skapa ett program som sparar två tal och dividerar det första talet med det andra
talet. Om det andra talet (nämnaren) är 0 ska ett felmeddelande ges, annars ska kvoten
skrivas ut.
*/

public class Uppgift17 {
    public static void main(String[] args) {

        // Skapa 2 variablen tal1 och tal2
        double tal1 = 7;
        double tal2 = 0;

        // Villkor
        if (tal2 == 0) {

            // Fel meddelande
            System.out.println("Error! Du kan inte dela med noll!");
        } else {

            // Skriv ut kvoten
            System.out.println((tal1/tal2));
        }
    }
}
