import java.util.Scanner;

public class Pattern35 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter limit for pattern : ");
        n = in.nextInt();
        for (int i = n; i > 0; i--) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            for (int l = 1; l < i; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}