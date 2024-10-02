module com.example.lab922 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab922 to javafx.fxml;
    exports com.example.lab922;
}