import pack1.*;
import pack2.*;

class FinalProgram implements pack1, pack2 {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public static void main(String args[]) {
        FinalProgram t = new FinalProgram();
        System.out.println("Addition :" + t.add(5, 6));
        System.out.println("Subtraction :" + t.sub(5, 3));
        System.out.println("Multiplication :" + t.multiply(3, 10));
        System.out.println("Division :" + t.divide(50, 5));
    }
}