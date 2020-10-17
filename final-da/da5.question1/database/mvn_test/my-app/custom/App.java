
import java.sql.Connection;
import java.sql.DriverManager;

class App {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            // connect way #1
            String url1 = "jdbc:mysql://localhost:3306/java_db";
            String user = "yash";
            String password = "yash2000.";

            Connection conn1 = DriverManager.getConnection(url1, user, password);
            if (conn1 != null) {
                System.out.println("Connected to the database test1");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}