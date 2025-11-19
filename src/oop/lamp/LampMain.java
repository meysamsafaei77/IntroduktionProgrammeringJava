package oop.lamp;
//Skapa ett Lamp-objekt i main och växla mellan på och av.

public class LampMain {

    public static void main(String[] args) {

        // Skriv ut text
        System.out.println("Är lampan tänd eller släckt? ");

        // Objekt
        Lamp myLamp = new Lamp(true);

        // Anropa metoderna från lamp klassen
        // Skriv ut text från metod och main
        myLamp.printStatus();

        System.out.println();
        System.out.println("Släck lampan!");

        myLamp.trunOff();
        myLamp.printStatus();

        System.out.println();
        System.out.println("Tänd på lampan!");

        myLamp.trunOn();
        myLamp.printStatus();

    }

}
