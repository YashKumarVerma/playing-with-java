import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        for (int k = 0; k < n; k++) {
            for (int l = 1; l <= (k + 1); l++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}