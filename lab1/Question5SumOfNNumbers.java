import java.util.Scanner;

class Question5SumOfNNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /** take input */
        System.out.print("Enter the limit n : ");
        int n = scanner.nextInt();

        System.out.println("Sum of " + n + " numbers is " + n * (n + 1) / 2);
    }
}