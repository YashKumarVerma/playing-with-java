import java.util.Scanner;

public class OddEvenSeparator {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = handler.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int odd = n - 1;
        int even = 0;

        System.out.print("Enter elements of array : ");
        for (int i = 0; i < n; i++) {
            a[i] = handler.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                b[even] = a[i];
                even++;
            } else {
                b[odd] = a[i];
                odd--;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
    }
}