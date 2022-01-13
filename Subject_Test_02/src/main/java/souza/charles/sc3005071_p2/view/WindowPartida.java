package souza.charles.sc3005071_p2.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import souza.charles.sc3005071_p2.controller.WindowPartidaController;
import souza.charles.sc3005071_p2.database.utils.NotDataFoundException;

import java.io.IOException;

public class WindowPartida {

    public void start() throws NotDataFoundException {
        FXMLLoader loader =  new FXMLLoader();
        try {
            Pane graph = loader.load(getClass().getResource("WindowPartida.fxml").openStream());
            Scene scene = new Scene(graph, 900,800);
            WindowPartidaController ctrl = loader.getController();
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new NotDataFoundException("Não foi possível carregar!");
        }
    }
}
