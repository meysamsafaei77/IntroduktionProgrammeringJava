package oop.calculator;
/* Skapa en class Calculator som läser in två tal i
 konstruktorn och sparar dem som attribut */

//Uppdatera Calculator så att den har liknande
// metoder för minus/delat med/gånger

public class Calculator {

    // Attribut, instans variabeln
    int tal1, tal2;

    // Konstruktorn
    public Calculator (int tal1T, int tal2T) {

        tal1 = tal1T;
        tal2 = tal2T;
    }

    public void addition() {

       int summaAdd  = tal1 + tal2;

        System.out.println("Summan av addition, "+tal1+" och "+tal2+" blir: "+summaAdd);
    }

    public void subtraktion() {

        int summaSub  = tal1 - tal2;

        System.out.println("Summan av subtraktion, "+tal1+" och "+tal2+" blir: "+summaSub);
    }

    public void multiplikation() {

        int summaMult  = tal1 * tal2;

        System.out.println("Summan av multiplikationen, "+tal1+" och "+tal2+" blir: "+summaMult);
    }

    public void division() {

        // Villkor
        if (tal2 == 0) {

            // Fel meddelande
            System.out.println("Error! Du kan inte dela med noll!");

        } else {

            // Skriv ut kvoten
            //int summaDivi =tal1 / tal2;
            //System.out.println("Summan av kvoten, "+tal1+" och "+tal2+" blir: "+summaDivi);

            // 1. "Casta" tal1 till en double INNAN divisionen
            double summaDivi = (double) tal1 / tal2;

            // 2. Använd printf för att formatera till 2 decimaler
            System.out.printf("Kvoten av %d och %d blir: %.2f\n", tal1, tal2, summaDivi);
        }
    }
}
