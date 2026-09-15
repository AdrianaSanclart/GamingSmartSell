package com.mycompany.gamingsmartsell;

import java.time.LocalDateTime;

public class Relatorios {

    private int idRelatorio;
    private String nomeRelatorio;
    private LocalDateTime dataGeracao;
    private int idUsuario;

    public Relatorios() {
    }

    public Relatorios(int idRelatorio, String nomeRelatorio,
           LocalDateTime dataGeracao, int idUsuario) {

        this.idRelatorio = idRelatorio;
        this.nomeRelatorio = nomeRelatorio;
        this.dataGeracao = dataGeracao;
        this.idUsuario = idUsuario;
    }

    public int getIdRelatorio() {
        return idRelatorio;
    }

    public void setIdRelatorio(int idRelatorio) {
        this.idRelatorio = idRelatorio;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public void setNomeRelatorio(String nomeRelatorio) {
        this.nomeRelatorio = nomeRelatorio;
    }

    public LocalDateTime getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(LocalDateTime dataGeracao) {
        this.dataGeracao = dataGeracao;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}
