import java.util.Scanner;

class Fibbonaci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms : ");
        int terms = scanner.nextInt();
        int a = 0;
        int b = 1;
        int c;

        System.out.println(a + " " + b + " ");
        for (int i = 2; i < terms; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}