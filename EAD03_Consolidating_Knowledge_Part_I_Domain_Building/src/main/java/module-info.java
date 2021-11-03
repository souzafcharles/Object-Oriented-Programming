module souza.charles {
    requires javafx.controls;
    requires javafx.fxml;

    opens souza.charles to javafx.fxml;
    exports souza.charles;
}
