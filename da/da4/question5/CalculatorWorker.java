import java.util.Scanner;

/** declaring calculator */
class Calculator {
    public static int power(int base, int power) throws Exception {
        if (base >= 0 && power >= 0) {
            return (int) Math.pow(base, power);
        } else {
            throw new Exception("base and power should should be 0 or positive");
        }
    }
}

public class CalculatorWorker {
    public static void main(String[] args) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int n = handler.nextInt();
        handler.nextLine();

        System.out.print("Enter Power: ");
        int p = handler.nextInt();
        handler.nextLine();

        try {
            int result = Calculator.power(n, p);
            System.out.println(">" + result);
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
        handler.close();
    }
}