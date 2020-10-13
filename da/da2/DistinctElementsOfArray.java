import java.util.Scanner;

public class DistinctElementsOfArray {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int items = handler.nextInt();
        int data[] = new int[items];
        int dc = 0;
        System.out.println("Enter " + items + " values : ");
        int temp;

        for (int i = 0; i < items; i++) {
            temp = handler.nextInt();
            if (!DistinctElementsOfArray.arrayContains(data, temp)) {
                System.out.println("> " + temp + " ");
                data[dc++] = handler.nextInt();
            }
        }

        handler.close();
    }

    static boolean arrayContains(int[] haystack, int needle) {
        for (int item : haystack) {
            if (item == needle) {
                return true;
            }
        }
        return false;
    }
}