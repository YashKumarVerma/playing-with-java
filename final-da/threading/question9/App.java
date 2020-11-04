import java.util.Scanner;
import java.util.logging.Handler;
import rainbow.rainbow;

/** extending throwable as custom Exception */
class InvalidNameException extends Throwable {
    private final String context = "[ " + rainbow.green("InvalidNameException") + " ] ";
    private String message;

    InvalidNameException(String message) {
        super(message);
        this.message = message;
        System.out.println(this.context + "triggered");
    }

    public String getMessage() {
        return this.context + this.message;
    }
}

/** main caller class */
public class App {
    public String name;

    /** display details of user after created */
    public void display() {
        System.out.println("Name: " + this.name);
    }

    public static void main(String args[]) {
        try {
            final Scanner handler = new Scanner(System.in);
            final String context = "[ " + rainbow.green("App") + " ] ";
            final App user = new App();

            System.out.print(context + "Enter name: ");
            user.name = handler.nextLine();

            handler.close();
            if (user.name.length() <= 3) {
                throw new InvalidNameException("Name too short");
            } else {
                System.out.println(context + "New user created");
                user.display();
            }
        } catch (InvalidNameException e) {
            System.out.println(e.getMessage());
        }

    }
}