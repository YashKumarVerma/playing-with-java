import java.util.Scanner;

public class SumOfFirstNNumbers {
    public static void main(String args[]) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = in.nextInt();
        System.out.print("This is sum from 1 to " + n + " = ");
        System.out.println(n * (n + 1) / 2);
    }
}