import java.util.Scanner;

public class SumOfFirstAndLastDigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a 4 digit number : ");
        int n = s.nextInt();
        int first = n / 1000;
        int last = n % 10;
        int sum = first + last;
        System.out.println("First digit is :" + first);
        System.out.println("Last digit is :" + last);
        System.out.println("Sum is : " + sum);
    }
}