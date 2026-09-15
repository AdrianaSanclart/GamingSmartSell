package com.mycompany.gamingsmartsell;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FornecedorDAO {
    public void cadastrar(Fornecedores fornecedor) throws SQLException {

        String sql = """
            INSERT INTO fornecedor
            (nome, categoria, ativo)
            VALUES (?, ?, ?)
            """;

        try (
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql)
        ) {

            stmt.setString(1, fornecedor.getNome());
            stmt.setString(2, fornecedor.getCategoria());
            stmt.setBoolean(3, fornecedor.isAtivo());

            stmt.executeUpdate();
        }
    }

    public List<Fornecedores> listarAtivos() throws SQLException {

        List<Fornecedores> fornecedores = new ArrayList<>();

        String sql = """
            SELECT *
            FROM fornecedor
            WHERE ativo = TRUE
            ORDER BY idFornecedor
            """;

        try (
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery()
        ) {

            while (rs.next()) {

                Fornecedores fornecedor = new Fornecedores();

                fornecedor.setIdFornecedor(rs.getInt("idFornecedor"));
                fornecedor.setNome(rs.getString("nome"));
                fornecedor.setCategoria(rs.getString("categoria"));
                fornecedor.setAtivo(rs.getBoolean("ativo"));

                fornecedores.add(fornecedor);
            }
        }

        return fornecedores;
    }

    public Fornecedores buscarPorId(int idFornecedor) throws SQLException {

        String sql = """
            SELECT *
            FROM fornecedor
            WHERE idFornecedor = ?
            """;

        try (
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql)
        ) {

            stmt.setInt(1, idFornecedor);

            try (ResultSet rs = stmt.executeQuery()) {

                if (rs.next()) {

                    Fornecedores fornecedor = new Fornecedores();

                    fornecedor.setIdFornecedor(rs.getInt("idFornecedor"));
                    fornecedor.setNome(rs.getString("nome"));
                    fornecedor.setCategoria(rs.getString("categoria"));
                    fornecedor.setAtivo(rs.getBoolean("ativo"));

                    return fornecedor;
                }
            }
        }

        return null;
    }

    public void atualizar(Fornecedores fornecedor) throws SQLException {

        String sql = """
            UPDATE fornecedor
            SET nome = ?,
            categoria = ?
            WHERE idFornecedor = ?
            """;

        try (
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql)
        ) {

            stmt.setString(1, fornecedor.getNome());
            stmt.setString(2, fornecedor.getCategoria());
            stmt.setInt(3, fornecedor.getIdFornecedor());

            stmt.executeUpdate();
        }
    }

    public void desativar(int idFornecedor) throws SQLException {

        String sql = """
            UPDATE fornecedor
            SET ativo = FALSE
            WHERE idFornecedor = ?
            """;

        try (
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql)
        ) {

            stmt.setInt(1, idFornecedor);

            stmt.executeUpdate();
        }
    }

    public List<Fornecedores> buscar(String termo) throws SQLException {

        List<Fornecedores> fornecedores = new ArrayList<>();

        String sql = """
            SELECT *
            FROM fornecedor
            WHERE ativo = TRUE
            AND (nome LIKE ? OR categoria LIKE ?)
            ORDER BY nome
            """;

        try (
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql)
        ) {

            String pesquisa = "%" + termo + "%";

            stmt.setString(1, pesquisa);
            stmt.setString(2, pesquisa);

            try (ResultSet rs = stmt.executeQuery()) {

                while (rs.next()) {

                    Fornecedores fornecedor = new Fornecedores();

                    fornecedor.setIdFornecedor(rs.getInt("idFornecedor"));

                    fornecedor.setNome(rs.getString("nome"));

                    fornecedor.setCategoria(rs.getString("categoria"));

                    fornecedor.setAtivo(rs.getBoolean("ativo"));

                    fornecedores.add(fornecedor);
                }
            }
        }

        return fornecedores;
    }      
}
