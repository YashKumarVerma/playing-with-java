import java.util.Scanner;

public class MatrixAddition {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int[][] a;
        int n;
        System.out.print("Enter the size of matrix : ");
        n = in.nextInt();
        a = new int[n][n];
        System.out.print("Enter the elements of first matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }
        System.out.print("Enter the elements of second matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] += in.nextInt();
            }
        }

        System.out.println("final matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

    }
}