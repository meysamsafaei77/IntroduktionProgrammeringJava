package oop.bankAccount;

import java.util.Scanner;

public class BankAccountMain {

    public static void main(String[] args) {

        // 1. Skapa kontot med 1000 kr i startsaldo
        BankAccount myAccount = new BankAccount(1000);

        // 2. Visa startsaldot
        myAccount.printSaldo();

        // 3. Skapa ETT Scanner-objekt för hela programmet
        Scanner scan = new Scanner(System.in);

        // --- TESTA DEPOSIT (INSÄTTNING) ---
        System.out.println("Hur mycket vill du sätta in: ");
        double inputDeposit = Double.parseDouble(scan.nextLine());

        // Anropa deposit-metoden med det inmatade värdet
        myAccount.deposit(inputDeposit);

        // --- TESTA WITHDRAW (UTTAG) ---
        System.out.println("Hur mycket vill du ta ut: ");
        double inputWithdraw = Double.parseDouble(scan.nextLine());

        // Anropa withdraw-metoden med det inmatade värdet
        myAccount.withdraw(inputWithdraw);

        // --- VISA SLUTLIGT SALDO ---
        // Vi kan hämta det slutgiltiga saldot med vår getter-metod
        double slutSaldo = myAccount.getSaldo();
        System.out.println("Ditt saldo är nu: " + slutSaldo + " kr");
    }
}
