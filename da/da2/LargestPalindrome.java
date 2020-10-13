import java.util.Scanner;

public class LargestPalindrome {
    static void printSubString(String string, int low, int high) {
        System.out.println(string.substring(low, high + 1));
    }

    static int longestPalindromeString(String str) {
        int start = 0;
        int maxLength = 1;
        int length = str.length();
        boolean table[][] = new boolean[length][length];
        for (int i = 0; i < length; ++i) {
            table[i][i] = true;
        }

        // check for sub-string of length 2.
        for (int i = 0; i < length - 1; ++i) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                table[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }

        for (int k = 3; k <= length; ++k) {
            for (int i = 0; i < length - k + 1; ++i) {
                int j = i + k - 1;
                if (table[i + 1][j - 1] && str.charAt(i) == str.charAt(j)) {
                    table[i][j] = true;
                    if (k > maxLength) {
                        start = i;
                        maxLength = k;
                    }
                }
            }
        }
        System.out.print("Longest palindrome substring is; ");
        printSubString(str, start, start + maxLength - 1);
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner handler = new Scanner(System.in);
        String string = handler.nextLine();
        System.out.println("Length is: " + longestPalindromeString(string));
    }
}