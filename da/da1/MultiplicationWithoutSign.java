import java.util.Scanner;

public class MultiplicationWithoutSign {
    static int multiply(int x, int y) {
        if (y == 0)
            return 0;
        if (y > 0)
            return (x + multiply(x, y - 1));
        if (y < 0)
            return -multiply(x, -y);
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number  :");
        int n1 = sc.nextInt();
        System.out.print("Enter second Number :");
        int n2 = sc.nextInt();
        System.out.println();
        System.out.print(multiply(n1, n2));
        System.out.println();
    }
}