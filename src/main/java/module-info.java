module com.example.teamcity {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.teamcity to javafx.fxml;
    exports com.example.teamcity;
}