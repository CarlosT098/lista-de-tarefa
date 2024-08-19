package com.listadetarefa.listadetarefa;

public class Tarefa {
    private String nome;
    private String descricao;
    private int importancia;
    private Boolean feito;

    public Tarefa(String nome, String descricao, int importancia) {
        this.nome = nome;
        this.descricao = descricao;
        this.importancia = importancia;
        this.feito = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
