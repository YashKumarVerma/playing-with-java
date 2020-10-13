class Prime implements Runnable {
    long j, counter;

    Prime() {
        super();
        counter = 0;
    }

    public void run() {
        for (long i = 0; counter <= 25; i++) {
            for (j = 2; j <= i; j++) {
                if (i % j == 0)
                    break;
            }
            if (j == i) {
                counter++;
                System.out.println("Print number #" + counter + " is " + i);
            }
        }
    }
}

class Fibbonaci implements Runnable {
    long a, b, c, n;

    Fibbonaci() {
        a = c = n = 0;
        b = 1;
    }

    public void run() {
        while (n++ < 50) {
            System.out.println(n + " th " + " Fibbonaci = " + a);
            c = a + b;
            a = b;
            b = c;
            try {
                if (n == 30) {
                    System.out.println("Wait thread.");
                    Thread.sleep(500);
                }

            } catch (InterruptedException e) {
                System.out.println("Error : " + e);
            }
        }
    }
}

public class FibbonaciPrinter {

    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();
        System.out.println("Main thread name : " + currentThread.getName());

        Prime prime = new Prime();
        Fibbonaci fibbonaci = new Fibbonaci();
        Thread fibThread = new Thread(fibbonaci, "fibonacci");
        Thread primeThread = new Thread(prime, "prime");
        fibThread.start();
        System.out.println("Thread " + fibThread.getName() + " started.");
        primeThread.start();
        System.out.println("Thread " + primeThread.getName() + " started.");
    }
}