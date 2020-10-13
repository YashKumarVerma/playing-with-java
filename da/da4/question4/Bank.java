import java.util.Scanner;
import banking.Account;

public class Bank {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.println("VIT Bank");
        int amt = 0;

        Account bankAccount = new Account();
        bankAccount.registerAccount();
        bankAccount.displayDetails();

        bankAccount.deposit(20000);
        bankAccount.deposit(30000);
        bankAccount.withDraw(2000);

        bankAccount.displayDetails();
    }
}
