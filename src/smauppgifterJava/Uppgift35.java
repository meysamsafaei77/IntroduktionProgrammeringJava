package smauppgifterJava;
/*35. Skapa ett program som beräknar och skriver ut kvadraterna för talen 1 till 9. Dvs 1
multiplicerat med 1, 2 multiplicerat med 2 osv.*/

public class Uppgift35 {
    public static void main(String[] args) {

        //Skriv ut text
        System.out.println("Kvadraten talen 1-9: ");

        // For loop
        for(int i = 1; i <= 9; i++) {

            // Skriv ut i
            System.out.print( (i*i) + " ");

        }
    }
}
