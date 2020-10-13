import java.util.Scanner;

public class SwapWithoutUsingThirdVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter first number : ");
        int n2 = sc.nextInt();

        System.out.println("value of n1:" + n1);
        System.out.println("value of n1:" + n2);
        System.out.println("Before swapping number " + n1 + " and " + n2);
        System.out.println();
        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;

        System.out.println("value of n1:" + n1);
        System.out.println("value of n1:" + n2);
        System.out.println();
        System.out.println("After swapping number " + n1 + " and " + n2);
    }
}