class ThreadGenerator implements Runnable {
    public void run() {
        System.out.print("Running !");
    }
}

public class multi_interface {
    public static void main(String args[]) {
        ThreadGenerator newThread = new ThreadGenerator();
        newThread.start();
    }
}
