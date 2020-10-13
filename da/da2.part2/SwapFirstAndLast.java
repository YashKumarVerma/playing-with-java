import java.util.Scanner;

public class SwapFirstAndLast {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int items = handler.nextInt();
        int data[] = new int[items];
        System.out.println("Enter " + items + " values : ");

        for (int i = 0; i < items; i++) {
            data[i] = handler.nextInt();
        }

        int newArray[] = new int[items];
        for (int i = 0; i < items; i += 1) {
            newArray[i] = data[i];
        }

        newArray[0] = data[items - 1];
        newArray[items - 1] = data[0];

        System.out.print("[");
        for (int i : newArray) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }
}