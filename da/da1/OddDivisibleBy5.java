import java.util.Scanner;

public class OddDivisibleBy5 {
    public static void main(String args[]) {
        int i;
        int j = 800;
        for (i = 200; i < j; i += 5) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}