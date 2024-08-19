package com.listadetarefa.listadetarefa;

public class Tarefa {
    private String titulo;
    private String descricao;
    private int importancia;
    private Boolean feito;

    public Tarefa(String titulo, String descricao, int importancia) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.importancia = importancia;
        this.feito = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getImportancia() {
        return importancia;
    }

    public void setImportancia(int importancia) {
        this.importancia = importancia;
    }

    public Boolean getFeito() {
        return feito;
    }

    public void setFeito(Boolean feito) {
        this.feito = feito;
    }
}
