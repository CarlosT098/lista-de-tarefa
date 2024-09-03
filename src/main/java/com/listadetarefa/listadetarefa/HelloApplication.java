package com.listadetarefa.listadetarefa;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.io.IOException;

public class HelloApplication extends Application {
    
    /* 
    @Override
    public void start(Stage primaryStage) throws IOException{
        // Criação de um array de exemplo
        String[] items = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};

        // Criação de um VBox para armazenar as Labels
        VBox vbox = new VBox();

        // Percorrer o array e adicionar uma Label para cada item
        for (String item : items) {
            Label label = new Label(item);
            vbox.getChildren().add(label); // Adiciona a label no VBox
        }

        // Configuração da cena com o VBox
        Scene scene = new Scene(vbox, 300, 200);

        // Configuração do palco principal
        primaryStage.setTitle("Exemplo de Labels com JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    */

    /* 
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("index-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("index");
        stage.setScene(scene);
        stage.show();
    }
    */

    public static void main(String[] args) {
        salvar();
        //launch();
    }

    public static void salvar(){
        String nome = "João";
        int idade = 25;

        try {
            // Criando um FileWriter para escrever no arquivo "dados.txt"
            FileWriter writer = new FileWriter("dados.txt");
            
            // Escrevendo as variáveis no arquivo
            writer.write(nome + "," + idade);
            
            // Fechando o FileWriter
            writer.close();
            
            System.out.println("Dados salvos com sucesso!");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao salvar os dados.");
            e.printStackTrace();
        }
    }

    @Override
    public void start(Stage arg0) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'start'");
    }
}