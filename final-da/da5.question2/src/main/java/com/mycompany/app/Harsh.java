
/**
 * @author YashKumarVerma
 * @description Java Program to show a form and save data to database. 
 * Also show the data from the database.
 */

/** libraries for javafx */
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

/** libraries for database **/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/** class to handle all database operations */
class DatabaseWorker {

    private final String url = "jdbc:mysql://localhost:3306/java_db";
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

    /** function to insert a new user into database */
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

    /** function to return all user details as 2d array of strings */
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

/** Application to handle UI */
public class App extends Application {

    /** create new database connection and save as data member */
    public static DatabaseWorker databaseWorker = new DatabaseWorker();

    /** launch the UI */
    public static void main(String[] args) {
        System.out.println("Starting UI suite");
        launch(args);
    }

    /** initialize application on init override */
    @Override
    public void init() {
        System.out.println("Launching UI");
    }

    /** perform cleanup and release resources */
    @Override
    public void stop() {
        System.out.println("Wrapping up UI");
    }

    /** describe the application UI and functionality */
    @Override
    public void start(Stage primaryStage) throws Exception {
        /** UI frame with padding */
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(10, 10, 10, 10));

        final Label titleLabel = new Label("Enter details of user : ");
        root.setTop(titleLabel);

        /** Create a GridPane in the center of the BorderPane */
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

        /** creating labels to show data to user */
        Label ResultLabel = new Label("");
        Label OutputLabel = new Label("Output");
        root.setBottom(ResultLabel);
        center.add(ResultLabel, 0, 6);
        center.add(OutputLabel, 0, 7);

        /** describe button to add user */
        Button AddUserButton = new Button("Save User");
        center.add(AddUserButton, 0, 5);
        root.setCenter(center);

        /** describe button to load users */
        Button ShowUserButton = new Button("Load Data");
        center.add(ShowUserButton, 1, 5);

        /** binding event handler to AddUserButton */
        AddUserButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // save details and show message to user
                String name = nameInputField.getText();
                String regNo = regInputField.getText();
                String mobile = mobileInputField.getText();
                int age = Integer.parseInt(ageInputField.getText());

                // save data to database
                if (App.databaseWorker.insertUser(name, regNo, mobile, age)) {
                    ResultLabel.setText("New User Created");
                    nameInputField.setText("");
                    ageInputField.setText("");
                    regInputField.setText("");
                    mobileInputField.setText("");
                } else {
                    ResultLabel.setText("Error Creating User");
                }
            }
        });

        /** binding event handler to ShowUserButton */
        ShowUserButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                OutputLabel.setText("");
                String outputString = "";
                for (String[] user : App.databaseWorker.getAllUsers()) {
                    outputString = outputString + "Name   : " + user[0] + "\n" + "Reg    : " + user[1] + "\n"
                            + "Mobile : " + user[2] + "\n" + "Age    : " + user[3] + "\n\n";

                }
                OutputLabel.setText(outputString);

            }
        });

        /** set application size, title and display to user */
        Scene scene = new Scene(root, 600, 200);
        primaryStage.setTitle("User Interaction | 19BCE2669");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
