package com.mycompany.gamingsmartsell;

public class Fornecedores {

    private int idFornecedor;
    private String nome;
    private String categoria;
    private boolean ativo;

    public Fornecedores() {
    }

    public Fornecedores(int idFornecedor, String nome, String categoria, boolean ativo) {
        this.idFornecedor = idFornecedor;
        this.nome = nome;
        this.categoria = categoria;
        this.ativo = ativo;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
