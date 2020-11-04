import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import rainbow.rainbow;

class Server extends Thread {
    private final String context = "[ " + rainbow.green(this.getName()) + " ] ";
    public static BlockingQueue<String> messages = new LinkedBlockingQueue<String>();

    public Server() {
        System.out.println(this.context + " Server initialized");
    }

    public void run() {
        while (true) {
            String message;
            while ((message = Server.messages.poll()) != null) {
                System.out.println(this.context + "got message from " + message);
            }
        }
    }
}

class Client extends Thread {
    private String context;
    private String name;
    private int coolDownTime;

    public Client(String name, int coolDownTime) {
        this.name = name;
        this.coolDownTime = coolDownTime;
        this.context = "[ " + rainbow.green(this.getName()) + " ] " + rainbow
                .dim(rainbow.italic(" [ " + this.name + " pinging every " + this.coolDownTime / 1000 + " seconds ] "));
    }

    public void run() {
        int messageNumber = 1;
        while (true) {
            try {
                Server.messages.put(this.context + " message #" + messageNumber);
                messageNumber++;
                this.sleep(this.coolDownTime);
            } catch (InterruptedException e) {
                System.out.println(this.context + "Error Sending message");
            }
        }
    }
}

public class Communication {
    public static void main(String args[]) {
        Server server = new Server();
        server.start();

        Client client1 = new Client("client:1", 1 * 2 * 1000);
        Client client2 = new Client("client:2", 2 * 2 * 1000);
        Client client3 = new Client("client:3", 3 * 2 * 1000);
        Client client4 = new Client("client:4", 4 * 2 * 1000);
        // Client client5 = new Client("client:5", 5 * 1000);
        // Client client6 = new Client("client:6", 6 * 1000);
        // Client client7 = new Client("client:7", 7 * 1000);
        // Client client8 = new Client("client:8", 8 * 1000);

        // start all clients
        client1.start();
        client2.start();
        client3.start();
        client4.start();
        // client5.start();
        // client6.start();
        // client7.start();
        // client8.start();
    }
}
