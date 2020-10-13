import java.util.Scanner;

public class NewArrContainingFirstAndLast {
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

        int finalArr[] = { data1[0], data[items - 1] };
        System.out.println("First element of new arr : " + finalArr[0]);
        System.out.println("Second element of new arr : " + finalArr[1]);

    }
}