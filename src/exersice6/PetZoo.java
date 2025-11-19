package exersice6;

public class PetZoo {

    public static void main(String[] args) {

        Pet dog = new Pet("Rex");
        Pet chicken = new Pet("Koko");
        Pet ko = new Pet("Milky");

        //Skapa en ny metod i klassen Pet som skriver ut attributet name
        //dog.printName();
        //chicken.printName();
        //ko.printName();

        //Använd denna metod ifrån klassen PetZoo på dina tre nyligen
        //skapade objekt och spara värdet i en variabel.
        String dogName = dog.getName();
        String chickenName = chicken.getName();
        String koName = ko.getName();

        //Skriv ut namnen två gånger ifrån PetZoo
        for (int i = 0; i < 2; i++) {

            System.out.println(dogName);
            System.out.println(chickenName);
            System.out.println(koName);
        }


    }
}
