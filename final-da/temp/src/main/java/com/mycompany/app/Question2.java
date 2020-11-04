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

class DB {
    Connection connection;
    Statement statement;

    public DB() {
        try {
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db", "yash", "yash2000.");
            this.statement = connection.createStatement();
        } catch (Exception e) {
            System.out.print("Error");
        }
    }

    public boolean createNew(String n, String r, String m, int a) {
        try {
            String q = "INSERT INTO users VALUES ('" + n + "','" + r + "', '" + m + "'," + a + ");";
            this.statement.executeUpdate(q);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String[][] getAllUsers() {
        try {
            String q = "SELECT * FROM users WHERE 1";
            ResultSet rs = this.statement.executeQuery(q);
            List<String[]> results = new ArrayList<String[]>();
            while (rs.next()) {
                List<String> result = new ArrayList<String>();
                result.add(rs.getString("name"));
                result.add(rs.getString("reg"));
                result.add(rs.getString("mobile"));
                result.add(String.valueOf(rs.getInt("age")));
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
    public static DB databaseWorker = new DB();

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(15, 15, 15, 15));
        GridPane center = new GridPane();
        center.setVgap(10);
        center.setHgap(10);
        TextField InputFieldName = new TextField("rajdeep savani");
        InputFieldName.setPrefWidth(200);
        Label InputFieldNameLabel = new Label("Name : ");
        center.add(InputFieldNameLabel, 0, 0);
        center.add(InputFieldName, 1, 0);
        TextField regInputField = new TextField("19BCE0001");
        regInputField.setPrefWidth(200);
        Label regInputFieldLabel = new Label("Reg No : ");
        center.add(regInputFieldLabel, 0, 1);
        center.add(regInputField, 1, 1);
        TextField mobileInputField = new TextField("+91 9887789988");
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
                String name = InputFieldName.getText();
                String regNo = regInputField.getText();
                String mobile = mobileInputField.getText();
                int age = Integer.parseInt(ageInputField.getText());
                if (Question2.databaseWorker.createNew(name, regNo, mobile, age)) {
                    ResultLabel.setText("Created");
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
        primaryStage.setTitle("Rajdeep Savani");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}