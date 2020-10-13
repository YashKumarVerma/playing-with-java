# Digital Assignment 3
- Report Submitted by: Yash Kumar Verma
- Registration Number: 19BCE2669
- All programs available at: [yashkumarverma-bot/semester3](https://github.com/yashkumarverma-bot/semester3)
- Report Written in: Markdown

---

## Question1
Eg: Assume that a bank maintains two kinds of accounts for customers, one called as savings
account and the other as current account. The savings account provides compound interest
and withdrawal facilities but no cheque book facility. The current account provides cheque
book facility but no interest. Current account holders should maintain a minimum balance
and if the balance falls below this level, a service charge is imposed.
Create a class account that stores customer name, account number and type of account. From
this, derive the classes cur_acct and sav_acct to make them more specific to their
requirements. Include necessary member functions in order to achieve the following tasks :
a) Accept deposit from a customer and update the balance.
b) Display the balance
c) Compute and deposit interest.
d) Permit withdrawal and update the balance.
e) Check for the minimum balance, impose penalty, necessary, and update the balance. 

#### Code
```JAVA

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
```

#### Output
![https://i.imgur.com/Q8MbDyk.png](https://i.imgur.com/Q8MbDyk.png)
![https://i.imgur.com/RXzrT1M.png](https://i.imgur.com/RXzrT1M.png)

---


## Question2
Write a program to demonstrate the knowledge of students in working with user-defined
packages and sub-packages.
Eg., Within the package named ‘primespackage’, define a class Primes which includes a
method checkForPrime() for checking if the given number is prime or not. Define another
class named TwinPrimes outside of this package which will display all the pairs of prime
numbers whose difference is 2. (Eg, within the range 1 to 10, all possible twin prime numbers
are (3,5), (5,7)). The TwinPrimes class should make use of the checkForPrime() method in
the Primes class. 

#### Code
```JAVA
/**
 * @author Yash Kumar Verma
 * @reg: 19BCE2669
 */
//    FILE: TwinPrime.java
import java.util.Scanner;
import Packages.Primes;

public class TwinsPrime {
    public static void main(String args[]) {
        int i;
        // take input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        sc.close();

        System.out.println("Twin prime numbers are: ");
        // checking twins prime
        for (i = n1; i <= n2; i++) {
            if (Primes.checkPrime(i) & Primes.checkPrime(i + 2) & i > 1) {
                System.out.println("(" + i + "," + (i + 2) + ")");
            }
        }
    }
}



// FILE: Packages/Primes.java
package Packages;

public class Primes {
    public static boolean checkPrime(int num) {
        int temp;
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            temp = num % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
```

#### Output
![https://i.imgur.com/11AHkS5.png](https://i.imgur.com/11AHkS5.png)

---

## Question3
 Write a program to demonstrate the knowledge of students in Java Exception handling.
Eg., Read the Register Number and Mobile Number of a student. If the Register Number does
not contain exactly 9 characters or if the Mobile Number does not contain exactly 10
characters, throw an IllegalArgumentException. If the Mobile Number contains any
character other than a digit, raise a NumberFormatException. If the Register Number contains
any character other than digits and alphabets, throw a NoSuchElementException. If they are
valid, print the message ‘valid’ else ‘invalid’ 

#### Code
```JAVA
/**
 * @author Yash Kumar Verma
 * @reg: 19BCE2669
 */
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExcepHandle {

    static void validate(String r, String n) {
        if (r.length() != 9) {
            System.out.println("Invalid");
            throw new IllegalArgumentException("Register Number does not contain exactly 9 characters");
        }
        if (n.length() != 10) {
            System.out.println("Invalid");
            throw new IllegalArgumentException("Mobile Number does not contain exactly 10 characters");
        }

        String pattern = "^[6|7|8|9]{1}\\d{9}";
        Pattern a = Pattern.compile(pattern);
        Matcher m1 = a.matcher(n);
        if (!m1.find()) {
            throw new NumberFormatException("Mobile Number cannot contain any character other than a digit");
        }

        String pattern2 = "^[1-9]{2}[A-Z]{3}[0-9]{4}$";
        Pattern b = Pattern.compile(pattern2);
        Matcher m2 = b.matcher(r);
        if (!m2.find()) {
            throw new NoSuchElementException(
                    "Registration Number cannot contain any character other than digits and alphabets");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter registration  number:");
        String reg = sc.nextLine();
        System.out.print("Enter mobile Number:");
        String no = sc.nextLine();
        sc.close();
        validate(reg, no);
        System.out.println("Valid");
    }
}
```

#### Output
![https://i.imgur.com/GQogN5w.png](https://i.imgur.com/GQogN5w.png)

---

## Question4
![https://i.imgur.com/t4Ng7qR.png](https://i.imgur.com/t4Ng7qR.png)
CreditCardAPP Interface methods: - The methods inside the credit card app has to be
redefined in individual bank classes. • getpersonalDetails – Method receives the name, mob, address, nominee, age, email
for a customer. • CalculatePerYearIncome – Take input of gross salary.
o NetSalPerMonth = GrossSalary – (GrossSalary * 0.2)
o PerYearIncome = NetSalPerMonth *12 • PrintEligibility – This is decided based on previous loan EMI. Get the input of EMI
that an employee pays per month
o EligibilityScore = 3. If employee does not pays any EMI.
o EligibilityScore= 2. If employee pays EMI for less than 20% of his
perYearIncome.
o EligibilityScore=1. If employee pays EMI for less than 40% of his
perYearIncome.
o EligibilityScore=0. If employee pays EMI for less than 60% of his
perYearIncome.
Write a Java program that creates the banking class for individual banks like ICICI, HDFC
and AXIS. Redefine the methods of the interfaces in all classes. 

#### Code
```JAVA

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
```

#### Output
![https://i.imgur.com/ZvNUIUv.png](https://i.imgur.com/ZvNUIUv.png)

---

## Question5
A super market has various products for sale. Design an abstract class to have
methods like billing, stock availability for a specific product, printSaleReport. Create
the subclasses according to category of products like, cosmetics, groceries,
kitchenTools, snacks & chocolates. Redefine the methods in abstract class. Apply the
dynamic polymorphism concept and override the printSaleReport method of the
abstract class. 


#### Code
```JAVA
/**
 * @author Yash Kumar Verma
 * @reg: 19BCE2669
 */
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

```

#### Output
![https://i.imgur.com/9AAv5pW.png](https://i.imgur.com/9AAv5pW.png)

---

## Question6
Design a class to display the schedule of trains in MGR Central railway station. The
class can have its own member variable like, train_no, src, dest, time, traveltime,
platformno, traveltype (A-Arrival, D-Departure). Create an array of objects in main
function. Perform the following tasks. 

-  SearchFunction ( ) – Takes trainno has input and perfroms a search with all objects. If found display all variable details of the class like train_no, src, dest, time, traveltime, platformno, traveltype. If not found throw arrayIndexOutofBound exception and handle it. 
-  SortFunction ( ) – Takes the input of sorting type (TM- time based, TN – Train no
based). Sort and display the records. If the user enters other than TN or TM input
throw arithematic or arrayIndexOutofBound exception and handle it. 


#### Code
```JAVA
import java.util.Scanner;

class Train {
    public int time;
    private String src;
    private String dest;
    private int platform;
    public int train_no;
    private int traveltime;
    private char traveltype;

    Train(int train_no, String src, String dest, int time, int traveltime, int platform, char traveltype) {
        this.train_no = train_no;
        this.src = src;
        this.dest = dest;
        this.time = time;
        this.traveltime = traveltime;
        this.platform = platform;
        this.traveltype = traveltype;
    }

    void printDetails() {
        System.out.println("Displaying Train Details:");
        System.out.println("Train no.: " + this.train_no);
        System.out.println("Source: " + this.src);
        System.out.println("Destination: " + this.dest);
        System.out.println("Time: " + this.time + "hrs");
        System.out.println("Travel Time: " + this.traveltime + "hrs");
        System.out.println("Platform number: " + this.platform);
        System.out.println("Travel Type: " + this.traveltype);
    }
}

public class MGRStation {
    public static void main(String args[]) {
        Train Train1 = new Train(5, "PUNE", "MUMBAI", 1400, 3, 1, 'A');
        Train Train2 = new Train(2, "MUMBAI", "PUNE", 900, 3, 2, 'D');
        Train Train3 = new Train(3, "KOLKATA", "PUNE", 1800, 12, 3, 'D');
        Train Train4 = new Train(1, "GOA", "MUMBAI", 700, 2, 4, 'A');
        Train Train5 = new Train(4, "KOLKATA", "GOA", 2100, 11, 5, 'D');

        // create array of trains
        Train[] trains = { Train1, Train2, Train3, Train4, Train5 };

        // user interaction
        System.out.print("Enter train number to search: ");
        Scanner handler = new Scanner(System.in);
        int trainNumber = handler.nextInt();
        handler.nextLine();

        MGRStation station = new MGRStation();
        try {
            station.SearchFunction(trains, trainNumber).printDetails();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Train Not found");
        }

        try {
            System.out.print("Enter sorting method (TN OR TM): ");
            String method = handler.nextLine();
            Train sortedTrains[] = new Train[5];
            sortedTrains = station.SortFunction(trains, method);
            for (Train t : sortedTrains) {
                t.printDetails();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Search method");
        }

        handler.close();
    }

    // search trains by id
    public Train SearchFunction(Train[] trains, int trainNumber) throws ArrayIndexOutOfBoundsException {
        for (int i = 0; i < trains.length; i++) {
            if (trains[i].train_no == trainNumber) {
                return trains[i];
            }
        }
        throw new ArrayIndexOutOfBoundsException("Train Not found");
    }

    // sort trains
    public Train[] SortFunction(Train[] trains, String method) throws ArrayIndexOutOfBoundsException {
        if (method == "TM") {
            return this.sortByTrainNumber(trains);
        } else if (method == "TN") {
            return this.sortByTime(trains);
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    // sort by train number
    private Train[] sortByTrainNumber(Train[] trains) {
        for (int i = 0; i < trains.length; i++) {
            for (int j = i + 1; j < trains.length; j++) {
                if (trains[i].train_no > trains[j].train_no) {
                    Train temp = trains[j];
                    trains[j] = trains[i];
                    trains[i] = temp;
                }
            }
        }
        return trains;
    }

    // sort by time
    private Train[] sortByTime(Train[] trains) {
        for (int i = 0; i < trains.length; i++) {
            for (int j = i + 1; j < trains.length; j++) {
                if (trains[i].time > trains[j].time) {
                    Train temp = trains[j];
                    trains[j] = trains[i];
                    trains[i] = temp;
                }
            }
        }
        return trains;
    }
}
```

#### Output
![https://i.imgur.com/nycuXB4.png](https://i.imgur.com/nycuXB4.png)
![https://i.imgur.com/jYjV5uS.png](https://i.imgur.com/jYjV5uS.png)

---
