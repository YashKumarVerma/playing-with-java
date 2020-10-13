import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter a number in base 10 : ");
        System.out.println("> " + Integer.toBinaryString(handler.nextInt()));
    }
}