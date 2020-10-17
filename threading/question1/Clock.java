import java.util.Scanner;

class ClockWorker extends Thread {
    private int counter = 0;

    @Override
    public void run() {
        try {
            while (true) {
                this.counter += 1;
                Thread.sleep(1 * 1000);
            }

        } catch (InterruptedException e) {
            System.out.println("Exception !");
        }
    }

    public int getSeconds() {
        return this.counter;
    }
}

public class Clock {

    public static void main(String args[]) {
        Scanner handler = new Scanner(System.in);
        System.out.println("Time Counter started");
        String command;

        // start separate thread with timer
        ClockWorker worker = new ClockWorker();
        worker.start();

        while (true) {
            System.out.print("Enter yes to show live timer : ");
            command = handler.nextLine();
            if (command.equals("yes")) {
                System.out.println("Seconds elapsed : " + worker.getSeconds());
            }
        }
    }
}