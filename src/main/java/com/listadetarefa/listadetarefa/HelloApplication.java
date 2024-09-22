package com.listadetarefa.listadetarefa;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        primaryStage.setTitle("Lista de Tarefas");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void salvar(List<Tarefa> listaTarefa, List<String> atual) {
        listaTarefa.get(0).getTitulo();

        try {
            // Criando um FileWriter para escrever no arquivo "dados.txt"
            FileWriter writer = new FileWriter("dados.txt");

            // Escrevendo as variáveis no arquivo
            int c = 0;
            while (listaTarefa.size() > c) {
                writer.write(listaTarefa.get(c).getTitulo() + ",");
                c++;
            }
            c = 0;
            while (atual.size() > c) {
                writer.write(atual.get(c) + ",");
                c++;
            }

            // Fechando o FileWriter
            writer.close();

            System.out.println("Dados salvos com sucesso!");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao salvar os dados.");
            e.printStackTrace();
        }
    }

    public ArrayList<String> ler() {
        try {
            // Criando um BufferedReader para ler o arquivo "dados.txt"
            BufferedReader reader = new BufferedReader(new FileReader("dados.txt"));

            // Lendo o conteúdo do arquivo
            String linha = reader.readLine();

            // Separando os dados (nome e idade) pelo caractere ","
            ArrayList<String> nomes = new ArrayList<String>();
            String[] dados = linha.split(",");
            int c = 0;
            if (dados.length > 0) {
                while (dados.length > c) {
                    nomes.add(dados[c]);
                    c++;

                    reader.close();
                }
                return nomes;
            } else {
                return null;
            }

        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao carregar os dados.");
            e.printStackTrace();
            return null;

        }
    }

}