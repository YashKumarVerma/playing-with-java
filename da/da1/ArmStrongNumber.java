import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = 0, a, temp;

        System.out.print("Enter a number to check if it's ArmStrong or not : ");
        int n = sc.nextInt();
        temp = n;

        while (n > 0) {
            a = n % 10;
            n = n / 10;
            k = k + (a * a * a);
        }

        if (temp == k) {
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Number is not Armstrong");
        }
    }
}