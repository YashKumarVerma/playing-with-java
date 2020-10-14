class OuterClass {
    public int value = 10;

    class InnerClass {
        public int value = 20;
    }
}

public class Worker {
    public static void main(String args[]) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        System.out.println("Outer value :" + outerClass.value);
        System.out.println("Inner Value :" + innerClass.value);
    }
}