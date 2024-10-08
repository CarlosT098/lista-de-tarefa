package com.listadetarefa.listadetarefa;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class TarefaController {
    
    @FXML
    private Label teste;

    @FXML
    private TextField tfTitulo;

    @FXML
    private TextField tfDescricao;

    @FXML
    private Spinner<Integer> spImportancia;

    @FXML
    public void btnSalvar(@SuppressWarnings("exports") ActionEvent event) throws IOException {

        if(tfTitulo == null){
            Tarefa tarefa = new Tarefa(tfTitulo.getText(), tfDescricao.getText(), spImportancia.getValue());
        List<Tarefa> listaTarefa = new ArrayList<>();
        HelloApplication application = new HelloApplication();
        listaTarefa.add(tarefa);
        teste.setText("Salvo!");
        HelloApplication test = new HelloApplication();
        test.salvar(listaTarefa, application.ler());

        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Dynamic Labels Example");
        stage.setScene(new Scene(root, 300, 275));
        stage.show();
        }else{
            Alert dialogoErro = new Alert(Alert.AlertType.ERROR);
            dialogoErro.setTitle("Diálogo de Error");
            dialogoErro.setHeaderText("Digite novamente");
            dialogoErro.setContentText("Dados incompletos");
            dialogoErro.showAndWait();
        }

    }

}
