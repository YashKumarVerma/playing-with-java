import java.util.LinkedList;
import java.util.Stack;

class ProducerConsumerWrapper {
    // creating a stack to simulate container, LIFO
    Stack<Integer> container = new Stack<Integer>();
    int capacity = 15;
    int itemsInStack = 0;

    // Function called by producer thread
    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (this) {
                /** if container is full, wait for kitchen to make parotta */
                while (itemsInStack == capacity) {
                    System.out.println("Waiting for more parottas");
                    wait();
                }

                /** when produced, keep at top of container */
                System.out.println("Canteen produced parotta: #" + value);

                /** add parotta to container */
                container.push(value++);
                itemsInStack++;

                /** notify that consumers can take resource */
                notify();

                /** set rate at which parottas are produced */
                Thread.sleep(1000);
            }
        }
    }

    // Function called by consumer thread
    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                /** if container is empty, then ask people to wait */
                while (container.isEmpty()) {
                    System.out.println("Container empty, waiting for more parottas");
                    wait();
                }

                /** pick topmost parotta from container */
                int value = container.pop();
                itemsInStack--;

                System.out.println("Someone picked parotta #" + value);

                /** notify kitchen that parotta taken */
                notify();

                /** set rate at which people take parottas */
                Thread.sleep(1000);
            }
        }
    }
}

// VITCanteenOperations
public class VITCanteen {
    public static void main(String[] args) throws InterruptedException {
        final ProducerConsumerWrapper pc = new ProducerConsumerWrapper();

        /**
         * initializing multi-threading by attaching one thread to produce and one
         * threat to consume parottas
         */
        Thread producerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Create consumer thread
        Thread consumerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start both threads
        producerThread.start();
        consumerThread.start();
        producerThread.join();
        consumerThread.join();
    }
}