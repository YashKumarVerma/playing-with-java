import java.util.Scanner;

public class DivisibleBy3And5 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n;

        System.out.println("Enter a number : ");
        n = in.nextInt();
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println(n + " is Divisible by 3 and 5.");
        } else {
            System.out.println(n + " is Not Divisible by 3 or 5.");
        }
    }
}