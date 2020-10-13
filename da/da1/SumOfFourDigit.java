import java.util.Scanner;

public class SumOfFourDigit {
    public static void main(String[] args) {
        /** take input from user */
        Scanner handle = new Scanner(System.in);
        System.out.print("Enter first number  : ");
        int number1 = handle.nextInt();
        System.out.print("Enter second number : ");
        int number2 = handle.nextInt();

        /** calculate sum */
        int sum = 0;
        sum += number1 + number2;

        /** show to ser */
        System.out.println("Sum of " + number1 + " and " + number2 + " is " + sum);
    }
}