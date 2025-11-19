package oop.calculator;
// Skapa ett objekt och anropa 	denna metod ifrån
// en annan klass som har en main-metodPr
// Skapa en metod som skriver ut addition för dessa två tal

//Uppdatera din main-metod så att den läser in 	de två talen med Scanner

/* I din main-metod för Calculator skapa ett nytt objekt
som istället för att läsa in två nya tal i konstruktorn
läser in två tal som är hämtade ifrån det första objektet.
T.ex att man använder produkten som tal 1 och summan som tal 2 */

import java.util.Scanner;

public class CalculatorMain1 {
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
        Calculator1 miniCalculator = new Calculator1(input1,input2);

        // Anropa metoden Addition, Subtraktion, Multiplikation, Division
        // Skriv ut resultatet
        int summaA = miniCalculator.addition();
        System.out.println("Summan av addition, "+input1+" och "+input2+" blir: "+summaA);

        int summaS = miniCalculator.subtraktion();
        System.out.println("Summan av subtraktion, "+input1+" och "+input2+" blir: "+summaS);

        int summaM = miniCalculator.multiplikation();
        System.out.println("Summan av multiplikation, "+input1+" och "+input2+" blir: "+summaM);

        double summaD = miniCalculator.division();
        // Använd printf för att formatera till 2 decimaler
        System.out.printf("Kvoten av %d och %d blir: %.2f\n", input1, input2, summaD);
        System.out.println();

        // Skapa ny objekt Calculator2
        System.out.println("Info om calculator 2");
        Calculator1 miniCalculator2 = new Calculator1 (summaM, summaA);
        System.out.println("Summan är: " + miniCalculator2.addition());
        System.out.println("Differensen är: "+ miniCalculator2.subtraktion());
        System.out.println("Kvoten är: "+ miniCalculator2.division());
        System.out.println("Produkten är: "+ miniCalculator2.multiplikation());

    }
}
