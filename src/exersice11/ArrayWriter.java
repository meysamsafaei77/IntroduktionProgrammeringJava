package exersice11;

import java.util.Scanner;

public class ArrayWriter {

    public static void main(String[] args) {

        // Skapa ett program som läser in fem namn ifrån terminalen och sparar dem i en array
        Scanner scan = new Scanner(System.in);

        String[] names = new String[5];

        // Lägga in värden eller objekt i vår array
        // Detta görs enklast med en for-loop

        for(int i = 0; i< names.length; i++) {
            names[i] = scan.nextLine();
        }

        // Skriv ut det första och sista namnet
        System.out.println(names[0]);
        System.out.println(names[names.length-1]); // Anna sätt att skriva

    }

}
