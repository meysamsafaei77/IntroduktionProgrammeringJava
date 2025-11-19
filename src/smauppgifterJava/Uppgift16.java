package smauppgifterJava;
/*16. En firma erbjuder sina kunder 10 procents rabatt om man vid ett inköpstillfälle
handlar för minst 1000 kr. Antag för enkelhetens skull att man bara handlar varor av ett
visst slag. Skapa ett program som beräknar vad en kund ska betala. Indata till algoritmen
ska vara antalet köpta enheter och priset per enhet.
*/

public class Uppgift16 {
    public static void main(String[] args) {

        // Skapa Variabeln antalkopaEnheter, prisPerEnheter och totalpris med sitt värde
        double antalKopaEnheter = 8;
        double prisPerEnheter = 140;
        double totalPris = antalKopaEnheter * prisPerEnheter;

        // Skriv ut totalpris
        System.out.println("Din total pris blir: " + totalPris +" kr");
        System.out.println();

        // Skapa villkor för rabatt
        if (totalPris >= 1000) {

            // Skapa varibabeln rabattbelopp och beräkna rabatt
            double rabattBelopp = 0.1 * totalPris;

            // Beräkna och skriva ut resultat
            System.out.println("Grattis!!! Du får 10% rabatt vid köp av 1000kr.");
            System.out.println("Du ska betala nu: " + (totalPris - rabattBelopp) + " kr");
        } else {

            // Ge ingen rabatt
            System.out.println("Du får ingen rabatt den här gången.");
            // Din extra-text är jättebra:
            System.out.println("Köp för "+ (1000 - totalPris)+ " kr till för att få 10% rabatt");
        }

    }
}
