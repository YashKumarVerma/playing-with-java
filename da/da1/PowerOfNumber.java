import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a, b;

        System.out.print("Enter number : ");
        a = in.nextInt();

        System.out.print("Enter power : ");
        b = in.nextInt();

        a = (int) Math.pow(a, b);
        System.out.println(a);
    }
}