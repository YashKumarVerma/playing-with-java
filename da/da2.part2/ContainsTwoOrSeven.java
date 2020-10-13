import java.util.Scanner;

public class ContainsTwoOrSeven {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        int data[] = new int[2];
        System.out.print("Enter first number : ");
        int first = handler.nextInt();
        System.out.print("Enter second number : ");
        int second = handler.nextInt();

        data[0] = first;
        data[1] = second;

        if (data[0] == 4 || data[0] == 7 || data[1] == 4 || data[1] == 7) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}