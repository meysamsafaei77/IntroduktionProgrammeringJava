package oop.lamp;
//Skapa en klass Lamp:
//Konstruktorn ska ta in ett boolean-attribut isOn.
//Skapa metoder turnOn och turnOff för att slå på och av lampan.

public class Lamp {

    // Attribut
    private boolean isOn;

    // Konstruktorn
    public Lamp (boolean isOn) {

        this.isOn = isOn;
    }

    // Metod för se om lampan är tänd
    public void printStatus () {

        // Villkor
        if (isOn == true) {

            System.out.println("Lampan är tänd");

        } else {

            System.out.println("Lampan är släckt");
        }
    }

    // Metod för slå på lampan
    public void trunOn () {

        isOn = true;
    }

    // Metod för släcka lampan
    public void trunOff () {

        isOn = false;
    }

}
