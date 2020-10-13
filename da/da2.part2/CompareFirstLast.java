import java.util.Scanner;

public class CompareFirstLast {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int items = handler.nextInt();
        int data[] = new int[items];
        System.out.println("Enter " + items + " values : ");

        for (int i = 0; i < items; i++) {
            data[i] = handler.nextInt();
        }

        System.out.println("First and last are same : " + (data[0] == data[items - 1]));
    }
}