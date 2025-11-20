package tdd.userTest;

public class User {

    private String userName, password;
    private String typeOfUser= "normal";
    int loginCount;
    private int solidus = 5;

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

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;

        // 2. Loop: Kontrollera om det finns specialtecken
        for (int i = 0; i < newPassword.length(); i++) {

            char c = newPassword.charAt(i);

            if (c == '!' || c == '#' || c == '$' || c == '&') {
                hasSpecialCharacters = true;
            }

            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            }

            if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            }
        }

        // 3. Slutgiltig kontroll och tilldelning
        // Lösenordet sparas ENDAST om flaggan är true
        if (hasSpecialCharacters && hasUpperCase && hasLowerCase) {
            password = newPassword;
        }
    }

    // Metod för hämta användare
    public String getTypeOfUser() {
        return typeOfUser;
    }

    // metod för att lägga till ny användare
    public void setTypeOfUser(String typeOfUser) {

        if (typeOfUser.equals("normal") || typeOfUser.equals("admin") ||
            typeOfUser.equals("super") ||typeOfUser.equals("gold member")) {

            this.typeOfUser = typeOfUser;
        }
    }

    // Metod för att kunna login som användare
    public void login() {
        loginCount++;
        solidus++;

        // Villkor för login
        if (loginCount == 20) {

            setTypeOfUser("gold member");
            // eller  typeOfUser ="gold member";

            // Ge bonus
            solidus += 20; // solidus = solidus + 20;
        }
    }

    // Metod för att ge poäng (solidus)
    public int getSolidus() {
        return solidus;
    }

    // Metod för köpa
    public void buy(int cost) {

        // Villkor för expensive
        if (cost>solidus){
            return;
        }
        solidus = solidus -cost; // eller solidus-=cost;
    }
}
