public class AsciiTable {
    public static void main(String args[]) {
        int i;
        /** show all characters till 255 : the limit of ASCII */
        for (i = 0; i < 255; i++) {
            System.out.println("ASCII Character with value " + i + " is " + (char) i);
        }
    }
}