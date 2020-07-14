import java.util.Scanner;

class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit n : ");
        int limit = scanner.nextInt();
        boolean flag;

        for (int i = 2; i < limit; i++) {
            flag = false;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                System.out.print(i + " ");
            }
        }

    }
}