package oop.bankAccount;
// 1. Skapa ett program BankAccount som kan hålla 	koll på
// hur stort saldo man har (pengar på sitt 	konto).

// 2. Utöka programmet så att man kan skriva ut saldot.

// 3. Utöka programmet så att man kan bestämma ett nytt värde för saldo.

// 4. Utöka programmet så att man aldrig kan få ett
// saldo som är mindre än 0 kronor.

/* 5. Utöka programmet så att man i programmet som anropar
BankAccount får reda på vad saldot är (så att man kan skriva ut
det ifrån main-programmet istället för direkt i BankAccount).
 */

public class BankAccount {

    // 1. Attribut
    private double saldo = 1000;

    // Konstruktorn
    public BankAccount (double saldo) {

        this.saldo = saldo;

    }

    // Metod för skriva ut saldo
    public void printSaldo () {

        System.out.println("Välkommen! Din välkomst saldo är: "+saldo +" kr");
    }

    // 2. Metod för nytt Attribut Saldo för Input
    public void setSaldo(double nyttSaldo) {

        this.saldo = nyttSaldo;
    }

    // 3. Metod för lägga till amount
    public void deposit (double amount) {

        // 4. Villkor
        if (amount <= 0) {

            System.out.println("Insättningen misslyckades, Skriv positivt tal.");

        } else {

            System.out.println("Din salo är: "+saldo +" kr");

            //this.saldo = saldo + amount ;
            this.saldo += amount ;
            System.out.println("Du har insätt: "+ amount+" kr på din konto");
            System.out.println("Nu har du på din konto: "+saldo +" kr");

        }

    }

    // 5. Metod return
    public double getSaldo() {
        return saldo;
    }

    // 3. Metod för ta ut amount
    public void withdraw (double nyttAmount) {

        // 4. Villkor
        if (nyttAmount > saldo) {

            System.out.println("Uttaget misslyckades, du har inte tillräckligt med pengar.");
            System.out.println("Din saldo är: "+ saldo+" kr");

        } else if (nyttAmount <= 0) {

            System.out.println("Uttaget misslyckades, du måste ange en positiv tal.");

        } else {

            this.saldo = saldo - nyttAmount;
            // eller this.saldo -= nyttAmount;
            System.out.println("Du har tagit ut: "+nyttAmount +" kr");
            System.out.println("Nu har du på din konto: "+saldo +" kr");

        }

    }

}
