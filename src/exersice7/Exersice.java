package exersice7;

import java.util.Scanner;

public class Exersice {

    public static void main(String[] args) {

        // Läs in en String (scan.nextLine())
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        //                "012345678". 4 är mellanslag
        String myString = "some text";
        int textLength = myString.length();

        // Använd en for-loop och skriv ut tecken för tecken innehållet i Stringen
        // Om man skriver ordet "ägg" så skrivs meningen "ägg är knasigt" ut

        if (text.equals("ägg")) {

            System.out.println("ägg är knasigt!");

        } else {
            for (int i = 0; i < text.length(); i++) {

                System.out.print(text.charAt(i) + " ");


            }
        }

    }

}
