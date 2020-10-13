package banking;

import java.util.Scanner;

public class Account {
    public Account() {
        System.out.println("Creating new account : ");
    }

    private String name;
    private String accountNumber;
    private int balance;

    public void registerAccount() {
        Scanner handler = new Scanner(System.in);

        System.out.print("Enter Name : ");
        String name = handler.nextLine();

        System.out.print("Enter account number: ");
        String accountNumber = handler.nextLine();

        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = 0;
        handler.close();
    }

    public void displayDetails() {
        System.out.println();
        System.out.println("Name: " + this.name);
        System.out.println("Account Number : " + this.accountNumber);
        System.out.println("Balance : " + this.balance);
    }

    public void deposit(int amt) {
        this.balance += amt;
    }

    public void withDraw(int amt) {
        this.balance -= amt;
    }
}