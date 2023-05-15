module com.example.javafxtp1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxtp1 to javafx.fxml;
    exports com.example.javafxtp1;
}