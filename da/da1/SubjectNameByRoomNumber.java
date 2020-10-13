import java.util.Scanner;

public class SubjectNameByRoomNumber {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter a class number : ");
        n = in.nextInt();
        if (n == 604) {
            System.out.println("Java Programming");
        } else if (n == 605) {
            System.out.println("Python Programming");
        } else {
            System.out.println("Invalid input");
        }
    }
}