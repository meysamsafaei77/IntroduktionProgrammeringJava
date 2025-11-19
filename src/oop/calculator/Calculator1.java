package oop.calculator;
/* Skapa en class Calculator som läser in två tal i
konstruktorn och sparar dem som attribut */

//Uppdatera Calculator så att den har liknande
// metoder för minus/delat med/gånger

/* Ändra så att metoderna istället för att skriva ut
resultatet returnerar det.
Vi svarar alltså main-klassen med ett resultat. */

public class Calculator1 {

    // Attribut, instans variabeln
    int tal1, tal2;

    // Konstruktorn
    public Calculator1 (int tal1T, int tal2T) {

        tal1 = tal1T;
        tal2 = tal2T;
    }

    public int addition() {

        int summaAdd  = tal1 + tal2;
        return summaAdd;

    }

    public int subtraktion() {

        int summaSub  = tal1 - tal2;
        return summaSub;

    }

    public int multiplikation() {

        int summaMult  = tal1 * tal2;
        return summaMult;

    }

    public double division() {

        // Villkor
        if (tal2 == 0) {

            // Fel meddelande
            System.out.println("Error! Du kan inte dela med noll!");
            return 0.0;

        } else {

            // Skriv ut kvoten
            // 1. "Casta" tal1 till en double INNAN divisionen
            double summaDivi = (double) tal1 / tal2;
            return summaDivi;

        }
    }

}
