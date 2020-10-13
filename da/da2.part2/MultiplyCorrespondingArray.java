import java.util.Scanner;

public class MultiplyCorrespondingArray {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int items = handler.nextInt();
        int data[] = new int[items];
        System.out.println("Enter " + items + " values : ");

        for (int i = 0; i < items; i++) {
            data[i] = handler.nextInt();
        }

        int data2[] = new int[items];
        System.out.println("Enter values of second array : ");
        System.out.println("Enter " + items + " values : ");

        for (int i = 0; i < items; i++) {
            data2[i] = handler.nextInt();
        }

        for (int i = 0; i < data.length; i += 1) {
            System.out.println("> " + data[i] + " * " + data2[i] + " = " + data[i] * data2[i]);
        }
    }
}