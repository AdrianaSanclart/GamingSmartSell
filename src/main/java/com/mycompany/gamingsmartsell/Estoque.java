package com.mycompany.gamingsmartsell;

public class Estoque {

    private int idEstoque;
    private int idProduto;
    private int quantidadeEstoque;

    public Estoque() {
    }

    public Estoque(int idEstoque, int idProduto, int quantidadeEstoque) {
        this.idEstoque = idEstoque;
        this.idProduto = idProduto;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getIdEstoque() {
        return idEstoque;
    }

    public void setIdEstoque(int idEstoque) {
        this.idEstoque = idEstoque;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}
