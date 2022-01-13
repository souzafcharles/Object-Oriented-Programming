package souza.charles.sc3005071_p2.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class WindowPrincipal  extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        Pane graph = loader.load(getClass().getResource("WindowPrincipal.fxml"));
        Scene scene = new Scene(graph, 1000, 800);
        stage.setScene(scene);
        stage.setTitle("Lista de Partidas");
        stage.show();
    }
}