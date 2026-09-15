package com.mycompany.gamingsmartsell;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RelatorioDAO {

    public void cadastrar(Relatorios relatorio) throws SQLException {

        String sql = """
            INSERT INTO relatorio
            (nomeRelatorio, dataGeracao, idUsuario)
            VALUES (?, ?, ?)
            """;

        try (
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql)
        ) {

            stmt.setString(1, relatorio.getNomeRelatorio());

            stmt.setTimestamp(2, java.sql.Timestamp.valueOf(relatorio.getDataGeracao()));

            stmt.setInt(3, relatorio.getIdUsuario());

            stmt.executeUpdate();
        }
    }

    public List<Relatorios> listarTodos() throws SQLException {

        List<Relatorios> relatorios = new ArrayList<>();

        String sql = """
            SELECT *
            FROM relatorio
            ORDER BY dataGeracao DESC
            """;

        try (
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery()
        ) {

            while (rs.next()) {

                Relatorios relatorio = new Relatorios();

                relatorio.setIdRelatorio(rs.getInt("idRelatorio"));

                relatorio.setNomeRelatorio(rs.getString("nomeRelatorio"));

                relatorio.setDataGeracao(rs.getTimestamp("dataGeracao").toLocalDateTime());

                relatorio.setIdUsuario(rs.getInt("idUsuario"));

                relatorios.add(relatorio);
            }
        }

        return relatorios;
    }

    public Relatorios buscarPorId(int idRelatorio) throws SQLException {

        String sql = """
            SELECT *
            FROM relatorio
            WHERE idRelatorio = ?
            """;

        try (
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql)
        ) {

            stmt.setInt(1, idRelatorio);

            try (ResultSet rs = stmt.executeQuery()) {

                if (rs.next()) {

                    Relatorios relatorio = new Relatorios();

                    relatorio.setIdRelatorio(rs.getInt("idRelatorio"));

                    relatorio.setNomeRelatorio(rs.getString("nomeRelatorio"));

                    relatorio.setDataGeracao(rs.getTimestamp("dataGeracao").toLocalDateTime());

                    relatorio.setIdUsuario(rs.getInt("idUsuario"));

                    return relatorio;
                }
            }
        }

        return null;
    }
}
