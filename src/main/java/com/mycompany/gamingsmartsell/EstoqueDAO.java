package com.mycompany.gamingsmartsell;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EstoqueDAO {

    public void cadastrar(Estoque estoque) throws SQLException {

        String sqlEstoque = """
        INSERT INTO estoque
        (idProduto, quantidadeEstoque)
        VALUES (?, ?)
        """;

        String sqlProduto = """
        UPDATE produto
        SET quantidade = ?
        WHERE idProduto = ?
        """;

        try (Connection conexao = Conexao.conectar()) {

            try {

                conexao.setAutoCommit(false);

                try (PreparedStatement stmt = conexao.prepareStatement(sqlEstoque)) {

                    stmt.setInt(1, estoque.getIdProduto());
                    stmt.setInt(2, estoque.getQuantidadeEstoque());

                    stmt.executeUpdate();
                }

                try (PreparedStatement stmt = conexao.prepareStatement(sqlProduto)) {

                    stmt.setInt(1, estoque.getQuantidadeEstoque());
                    stmt.setInt(2, estoque.getIdProduto());

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

    public List<Estoque> listarTodos() throws SQLException {

        List<Estoque> estoques = new ArrayList<>();

        String sql = """
            SELECT *
            FROM estoque
            ORDER BY idEstoque
            """;

        try (
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery()
        ) {
            while (rs.next()) {

                Estoque estoque = new Estoque();

                estoque.setIdEstoque(rs.getInt("idEstoque"));
                estoque.setIdProduto(rs.getInt("idProduto"));
                estoque.setQuantidadeEstoque(rs.getInt("quantidadeEstoque"));

                estoques.add(estoque);
            }
        }

        return estoques;
    }

    public Estoque buscarPorId(int idEstoque) throws SQLException {

        String sql = """
            SELECT *
            FROM estoque
            WHERE idEstoque = ?
            """;

        try (
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql)
        ) {
            stmt.setInt(1, idEstoque);

            try (ResultSet rs = stmt.executeQuery()) {

                if (rs.next()) {

                    Estoque estoque = new Estoque();

                    estoque.setIdEstoque(rs.getInt("idEstoque"));
                    estoque.setIdProduto(rs.getInt("idProduto"));
                    estoque.setQuantidadeEstoque(rs.getInt("quantidadeEstoque"));

                    return estoque;
                }
            }
        }

        return null;
    }

    public Estoque buscarPorProduto(int idProduto) throws SQLException {

        String sql = """
            SELECT *
            FROM estoque
            WHERE idProduto = ?
            """;

        try (
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql)
        ) {
            stmt.setInt(1, idProduto);

            try (ResultSet rs = stmt.executeQuery()) {

                if (rs.next()) {

                    Estoque estoque = new Estoque();

                    estoque.setIdEstoque(rs.getInt("idEstoque"));
                    estoque.setIdProduto(rs.getInt("idProduto"));
                    estoque.setQuantidadeEstoque(rs.getInt("quantidadeEstoque"));

                    return estoque;
                }
            }
        }

        return null;
    }

    public void atualizar(Estoque estoque) throws SQLException {

        String sqlEstoque = """
        UPDATE estoque
        SET quantidadeEstoque = ?
        WHERE idEstoque = ?
        """;

        String sqlProduto = """
        UPDATE produto
        SET quantidade = ?
        WHERE idProduto = ?
        """;

        try (Connection conexao = Conexao.conectar()) {

            try {

                conexao.setAutoCommit(false);

                try (PreparedStatement stmt = conexao.prepareStatement(sqlEstoque)) {

                    stmt.setInt(1, estoque.getQuantidadeEstoque());
                    stmt.setInt(2, estoque.getIdEstoque());

                    stmt.executeUpdate();
                }

                try (PreparedStatement stmt = conexao.prepareStatement(sqlProduto)) {

                    stmt.setInt(1, estoque.getQuantidadeEstoque());
                    stmt.setInt(2, estoque.getIdProduto());

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
    
    public List<Estoque> buscarPorNomeProduto(String nome) throws SQLException {

        List<Estoque> estoques = new ArrayList<>();

        String sql = """
            SELECT e.*
            FROM estoque e
            INNER JOIN produto p
            ON e.idProduto = p.idProduto
            WHERE p.nome LIKE ?
            AND p.ativo = TRUE
            ORDER BY p.nome
            """;

        try (
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql)
        ) {

            stmt.setString(1, "%" + nome + "%");

            try (ResultSet rs = stmt.executeQuery()) {

                while (rs.next()) {

                    Estoque estoque = new Estoque();

                    estoque.setIdEstoque(rs.getInt("idEstoque"));
                    estoque.setIdProduto(rs.getInt("idProduto"));
                    estoque.setQuantidadeEstoque(rs.getInt("quantidadeEstoque"));

                    estoques.add(estoque);
                }
            }
        }

        return estoques;
    }
    
    public java.util.List<Estoque> listarEstoqueAtivo() throws SQLException {

        java.util.List<Estoque> estoques = new java.util.ArrayList<>();

        String sql = """
            SELECT e.*
            FROM estoque e
            INNER JOIN produto p
            ON e.idProduto = p.idProduto
            WHERE p.ativo = TRUE
            ORDER BY p.nome
            """;

        try (
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery()
        ) {

            while (rs.next()) {

                Estoque estoque = new Estoque();

                estoque.setIdEstoque(rs.getInt("idEstoque"));

                estoque.setIdProduto(rs.getInt("idProduto"));

                estoque.setQuantidadeEstoque(rs.getInt("quantidadeEstoque"));

                estoques.add(estoque);
            }
        }

        return estoques;
    }
    
}
