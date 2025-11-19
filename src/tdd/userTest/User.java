package tdd.userTest;

public class User {

    private String userName, password;

    // Konstruktorn
    public User(String userName, String password) {

        this.userName = userName;
        this.password = password;
    }

    // Metod för hämta namn och password
    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    // Metod för att lägga till ny namn
    public void setUserName(String newName) {

        // 1. Guard Clause: Stoppa om namnet är för kort
        if (newName.length() < 4) {
            return; // Stoppar metoden, namnet behåller sitt gamla värde
        }

        // 2. Guard Clause: Kolla om det finns siffror (stoppa om det finns)
        for (int i = 0; i < newName.length(); i++) {

            char c = newName.charAt(i);
            if (Character.isDigit(c)) {
                return; // Stoppar metoden, namnet behåller sitt gamla värde
            }
        }

        // 3. Om vi når hit, är namnet giltigt. Spara det.
        userName = newName;

    }

    // Metod för att ändra password
    public void setPassword(String newPassword) {

        // 1. Guard Clause: Stoppa om lösenordet är för kort eller för långt
        if (newPassword.length() < 7 || newPassword.length() > 20) {

            return;
        }

        // Skapa och initiera flaggan här (lokal variabel)
        boolean hasSpecialCharacters = false;

        // 2. Loop: Kontrollera om det finns specialtecken
        for (int i = 0; i < newPassword.length(); i++) {

            char c = newPassword.charAt(i);

            if (c == '!' || c == '#' || c == '$' || c == '&') {
                hasSpecialCharacters = true;
                break; // Vi hittade ett tecken, så vi kan stoppa loopen
            }
        }

        // 3. Slutgiltig kontroll och tilldelning
        // Lösenordet sparas ENDAST om flaggan är true
        if (hasSpecialCharacters) {
            password = newPassword;
        }
    }
}
