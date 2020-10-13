import java.util.Scanner;

public class SwapUsingThirdVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter Second number : ");
        int n2 = sc.nextInt();

        int temp;
        System.out.println("Before swapping number " + n1 + " and " + n2);
        temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("after swapping number " + n1 + " and " + n2);
    }
}