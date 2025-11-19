package exersice1;

public class Operation {
    public static void main(String[] args) {
    /*  +		plus
        -		minus
        *		gånger
        /		delat med
        %	modulus (resten av en division)

        7 % 3 = 1
        25 % 5 = 0
        137 % 10 = 7
     */

        // 7 / 3 = 2 + resten 1
        // 25 / 5 = 5 + resten 0
        // 137 / 10 = 13 + resten 7
        int number =7 % 3 ;
        int nextNumber =25 % 5 ;
        int thirdNumber = 137 % 10;

        System.out.println(number);
        System.out.println(nextNumber);
        System.out.println(thirdNumber);

    }
}
