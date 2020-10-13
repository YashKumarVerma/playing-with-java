import java.util.Arrays;
import java.util.Scanner;

public class ThirdLargestElement {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int items = handler.nextInt();
        int data[] = new int[items];

        System.out.print("Enter the elements : ");
        for (int i = 0; i < items; i += 1) {
            data[i] = handler.nextInt();
        }

        Arrays.sort(data);
        System.out.println("Third Largest Element is : " + data[data.length - 4]);

    }
}