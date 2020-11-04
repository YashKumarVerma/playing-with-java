import rainbow.rainbow;

public class Worker {
    private int counter = 0;

    // synchronized keyword to allow only one thread to execute at one time
    public synchronized void increment(String threadName) throws InterruptedException {
        counter++;
        Thread.sleep(1000);
        System.out.println("Thread Working: " + threadName + " and counter is: " + counter);
    }

    // function to invoke clients
    public void doWork() {

        // start first thread
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        increment("[ " + rainbow.green(Thread.currentThread().getName()) + " ] ");
                    } catch (InterruptedException ex) {
                        System.out.println("Error !");
                    }
                }
            }
        });
        thread1.start();

        // start second thread
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        increment("[ " + rainbow.green(Thread.currentThread().getName()) + " ] ");
                    } catch (InterruptedException ex) {
                        System.out.println("Error !");
                    }
                }
            }
        });
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ignored) {
            System.out.println(rainbow.red("Couldn't join threads"));
        }
        System.out.println("counter is: " + counter);
    }

    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.doWork();
    }
}