package smauppgifterJava;
/*26. Skapa ett program som sparar två tal och skriver ut
 det största talet följt av orden “är störst “.
  Om talen är lika ska “Talen är lika“ skrivas ut.

*/

public class Uppgift26 {
    public static void main(String[] args) {

        // Skapa 2 variabeln tal1 och tal2 med värde
        int tal1 = 8;
        int tal2 = 12;

        // Skapa villkor
        if (tal1 > tal2) {

            // Gör detta om villkor 1 är sant
            System.out.println(tal1 + " är störst!");

        } else if (tal1 == tal2) {

            // Gör detta om villkor 1 var falskt, MEN villkor 2 är sant
            System.out.println("Talen är lika!" + tal1 +" = "+ tal2);

        } else {

            // Gör detta om varken villkor 1 eller 2 var sanna
            System.out.println(tal2+ " är Störst!" );
        }
    }
}
