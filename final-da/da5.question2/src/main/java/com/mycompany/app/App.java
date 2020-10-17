
/**
 * @author YashKumarVerma
 * @description Java Program to show a form and save data to database. 
 * Also show the data from the database.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

// database requirements
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class DatabaseWorker {

    private final String url = "jdbc:mysql://localhost:3306/java_db";
    private final String user = "yash";
    private final String password = "yash2000.";
    private Connection connection = null;
    private Statement statement = null;

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
}

public class App extends Application {
    private DatabaseWorker databaseWorker = null;

    public static void main(String[] args) {
        launch(args);
    }

    /** initialize application on init override */
    @Override
    public void init() {
        System.out.println("Initializing UI ");
        this.databaseWorker = new DatabaseWorker();
    }

    /** perform cleanup and release resources */
    @Override
    public void stop() {
        System.out.println("Wrapping up gui");
    }

    /** describe the application UI and functionality */
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(10, 10, 10, 10));

        Button AddUserButton;
        Label ResultLabel;

        final Label additionLabel = new Label("Enter details of user : ");
        root.setTop(additionLabel);

        ResultLabel = new Label("");
        root.setBottom(ResultLabel);

        // Create a GridPane in the center of the BorderPane
        GridPane center = new GridPane();
        center.setVgap(5);
        center.setHgap(5);

        /** defining user interaction widgets */
        TextField nameInputField = new TextField("Yash Kumar Verma");
        nameInputField.setPrefWidth(200);
        Label nameInputFieldLabel = new Label("Name : ");
        center.add(nameInputFieldLabel, 0, 0);
        center.add(nameInputField, 1, 0);

        TextField regInputField = new TextField("19BCE2669");
        regInputField.setPrefWidth(200);
        Label regInputFieldLabel = new Label("Reg No : ");
        center.add(regInputFieldLabel, 0, 1);
        center.add(regInputField, 1, 1);

        TextField mobileInputField = new TextField("+91 8864813176");
        mobileInputField.setPrefWidth(200);
        Label mobileInputFieldLabel = new Label("Mobile No : ");
        center.add(mobileInputFieldLabel, 0, 2);
        center.add(mobileInputField, 1, 2);

        TextField ageInputField = new TextField("20");
        ageInputField.setPrefWidth(200);
        Label ageInputFieldLabel = new Label("Age : ");
        center.add(ageInputFieldLabel, 0, 3);
        center.add(ageInputField, 1, 3);

        // center.add()

        AddUserButton = new Button("Save User");
        center.add(AddUserButton, 0, 5);
        root.setCenter(center);

        // Set the event handler when the button is clicked
        AddUserButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // int number1 = Integer.parseInt(TextInput1.getText());
                // int number2 = Integer.parseInt(TextInput2.getText());
                // int sum = number1 + number2;
                // ResultLabel.setText("The sum is " + sum);
            }
        });

        Scene scene = new Scene(root, 600, 200);
        primaryStage.setTitle("Compute the Sum");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
