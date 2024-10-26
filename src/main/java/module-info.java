module com.example.appfaztudo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.appfaztudo to javafx.fxml;
    exports com.example.appfaztudo;
}