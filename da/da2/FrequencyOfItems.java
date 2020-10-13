import java.util.Scanner;

interface ArrayUtil {
    static boolean arrayContains(char[] haystack, char needle) {
        for (char item : haystack) {
            if (item == needle) {
                return true;
            }
        }
        return false;
    }

    static int indexOf(char[] haystack, char needle) {
        for (int i = 0; i < haystack.length; i += 1) {
            if (haystack[i] == needle) {
                return i;
            }
        }

        return -1;
    }
};

public class FrequencyOfItems implements ArrayUtil {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String string = handler.nextLine();
        char characters[] = new char[string.length()];
        int instances[] = new int[string.length()];
        int uniques = 0;

        for (int i = 0; i < string.length(); i += 1) {
            if (ArrayUtil.arrayContains(characters, string.charAt(i))) {
                instances[ArrayUtil.indexOf(characters, string.charAt(i))] += 1;
            } else {
                characters[uniques] = string.charAt(i);
                instances[uniques] = 1;
                uniques++;
            }
        }

        for (int i = 0; i < uniques; i += 1) {
            System.out.println("> " + characters[i] + " occurs " + instances[i] + " times.");
        }
    }
}