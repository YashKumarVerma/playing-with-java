import java.util.Scanner;

public class ArrayRotation {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        int[] a;
        int temp;
        a = new int[3];

        System.out.println("Enter three of array : ");
        for (int i = 0; i < 3; i++) {
            a[i] = handler.nextInt();
        }

        System.out.print("Original Array : [");
        for (int i = 0; i < 3; i++) {
            if (i != 2) {
                System.out.print(a[i] + ",");
            } else {
                System.out.println(a[i] + "]");
            }
        }

        temp = a[0];
        for (int i = 0; i < 2; i++) {
            a[i] = a[i + 1];
        }
        a[2] = temp;
        System.out.print("Rotated Array : [");
        for (int i = 0; i < 3; i++) {
            if (i != 2) {
                System.out.print(a[i] + ",");
            } else {
                System.out.println(a[i] + "]");
            }
        }
    }
}