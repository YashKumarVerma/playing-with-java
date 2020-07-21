package lab1;

import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        int row, number = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n value for Floyd's Triangle : ");
        row = scanner.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
        scanner.close();
    }
}