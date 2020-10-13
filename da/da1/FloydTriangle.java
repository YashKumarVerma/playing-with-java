import java.util.Scanner;

public class FloydTriangle {
    public static void main(String args[]) {
        int n;
        int number = 1;
        int i, j;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter limit for pattern : ");
        n = in.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print((number++) + "\t");
            }
            System.out.println();
        }
    }
}