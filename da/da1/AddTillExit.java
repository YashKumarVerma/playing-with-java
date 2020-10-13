import java.util.Scanner;

public class AddTillExit {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n, ans = 0;
        System.out.println("Type 0 for answer");
        System.out.println("Type numbers of sum:");
        do {
            System.out.print("> ");
            n = in.nextInt();
            ans += n;
        } while (n != 0);
        System.out.println("The final answer is :" + ans);
    }
}