package com.listadetarefa.listadetarefa;

import java.io.IOException;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Node;

public class HelloController {

    @FXML
    private VBox vboxContainer;

    @FXML
    public void initialize() {
        HelloApplication helloApplication = new HelloApplication();
        ArrayList<String> items = new ArrayList<>();
        items.addAll(helloApplication.ler());

        int c = 0;
        while (items.size() > c) {
            CheckBox cb = new CheckBox(items.get(c));
            vboxContainer.getChildren().add(cb);
            c++;
        }
    }

    @FXML
    public void novasTarefa(ActionEvent event) throws IOException {
        Parent pagina2Parent = FXMLLoader.load(getClass().getResource("tarefa-view.fxml"));
        Scene pagina2Scene = new Scene(pagina2Parent);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(pagina2Scene);
        stage.show();

    }
}
