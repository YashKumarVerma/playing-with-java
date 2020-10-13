import java.util.Scanner;

public class MultiplicationTableByUser {
    public static void main(String args[]) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number for multiplication Table : ");
        n = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + n * i);
        }
    }
}