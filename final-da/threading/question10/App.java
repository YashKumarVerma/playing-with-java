import java.util.InputMismatchException;
import java.util.Scanner;
import rainbow.rainbow;

class InvalidNameException extends Exception {
    private final String context = "[ " + rainbow.green("InvalidNameException") + " ] ";
    private String message;

    public InvalidNameException(String message) {
        super(message);
        this.message = message;
        System.out.println(this.context + "triggered");
    }

    public String getMessage() {
        return this.context + this.message;
    }
};

class InvalidAgeException extends Exception {
    private final String context = "[ " + rainbow.green("InvalidAgeException") + " ] ";
    private String message;

    public InvalidAgeException(String message) {
        super(message);
        this.message = message;
        System.out.println(this.context + "triggered");
    }

    public String getMessage() {
        return this.context + this.message;
    }
};

class InvalidRegistrationNumberException extends Exception {
    private final String context = "[ " + rainbow.green("InvalidRegistrationNumberException") + " ] ";
    private String message;

    public InvalidRegistrationNumberException(String message) {
        super(message);
        this.message = message;
        System.out.println(this.context + "triggered");
    }

    public String getMessage() {
        return this.context + this.message;
    }
};

class User {
    final private String context = "[ " + rainbow.green("User") + " ] ";
    private String name;
    private String regNo;
    private int age;
    private Scanner handler = new Scanner(System.in);
    public Boolean success = false;

    User() {
        System.out.println(this.context + "user instance created");
    }

    public void displayDetails() {
        System.out.println(this.context + "User Details:");
        System.out.println(this.context + "Name :" + this.name);
        System.out.println(this.context + "Age :" + this.age);
        System.out.println(this.context + "RegNo :" + this.regNo);
    }

    public void setName() throws InvalidNameException {
        System.out.print(context + "Enter name : ");
        this.name = handler.nextLine();
        if (name.length() <= 3) {
            throw new InvalidNameException("Name should be longer than 3 characters");
        }
    }

    public void setRegNo() throws InvalidRegistrationNumberException {
        System.out.print(context + "Enter registration number : ");
        this.regNo = handler.nextLine();
        if (regNo.length() != 9) {
            throw new InvalidRegistrationNumberException("Registration Number should be of 9 characters");
        }
    }

    public void setAge() throws InvalidAgeException {
        System.out.print(context + "Enter age : ");
        this.age = handler.nextInt();
        handler.nextLine();
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Age should be positive and less than 120");
        }
    }
}

public class App {
    public static void main(String args[]) {

        User user = new User();
        try {

            System.out.println("[ " + rainbow.green("try block starts") + " ] ");
            user.setName();
            user.setAge();
            user.setRegNo();
            user.success = true;
            System.out.println("[ " + rainbow.green("try block ends") + " ] ");
        } catch (InvalidNameException e) {
            System.out.println(e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (InvalidRegistrationNumberException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Incorrect Data type entered");
        } finally {
            System.out.println("[ " + rainbow.green("finally block starts") + " ] ");
            System.out.print("[ " + rainbow.green("finally") + " ] ");
            if (user.success == true) {
                System.out.println(rainbow.green(rainbow.underline("The user was created successfully.")));
            } else {
                System.out.println(rainbow.red(rainbow.underline("The user could not be created !")));
            }
            user.displayDetails();
            System.out.println("[ " + rainbow.green("finally block ends") + " ] ");
        }
    }

}