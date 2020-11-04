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

public class App {
    public static void main(String args[]) {
        final String context = "[ " + rainbow.green("App") + " ] ";

        try {
            Scanner handler = new Scanner(System.in);
            System.out.print(context + "Enter name : ");
            String name = handler.nextLine();
            if (name.length() <= 3) {
                throw new InvalidNameException("Name should be longer than 3 characters");
            }

            System.out.print(context + "Enter age : ");
            int age = handler.nextInt();
            handler.nextLine();
            if (age < 0 || age > 120) {
                throw new InvalidAgeException("Age should be positive and less than 120");
            }

            System.out.print(context + "Enter registration number : ");
            String regNo = handler.nextLine();
            if (regNo.length() != 9) {
                throw new InvalidRegistrationNumberException("Registration Number should be of 9 characters");
            }

            System.out.println(context + "Record Saved");

        } catch (InvalidNameException e) {
            System.out.println(e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (InvalidRegistrationNumberException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Incorrect Data type entered");
        }
    }

}