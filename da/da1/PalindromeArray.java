import java.util.Scanner;

public class PalindromeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int m = n;
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        if (rev == m)
            System.out.println("Number is Palindrome");
        else
            System.out.println("Number not is Palindrome");
        System.out.print("Enter no. of elements you want in array:");
        int k = sc.nextInt();
        int a[] = new int[k];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < k; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Odd Numbers:");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
            }
        }
        System.out.println("Even Numbers:");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }

    }
}
