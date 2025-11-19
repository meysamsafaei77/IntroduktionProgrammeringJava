package oop.dog;
// Skapa ett Dog-objekt i main och låt det skälla.

public class DogMain {

    public static void main(String[] args) {

        // Objekt my dog
        Dog myDog = new Dog( "Rex", "Whippet", 4);

        // Anropa metod bark
        // Skriv ut namn, rasen och åldern på hunden samt hur skällar den
        String name = myDog.getName();
        String ras = myDog.getRas();
        int age = myDog.getAge();
        int hundH = myDog.getHumanAge();

        System.out.println("Namnet på hunden är: "+ name);
        System.out.println("Rasen på hunden är: "+ ras);
        System.out.println("Hunden är: "+ age+ " gammal");
        System.out.println("Hundens ålden på människans åldern blir: "+ hundH+ " gammal");

        // Lägg till ny ålder på hunden
        myDog.setAge(8);
        int newAge = myDog.getAge();
        int newHundH = myDog.getHumanAge();

        // Skriv ut resultatet
        System.out.println("Hunden blev: "+ newAge +" år gammal nu");
        System.out.println("Hundens ålden på människans åldern blir nu: "+ newHundH+ " gammal");

        myDog.bark();

    }

}
