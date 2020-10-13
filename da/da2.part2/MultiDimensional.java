import java.util.Scanner;

public class MultiDimensional {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        int batches[] = new int[4];
        int groups[] = new int[4];
        int total;
        int temp;

        for (int i = 0; i < 4; i += 1) {
            System.out.print("Enter number of slow learners in batch " + i + ": ");
            temp = handler.nextInt();
        }

        for (int i = 0; i < 4; i += 1) {
            groups[i] = batches[i] / 4;
            if (batches[i] % 4 != 0) {
                groups[i] += 1;
            }
        }

        int jagged[][] = new int[4][];
        for (int i = 0; i < 4; i += 1) {
            jagged[i] = new int[groups[i]];
            for ( int j = 0; j < ; j+=1) {
            
            }
        }

    }
}