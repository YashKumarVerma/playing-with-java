import java.util.Scanner;

public class ReverseNumber {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        int temp;
        int number;
        int number2 = 0;
        System.out.print("Enter a number : ");
        number = handler.nextInt();

        while (number != 0) {
            temp = number % 10;
            number2 = number2 * 10 + temp;
            number = number / 10;
        }
        System.out.println("Reversed Number is " + number2);
    }
}