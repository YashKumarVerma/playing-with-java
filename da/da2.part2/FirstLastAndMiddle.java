import java.util.Scanner;

public class FirstLastAndMiddle {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int items = handler.nextInt();

        /** ensure only even length */
        while (items % 2 == 0) {
            System.out.println("Enter an odd length.");
            items = handler.nextInt();
        }

        int data[] = new int[items];
        System.out.println("Enter " + items + " values : ");

        for (int i = 0; i < items; i++) {
            data[i] = handler.nextInt();
        }

        int middle = data[items / 2];
        if (data[0] > middle) {
            if (data[0] > data[items - 1]) {
                System.out.println("> " + data[0] + " is largest.");
            } else {
                System.out.println("> " + data[items - 1] + " is largest.");
            }
        } else {
            if (middle > data[items - 1]) {
                System.out.println("> " + middle + " is largest.");
            } else {
                System.out.println("> " + data[items - 1] + " is largest.");
            }
        }
    }
}