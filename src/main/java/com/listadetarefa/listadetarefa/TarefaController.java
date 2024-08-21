package com.listadetarefa.listadetarefa;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;
import java.util.List;

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
    public void btnSalvar(){
        Tarefa tarefa = new Tarefa(tfTitulo.getText(), tfDescricao.getText(), spImportancia.getValue());
        List<Tarefa> listaTarefa = new ArrayList<Tarefa>();
        listaTarefa.add(tarefa);
        teste.setText("Salvo!");
    }

}
