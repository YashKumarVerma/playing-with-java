import java.util.Scanner;

public class FormulaQuestion {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter n to calculate n + nn + nnn : ");
        int n = handler.nextInt();
        System.out.println("> " + (n + n * n + n * n * n));

    }
}