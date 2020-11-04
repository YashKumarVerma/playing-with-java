import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import rainbow.rainbow;
import rainbow.rainbow;

class PrimeNumber extends Thread {
    private int nth;
    private final String context = "[ " + rainbow.green(this.getName()) + " ] ";

    public PrimeNumber(int nth) {
        this.nth = nth;
    }

    @Override
    public void run() {
        System.out.println(this.context + this.nth + "th prime number is " + this.findNth(this.nth));
    }

    private int findNth(int nth) {
        int num, count, i;
        num = 1;
        count = 0;

        while (count < nth) {
            num = num + 1;
            for (i = 2; i <= num; i++) {
                if (num % i == 0) {
                    break;
                }
            }
            if (i == num) {
                count = count + 1;
            }
        }

        return num;
    }
}

class PrimeFactors extends Thread {
    private int number;
    private Integer[] factors;
    private final String context = "[ " + rainbow.green(this.getName()) + " ] ";

    public PrimeFactors(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.print(this.context + "Prime Factors of " + this.number + " are : ");
        this.calculator();
        for (Integer num : this.factors) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private void calculator() {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 2; i < this.number; i++) {
            while (this.number % i == 0) {
                list.add(i);
                this.number = this.number / i;
            }
        }
        this.factors = list.toArray(new Integer[list.size()]);
    }
}

public class Computations {
    public static void main(String args[]) {
        final String context = "[ " + rainbow.green(Thread.currentThread().getName()) + " ] ";

        try {
            Scanner handler = new Scanner(System.in);
            System.out.print(context + rainbow.bold("Enter a number : "));
            int number = handler.nextInt();

            PrimeNumber primeNumber = new PrimeNumber(number);
            primeNumber.start();

            PrimeFactors primeFactors = new PrimeFactors(number);
            primeFactors.start();
        } catch (IllegalArgumentException e) {
            System.out.println(rainbow.red(context + "Illegal arguments !"));
        } catch (InputMismatchException e) {
            System.out.println(rainbow.red(context + "Invalid input type !"));
        } catch (Exception e) {
            System.out.println(rainbow.red(context + "Some Error encountered !"));
        }
    }
}