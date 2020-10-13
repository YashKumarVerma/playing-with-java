import java.util.Scanner;
import java.util.Arrays;

interface StringUtil {
    static String sort(String string) {
        return string;
    }
}

public class SortString {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int items = handler.nextInt();
        String string[] = new String[items];

        /** taking input of data */
        handler.nextLine();
        for (int i = 0; i < items; i += 1) {
            System.out.print("Enter string " + (i + 1) + " :");
            string[i] = handler.nextLine();
        }

        Arrays.sort(string);

        for (String s : string) {
            System.out.println("> " + s);
        }
    }
}