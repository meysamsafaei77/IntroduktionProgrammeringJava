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

// En användare börjar alltid typeOfUser som en ”normal” user.
// Skriv test som hämtar detta attribut

//Det går att ändra typeOfUser genom en metod

//De enda korrekta värden för typeOfUser är ”normal”, ”admin” och ”super”

// typeOfUser kan även vara ”gold member”

//När man har loggat in 20 gånger blir man automatiskt ”gold member”

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
        User myUser = new User("Anna","Hemligt!");

        // Test för metoden hämta namn
        assertEquals("Anna", myUser.getUserName());

        // Test för metoden hämta password
        assertEquals("Hemligt!", myUser.getPassword());

        // Test för lägga till ett nytt namn och sen hämta den
        myUser.setUserName("Stig4");
        assertEquals("Anna", myUser.getUserName());

        // Test för lägga till ett nytt password och sen hämta den
        myUser.setPassword("hemligtärhemligt?!");
        assertEquals("Hemligt!", myUser.getPassword());

    }

    @Test
    public void testDefaultUserType () {

        // 1. Skapa ny användare
        User myUser = new User("Anna", "Lösenord1!");

        // 2. Kontrollera att typen automatiskt blev "normal"
        // (Den här raden kommer bli Röd eftersom metoden inte finns än)
        assertEquals("normal", myUser.getTypeOfUser());

    }


    @Test
    public void testChangeUserType () {

        // 1. Skapa ny användare
        User myUser = new User("Anna", "Lösenord1!");

        // 2. Kontrollera att typen automatiskt blev "normal"
        assertEquals("normal", myUser.getTypeOfUser());

        // Test för lägga till ett nytt namn och sen hämta den
        myUser.setTypeOfUser("admin");
        assertEquals("admin", myUser.getTypeOfUser());

    }


    @Test
    public void testSetInvalidUserType () {

        // 1. Skapa ny användare
        User myUser = new User("Anna", "Lösenord1!");

        // 2. Kontrollera att typen automatiskt blev "normal"
        assertEquals("normal", myUser.getTypeOfUser());

        // Test för lägga till ett nytt namn och sen hämta den
        myUser.setTypeOfUser("hacker");
        assertEquals("normal", myUser.getTypeOfUser());

    }

    @Test
    public void testSetGoldMember () {

        // 1. Skapa ny användare
        User myUser = new User("Anna", "Lösenord1!");

        // 2. Kontrollera att typen automatiskt blev "normal"
        assertEquals("normal", myUser.getTypeOfUser());

        // Test för lägga till ett nytt namn och sen hämta den
        myUser.setTypeOfUser("gold member");
        assertEquals("gold member", myUser.getTypeOfUser());

    }


    @Test
    public void testAutomaticGoldMember () {

        // 1. Skapa ny användare
        User myUser = new User("Anna", "Lösenord1!");

        // 2. Kontrollera att typen automatiskt blev "normal"
        assertEquals("normal", myUser.getTypeOfUser());

        // Test för lägga till ett nytt namn och sen hämta den
        myUser.setTypeOfUser("normal");

        for (int i = 0; i < 20; i++) {
            myUser.login();
        }
        assertEquals("gold member", myUser.getTypeOfUser());

    }

    // Det finns en intern valuta ”solidus” som man kan göra uttag ifrån.
    // Man kan såklart enbart göra så stort uttag som man har ”råd med”.
    // Alla börjar med 5 solidus och när man blir gold member får man
    // 20 solidus automatiskt. Användarna vill såklart kunna ta reda på hur
    // många solidus de har. Varje gång man loggar in får man en solidus.
    // Med solidus kan man köpa merch: hoodie kostar 20 solidus, t-shirt 15
    // solidus och stickers 5 solidus. Detta är en massa funktioner,
    // utveckla dem därför med flera steg enligt TDD.

    @Test
    public void testInitialSolidus() {
        // 1. Skapa ny användare
        User myUser = new User("Anna", "Lösenord1!");

        // 2. Kontrollera att hon har 5 solidus direkt
        assertEquals(5, myUser.getSolidus());
    }


    @Test
    public void testLoginEarnsSolidus () {
        // 1. Skapa ny användare
        User myUser = new User("Anna", "Lösenord1!");

        // 2. Kontrollera att hon har 5 solidus direkt
        assertEquals(5, myUser.getSolidus());
        myUser.login();

        // 3. Anropa metoden solidus ocg hämta solidus
        int solius = myUser.getSolidus();
        assertEquals(6, myUser.getSolidus());
    }

    @Test
    public void testGoldMemberBonus () {
        // 1. Skapa ny användare
        User myUser = new User("Anna", "Lösenord1!");

        // 2. Test för lägga till ett nytt namn och sen hämta den
        myUser.setTypeOfUser("normal");

        // 3. Kontrollera att hon har 5 solidus direkt
        assertEquals(5, myUser.getSolidus());
        for (int i = 0; i < 20; i++) {
            myUser.login();
        }

        // 4. Anropa metoden solidus ocg hämta solidus
        int solius = myUser.getSolidus();
        assertEquals(45, myUser.getSolidus());
        assertEquals("gold member", myUser.getTypeOfUser());
    }

    @Test
    public void testBuySticker () {
        // 1. Skapa ny användare (får 5 solidus automatiskt)
        User myUser = new User("Anna", "Lösenord1!");

        // 2. Köp en sticker för 5 solidus
        myUser.buy(5);

        // 3. Kontrollera att saldot nu är 0
        assertEquals(0, myUser.getSolidus());
    }

    @Test
    public void testBuyT_Shirt () {
        // 1. Skapa ny användare (får 5 solidus automatiskt)
        User myUser = new User("Anna", "Lösenord1!");

        // 2. Kontrollera att hon har 5 solidus direkt
        assertEquals(5, myUser.getSolidus());
        for (int i = 0; i < 10; i++) {
            myUser.login();
        }

        // 2. Köp en sticker för 5 solidus
        myUser.buy(15);

        // 3. Kontrollera att saldot nu är 0
        assertEquals(0, myUser.getSolidus());
    }

    @Test
    public void testBuyHoodie() {
        // 1. Skapa ny användare (får 5 solidus automatiskt)
        User myUser = new User("Anna", "Lösenord1!");

        // Logga in 15 gånger -> totalt 20 solidus
        for (int i = 0; i < 15; i++) {
            myUser.login();
        }

        // Köp Hoodie för 20
        myUser.buy(20);

        // Saldot ska vara 0
        assertEquals(0, myUser.getSolidus());
    }

    @Test
    public void testToExpensive() {
        User myUser = new User("Anna", "Lösenord1!");

        // Bli Gold Member (45 solidus totalt)
        for (int i = 0; i < 20; i++) {
            myUser.login();
        }
        assertEquals(45, myUser.getSolidus()); // Kontroll

        // Shoppa loss!
        myUser.buy(20); // Hoodie
        myUser.buy(15); // T-shirt
        myUser.buy(5);  // Sticker
        myUser.buy(5);  // Sticker

        // Nu borde saldot vara 0
        assertEquals(0, myUser.getSolidus());


        // Vi försöker köpa en sticker till för 5 kr, men har 0 kr.
        myUser.buy(5);

        // Saldot ska fortfarande vara 0 (inte -5)
        assertEquals(0, myUser.getSolidus());
    }
}
