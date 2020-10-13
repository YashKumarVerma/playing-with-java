
/**
 * @author YashKumarVerma
 * @reg: 19BCE2669
 */
import java.util.Scanner;

/**
 * Main BankAccount Class
 */
class BankAccount {
    Scanner handler = new Scanner(System.in);
    String name;
    int accountNumber;
    String accountType;
    float balance;

    void input() {
        System.out.print("Enter name : ");
        this.name = handler.nextLine();

        System.out.print("Enter Account number : ");
        this.accountNumber = handler.nextInt();

        System.out.print("Enter Account type : ");
        this.accountType = handler.next();

        System.out.print("Enter balance : ");
        this.balance = handler.nextFloat();
    }

    // to deposit amount
    void deposit() {
        System.out.println("Enter amount to deposit: ");
        int amt = handler.nextInt();
        balance += amt;
        System.out.println();
    }

    // to display details
    void display() {
        System.out.println("Account holder name : " + this.name);
        System.out.println("Account Number : " + this.accountNumber);
        System.out.println("Account type : " + this.accountType);
        System.out.println("Available balance : " + this.balance);
    }
}

// current account details
class Cur_acct extends BankAccount {
    public int minimumBalance;
    public int imposePenalty;

    Cur_acct() {
        this.minimumBalance = 1000;
        this.imposePenalty = 100;
    }

    int min_bal() {
        int reminder = 1;
        if (balance <= minimumBalance) {
            balance = balance - imposePenalty;
            reminder = 0;
        }
        return reminder;
    }

    void withdraw() {
        System.out.print("Enter withdraw amount : ");
        int amt = handler.nextInt();

        if (balance >= amt) {
            balance -= amt;
            if (min_bal() == 0) {
                System.out.println("Penalty imposed.");
            }
        } else {
            System.out.println("Not enough balance.");
        }
    }
}

class Sav_acct extends BankAccount {
    float interest;

    float computeInterest() {
        int time, r = 10;
        System.out.println("Enter time : ");
        time = handler.nextInt();
        interest = balance * ((float) Math.pow(1 + r / 100.0, time) - balance);
        balance += interest;
        return interest;
    }

    void withdraw() {
        System.out.print("Enter withdraw amount : ");
        int x = handler.nextInt();

        if (balance >= x) {
            balance -= x;
        } else {
            System.out.println("Not enough balance.");
        }
    }
}

public class Bank {
    public static void main(String args[]) {
        Cur_acct current = new Cur_acct();
        Sav_acct savings = new Sav_acct();
        System.out.println("Enter current account holder's details :");
        current.input();
        current.display();
        current.deposit();
        current.display();
        current.withdraw();
        current.display();

        System.out.println("Enter saving account holder's details :");
        savings.input();
        savings.display();
        savings.deposit();
        savings.display();
        savings.withdraw();
        savings.display();

    }
}