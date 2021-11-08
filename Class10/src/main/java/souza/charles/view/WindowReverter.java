package souza.charles.view;
/*
Subject title: Object-Oriented Programming
Lecturer: Prof. Dr. Lucas Bueno Ruas de Oliveira
Example adapted by: Charles Fernandes de Souza
Date: October 25, 2021
*/
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class WindowReverter extends Application {
    private TextField tfInput;
    private Label lbResult, lbInput;
    private Button btnExecute;
    private WindowReverterController ctrl = new WindowReverterController(this);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        lbInput = new Label("Input:");
        tfInput = new TextField();
        tfInput.setPromptText("Input text");
        lbResult = new Label("Result:");
        btnExecute = new Button("Revert");
        btnExecute.setOnAction(e -> ctrl.reverseInput());

        VBox layout = new VBox();
        layout.setSpacing(10);
        layout.setPadding(new Insets(10,10,10,10));
        layout.setAlignment(Pos.BASELINE_LEFT);
        layout.getChildren().addAll(lbInput,tfInput,btnExecute,lbResult);

        Scene scene = new Scene(layout, 600, 80);

        stage.setTitle("String Reverter");
        stage.setScene(scene);
        stage.show();
    }

    public String getInput(){
        return tfInput.getText();
    }

    public void setResult(String text){
        lbResult.setText("Result: " + text);
    }
}
