package com.listadetarefa.listadetarefa;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class IndexController {

    @FXML
    public void novasTarefa(ActionEvent event) throws IOException {
        Parent pagina2Parent = FXMLLoader.load(getClass().getResource("tarefa-view.fxml"));
        Scene pagina2Scene = new Scene(pagina2Parent);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(pagina2Scene);
        stage.show();
    }

}
