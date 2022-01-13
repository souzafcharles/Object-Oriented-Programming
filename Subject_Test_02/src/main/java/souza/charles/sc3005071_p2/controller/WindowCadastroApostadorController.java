package souza.charles.sc3005071_p2.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import souza.charles.sc3005071_p2.database.dao.ApostadorDAO;
import souza.charles.sc3005071_p2.model.Aposta;
import souza.charles.sc3005071_p2.model.Apostador;

public class WindowCadastroApostadorController {

    @FXML private Button btIncluir;
    @FXML private ChoiceBox<?> cbInterditado;
    @FXML private Label lbCPFCadastro;
    @FXML private Label lbIdade;
    @FXML private Label lbInterditado;
    @FXML private Label lbNomeCadastro;
    @FXML private Label lbTelefoneCadastro;
    @FXML private TextField txtCPF;
    @FXML private TextField txtIdade;
    @FXML private TextField txtNome;

    public void start() {
    }

    public void showAndWait(Aposta selectedItem) {
        txtNome.setText("");
        txtCPF.setText("");
        txtIdade.setText("");
    }

    public void save(ActionEvent actionEvent) {
        Apostador apostador = new Apostador() {
            @Override
            public Integer calculaDivorcios() {
                return null;
            }
        };
        apostador.setNome(txtNome.getText());
        apostador.setCpf(txtCPF.getText());
        apostador.setIdade(Integer.parseInt(txtIdade.getText()));
        boolean interditado = true;
        apostador.setInterditado(interditado);
        ApostadorDAO a = new ApostadorDAO();
    }

}