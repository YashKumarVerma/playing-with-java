import java.util.Scanner;

public class InvertedNumberPryamid {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int n, i;
        System.out.println("Enter a number : ");
        n = in.nextInt();
        i = n;
        while (i > 0) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            i--;
        }
    }
}