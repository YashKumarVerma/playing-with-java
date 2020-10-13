import java.util.Scanner;

interface ArrayFiltering {
    static boolean arrayContains(char[] haystack, char needle) {
        for (char item : haystack) {
            if (item == needle) {
                return true;
            }
        }
        return false;
    }
};

public class VowelOrConsonant implements ArrayFiltering {
    public static void main(String args[]) {
        char vowels[] = { 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' };
        Scanner handler = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String string = handler.nextLine();

        for (int i = 0; i < string.length(); i += 1) {
            if (ArrayFiltering.arrayContains(vowels, string.charAt(i))) {
                System.out.println("> " + string.charAt(i) + " is a vowel.");
            } else {
                System.out.println("> " + string.charAt(i) + " is a consonant.");
            }
        }
    }

}