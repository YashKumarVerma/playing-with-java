import java.util.Scanner;

public class FirstAndLastOfTwoArr {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter number of elements in array 1 : ");
        int items1 = handler.nextInt();
        int data1[] = new int[items1];
        System.out.println("Enter " + items1 + " values : ");

        for (int i = 0; i < items1; i++) {
            data1[i] = handler.nextInt();
        }

        System.out.print("Enter number of elements in array 2 : ");
        int items = handler.nextInt();
        int data[] = new int[items];
        System.out.println("Enter " + items + " values : ");

        for (int i = 0; i < items; i++) {
            data[i] = handler.nextInt();
        }

        System.out.println("Starting elements of both array are same: " + (data[0] == data1[0]));
        System.out.println("Last elements of both array are same: " + (data[items - 1] == data1[items1 - 1]));
        System.out.println("First element of first array is equal to last element of second array : "
                + (data1[0] == data[items - 1]));
        System.out.println("Last element of first array is equal to first element of second array : "
                + (data1[items1 - 1] == data[0]));

    }
}