import java.util.Scanner;

public class SumOfTwoEqualToThird {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.println("Enter three Numbers :");
        System.out.print("Enter first Number : ");
        int first = handler.nextInt();
        System.out.print("Enter second Number : ");
        int second = handler.nextInt();
        System.out.print("Enter third Number : ");
        int third = handler.nextInt();

        if (first + second == third || second + third == first || third + first == second) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}