import java.util.Scanner;

public class SumOfDigitsDivisibleBy3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        for (int i = 12; i < 50; i += 3) {
            ans += i;
        }
        System.out.println("The final answer is : " + ans);
    }
}