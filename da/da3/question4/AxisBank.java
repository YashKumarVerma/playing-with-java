import java.util.Scanner;

interface CreditCardApp {
    void getPersonalDetails(String name, String mob, String address, String nominee, int age, String email);

    void CalculatePerYearIncome(Double grossSalary);

    void PrintEligibility(Double emi);
}

public class AxisBank implements CreditCardApp {
    private int age;
    private String name;
    private String email;
    private String address;
    private String nominee;
    private String mobileNumer;
    public Double netSalaryPerMonth;
    public Double perYearIncome;
    public int eligibilityScore;

    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        int age;
        String name;
        String email;
        String address;
        String nominee;
        String mobileNumer;

        System.out.println("Axis Bank Systems");
        System.out.println("Enter your personal details: ");
        System.out.print("Enter age: ");
        age = handler.nextInt();
        handler.nextLine();
        System.out.print("Enter Name: ");
        name = handler.nextLine();
        System.out.print("Enter your email: ");
        email = handler.nextLine();
        System.out.print("Enter your address:  ");
        address = handler.nextLine();
        System.out.print("Enter your nominee: ");
        nominee = handler.nextLine();
        System.out.print("Enter your Mobile Number:   ");
        mobileNumer = handler.nextLine();

        AxisBank bank = new AxisBank();
        bank.getPersonalDetails(name, mobileNumer, address, nominee, age, email);

        System.out.println("Enter gross salary:");
        Double gross = handler.nextDouble();
        bank.CalculatePerYearIncome(gross);
        System.out.println("Net Salary Per month :" + bank.netSalaryPerMonth);
        System.out.println("Per Year Income:" + bank.perYearIncome);

        System.out.println("Enter EMI amount:");
        Double emi = handler.nextDouble();
        bank.PrintEligibility(emi);
        System.out.println("Eligibility score:" + bank.eligibilityScore);
    }

    public void getPersonalDetails(String name, String mob, String address, String nominee, int age, String email) {
        this.age = age;
        this.name = name;
        this.email = email;
        this.address = address;
        this.nominee = nominee;
        this.mobileNumer = mob;
    }

    public void CalculatePerYearIncome(Double grossSalary) {
        this.netSalaryPerMonth = grossSalary - (grossSalary * 0.2);
        System.out.println("Net Salary per month: " + this.netSalaryPerMonth);
        this.perYearIncome = netSalaryPerMonth * 12;
        System.out.println("Per Year Income" + this.perYearIncome);
    }

    public void PrintEligibility(Double emi) {
        if (emi == 0) {
            this.eligibilityScore = 3;
        } else if (emi < this.perYearIncome * 0.20) {
            this.eligibilityScore = 2;
        } else if (emi < this.perYearIncome * 0.40) {
            this.eligibilityScore = 1;
        } else {
            this.eligibilityScore = 0;
        }
        System.out.println("Eligibility Score is " + this.eligibilityScore);
    }
}

class ICICI implements CreditCardApp {
    private int age;
    private String name;
    private String email;
    private String address;
    private String nominee;
    private String mobileNumer;
    public Double netSalaryPerMonth;
    public Double perYearIncome;
    public int eligibilityScore;

    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        int age;
        String name;
        String email;
        String address;
        String nominee;
        String mobileNumer;

        System.out.println("ICICI Bank Systems");
        System.out.print("Enter your personal details: ");
        System.out.print("Enter age:");
        age = handler.nextInt();
        System.out.print("Enter Name:");
        name = handler.nextLine();
        System.out.print("Enter your email:");
        email = handler.nextLine();
        System.out.print("Enter your address:");
        address = handler.nextLine();
        System.out.print("Enter your nominee");
        nominee = handler.nextLine();
        System.out.print("Enter your Mobile Number");
        mobileNumer = handler.nextLine();

        AxisBank bank = new AxisBank();
        bank.getPersonalDetails(name, mobileNumer, address, nominee, age, email);

