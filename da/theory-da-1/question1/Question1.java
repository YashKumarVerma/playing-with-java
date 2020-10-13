import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

class SharedData {
    public static int counter = 0;
}

class ThreadWorker implements Runnable {
    public void run() {
        System.out.println("Thread Initiated, counter = " + SharedData.counter);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Thread name : " + Thread.currentThread().getName());
                System.out.println("Counter : " + SharedData.counter);
            }
        }, 0, 1000);
        SharedData.counter++;
    }
}

public class Question1 {

    public static void main(String main[]) {
        String choice;
        Scanner handler = new Scanner(System.in);
        System.out.println("Counter : " + SharedData.counter);
        List<ThreadWorker> threadStorage = new ArrayList<ThreadWorker>();

        do {
            ThreadWorker temp = new ThreadWorker();
            temp.run();
            threadStorage.add(temp);

            System.out.print("Do you want to invoke more threads : y/n ");
            choice = handler.nextLine();
        } while (choice.equals("y"));
        handler.close();
    }
}
