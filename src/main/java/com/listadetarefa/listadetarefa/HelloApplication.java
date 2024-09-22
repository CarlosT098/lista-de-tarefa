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
    public void start(@SuppressWarnings("exports") Stage primaryStage) throws Exception {
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
            FileWriter writer = new FileWriter("dados.txt");
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
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("resource")
    public ArrayList<String> ler() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("dados.txt"));
            String linha = reader.readLine();
            ArrayList<String> nomes = new ArrayList<>();
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
                return new ArrayList<>();
            }

        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();

        }
    }

}