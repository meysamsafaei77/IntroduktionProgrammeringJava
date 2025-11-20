package exersice11;

import exersice5.Car;

public class Array {

    public static void main(String[] args) {

        // Skapa ett program som innehåller en array med fem namn.
        String [] names = {"Ali", "Davood", "Max","Sanna", "Clara"};

        // Skriv ut det första och sista namnet.
        // arrayName[0]
        // arrayName[4] i sout.
        System.out.println("Första namnet är "+names[0]+" och sista namnet är "  + names[4]);

        for(int i = 0; i< 5; i++) { // 5 ord så byter vi i till 5 eller skriv: arrayNmae.length

            System.out.println(names[i]);
        }
        System.out.println();


        // Vi skapar en ny array såhär:
        // int[] numbers = new int[9];
        // String[] names = new String[13];
        // Car[] cars = new Car[3];

        // Samma sak som String [] names = {"Toyota", "Mercedes", "BMW", "Audie"};
        String [] cars = new String[4];

        // Lägg till 4 bilar i listan eftersom det finns 4 plats
        cars[0] = "Toyota";
        cars[1] = "Mercedes";
        cars[2] = "BMW";
        cars[3] = "Audie";

        // Skriv ut det första och sista namnet.
        // arrayName[0]
        // arrayName[3] i sout.

        System.out.println(cars[0]);
        System.out.println(cars[3]);
        System.out.println();

        for(int i = 0; i< cars.length; i++) { // 4 bilar så byter vi i till 4 eller skriv: arrayNmae.length

            System.out.println(cars[i]);

        }
        System.out.println();

        // String Split

        String myString = "hej på dig";

        String[] stringArray = myString.split(" ");

        for(int i = 0; i< stringArray.length; i++) { // 3 ord så byter vi i till tre eller skriv: arrayNmae.length

            System.out.println(stringArray[i]);
        }





    }

}
