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

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();
        // Margin of 10 pixels
        root.setPadding(new Insets(10, 10, 10, 10));

        Button AddButton;
        TextField TextInput1, TextInput2;
        Label sumLabel;

        // Add a label message in the top. We create the
        // label without a named reference since the label
        // is read-only; we never change it so no reference is needed.
        final Label additionLabel = new Label("Enter an integer into each textbox.");
        root.setTop(additionLabel);

        // The label that will display the sum goes into the bottom.
        // Initially it is just a blank string.
        sumLabel = new Label("");
        root.setBottom(sumLabel);

        // Create a GridPane in the center of the BorderPane
        GridPane center = new GridPane();
        center.setVgap(5);
        center.setHgap(5);

        TextInput1 = new TextField("10");
        TextInput1.setPrefWidth(200);
        Label TextInput1Label = new Label("Number 1");

        TextInput2 = new TextField("20");
        TextInput2.setPrefWidth(200);
        Label TextInput2Label = new Label("Number 2");

        center.add(TextInput1Label, 0, 0);
        center.add(TextInput2Label, 0, 1);
        center.add(TextInput1, 1, 0);
        center.add(TextInput2, 1, 1);
        AddButton = new Button("Add Numbers");
        center.add(AddButton, 1, 2);
        root.setCenter(center);

        // Set the event handler when the button is clicked
        AddButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int number1 = Integer.parseInt(TextInput1.getText());
                int number2 = Integer.parseInt(TextInput2.getText());
                int sum = number1 + number2;
                sumLabel.setText("The sum is " + sum);
            }
        });

        Scene scene = new Scene(root, 450, 150);
        primaryStage.setTitle("Compute the Sum");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
