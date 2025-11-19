package exersice1;

public class Exersice {
    public static void main(String[] args) {
        /*Skapa ett program som använder tre tal
        Programmet beräknar och skriver ut summan samt medelvärdet av de tre talen.*/

        double first= 9;
        double secend = 5.7;
        double third= 2.5;

        double summa = first + secend + third;
        double median = summa / 3;

        System.out.println("Summan av tre tal är: "+ summa);
        System.out.println("Medelvärdet är: "+ median);


        /*Skapa ett program som beräknar och skriver ut arean och omkretsen av en rektangel.
        Rektangelns sidor ska läsas in */

        int a = 6;
        int b = 4;

        System.out.println();
        System.out.println("Rektangels sida a är: "+ a);
        System.out.println("Rektangels sida b är: "+ b);

        int area= a * b;
        int omkrets= 2*a + 2*b;

        System.out.println();
        System.out.println("Arean av rektangeln är: "+ area);
        System.out.println("Omkretsen av rektangeln är: "+ omkrets);

    }
}
