import java.util.Scanner;

public class DivideBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is the all odd numbers which are divided by 5 in range of 200 to 800 : ");
        for (int i = 200; i < 800; i++) {
            if (i % 2 == 1) {
                if (i % 5 == 0)
                    System.out.println(i + "\t");
            }

        }
    }
}