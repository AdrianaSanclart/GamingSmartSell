package com.mycompany.gamingsmartsell;

public class Sessao {
    private static Usuario usuarioLogado;

    public static Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    public static void setUsuarioLogado(Usuario usuario) {
        usuarioLogado = usuario;
    }

    public static void encerrar() {
        usuarioLogado = null;
    }
}
