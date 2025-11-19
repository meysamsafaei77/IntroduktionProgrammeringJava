package smauppgifterJava;
/* 3. Skapa ett program där antal timmar är definierad i en variabel. Programmet beräknar
      och skriver ut hur mycket det blir omvandlat till minuter resp. sekunder.
 */
public class Uppgift3 {

    public static void main(String[] args) {

        //Skapa en variabel för timmar med ett värde, minuter och sekunder.
        //Programet omvandlar tiden till minuter och sekuner.
        double timmar = 3.5;
        double minuter = timmar * 60;
        double sekunder = timmar * 60 * 60;

        //Skriv ut resultat.
        System.out.println("Tiden " + timmar + " timmar blir " + minuter + " minuter och " + sekunder + " sekunder");

    }

}
