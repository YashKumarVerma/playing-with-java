import java.util.Scanner;

public class JioCharges {
    /** instance members */
    public String customerName;
    public int billAmount;
    private int callsMadeToJio;
    private int callsMadeToNonJio;

    /** getters and setters for callsMadeToJio */
    public int getCallsMadeToJio() {
        return this.callsMadeToJio;
    }

    public void setCallsMadeToJio(int calls) {
        this.callsMadeToJio = calls;
    }

    /** getters and setters for callsMadeToNonJio */
    public int getCallsMadeToNonJio() {
        return this.callsMadeToNonJio;
    }

    public void setCallsMadeToNonJio(int calls) {
        this.callsMadeToNonJio = calls;
    }

    /** default constructor to start a new account (part ii in question) */
    JioCharges() {
        this.customerName = "New Customer";
        this.billAmount = 0;
        this.callsMadeToJio = 0;
        this.callsMadeToNonJio = 0;
    }

    /**
     * parametrized constructor to create new account with given details (part iii
     * in question)
     */
    JioCharges(String customerName, int callsToJio, int callsToNonJio) {
        this.customerName = customerName;
        this.callsMadeToJio = callsToJio;
        this.callsMadeToNonJio = callsToNonJio;
        this.billAmount = 0;
    }

    /** function to take input from user(part iv in question) */
    public void getData() {
        Scanner handler = new Scanner(System.in);
        System.out.println("Enter the details about the user : ");
        System.out.print("Enter customer name : ");
        String customerName = handler.nextLine();

        System.out.print("Enter number of calls made to jio network : ");
        int toJio = handler.nextInt();

        System.out.print("Enter number of calls made to non jio network : ");
        int toNonJio = handler.nextInt();

        this.customerName = customerName;
        this.callsMadeToJio = toJio;
        this.callsMadeToNonJio = toNonJio;

        this.calculateBillAmount();
    }

    /** method to calculate bill based on given price (part v in question) */
    public void calculateBillAmount() {
        int totalBill;
        int totalCalls = this.callsMadeToJio + this.callsMadeToNonJio;

        if (totalCalls > 0 && totalCalls <= 200) {
            totalBill = 1 * this.callsMadeToJio + 2 * this.callsMadeToNonJio;
        } else if (totalCalls > 200 && totalCalls <= 300) {
            totalBill = 2 * this.callsMadeToJio + 2 * this.callsMadeToNonJio;
        } else {
            totalBill = 5 * this.callsMadeToJio + 6 * this.callsMadeToNonJio;
        }

        this.billAmount = totalBill;
    }

    /**
     * Main caller function to test class
     */
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);

        System.out.println("LAB.CAT.19BCE2669 :: Yash Kumar Verma");
        System.out.print("Enter number of customers:  ");
        int customers = handler.nextInt();

        // create array of objects and call default constructor of all objects
        JioCharges[] jioCustomers = new JioCharges[customers];

        // Now edit the data using getData function
        for (int i = 0; i < customers; i++) {
            jioCustomers[i] = new JioCharges();
            jioCustomers[i].getData();
            System.out.println();
        }

        // displaying report of all accounts
        for (int i = 0; i < customers; i++) {
            System.out.println("Customer Name : " + jioCustomers[i].customerName);
            System.out.println("Calls to Jio : " + jioCustomers[i].getCallsMadeToJio());
            System.out.println("Calls to Non Jio : " + jioCustomers[i].getCallsMadeToNonJio());
            System.out.println("Total Bill : " + jioCustomers[i].billAmount);
            System.out.println();
        }

    }
}