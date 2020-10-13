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

    static boolean checkAnagram(char[] s1, char[] s2) {
        if (s1.length != s2.length) {
            return false;
        }

        for (char c : s1) {
            if (!ArrayUtil.arrayContains(s2, c)) {
                return false;
            }
        }

        return true;
    }
}

public class Anagrams implements ArrayUtil {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter first string : ");
        String string1 = handler.nextLine();

        System.out.print("Enter second string : ");
        String string2 = handler.nextLine();

        char str1[] = string1.toCharArray();
        char str2[] = string2.toCharArray();

        if (ArrayUtil.checkAnagram(str1, str2)) {
            System.out.println("> Strings are Anagram");
        } else {
            System.out.println("> Strings are not anagrams");
        }
    }
}