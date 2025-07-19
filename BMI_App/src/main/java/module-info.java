module com.tu.bmi_app {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.tu.bmi_app to javafx.fxml;
    exports com.tu.bmi_app;
}
