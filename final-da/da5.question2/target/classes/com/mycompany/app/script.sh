echo "Compiling..."
javac --module-path /home/yash/scripts/packages/javafx-sdk-11.0.2/lib --add-modules javafx.controls,javafx.fxml $1.java
echo "Running..."
java --module-path /home/yash/scripts/packages/javafx-sdk-11.0.2/lib --add-modules=javafx.controls -cp . $1   