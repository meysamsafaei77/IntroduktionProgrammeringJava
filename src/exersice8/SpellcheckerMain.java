package exersice8;

public class SpellcheckerMain {

    public static void main(String[] args) {

        // Objekt
        Spellchecker spell = new Spellchecker();

        // Villkor
        if (spell.isLetter('h')) {

            System.out.println("H is the letter!");
        }

        if (spell.isLetter('e')) {

            System.out.println("E is the letter!");
        }

        if (spell.isLetter('j')) {

            System.out.println("J is the letter!");
        }

        if (spell.isLetter('å')) {

            System.out.println("Å is the letter!");
        }

        if (spell.isLetter('}')) {

            System.out.println("} is the letter!");
        }

        if (spell.isLetter('1')) {

            System.out.println("H is the letter!");
        }
    }
}
