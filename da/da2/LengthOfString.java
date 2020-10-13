import java.util.Scanner;

public class LengthOfString {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String string = handler.nextLine();
        int stringLength = 0;

        for (char c : string.toCharArray()) {
            stringLength++;
        }

        System.out.println("> Length of String \"" + string + "\" is " + stringLength);
    }
}