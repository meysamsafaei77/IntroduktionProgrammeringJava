package smauppgifterJava;
/*28. Skapa ett program som sparar en temperatur. Om temperaturen är mellan 18 och 25
grader ska meddelandet “Lagom temp“ skrivas ut. Om det är varmare än 25 grader ska
“För varmt“ skrivas ut och om det är kallare än 18grader ska “För kallt“ skrivas ut.
*/

public class Uppgift28 {
    public static void main(String[] args) {

        // Skapa temp Variabeln
        int temp = 29;

        // Villkor för temperature
        if (temp >= 18 && temp <=25) {

            // Om första villkor är sant, gör detta
            System.out.println("Lagom temp");

        } else if (temp > 25) {

            // Om Andra villkor är sant, gör detta
            System.out.println("För varmt!");
        } else {

            // Om tredje villkor är sant, gör detta
            System.out.println("För kallt");
        }
    }
}
