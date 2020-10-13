import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String args[]) {
        /** starting from 1 to 15 */
        for (int i = 1; i <= 15; i++) {
            /** show till 10 multiplication rows */
            for (int j = 1; j <= 10; j++)
                System.out.println(i + " x " + j + " = " + i * j);

            System.out.println();
        }
    }
}