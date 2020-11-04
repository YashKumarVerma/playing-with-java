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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class DatabaseWorker {
    String url = "jdbc:mysql://localhost:3306/java_db";
    String user = "smit";
    String password = "Smital";
    Connection connection = null;
    Statement statement = null;

    public DatabaseWorker() {
        try {
            this.connection = DriverManager.getConnection(url, user, password);
            this.statement = connection.createStatement();
        } catch (Exception e) {
            System.out.print("Error");
        }
    }

    public boolean insertUser(String name, String regNo, String mobile, int age) {
        try {
            final String sqlQuery = "INSERT INTO users VALUES ('" + name + "','" + regNo + "', '" + mobile + "'," + age
                    + ");";
            this.statement.executeUpdate(sqlQuery);
            return true;
        } catch (SQLException e) {
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public String[][] getAllUsers() {
        try {
            final String sqlQuery = "SELECT * FROM users WHERE 1";
            ResultSet resultSet = this.statement.executeQuery(sqlQuery);
            List<String[]> results = new ArrayList<String[]>();
            while (resultSet.next()) {
                List<String> result = new ArrayList<String>();
                String name = resultSet.getString("name");
                String reg = resultSet.getString("reg");
                String mobile = resultSet.getString("mobile");
                String age = String.valueOf(resultSet.getInt("age"));
                result.add(name);
                result.add(reg);
                result.add(mobile);
                result.add(age);
                results.add(result.toArray(new String[result.size()]));
            }
            return results.toArray(new String[results.size()][4]);
        } catch (Exception e) {
            String[][] empty = new String[0][0];
            return empty;
        }
    }
}

public class Question2 extends Application {
    public static DatabaseWorker databaseWorker = new DatabaseWorker();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(10, 10, 10, 10));
        final Label titleLabel = new Label("Enter details of user : ");
        root.setTop(titleLabel);
        GridPane center = new GridPane();
        center.setVgap(5);
        center.setHgap(5);
        TextField nameInputField = new TextField("smit gor");
        nameInputField.setPrefWidth(200);
        Label nameInputFieldLabel = new Label("Name : ");
        center.add(nameInputFieldLabel, 0, 0);
        center.add(nameInputField, 1, 0);
        TextField regInputField = new TextField("19BCT0103");
        regInputField.setPrefWidth(200);
        Label regInputFieldLabel = new Label("Reg No : ");
        center.add(regInputFieldLabel, 0, 1);
        center.add(regInputField, 1, 1);
        TextField mobileInputField = new TextField("+91 9016902747");
        mobileInputField.setPrefWidth(200);
        Label mobileInputFieldLabel = new Label("Mobile No : ");
        center.add(mobileInputFieldLabel, 0, 2);
        center.add(mobileInputField, 1, 2);
        TextField ageInputField = new TextField("19");
        ageInputField.setPrefWidth(200);
        Label ageInputFieldLabel = new Label("Age : ");
        center.add(ageInputFieldLabel, 0, 3);
        center.add(ageInputField, 1, 3);
        Label ResultLabel = new Label("");
        Label OutputLabel = new Label("Output");
        root.setBottom(ResultLabel);
        center.add(ResultLabel, 0, 6);
        center.add(OutputLabel, 0, 7);
        Button CreateNewUser = new Button("Save User");
        center.add(CreateNewUser, 0, 5);
        root.setCenter(center);
        Button ViewUsersButton = new Button("Load Data");
        center.add(ViewUsersButton, 1, 5);

        CreateNewUser.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String name = nameInputField.getText();
                String regNo = regInputField.getText();
                String mobile = mobileInputField.getText();
                int age = Integer.parseInt(ageInputField.getText());
                if (Question2.databaseWorker.insertUser(name, regNo, mobile, age)) {
                    ResultLabel.setText("New Created");
                    nameInputField.setText("");
                    ageInputField.setText("");
                    regInputField.setText("");
                    mobileInputField.setText("");
                } else {
                    ResultLabel.setText("Error Creating User");
                }
            }
        });

        ViewUsersButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                OutputLabel.setText("");
                String outputString = "";
                for (String[] user : Question2.databaseWorker.getAllUsers()) {
                    outputString = outputString + "Name : " + user[0] + "\n" + "Reg : " + user[1] + "\n" + "Mobile : "
                            + user[2] + "\n" + "Age : " + user[3] + "\n\n";
                }
                OutputLabel.setText(outputString);
            }
        });
        Scene scene = new Scene(root, 400, 200);
        primaryStage.setTitle("User Interaction - (Database)");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}