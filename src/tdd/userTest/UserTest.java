package tdd.userTest;
// Skapa en testklass och utveckla efter TDD
// Skapa ett test för en tänkt klass User autogenerera klassen ifrån testklassen

// Uppdatera testet så att konstruktorn i User får två parametrar av
// typen String: userName och password. Autogenerera detta ifrån testfallet.

// Skriv koden som gör att testet i uppgift 3 blir godkänt och spara
// parametrarna i två attribut: userName, password. För alla kommande
// uppgifter gör likadant Red – Green – Refactor.

// Skriv test/kod som hämtar attributet userName.
// Skriv test/kod som hämtar attributet passWord.
// Skriv ett test/kod som ändrar userName.

// Skriv ett test/kod som kontrollerar att userName inte får vara kortare
// än 4 tecken, i så fall behåller man det ursprungliga userName

// Skriv fler test som testar denna nya funktion

// Skriv test som gör det möjligt att uppdatera lösenordet.
// Ett lösenord måste ha minst 7 tecken och får vara högst 20 tecken långt.

// Lösenordet måste innehålla minst en av dessa tecken: !$#&
// (Tips: det finns fler metoder i String).

// Lösenordet måste ha minst en liten och en stor bokstav (a-z, A-Z)

import org.junit.jupiter.api.Test; // Importerar verktyget för att testa
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    @Test
    public void testCreateUser () {

        // Här försöker vi skapa en User, trots att klassen inte finns än!
        // Detta är TDD: Vi skriver koden SOM OM klassen redan fanns.
        User myUser = new User("Anna","hemligt");

    }

    @Test
    public void testGetUserName () {

        // Här försöker vi skapa en User, trots att klassen inte finns än!
        // Detta är TDD: Vi skriver koden SOM OM klassen redan fanns.
        User myUser = new User("Anna","hemligt");

        // Test för metoden hämta namn
        assertEquals("Anna", myUser.getUserName());

    }

    @Test
    public void testGetPassword () {

        // Här försöker vi skapa en User, trots att klassen inte finns än!
        // Detta är TDD: Vi skriver koden SOM OM klassen redan fanns.
        User myUser = new User("Anna","hemligt");

        // Test för metoden hämta namn
        assertEquals("Anna", myUser.getUserName());

        // Test för metoden hämta password
        assertEquals("hemligt", myUser.getPassword());

    }

    @Test
    public void testSetUserName () {

        // Här försöker vi skapa en User, trots att klassen inte finns än!
        // Detta är TDD: Vi skriver koden SOM OM klassen redan fanns.
        User myUser = new User("Anna","hemligt");

        // Test för metoden hämta namn
        assertEquals("Anna", myUser.getUserName());

        // Test för metoden hämta password
        assertEquals("hemligt", myUser.getPassword());

        // Test för lägga till ett nytt namn och sen hämta den
        myUser.setUserName("Sahar");
        assertEquals("Sahar", myUser.getUserName());
    }

    @Test
    public void testSetShortUserName () {

        // Här försöker vi skapa en User, trots att klassen inte finns än!
        // Detta är TDD: Vi skriver koden SOM OM klassen redan fanns.
        User myUser = new User("Anna","hemligt");

        // Test för metoden hämta namn
        assertEquals("Anna", myUser.getUserName());

        // Test för metoden hämta password
        assertEquals("hemligt", myUser.getPassword());

        // Test för lägga till ett nytt namn och sen hämta den
        myUser.setUserName("Bo");
        assertEquals("Anna", myUser.getUserName());

    }

    @Test
    public void testSetBoundarySuccess () {

        // Här försöker vi skapa en User, trots att klassen inte finns än!
        // Detta är TDD: Vi skriver koden SOM OM klassen redan fanns.
        User myUser = new User("Anna","hemligt");

        // Test för metoden hämta namn
        assertEquals("Anna", myUser.getUserName());

        // Test för metoden hämta password
        assertEquals("hemligt", myUser.getPassword());

        // Test för lägga till ett nytt namn och sen hämta den
        myUser.setUserName("Stig");
        assertEquals("Stig", myUser.getUserName());

    }

    @Test
    public void testSetUserNameNoNumbers () {

        // Här försöker vi skapa en User, trots att klassen inte finns än!
        // Detta är TDD: Vi skriver koden SOM OM klassen redan fanns.
        User myUser = new User("Anna","hemligt");

        // Test för metoden hämta namn
        assertEquals("Anna", myUser.getUserName());

        // Test för metoden hämta password
        assertEquals("hemligt", myUser.getPassword());

        // Test för lägga till ett nytt namn och sen hämta den
        myUser.setUserName("Stig4");
        assertEquals("Anna", myUser.getUserName());

    }


    @Test
    public void testSetShortPassword () {

        // Här försöker vi skapa en User, trots att klassen inte finns än!
        // Detta är TDD: Vi skriver koden SOM OM klassen redan fanns.
        User myUser = new User("Anna","hemligt");

        // Test för metoden hämta namn
        assertEquals("Anna", myUser.getUserName());

        // Test för metoden hämta password
        assertEquals("hemligt", myUser.getPassword());

        // Test för lägga till ett nytt namn och sen hämta den
        myUser.setUserName("Stig4");
        assertEquals("Anna", myUser.getUserName());

        // Test för lägga till ett nytt password och sen hämta den
        myUser.setPassword("hemligt");
        assertEquals("hemligt", myUser.getPassword());

    }

    @Test
    public void testNoSpecialCharacters () {

        // Här försöker vi skapa en User, trots att klassen inte finns än!
        // Detta är TDD: Vi skriver koden SOM OM klassen redan fanns.
        User myUser = new User("Anna","hemligt!");

        // Test för metoden hämta namn
        assertEquals("Anna", myUser.getUserName());

        // Test för metoden hämta password
        assertEquals("hemligt!", myUser.getPassword());

        // Test för lägga till ett nytt namn och sen hämta den
        myUser.setUserName("Stig4");
        assertEquals("Anna", myUser.getUserName());

        // Test för lägga till ett nytt password och sen hämta den
        myUser.setPassword("hemligdfdgdfd");
        assertEquals("hemligt!", myUser.getPassword());

    }

    @Test
    public void testSetPasswordCaseRequirement () {

        // Här försöker vi skapa en User, trots att klassen inte finns än!
        // Detta är TDD: Vi skriver koden SOM OM klassen redan fanns.
        User myUser = new User("Anna","hemligt!");

        // Test för metoden hämta namn
        assertEquals("Anna", myUser.getUserName());

        // Test för metoden hämta password
        assertEquals("hemligt!", myUser.getPassword());

        // Test för lägga till ett nytt namn och sen hämta den
        myUser.setUserName("Stig4");
        assertEquals("Anna", myUser.getUserName());

        // Test för lägga till ett nytt password och sen hämta den
        myUser.setPassword("hemligdfdgdfd");
        assertEquals("hemligt!", myUser.getPassword());

        // hej
    }
}
