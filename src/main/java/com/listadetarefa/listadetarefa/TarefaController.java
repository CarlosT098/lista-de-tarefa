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
    public void btnSalvar(ActionEvent event) throws IOException {
        Tarefa tarefa = new Tarefa(tfTitulo.getText(), tfDescricao.getText(), spImportancia.getValue());
        List<Tarefa> listaTarefa = new ArrayList<Tarefa>();
        listaTarefa.add(tarefa);
        teste.setText("Salvo!");
        HelloApplication test = new HelloApplication();
        test.salvar(listaTarefa);

        Parent pagina2Parent = FXMLLoader.load(getClass().getResource("index-view.fxml"));
        Scene pagina2Scene = new Scene(pagina2Parent);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(pagina2Scene);
        stage.show();
    }

}
