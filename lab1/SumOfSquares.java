import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value :");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sum = sum + (n * n);
        }
        System.out.println("Square of the sum is " + sum);
    }
}