import java.util.Scanner;

public class DiagonalOfMatrix {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int[][] a;
        int n, ans = 0;

        System.out.print("Enter the size of matrix : ");
        n = in.nextInt();
        a = new int[n][n];
        System.out.print("Enter the elements of the matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
                if (i == j) {
                    ans += a[i][j];
                }
            }
        }
        System.out.println("Sum of diagonal element is : " + ans);
    }
}