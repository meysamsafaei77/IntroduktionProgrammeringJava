package smauppgifterJava;
//33.Skriv ut talen 100 till 0, dvs 100, 99, 98, …, 0

public class Uppgift33 {
    public static void main(String[] args) {

        //Skriv ut text
        System.out.println("Tal 100-0");

        // For loop
        for(int i = 101; i > 0; i--) {

            // Skriv ut i
            System.out.print( (i-1) + " ");

        }
    }
}
