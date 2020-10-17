
/**
 * @author YashKumarVerma
 * @desc Program to showcase menu and event handlers 
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.control.Alert.AlertType;
import java.time.LocalDate;

/**
 * Menu Example with Event handlers
 */
public class MenuExample extends Application {

    /**
     * initialize the application
     */
    @Override
    public void init() {
        System.out.println("Initializing application.");
    }

    /**
     * main application code
     */
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("MenuBar and Event Handler | 19BCE2669");

        /** declaring menus for application */
        Menu menu = new Menu("Menu");
        MenuItem menuItemName = new MenuItem("Display Name");
        MenuItem menuItemRegNumber = new MenuItem("Display registration number");
        MenuItem menuItemDetails = new MenuItem("Display details");

        menu.getItems().add(menuItemName);
        menu.getItems().add(menuItemRegNumber);
        menu.getItems().add(menuItemDetails);

        Label message = new Label("Select options from menu to view details");
        message.setPadding(new Insets(50, 50, 50, 50));

        /** declaring event handlers */
        EventHandler<ActionEvent> NameEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                System.out.println("User selected : " + ((MenuItem) e.getSource()).getText());
                message.setText("My name is Yash Kumar Verma");
            }
        };

        EventHandler<ActionEvent> RegisterEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                System.out.println("User selected : " + ((MenuItem) e.getSource()).getText());
                message.setText("My registration number is 19BCE2669");
            }
        };

        EventHandler<ActionEvent> DetailsEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                System.out.println("User selected : " + ((MenuItem) e.getSource()).getText());
                message.setText("I am interested in learning more about javafx and event handlers.");
            }
        };

        /** binding events to menu items */
        menuItemName.setOnAction(NameEvent);
        menuItemRegNumber.setOnAction(RegisterEvent);
        menuItemDetails.setOnAction(DetailsEvent);

        /** initializing menu bar and layout box */
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(menu);

        VBox verticalBox = new VBox(menuBar, message);
        Scene scene = new Scene(verticalBox, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * cleanup stop function
     */
    @Override
    public void stop() {
        System.out.println("Application Stopped.");
    }

    public static void main(String args[]) {
        // launch the application
        launch(args);
    }
}