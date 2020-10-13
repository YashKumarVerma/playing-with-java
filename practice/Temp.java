public class Temp {
    public static void main(String args[]) {
        int a = 10;
        {
            int b = 20;
            System.out.println(b);
        }
        System.out.println(a);

        for (int i = 0; i < 5; i++) {
            int a = 20;
            System.out.println(a);
        }

    }
}
