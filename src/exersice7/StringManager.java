package exersice7;

public class StringManager {

    public static void main(String[] args) {

        //                "012345678". 4 är mellanslag
        String myString = "some text";

        if(myString.equals("some text")) { // det går även myString.equals =="some text"

            //do something
            System.out.println("Yes, the text is the same!");

        }

        if(myString.length()==9) {

            // Skriv ut text
            System.out.println("The text is exactly 9 characters!");

        }

        // Skriv ut det specifik bokstav
        System.out.println(myString.charAt(3));

        // 9-1= 8, 8 = t
        System.out.println(myString.charAt(myString.length()-1));




    }

}
