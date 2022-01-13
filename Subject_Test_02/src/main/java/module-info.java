module souza.charles.sc3005071_p2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires sqlite.jdbc;

    opens souza.charles.sc3005071_p2.view to javafx.fxml;
    opens souza.charles.sc3005071_p2.model to javafx.fxml;
    opens souza.charles.sc3005071_p2.controller to javafx.fxml;

    exports souza.charles.sc3005071_p2.view;
    exports souza.charles.sc3005071_p2.model;
    exports souza.charles.sc3005071_p2.controller;
}