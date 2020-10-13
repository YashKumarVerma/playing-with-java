import java.util.Scanner;
import java.util.Arrays;

public class VowelRemover {
    public static void main(String args[]) {
        System.out.print("Enter a string: ");
        Scanner handler = new Scanner(System.in);
        String string = handler.nextLine();

        String[] vowels = { "a", "e", "i", "o", "u", "A", "E", "I", "O", "U" };
        for (int i = 0; i < vowels.length; i++) {
            string = string.replace(vowels[i], "");
        }

        System.out.println("New String : " + string);
    }

}