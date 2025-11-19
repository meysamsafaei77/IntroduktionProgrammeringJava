package smauppgifterJava;
//32. Skapa ett program där talen 2, 4, 6, …, 100 skrivs ut.

public class Uppgift32 {
    public static void main(String[] args) {

        //Skriv ut text
        System.out.println("Tal 2-100");

        // For loop
        for(int i = 2; i<= 100; i+= 2) {

            System.out.print( (i) + " ");

        }
    }
}
