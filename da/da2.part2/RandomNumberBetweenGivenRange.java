import java.util.Scanner;

public class RandomNumberBetweenGivenRange {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter starting range : ");

        int lowerRange = handler.nextInt();
        System.out.print("Enter final range : ");
        int upperRange = handler.nextInt();
        int randomNumber = lowerRange + (int) (Math.random() * ((upperRange - lowerRange) + 1));
        System.out.println("Random number between given range : " + randomNumber);
    }
}