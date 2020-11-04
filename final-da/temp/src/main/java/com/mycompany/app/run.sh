echo "Compile Script by YashKumarVerma/19BCE2669"
echo "Compiling: javac --module-path /home/yash/scripts/packages/javafx-sdk-11.0.2/lib:com/mysql --add-modules javafx.controls,javafx.fxml App.java"
javac --module-path /home/yash/scripts/packages/javafx-sdk-11.0.2/lib:com/mysql --add-modules javafx.controls,javafx.fxml $1.java

echo "Executing: java --module-path /home/yash/scripts/packages/javafx-sdk-11.0.2/lib:packages/com/mysql --add-modules=javafx.controls -cp . App"
java --module-path /home/yash/scripts/packages/javafx-sdk-11.0.2/lib:packages/com/mysql --add-modules=javafx.controls -cp . $1   