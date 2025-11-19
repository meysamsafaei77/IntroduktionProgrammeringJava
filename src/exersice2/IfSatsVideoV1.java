package exersice2;

public class IfSatsVideoV1 {
    public static void main(String[] args) {

        /*==	lika med
          <		mindre än
          >		större än
          <=	mindre än eller lika med
          >=	större än eller lika med */

        int number1 = 5;
        int number2 = 5;

        if(number1 > number2) {

            System.out.println("number1 is lager then number2");

        } else if (number1 == number2) {

            System.out.println("number1 is the same as number2");

        } else {

            System.out.println("number1 is smaller then number2");
        }

        System.out.println("End of text");

    }
}
