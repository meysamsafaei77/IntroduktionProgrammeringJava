package smauppgifterJava;
/*
En försäljare har delvis prestationslön. Han får 8000 kr per månad i grundlön och 9%
av försäljningssumman. Skapa ett program som beräknar lönesumman under en period.
Försäljningssumman ska vara definierad i en variabel.
*/
public class Uppgift2 {

    public static void main(String[] args) {

        //steg 1: vi skapar två olika variabel som har värdet 8000 och 12000
        double grundlon = 8000;
        double forsaljningsSumma = 12000;

        //steg 2: beräkna totallön
        double totallon = grundlon + (forsaljningsSumma * 0.09);

        // steg 3: skriv ut resultatet
        System.out.println("Försäljarens total lön blir " + totallon + "Kr");

    }
}
