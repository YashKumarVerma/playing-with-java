import java.beans.EventHandler;

import javax.security.auth.login.AppConfigurationEntry;
import javafx.event.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
public class JavaFXMenu extends Application{
    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root,300,400);
        MenuBar menubar = new Menubar();
        Menu FileMenu = new Menu("File");
        
        MenuItem filemenu1 = new MenuItem ("New");
        filemenu1.setOnAction(action);
        FileMenu.getItems().add(filemenu1);

        MenuItem filemenu2 = new MenuItem ("Open");
        filemenu2.setOnAction(action);
        FileMenu.getItems().add(filemenu2);

        MenuItem filemenu3 = new MenuItem ("Save");
        filemenu3.setOnAction(action);
        FileMenu.getItems().add(filemenu3);
        
        MenuItem filemenu4 = new MenuItem ("Save As");
        filemenu4.setOnAction(action);
        FileMenu.getItems().add(filemenu4);
        
        MenuItem filemenu5 = new MenuItem ("Exit");
        filemenu5.setOnAction(action);
        FileMenu.getItems().add(filemenu5);

        
        Menu EditMenu = new Menu("Edit");
        MenuItem Editmenu1 = new MenuItem ("Cut");
        EditMenu1.setOnAction(action);
        EditMenu.getItems().add(Editmenu1);

        MenuItem Editmenu2 = new MenuItem ("Copy");
        EditMenu2.setOnAction(action);
        EditMenu.getItems().add(Editmenu2);

        MenuItem Editmenu3 = new MenuItem ("Paste");
        EditMenu3.setOnAction(action);
        EditMenu.getItems().add(Editmenu3);

        MenuItem Editmenu4 = new MenuItem ("Find");
        EditMenu4.setOnAction(action);
        EditMenu.getItems().add(Editmenu4);

        MenuItem Editmenu5 = new MenuItem ("Replace");
        EditMenu5.setOnAction(action);
        EditMenu.getItems().add(Editmenu5);

        MenuItem Editmenu6 = new MenuItem ("Go to");
        EditMenu6.setOnAction(action);
        EditMenu.getItems().add(Editmenu6);

        EditMenu.getItems().allAll(EditMenu1,EditMenu2,EditMenu3,EditMenu4,EditMenu5,EditMenu6);
        root.setTop(menubar);
        FileMenu.getItems().allAll(filemenu1,filemenu2,filemenu3);
        menubar.getMenus.allAll(FileMenu,EditMenu);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private EventHandler<ActionEvent> changeTabPlacement(){
        MenuItem mItem = (MenuItem) event.getSource();
        String side = mItem.getText();
        if("New".equalsIgnoreCase(side)){
            System.out.println("New selected");
        }else if ("Open".equalsIgnoreCase(side)){
            System.out.println("Open selected");
        }else if ("Save".equalsIgnoreCase(side)){
            System.out.println("Save selected");
        }else if ("Save As".equalsIgnoreCase(side)){
            System.out.println("Save As selected");
        }else if ("Exit".equalsIgnoreCase(side)){
            System.out.println("Exit selected");
        }
        if("Cut".equalsIgnoreCase(side)){
            System.out.println("Cut selected");
        }else if ("Copy".equalsIgnoreCase(side)){
            System.out.println("Copy selected");
        }else if ("Copy".equalsIgnoreCase(side)){
            System.out.println("Copy selected");
        }else if ("Paste".equalsIgnoreCase(side)){
            System.out.println("Paste selected");
        }else if ("Find".equalsIgnoreCase(side)){
            System.out.println("Find selected");
        }else if ("Replace".equalsIgnoreCase(side)){
            System.out.println("Replace selected");
        }else if ("Go to".equalsIgnoreCase(side)){
            System.out.println("Go to selected");
        }
    }   
}