        System.out.println("Enter gross salary:");
        Double gross = handler.nextDouble();
        bank.CalculatePerYearIncome(gross);
        System.out.println("Net Salary Per month :" + bank.netSalaryPerMonth);
        System.out.println("Per Year Income:" + bank.perYearIncome);

        System.out.println("Enter EMI amount:");
        Double emi = handler.nextDouble();
        bank.PrintEligibility(emi);
        System.out.println("Eligibility score:" + bank.eligibilityScore);
    }

    public void getPersonalDetails(String name, String mob, String address, String nominee, int age, String email) {
        this.age = age;
        this.name = name;
        this.email = email;
        this.address = address;
        this.nominee = nominee;
        this.mobileNumer = mob;
    }

    public void CalculatePerYearIncome(Double grossSalary) {
        this.netSalaryPerMonth = grossSalary - (grossSalary * 0.2);
        System.out.println("Net Salary per month: " + this.netSalaryPerMonth);
        this.perYearIncome = netSalaryPerMonth * 12;
        System.out.println("Per Year Income" + this.perYearIncome);
    }

    public void PrintEligibility(Double emi) {
        if (emi == 0) {
            this.eligibilityScore = 3;
        } else if (emi < this.perYearIncome * 0.20) {
            this.eligibilityScore = 2;
        } else if (emi < this.perYearIncome * 0.40) {
            this.eligibilityScore = 1;
        } else {
            this.eligibilityScore = 0;
        }
        System.out.println("Eligibility Score is " + this.eligibilityScore);
    }
}

class HDFCBank implements CreditCardApp {
    private int age;
    private String name;
    private String email;
    private String address;
    private String nominee;
    private String mobileNumer;
    public Double netSalaryPerMonth;
    public Double perYearIncome;
    public int eligibilityScore;

    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        int age;
        String name;
        String email;
        String address;
        String nominee;
        String mobileNumer;

        System.out.println("HDFC Bank Systems");
        System.out.print("Enter your personal details: ");
        System.out.print("Enter age:");
        age = handler.nextInt();
        System.out.print("Enter Name:");
        name = handler.nextLine();
        System.out.print("Enter your email:");
        email = handler.nextLine();
        System.out.print("Enter your address:");
        address = handler.nextLine();
        System.out.print("Enter your nominee");
        nominee = handler.nextLine();
        System.out.print("Enter your Mobile Number");
        mobileNumer = handler.nextLine();

        AxisBank bank = new AxisBank();
        bank.getPersonalDetails(name, mobileNumer, address, nominee, age, email);

        System.out.println("Enter gross salary:");
        Double gross = handler.nextDouble();
        bank.CalculatePerYearIncome(gross);
        System.out.println("Net Salary Per month :" + bank.netSalaryPerMonth);
        System.out.println("Per Year Income:" + bank.perYearIncome);

        System.out.println("Enter EMI amount:");
        Double emi = handler.nextDouble();
        bank.PrintEligibility(emi);
        System.out.println("Eligibility score:" + bank.eligibilityScore);
    }

    public void getPersonalDetails(String name, String mob, String address, String nominee, int age, String email) {
        this.age = age;
        this.name = name;
        this.email = email;
        this.address = address;
        this.nominee = nominee;
        this.mobileNumer = mob;
    }

    public void CalculatePerYearIncome(Double grossSalary) {
        this.netSalaryPerMonth = grossSalary - (grossSalary * 0.2);
        System.out.println("Net Salary per month: " + this.netSalaryPerMonth);
        this.perYearIncome = netSalaryPerMonth * 12;
        System.out.println("Per Year Income" + this.perYearIncome);
    }

    public void PrintEligibility(Double emi) {
        if (emi == 0) {
            this.eligibilityScore = 3;
        } else if (emi < this.perYearIncome * 0.20) {
            this.eligibilityScore = 2;
        } else if (emi < this.perYearIncome * 0.40) {
            this.eligibilityScore = 1;
        } else {
            this.eligibilityScore = 0;
        }
        System.out.println("Eligibility Score is " + this.eligibilityScore);
    }
}