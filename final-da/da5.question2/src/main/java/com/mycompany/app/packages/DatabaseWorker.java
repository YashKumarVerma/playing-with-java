package dbworker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseWorker {

    private final String url = "jdbc:mysql://localhost:3306/java_db";
    private final String user = "yash";
    private final String password = "yash2000.";
    private Connection connection = null;
    private Statement statement = null;

    public DatabaseWorker() {
        try {
            System.out.println("Connecting to database");
            this.connection = DriverManager.getConnection(url, user, password);
            this.statement = connection.createStatement();
            System.out.println("Database connected");

        } catch (Exception e) {
            System.out.println("Error connecting to database;");
        }
    }

    public boolean insertUser(String name, String regNo, String mobile, int age) {
        try {
            final String sqlQuery = "INSERT INTO users VALUES ('" + name + "','" + regNo + "', '" + mobile + "'," + age
                    + ");";
            System.out.println("sql > " + sqlQuery);
            this.statement.executeUpdate(sqlQuery);
            return true;
        } catch (SQLException e) {
            System.out.println("Error while inserting entry to database");
            System.out.println(e.getErrorCode());
            return false;
        } catch (Exception e) {
            System.out.println("Unhandled Exception !");
            return false;
        }
    }

    public String[][] getAllUsers() {
        try {
            final String sqlQuery = "SELECT * FROM users WHERE 1";
            ResultSet resultSet = this.statement.executeQuery(sqlQuery);
            List<String[]> results = new ArrayList<String[]>();

            System.out.println("sql > " + sqlQuery);
            while (resultSet.next()) {
                List<String> result = new ArrayList<String>();
                String name = resultSet.getString("name");
                String reg = resultSet.getString("reg");
                String mobile = resultSet.getString("mobile");
                String age = String.valueOf(resultSet.getInt("age"));

                // show data in console
                System.out.println("sql > name   : " + name);
                System.out.println("    | reg    : " + reg);
                System.out.println("    | mobile : " + mobile);
                System.out.println("    | age    : " + age);

                result.add(name);
                result.add(reg);
                result.add(mobile);
                result.add(age);

                results.add(result.toArray(new String[result.size()]));
            }

            return results.toArray(new String[results.size()][4]);
        } catch (Exception e) {
            System.out.println("Error while fetching results !");
            String[][] empty = new String[0][0];
            return empty;
        }

    }

    // public static void main(String args[]) {
    // db worker = new db();
    // for (String[] results : worker.getAllUsers()) {
    // System.out.print("sql > ");
    // for (String item : results) {
    // System.out.print(item + " ,");
    // }
    // System.out.println();
    // }
    // }
}
