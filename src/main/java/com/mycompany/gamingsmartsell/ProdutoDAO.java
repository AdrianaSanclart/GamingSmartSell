package com.mycompany.gamingsmartsell;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {
    
    public void cadastrar(Produtos produto) throws SQLException {

        String sqlProduto = """
        INSERT INTO produto
        (nome, categoria, quantidade, idFornecedor, ativo)
        VALUES (?, ?, ?, ?, ?)
        """;

        String sqlEstoque = """
        INSERT INTO estoque
        (idProduto, quantidadeEstoque)
        VALUES (?, ?)
        """;

        try (Connection conexao = Conexao.conectar()) {

            try {

                conexao.setAutoCommit(false);

                int idProdutoGerado;

                try (PreparedStatement stmt = conexao.prepareStatement(sqlProduto, java.sql.Statement.RETURN_GENERATED_KEYS)) {

                    stmt.setString(1, produto.getNome());
                    stmt.setString(2, produto.getCategoria());
                    stmt.setInt(3, produto.getQuantidade());
                    stmt.setInt(4, produto.getIdFornecedor());
                    stmt.setBoolean(5, produto.isAtivo());

                    stmt.executeUpdate();

                    try (ResultSet rs = stmt.getGeneratedKeys()) {

                        if (rs.next()) {
                            idProdutoGerado = rs.getInt(1);
                        } else {
                            throw new SQLException("Não foi possível obter o ID do produto cadastrado.");
                        }
                    }
                }

                try (PreparedStatement stmt = conexao.prepareStatement(sqlEstoque)) {

                    stmt.setInt(1, idProdutoGerado);
                    stmt.setInt(2, produto.getQuantidade());

                    stmt.executeUpdate();
                }

                conexao.commit();

            } catch (SQLException e) {

                conexao.rollback();
                throw e;

            } finally {

                conexao.setAutoCommit(true);
            }
        }
    }

    public List<Produtos> listarAtivos() throws SQLException {

        List<Produtos> produtos = new ArrayList<>();

        String sql = """
            SELECT *
            FROM produto
            WHERE ativo = TRUE
            ORDER BY idProduto
            """;

        try (
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery()
        ) {
            while (rs.next()) {

                Produtos produto = new Produtos();

                produto.setIdProduto(rs.getInt("idProduto"));
                produto.setNome(rs.getString("nome"));
                produto.setCategoria(rs.getString("categoria"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setIdFornecedor(rs.getInt("idFornecedor"));
                produto.setAtivo(rs.getBoolean("ativo"));

                produtos.add(produto);
            }
        }

        return produtos;
    }

    public Produtos buscarPorId(int idProduto) throws SQLException {

        String sql = """
            SELECT *
            FROM produto
            WHERE idProduto = ?
            """;

        try (
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql)
        ) {
            stmt.setInt(1, idProduto);

            try (ResultSet rs = stmt.executeQuery()) {

                if (rs.next()) {

                    Produtos produto = new Produtos();

                    produto.setIdProduto(rs.getInt("idProduto"));
                    produto.setNome(rs.getString("nome"));
                    produto.setCategoria(rs.getString("categoria"));
                    produto.setQuantidade(rs.getInt("quantidade"));
                    produto.setIdFornecedor(rs.getInt("idFornecedor"));
                    produto.setAtivo(rs.getBoolean("ativo"));

                    return produto;
                }
            }
        }

        return null;
    }

    public void atualizar(Produtos produto) throws SQLException {

        String sqlProduto = """
        UPDATE produto
        SET nome = ?,
        categoria = ?,
        quantidade = ?,
        idFornecedor = ?
        WHERE idProduto = ?
        """;

        String sqlEstoque = """
        UPDATE estoque
        SET quantidadeEstoque = ?
        WHERE idProduto = ?
        """;

        try (Connection conexao = Conexao.conectar()) {

            try {

                conexao.setAutoCommit(false);

                try (PreparedStatement stmt = conexao.prepareStatement(sqlProduto)) {

                    stmt.setString(1, produto.getNome());
                    stmt.setString(2, produto.getCategoria());
                    stmt.setInt(3, produto.getQuantidade());
                    stmt.setInt(4, produto.getIdFornecedor());
                    stmt.setInt(5, produto.getIdProduto());

                    stmt.executeUpdate();
                }

                try (PreparedStatement stmt = conexao.prepareStatement(sqlEstoque)) {

                    stmt.setInt(1, produto.getQuantidade());
                    stmt.setInt(2, produto.getIdProduto());

                    stmt.executeUpdate();
                }

                conexao.commit();

            } catch (SQLException e) {

                conexao.rollback();
                throw e;

            } finally {

                conexao.setAutoCommit(true);
            }
        }
    }

    public void desativar(int idProduto) throws SQLException {

        String sql = """
            UPDATE produto
            SET ativo = FALSE
            WHERE idProduto = ?
            """;

        try (
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql)
        ) {
            stmt.setInt(1, idProduto);
            stmt.executeUpdate();
        }
    }

    public List<Produtos> buscarPorNome(String termo) throws SQLException {

        java.util.List<Produtos> produtos = new java.util.ArrayList<>();

        String sql = """
            SELECT p.*
            FROM produto p
            INNER JOIN fornecedor f
            ON p.idFornecedor = f.idFornecedor
            WHERE p.ativo = TRUE
            AND (p.nome LIKE ? OR p.categoria LIKE ? OR f.nome LIKE ?)
            ORDER BY p.nome
            """;

        try (
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql)
        ) {

            String pesquisa = "%" + termo + "%";

            stmt.setString(1, pesquisa);
            stmt.setString(2, pesquisa);
            stmt.setString(3, pesquisa);

            try (ResultSet rs = stmt.executeQuery()) {

                while (rs.next()) {

                    Produtos produto = new Produtos();

                    produto.setIdProduto(rs.getInt("idProduto"));
                    produto.setNome(rs.getString("nome"));
                    produto.setCategoria(rs.getString("categoria"));
                    produto.setQuantidade(rs.getInt("quantidade"));
                    produto.setIdFornecedor(rs.getInt("idFornecedor"));
                    produto.setAtivo(rs.getBoolean("ativo"));

                    produtos.add(produto);
                }
            }
        }

        return produtos;
    }
    
        public java.util.List<Produtos> listarTodosAtivos() throws SQLException {

        java.util.List<Produtos> produtos = new java.util.ArrayList<>();

        String sql = """
            SELECT *
            FROM produto
            WHERE ativo = TRUE
            ORDER BY nome
            """;

        try (
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery()
        ) {

            while (rs.next()) {

                Produtos produto = new Produtos();

                produto.setIdProduto(rs.getInt("idProduto"));
                produto.setNome(rs.getString("nome"));
                produto.setCategoria(rs.getString("categoria"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setIdFornecedor(rs.getInt("idFornecedor"));
                produto.setAtivo(rs.getBoolean("ativo"));

                produtos.add(produto);
            }
        }

        return produtos;
    }
    
}
