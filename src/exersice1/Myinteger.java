package exersice1;

public class Myinteger {
    public static void main(String[] args) {

        int number = 5;
        int nextNumber = 6;

        System.out.println(number);
        System.out.println(nextNumber);

        number = 5 + 3;
        nextNumber = number + 1;

        System.out.println();
        System.out.println("Now updated to: ");
        System.out.println(number);
        System.out.println(nextNumber);

        System.out.println();
        System.out.println("Now updated to: ");
        // Det är samma sak som number = number + 3
        number += 3;
        System.out.println(number);

        // Det är samma sak som nextNumber = nextNumber - 2
        nextNumber -=2;
        System.out.println(nextNumber);

        System.out.println();
        System.out.println("Now updated to: ");
        // Det här ökar med 1, number += 1; number = number + 1;
        number++;
        System.out.println(number);

        // nextNumber -= 1; nextNumber = nextNumber - 1;
        nextNumber--;
        System.out.println(nextNumber);


    }
}
