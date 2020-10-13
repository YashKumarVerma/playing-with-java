import java.util.Scanner;

public class SumOfSquaresTillN {
    public static void main(String args[]) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = in.nextInt();

        System.out.print("This is the sum of series : ");
        System.out.println(n * (n + 1) * (2 * n + 1) / 6);
    }
}