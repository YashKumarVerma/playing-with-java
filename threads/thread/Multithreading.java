
class ThreadGenerator extends Thread {
    public void run() {
        System.out.println("Thread Created");

    }
}

public class Multithreading {
    public static void main(String args[]) {
        ThreadGenerator newThread = new ThreadGenerator();
        newThread.start();
    }
}