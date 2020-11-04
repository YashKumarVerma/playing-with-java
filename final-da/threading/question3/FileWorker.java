import java.net.URI;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import rainbow.rainbow;

class FileWriterThread extends Thread {
    private String data;
    private String fileName;
    private FileWriter fileWriter = null;
    private final String context = "[ " + rainbow.green(this.getName()) + " ] ";

    public FileWriterThread(String fileName, String data) throws IOException {
        System.out.println(this.context + "File Writer Thread initialized");
        this.data = data;
        this.fileName = fileName;
        this.fileWriter = new FileWriter("./" + fileName);
    }

    @Override
    public void run() {
        try {
            this.fileWriter.write(this.data);
            System.out.println(this.context + "Data written to file : " + this.fileName);
        } catch (IOException e) {
            System.out.print(e);
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(this.context + "File Writer closed.");
        this.fileWriter.close();
    }
}

class FileDownloader extends Thread {
    private String fileUrl;
    private String fileName;
    private final String context = "[ " + rainbow.green(this.getName()) + " ] ";

    public FileDownloader(String fileUrl, String fileName) {
        System.out.println(this.context + "File Downloader Thread initialized");
        this.fileUrl = fileUrl;
        this.fileName = fileName;
    }

    public void run() {
        try {
            final HttpClient client = HttpClient.newHttpClient();
            final HttpRequest request = HttpRequest.newBuilder().uri(URI.create(this.fileUrl)).build();
            final HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            final String dataToWriteToFile = response.body();
            final FileWriterThread fileWriterThread = new FileWriterThread(this.fileName, dataToWriteToFile);
            fileWriterThread.start();

        } catch (Exception e) {
            System.out.println(this.context + "Error downloading webpage");
        }
    }
}

public class FileWorker {

    public static void main(final String[] args) {
        final Scanner handler = new Scanner(System.in);
        final String context = "[ " + rainbow.green(Thread.currentThread().getName()) + " ] ";

        // take input of url
        System.out.print(context + rainbow.italic("Enter url of the page you want to save : "));
        String url = handler.nextLine();

        // take input of filename
        System.out.print(context + rainbow.italic("Enter name of file you want to save webpage as :"));
        String fileName = handler.nextLine();

        // download file
        FileDownloader fileDownloader = new FileDownloader(url, fileName);
        fileDownloader.start();

        System.out.println(context + "Your file is downloading now.");

        handler.close();
    }
}