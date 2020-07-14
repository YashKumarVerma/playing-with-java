import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int newNumber = 0;
        int digit;

        while (number > 0) {
            digit = number % 10;
            newNumber = newNumber * 10 + digit;
            number = number / 10;
        }

        System.out.println("Reversed digit = " + newNumber);
    }
}