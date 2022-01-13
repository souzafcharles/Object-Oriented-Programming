package souza.charles.sc3005071_p2.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import souza.charles.sc3005071_p2.database.dao.ApostadorDAO;
import souza.charles.sc3005071_p2.model.Aposta;
import souza.charles.sc3005071_p2.model.Apostador;
import souza.charles.sc3005071_p2.model.ApostadorFimDeCarreira;

import java.util.List;

public class WindowPrincipalController {

    @FXML
    private Button btAtualizar;
    @FXML
    private Button btDeletar;
    @FXML
    private Button btInserir;
    @FXML
    private Button btNovoJogo;
    @FXML
    private TableColumn<Apostador, String> cApostador1;
    @FXML
    private TableColumn<Apostador, String> cApostador2;
    @FXML
    private TableColumn<Apostador, String> cGanhador;
    @FXML
    private TableColumn<Apostador, String> cJogada1;
    @FXML
    private TableColumn<Apostador, String> cJogada2;
    @FXML
    private TextField fillBusca;
    @FXML
    private Label lbBusca;
    @FXML
    private TableView<Aposta> tableView;


    ObservableList<Aposta> apostadors;
    private boolean loaded;
    private List<Aposta> tableData;
    private List<Aposta> filteredTableData;


    @FXML
    public void initialize() {
        bindTableToModel();
        bindTableToDataSource();
    }

    private void bindTableToModel() {
        cApostador1.setCellValueFactory(new PropertyValueFactory<>("jogador1"));
        cApostador2.setCellValueFactory(new PropertyValueFactory<>("jogador2"));
        cJogada1.setCellValueFactory(new PropertyValueFactory<>("jogada1"));
        cJogada2.setCellValueFactory(new PropertyValueFactory<>("jogada2"));
        cGanhador.setCellValueFactory(new PropertyValueFactory<>("ganhador"));
    }


    private void bindTableToDataSource() {
        apostadors = FXCollections.observableArrayList();
        tableView.setItems(apostadors);
    }

    public void adicionar(ActionEvent actionEvent) {
        WindowCadastroApostadorController window = new WindowCadastroApostadorController();
        Aposta selectedItem = null;
        window.showAndWait(selectedItem);
        reaload();
    }

    private void reaload() {
    }

    public void editar() {
        final Aposta selectedItem = tableView.getSelectionModel().getSelectedItem();

        if (selectedItem != null) {
            WindowCadastroApostadorController window = new WindowCadastroApostadorController();
            window.showAndWait(selectedItem);
            reaload();
        }

    }

    public void remover(ActionEvent actionEvent) {
        final Aposta selectedAnimal = tableView.getSelectionModel().getSelectedItem();
        if (selectedAnimal != null) {
            ApostadorDAO dao = new ApostadorDAO();
            loadTableView();
        }
    }

    private void loadTableView() {
    }

    public void handleRowSelection(MouseEvent mouseEvent) {
        Object selectedApostador = tableView.getSelectionModel().getSelectedItem();

        if (selectedApostador != null) {

            cApostador1.setText(selectedApostador.toString());
            if (selectedApostador instanceof ApostadorFimDeCarreira) {
                cApostador1.setText("name");
                if (selectedApostador instanceof ApostadorFimDeCarreira) {
                    cApostador2.setText("name");
                    if (((ApostadorFimDeCarreira) selectedApostador).isInterditado())
                        cApostador1.setText("nome");
                    else
                        cGanhador.setText("nome");
                }
            } else
                selectedApostador = null;
        }

    }
}