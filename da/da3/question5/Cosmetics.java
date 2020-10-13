import java.util.Scanner;

/** abstract class for all departments */
abstract class SuperMart {
    abstract double bill();

    abstract boolean availability(int ProductCode);

    void PrintSaleReport() {
        System.out.println("Printing report");
        System.out.println("No Sale");
    }
}

// class extending abstract class
class KitchenTools extends SuperMart {
    Scanner handler = new Scanner(System.in);

    // function to handle billing
    double bill() {
        System.out.print("Enter  Amount:  ");
        int amt = handler.nextInt();
        handler.nextLine();
        return amt;
    }

    // function to check stock availability
    boolean availability(int ProductCode) {
        Boolean isAvailable = false;
        return isAvailable;
    }

    // function to print sale report
    void PrintSaleReport() {
        System.out.println("This is your sales report for KitchenTools:");
        System.out.println("4 items of A");
        System.out.println("4 items of B");
    }
}

// class extending base class
class SnacksChocs extends SuperMart {
    Scanner handler = new Scanner(System.in);

    // function to handle billing
    double bill() {
        System.out.print("Enter  Amount:  ");
        int amt = handler.nextInt();
        handler.nextLine();
        return amt;
    }

    // function to check stock availability
    boolean availability(int ProductCode) {
        Boolean isAvailable = false;
        return isAvailable;
    }

    // function to print sale report
    void PrintSaleReport() {
        System.out.println("This is your sales report for snacks:");
        System.out.println("30 items of A");
        System.out.println("40 items of B");
    }
}

// class extending abstract class
class Groceries extends SuperMart {
    Scanner handler = new Scanner(System.in);

    // function to handle billing
    double bill() {
        System.out.print("Enter  Amount:  ");
        int amt = handler.nextInt();
        handler.nextLine();
        return amt;
    }

    // function to check stock availability
    boolean availability(int ProductCode) {
        Boolean isAvailable = false;
        return isAvailable;
    }

    // function to print sale report
    void PrintSaleReport() {
        System.out.println("This is your sales report for Groceries:");
        System.out.println("13 items of A");
        System.out.println("14 items of B");
    }
}

/** classes implementing abstract class */
public class Cosmetics extends SuperMart {
    Scanner handler = new Scanner(System.in);

    // function to handle billing
    double bill() {
        System.out.print("Enter  Amount:  ");
        int amt = handler.nextInt();
        handler.nextLine();
        return amt;
    }

    // function to check stock availability
    boolean availability(int ProductCode) {
        Boolean isAvailable = false;
        return isAvailable;
    }

    // function to print sale report
    void PrintSaleReport() {
        System.out.println("This is your sales report for cosmetics:");
        System.out.println("3 items of A");
        System.out.println("4 items of B");
    }

    public static void main(String[] args) {
        SuperMart obj = new Cosmetics();
        obj.bill();
        System.out.print("Checking System availability: ");
        System.out.println(obj.availability(0));
        obj.PrintSaleReport();
    }
}
