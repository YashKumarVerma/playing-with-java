import java.util.Scanner;

public class OddAndEvenValues {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int items = handler.nextInt();
        int data[] = new int[items];

        System.out.print("Enter " + items + " items : ");
        for (int i = 0; i < items; i += 1) {
            data[i] = handler.nextInt();
        }
        System.out.println();

        System.out.println("Displaying even positioned values : ");
        for (int i = 0; i < items; i += 2) {
            System.out.print(data[i] + " ");
        }
        System.out.println();

        System.out.println("Displaying odd positioned values : ");
        for (int i = 1; i < items; i += 2) {
            System.out.print(data[i] + " ");
        }
        System.out.println();

    }
}