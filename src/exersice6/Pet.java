package exersice6;

public class Pet {

    //attribut
    private String name;

    //konstruktor
    public Pet(String petName) {

        name = petName;
    }

    //Skapa en ny metod i klassen Pet som skriver ut attributet name
    public void printName() {

        System.out.println("Min Pets namn är: " + name);
    }

    public String getName() {

        return name;
    }
}
