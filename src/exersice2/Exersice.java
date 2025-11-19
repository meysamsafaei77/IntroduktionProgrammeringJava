package exersice2;

public class Exersice {
    public static void main(String[] args) {
        /*Jämför två tal. Om det första är större än det andra
        skriv ut ”Första talet är störst”,
        samt ”Andra talet är störst” om det är tvärtom.
        */

        int tal1 = 8;
        int tal2 = 4;

        if (tal1 > tal2) {

            System.out.println("Första talet är störst");

        } else {

            System.out.println("Andra talet är störst");

        }
        /*
        else if (tal2 > tal1) {
            System.out.println("Andra talet är störst");}
        */

       /*Jämför två tal. Om det första är jämt delbart med det andra
       skriv ut ”Jämt delbart”, annars skriv ut ”Inte jämt delbart”*/

        if (tal1 % tal2 == 0) {

            System.out.println("Jämt delbart");
            
        } else if (tal1 % tal2 != 0) {

            System.out.println("Inte jämt delbart");
        }

    }
}
