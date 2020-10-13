import java.util.Scanner;

interface StringReverser {
    static String processString(String str) {
        char c[] = str.toCharArray();
        char temp;
        for (int i = 0; i < c.length / 2; i += 1) {
            temp = c[i];
            c[i] = c[c.length - i - 1];
            c[c.length - i - 1] = temp;
        }
        return String.valueOf(c);
    }
}

public class Palindrome implements StringReverser {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String string = handler.nextLine();

        System.out.println(StringReverser.processString(string));

        if (string.compareTo(StringReverser.processString(string)) == 0) {
            System.out.println("String is palindrome.");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}