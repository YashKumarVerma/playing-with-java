import java.util.Scanner;
import rainbow.rainbow;

class ClockWorker extends Thread {
    private int counter = 0;
    private final String context = "[ " + rainbow.green(this.getName()) + " ] ";

    ClockWorker() {
        System.out.println(this.context + "ClockWorker started");
    }

    @Override
    public void run() {
        try {
            while (true) {
                this.counter += 1;
                Thread.sleep(1 * 1000);
            }

        } catch (InterruptedException e) {
            System.out.println(context + "Exception !");
        }
    }

    public int getSeconds() {
        System.out.print(context);
        return this.counter;
    }
}

public class Clock {

    public static void main(String args[]) {
        String command;
        final Scanner handler = new Scanner(System.in);
        final String context = "[ " + rainbow.green(Thread.currentThread().getName()) + " ] ";

        // tell user about current thread and that counter has started
        System.out.println(context + " Time Counter started");

        // start separate thread with timer
        final ClockWorker worker = new ClockWorker();
        worker.start();

        while (true) {
            System.out.print(context + "Enter \"show\" to show live timer : ");
            command = handler.nextLine();
            if (command.equals("show")) {
                System.out.println("Seconds elapsed : " + worker.getSeconds());
            }
        }

    }
}