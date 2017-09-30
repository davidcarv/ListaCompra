package com.example.david.listacompras;

/**
 * Created by David on 29/09/2017.
 */

public class Item {

    private String quantidade;
    private String nome;
    private String tipo;

    Item(String quantidade, String nome, String tipo) {
        this.quantidade = quantidade;
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
