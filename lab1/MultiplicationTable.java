package lab1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int n, multi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n for multiplication table : ");
        n = scanner.nextInt();
        for (int i = 1; i < 11; i++) {
            multi = n * i;
            System.out.println(n + "*" + i + "=" + multi);
        }

        scanner.close();
    }
}