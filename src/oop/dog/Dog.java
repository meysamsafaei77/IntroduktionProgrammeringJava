package oop.dog;
// Skapa en klass Dog: Konstruktorn ska ta in namnet och rasen på hunden.
// Skapa en metod bark som skriver ut ”Voff!".

// Utöka Dog: Lägg till ett attribut age för hundens ålder.
// Skapa en metod som gör att du kan uppdatera hundens ålder.
// Skapa en metod getHumanAge som returnerar hundens
// ålder omvandlad till människoår (multiplicera med 7).
// Testa metoden i main-metoden.


public class Dog {

    // Attribut
    private String name, ras;
    private int age;


    // Konstruktorn
    public Dog (String nameN,String rasR, int ageA) {

        name = nameN;
        ras = rasR;
        age = ageA;
    }

    // Hämta ut namn, rasen och åldern
    public String getName() {
        return name;
    }

    public String getRas() {
        return ras;
    }

    public int getAge() {
        return age;
    }

    // Uppdatera åldern på hunden
    public void setAge(int newAge) {

        age = newAge;
    }

    // Hundens åldern till människan
    public int getHumanAge () {

        int hundHuman = age * 7;
        return hundHuman;
    }

    // Metod för bark
    public void bark() {
        System.out.println("Voff!");

    }

}
