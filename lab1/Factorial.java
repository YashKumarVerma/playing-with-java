import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        long factorial = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        for (int i = number; i > 0; i--) {
            factorial = factorial * i;
        }

        System.out.println("Factorial of " + number + " is " + factorial);
    }
}