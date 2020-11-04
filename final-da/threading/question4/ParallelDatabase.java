
/** libraries for database **/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import rainbow.rainbow;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/** class to handle all database operations */
class DatabaseWorker extends Thread {
    private final String url = "jdbc:mysql://localhost:3306/java_db";
    private final String user = "yash";
    private final String password = "yash2000.";
    private Connection connection = null;
    private Statement statement = null;
    private final String context = "[ " + rainbow.green(this.getName()) + " ] ";

    public void run() {
        System.out.println(context + "database connected");
    }

    /** constructor to create a connection and store */
    public DatabaseWorker() {
        try {
            System.out.println(this.context + "Connecting to database");
            this.connection = DriverManager.getConnection(this.url, this.user, this.password);
            this.statement = connection.createStatement();
            System.out.println(this.context + "Database connected");

        } catch (Exception e) {
            System.out.println(this.context + "Error connecting to database;");
        }
    }

    /** function to insert a new user into database */
    public boolean insertUser(String name, String regNo, String mobile, int age) {
        try {
            final String sqlQuery = "INSERT INTO users VALUES ('" + name + "','" + regNo + "', '" + mobile + "'," + age
                    + ");";
            System.out.println(this.context + "sql > " + sqlQuery);
            this.statement.executeUpdate(sqlQuery);
            return true;
        } catch (SQLException e) {
            System.out.println(this.context + "Error while inserting entry to database");
            System.out.println(e.getErrorCode());
            return false;
        } catch (Exception e) {
            System.out.println(this.context + "Unhandled Exception !");
            return false;
        }
    }
}

/** main worker class */
public class ParallelDatabase {

    public static void main(String args[]) throws Exception {
        final String context = "[ " + rainbow.green(Thread.currentThread().getName()) + " ] ";
        ExecutorService executor = Executors.newFixedThreadPool(10);

        // create 10 parallel connections and insert data
        for (int i = 0; i < 10; i++) {
            Runnable worker = new MyRunnable(i);
            executor.execute(worker);
        }

        // wait for all operations
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println(context + "Finished Writing.");
    }

    public static class MyRunnable implements Runnable {
        private final int index;
        private DatabaseWorker worker = new DatabaseWorker();

        MyRunnable(int index) {
            this.index = index;
        }

        @Override
        public void run() {
            this.worker.insertUser("user_" + this.index, "19BCE00" + this.index, "pass@" + this.index,
                    (20 + this.index) % 30);
        }
    }
}