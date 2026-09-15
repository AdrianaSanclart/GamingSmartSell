package com.mycompany.gamingsmartsell;

import java.time.LocalDateTime;

public class Vendas {

    private int idVenda;
    private int quantidade;
    private String pagamento;
    private double valorUnitario;
    private double valorTotal;
    private LocalDateTime dataVenda;
    private int idProduto;
    private int idUsuario;

    private boolean estornada;
    
    public boolean isEstornada() {
    return estornada;
}

    public void setEstornada(boolean estornada) {
    this.estornada = estornada;
}
    
    public Vendas() {
    }

    public Vendas(int idVenda, int quantidade, String pagamento,
              double valorUnitario, double valorTotal,
              LocalDateTime dataVenda,
              int idProduto, int idUsuario,
              boolean estornada) {

        this.idVenda = idVenda;
        this.quantidade = quantidade;
        this.pagamento = pagamento;
        this.valorUnitario = valorUnitario;
        this.valorTotal = valorTotal;
        this.dataVenda = dataVenda;
        this.idProduto = idProduto;
        this.idUsuario = idUsuario;
        this.estornada = estornada;
}

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public LocalDateTime getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDateTime dataVenda) {
        this.dataVenda = dataVenda;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}
