
echo "Compiling javafx..."
javac --module-path /home/yash/scripts/packages/javafx-sdk-11.0.2/lib --add-modules javafx.controls,javafx.fxml -d packages/ $1.java
echo "Running javafx..."
java --module-path /home/yash/scripts/packages/javafx-sdk-11.0.2/lib --add-modules=javafx.controls -cp . $1   