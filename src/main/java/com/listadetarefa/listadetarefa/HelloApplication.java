package com.listadetarefa.listadetarefa;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

;

public class HelloApplication extends Application {
    
    
    @Override
    public void start(Stage primaryStage) throws IOException{
        // Criação de um array de exemplo
        ArrayList<String> items = new ArrayList<>();
        items.addAll(ler());

        // Criação de um VBox para armazenar as Labels
        VBox vbox = new VBox();

        // Percorrer o array e adicionar uma Label para cada item
        int c = 0;
        while (items.size() > c) {
            CheckBox cb = new CheckBox(items.get(c));
            vbox.getChildren().add(cb);
            c++;
        }

        Button bt = new Button("Click Me");
        bt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Parent pagina2Parent = null;
                try {
                    pagina2Parent = FXMLLoader.load(getClass().getResource("tarefa-view.fxml"));
                    Scene pagina2Scene = new Scene(pagina2Parent);
                    Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                    stage.setScene(pagina2Scene);
                    stage.show();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        vbox.getChildren().add(bt);

        // Configuração da cena com o VBox
        Scene scene = new Scene(vbox, 300, 200);

        // Configuração do palco principal
        primaryStage.setTitle("Exemplo de Labels com JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
        

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
        launch();
    }

    public void salvar(List<Tarefa> listaTarefa){

        int c = 0;

        listaTarefa.get(0).getTitulo();

        String[] nomes = {"joao", "maria", "douglas", "clara", "amanda"};

        try {
            // Criando um FileWriter para escrever no arquivo "dados.txt"
            FileWriter writer = new FileWriter("dados.txt");
            
            // Escrevendo as variáveis no arquivo            
            while (listaTarefa.size() > c) {
                writer.write(listaTarefa.get(c).getTitulo() + ",");
                c++;
            }
            //writer.write(nome + "," + idade);
            
            // Fechando o FileWriter
            writer.close();
            
            System.out.println("Dados salvos com sucesso!");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao salvar os dados.");
            e.printStackTrace();
        }
    }

    public static ArrayList<String> ler(){
        try {
            // Criando um BufferedReader para ler o arquivo "dados.txt"
            BufferedReader reader = new BufferedReader(new FileReader("dados.txt"));
            
            // Lendo o conteúdo do arquivo
            String linha = reader.readLine();
            
            // Separando os dados (nome e idade) pelo caractere ","
            ArrayList<String> nomes = new ArrayList<String>();
            String[] dados = linha.split(",");
            
            for(int i = 0; i<=4; i++){
                nomes.add(dados[i]);
                i++;
                
                reader.close();
            }
            return nomes;

        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao carregar os dados.");
            e.printStackTrace();
            return null;

        }
    }

}