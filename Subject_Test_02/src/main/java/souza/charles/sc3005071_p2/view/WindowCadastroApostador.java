package souza.charles.sc3005071_p2.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import souza.charles.sc3005071_p2.controller.WindowCadastroApostadorController;
import souza.charles.sc3005071_p2.database.utils.NotDataFoundException;

import java.io.IOException;

public class WindowCadastroApostador {

    public void start() throws NotDataFoundException {
        FXMLLoader loader =  new FXMLLoader();
        try {
            Pane graph = loader.load(getClass().getResource("WindowCadastroApostador.fxml").openStream());
            Scene scene = new Scene(graph, 600, 400);
            WindowCadastroApostadorController ctrl = loader.getController();
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new NotDataFoundException("Não foi possível carregar!");
        }
    }
}

