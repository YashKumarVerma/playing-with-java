import java.util.Scanner;
import java.util.Random;

public class RandomNumbersInGivenRange {
    public static void main(String args[]) {
        Random random = new Random();
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter max range : ");
        int maxRange = handler.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println("> " + random.nextInt(maxRange));
        }
    }
}