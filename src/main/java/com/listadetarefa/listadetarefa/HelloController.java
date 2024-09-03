package com.listadetarefa.listadetarefa;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class HelloController {
     @FXML
    private VBox vbox;

    public void initialize() {
        // Criação de um array de exemplo
        String[] items = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};

        // Percorrer o array e adicionar uma Label para cada item
        for (String item : items) {
            Label label = new Label(item);
            vbox.getChildren().add(label); // Adiciona a label no VBox
        }
    }
}