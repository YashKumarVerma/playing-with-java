import java.util.Scanner;

public class FilterStringCharacters {
    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String string = handler.nextLine();
        string = string.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("Filtered String: " + string);
    }
}