import java.util.Scanner;

public class DivisibleBy3And5 {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = handler.nextInt();

        if (n % 5 == 0) {
            if (n % 3 == 0) {
                System.out.println("Number is divided by 3 and 5");
            } else {
                System.out.println("Number is not divided by 3 and 5");
            }
        } else {
            System.out.println("Number is not divided by 3 and 5");
        }
    }
}