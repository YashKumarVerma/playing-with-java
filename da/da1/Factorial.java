import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int number, k, factorial;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        number = sc.nextInt();

        factorial = 1;
        for (k = 1; k <= number; k++) {
            factorial = factorial * k;
        }
        System.out.println("Factorial is " + factorial);

    }
}