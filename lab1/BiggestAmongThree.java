package lab1;

import java.util.Scanner;

public class BiggestAmongThree {
    public static void main(String[] args) {
        int n, m, k;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        n = scanner.nextInt();
        m = scanner.nextInt();
        k = scanner.nextInt();
        if (n > m) {
            if (n > k) {
                System.out.println(n + " is the biggest among three");
            } else {
                System.out.println(k + " is the biggest among three");
            }
        } else if (m > k) {
            System.out.println(m + " is the biggest among three");
        } else {
            System.out.println(k + " is the biggest among three");
        }
        scanner.close();
    }
}