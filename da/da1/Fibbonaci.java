import java.util.Scanner;

public class Fibbonaci {
    public static void main(String[] args) {
        int number, first = 0, third = 0, second = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        number = sc.nextInt();

        System.out.println("First " + number + "fibbonacci number are \n" + first + "\n" + second);

        for (int i = 0; i < number - 2; i++) {
            third = first + second;
            System.out.println(third);
            first = second;
            second = third;
        }
    }
}