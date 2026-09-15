package com.mycompany.gamingsmartsell;

public class Produtos {

    private int idProduto;
    private String nome;
    private String categoria;
    private int quantidade;
    private int idFornecedor;
    private boolean ativo;

    public Produtos() {
    }

    public Produtos(int idProduto, String nome, String categoria,
                    int quantidade, int idFornecedor, boolean ativo) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.idFornecedor = idFornecedor;
        this.ativo = ativo;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
