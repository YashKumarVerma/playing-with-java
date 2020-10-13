import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class AlternateOrder {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);

        System.out.print("Enter number of elements : ");
        int items = handler.nextInt();
        int data[] = new int[items];
        System.out.print("Enter " + items + " values : ");

        for (int i = 0; i < items; i++) {
            data[i] = handler.nextInt();
        }

        Collections.sort(Arrays.asList(data), Collections.reverseOrder());

        int[] finalArr = new int[data.length];
        for (int i = 0; i < data.length; i += 2) {
            finalArr[i] = data[i];
            finalArr[i + 1] = data[data.length - i - 1];
        }

        for (int i = 0; i < finalArr.length; i++) {
            System.out.println(finalArr[i]);
        }
    }
}