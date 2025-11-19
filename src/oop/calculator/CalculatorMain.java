package oop.calculator;
// Skapa ett objekt och anropa 	denna metod ifrån
// en annan klass som har en main-metodPr
// Skapa en metod som skriver ut addition för dessa två tal

//Uppdatera din main-metod så att den läser in 	de två talen med Scanner

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {

        // Input
        // Skapar mitt Scanner objekt
        Scanner scan = new Scanner(System.in);
        System.out.println("Ange första talet: ");
        int input1 = Integer.parseInt(scan.nextLine());
        System.out.println("Ange Andra talet: ");
        int input2 = Integer.parseInt(scan.nextLine());

        // Out Put
        // Skapa minicalculator
        Calculator miniCalculator = new Calculator(input1,input2);

        // Anropa metoden Addition, Subtraktion, Multiplikation, Division
        miniCalculator.addition();
        miniCalculator.subtraktion();
        miniCalculator.multiplikation();
        miniCalculator.division();
    }
}
