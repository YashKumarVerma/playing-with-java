import java.util.Scanner;

public class LargestValueOfArray {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        int items = 3;
        int data[] = new int[items];
        System.out.println("Enter " + items + " values : ");

        for (int i = 0; i < items; i++) {
            data[i] = handler.nextInt();
        }

        if (data[0] > data[2]) {
            System.out.println(data[0] + " is greater than " + data[2]);
        } else {
            System.out.println(data[2] + " is greater than " + data[0]);
        }

    }
}