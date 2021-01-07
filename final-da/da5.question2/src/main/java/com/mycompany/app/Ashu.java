
/** libraries for database **/
import java.util.Scanner;
import java.util.logging.Handler;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Create a table for employee pay structure with the following fields
 * 
 * the basic pay for the employee and the number of days leave taken, year of
 * experience, gross salary and netsalary.
 * 
 * Gross salary is calculated as Basic Pay based on cadre(5000 for cadre1 and
 * 10000 for cadre2) + HRA + DA + GRADE PAY(3000 for (cadre1 and 4000 for
 * cadre2).
 * 
 * HRA is fixed as 30% of Basic pay and DA as 80% of Basic pay.
 * 
 * Net salary includes deduction for PF (2000 is fixed for all cadres) and leave
 * on loss of pay.
 * 
 * An employee is eligible to take 1 day leave per month, leave taken more than
 * 24 days in a calendar year is considered as loss of pay. Calculate the gross
 * and net salary.
 * 
 * 
 * 
 * CREATE TABLE salary ( basic_salary VARCHAR(10), leaves INT(8), experience
 * INT(2), gross_salary INT(8), net_salary INT(8) );
 */
class Calculate {
    public static float gross(int basic, int grade, int leaves) {
        float hra = (float) basic * 0.30f;
        float da = (float) basic * 0.80f;
        float answer = basic + hra + da + grade;

        return answer;
    }

    public static float net(int basic, int grade, int leaves) {
        float net = Calculate.gross(basic, grade, leaves);
        float perDaySalary = net / 365;

        if (leaves > 24) {
            net -= perDaySalary * (24 - leaves);
        }
        return net;
    }
}

/** class to handle all database operations */
class DatabaseWorker {

    private final String url = "jdbc:mysql://localhost:3306/ashu";
    private final String user = "yash";
    private final String password = "yash2000.";
    private Connection connection = null;
    private Statement statement = null;

    /** constructor to create a connection and store */
    public DatabaseWorker() {
        try {
            System.out.println("Connecting to database");
            this.connection = DriverManager.getConnection(this.url, this.user, this.password);
            this.statement = connection.createStatement();
            System.out.println("Database connected");

        } catch (Exception e) {
            System.out.print(e.getStackTrace());
            System.out.print(e);
            System.out.println("Error connecting to database;");
        }
    }

    /** function to return all user details as 2d array of strings */
    public String[][] getAllData() {
        {
            try {
                final String sqlQuery = "SELECT * FROM students WHERE 1";
                ResultSet resultSet = this.statement.executeQuery(sqlQuery);
                List<String[]> results = new ArrayList<String[]>();

                System.out.println("sql > " + sqlQuery);
                while (resultSet.next()) {
                    List<String> result = new ArrayList<String>();
                    String basic_salary = String.valueOf(resultSet.getInt("basic_salary"));
                    String leaves = String.valueOf(resultSet.getInt("leaves"));
                    String experience = String.valueOf(resultSet.getInt("experience"));
                    String gross_salary = String.valueOf(resultSet.getInt("gross_salary"));
                    String net_salary = String.valueOf(resultSet.getInt("net_salary"));

                    result.add(basic_salary);
                    result.add(leaves);
                    result.add(experience);
                    result.add(gross_salary);
                    result.add(net_salary);

                    results.add(result.toArray(new String[result.size()]));
                }

                return results.toArray(new String[results.size()][5]);
            } catch (Exception e) {
                System.out.println("Error while fetching results !");
                String[][] empty = new String[0][0];
                return empty;
            }
        }
    }
}

public class Ashu {

    /** create new database connection and save as data member */
    public static DatabaseWorker databaseWorker = new DatabaseWorker();

    /** launch the application */
    /**
     * CREATE TABLE students ( basic_salary INT(10), leaves INT(8), experience
     * INT(2), gross_salary INT(8), net_salary INT(8) );
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("JAVA LAB FAT");
        System.out.println("Listing all salary entries\n");
        int basic, grade, leaves;

        for (String[] column : Ashu.databaseWorker.getAllData()) {
            System.out.println("");
            System.out.print("Net Salary = ");
            basic = Integer.parseInt(column[0]);
            grade = Integer.parseInt(column[0]);
            leaves = Integer.parseInt(column[1]);
            System.out.print(Calculate.gross(basic, grade, leaves));
            System.out.println("");
            System.out.print("Gross Pay = ");
            System.out.print(Calculate.gross(basic, grade, leaves));
            System.out.println("---");
        }
    }
}