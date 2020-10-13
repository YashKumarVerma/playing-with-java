import java.util.Scanner;

public class BaseConversion {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter binary number : ");
        long number1 = handler.nextLong();
        int decimal = convertBinaryToDecimal(number1);
        System.out.printf("%d in binary = %d in decimal", number1, decimal);

        System.out.print("\nEnter Decimal number : ");
        int number2 = handler.nextInt();
        long binary = convertDecimalToBinary(number2);
        System.out.printf("%d in decimal = %d in binary", number2, binary);
        System.out.println("");
    }

    public static int convertBinaryToDecimal(long num) {
        int decimalNumber = 0, i = 0;
        long remainder;
        while (num != 0) {
            remainder = num % 10;
            num = num / 10;
            decimalNumber += remainder * Math.pow(2, i);
            ++i;
        }
        return decimalNumber;
    }

    public static long convertDecimalToBinary(int n) {
        long binaryNumber = 0;
        int remainder, i = 1;

        while (n != 0) {
            remainder = n % 2;
            n = n / 2;
            binaryNumber += remainder * i;
            i = i * 10;
        }
        return binaryNumber;
    }
}