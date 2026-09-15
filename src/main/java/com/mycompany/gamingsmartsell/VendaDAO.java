package com.mycompany.gamingsmartsell;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VendaDAO {

    public void cadastrar(Vendas venda) throws SQLException {

        String sqlVenda = """
            INSERT INTO venda
            (quantidade, pagamento, valorUnitario, valorTotal,
             dataVenda, idProduto, idUsuario)
            VALUES (?, ?, ?, ?, ?, ?, ?)
            """;

        String sqlBuscarEstoque = """
            SELECT idEstoque, quantidadeEstoque
            FROM estoque
            WHERE idProduto = ?
            FOR UPDATE
            """;

        String sqlAtualizarEstoque = """
            UPDATE estoque
            SET quantidadeEstoque = ?
            WHERE idProduto = ?
            """;

        String sqlAtualizarProduto = """
            UPDATE produto
            SET quantidade = ?
            WHERE idProduto = ?
            """;

        try (Connection conexao = Conexao.conectar()) {

            try {

                conexao.setAutoCommit(false);

                int quantidadeAtual;

                try (PreparedStatement stmt =
                        conexao.prepareStatement(sqlBuscarEstoque)) {

                    stmt.setInt(1, venda.getIdProduto());

                    try (ResultSet rs = stmt.executeQuery()) {

                        if (!rs.next()) {
                            throw new SQLException("Produto não possui registro de estoque.");
                        }

                        quantidadeAtual = rs.getInt("quantidadeEstoque");
                    }
                }

                if (venda.getQuantidade() > quantidadeAtual) {
                    throw new SQLException("Estoque insuficiente. Quantidade disponível: " + quantidadeAtual);
                }

                int novaQuantidade = quantidadeAtual - venda.getQuantidade();

                try (PreparedStatement stmt = conexao.prepareStatement(sqlVenda)) {

                    stmt.setInt(1, venda.getQuantidade());
                    stmt.setString(2, venda.getPagamento());
                    stmt.setDouble(3, venda.getValorUnitario());
                    stmt.setDouble(4, venda.getValorTotal());
                    stmt.setTimestamp(5, java.sql.Timestamp.valueOf(venda.getDataVenda()));
                    stmt.setInt(6, venda.getIdProduto());
                    stmt.setInt(7, venda.getIdUsuario());

                    stmt.executeUpdate();
                }

                try (PreparedStatement stmt = conexao.prepareStatement(sqlAtualizarEstoque)) {

                    stmt.setInt(1, novaQuantidade);
                    stmt.setInt(2, venda.getIdProduto());

                    stmt.executeUpdate();
                }

                try (PreparedStatement stmt = conexao.prepareStatement(sqlAtualizarProduto)) {

                    stmt.setInt(1, novaQuantidade);
                    stmt.setInt(2, venda.getIdProduto());

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

    public List<Vendas> listarTodas() throws SQLException {

        List<Vendas> vendas = new ArrayList<>();

        String sql = """
            SELECT *
            FROM venda
            WHERE estornada = FALSE
            ORDER BY dataVenda DESC
            """;

        try (
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery()
        ) {

            while (rs.next()) {

                Vendas venda = new Vendas();

                venda.setIdVenda(rs.getInt("idVenda"));
                venda.setQuantidade(rs.getInt("quantidade"));
                venda.setPagamento(rs.getString("pagamento"));
                venda.setValorUnitario(rs.getDouble("valorUnitario"));
                venda.setValorTotal(rs.getDouble("valorTotal"));
                venda.setDataVenda(rs.getTimestamp("dataVenda").toLocalDateTime());
                venda.setIdProduto(rs.getInt("idProduto"));
                venda.setIdUsuario(rs.getInt("idUsuario"));
                venda.setEstornada(rs.getBoolean("estornada"));

                vendas.add(venda);
            }
        }

        return vendas;
    }

    public Vendas buscarPorId(int idVenda) throws SQLException {

        String sql = """
            SELECT *
            FROM venda
            WHERE idVenda = ?
            """;

        try (
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql)
        ) {

            stmt.setInt(1, idVenda);

            try (ResultSet rs = stmt.executeQuery()) {

                if (rs.next()) {

                    Vendas venda = new Vendas();

                    venda.setIdVenda(rs.getInt("idVenda"));
                    venda.setQuantidade(rs.getInt("quantidade"));
                    venda.setPagamento(rs.getString("pagamento"));
                    venda.setValorUnitario(rs.getDouble("valorUnitario"));
                    venda.setValorTotal(rs.getDouble("valorTotal"));
                    venda.setDataVenda(rs.getTimestamp("dataVenda").toLocalDateTime());
                    venda.setIdProduto(rs.getInt("idProduto"));
                    venda.setIdUsuario(rs.getInt("idUsuario"));
                    venda.setEstornada(rs.getBoolean("estornada"));

                    return venda;
                }
            }
        }

        return null;
    }

    public List<Vendas> buscarPorProduto(String nomeProduto) throws SQLException {

        List<Vendas> vendas = new ArrayList<>();

        String sql = """
            SELECT v.*
            FROM venda v
            INNER JOIN produto p 
            ON v.idProduto = p.idProduto
            WHERE p.nome LIKE ?
            AND v.estornada = FALSE
            ORDER BY v.dataVenda DESC
            """;

        try (
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql)
        ) {

            stmt.setString(1, "%" + nomeProduto + "%");

            try (ResultSet rs = stmt.executeQuery()) {

                while (rs.next()) {

                Vendas venda = new Vendas();

                venda.setIdVenda(rs.getInt("idVenda"));
                venda.setQuantidade(rs.getInt("quantidade"));
                venda.setPagamento(rs.getString("pagamento"));
                venda.setValorUnitario(rs.getDouble("valorUnitario"));
                venda.setValorTotal(rs.getDouble("valorTotal"));
                venda.setDataVenda(rs.getTimestamp("dataVenda").toLocalDateTime());
                venda.setIdProduto(rs.getInt("idProduto"));
                venda.setIdUsuario(rs.getInt("idUsuario"));
                venda.setEstornada(rs.getBoolean("estornada"));

                vendas.add(venda);
            }
        }
    }

    return vendas;
}
     
        public void estornar(int idVenda) throws SQLException {

        String sqlBuscarVenda = """
            SELECT *
            FROM venda
            WHERE idVenda = ?
              AND estornada = FALSE
            FOR UPDATE
            """;

        String sqlBuscarEstoque = """
            SELECT quantidadeEstoque
            FROM estoque
            WHERE idProduto = ?
            FOR UPDATE
            """;

        String sqlAtualizarVenda = """
            UPDATE venda
            SET estornada = TRUE
            WHERE idVenda = ?
            """;

        String sqlAtualizarEstoque = """
            UPDATE estoque
            SET quantidadeEstoque = ?
            WHERE idProduto = ?
            """;

        String sqlAtualizarProduto = """
            UPDATE produto
            SET quantidade = ?
            WHERE idProduto = ?
            """;

        try (Connection conexao = Conexao.conectar()) {

            try {

                conexao.setAutoCommit(false);

                int idProduto;
                int quantidadeVenda;

                try (PreparedStatement stmt = conexao.prepareStatement(sqlBuscarVenda)) {

                    stmt.setInt(1, idVenda);

                    try (ResultSet rs = stmt.executeQuery()) {

                        if (!rs.next()) {
                            throw new SQLException("Venda não encontrada ou já estornada.");
                        }

                        idProduto = rs.getInt("idProduto");
                        quantidadeVenda = rs.getInt("quantidade");
                    }
                }

                int quantidadeAtual;

                try (PreparedStatement stmt = conexao.prepareStatement(sqlBuscarEstoque)) {

                    stmt.setInt(1, idProduto);

                    try (ResultSet rs = stmt.executeQuery()) {

                        if (!rs.next()) {
                            throw new SQLException("Estoque do produto não encontrado.");
                        }

                        quantidadeAtual = rs.getInt("quantidadeEstoque");
                    }
                }

                int novaQuantidade = quantidadeAtual + quantidadeVenda;

                try (PreparedStatement stmt = conexao.prepareStatement(sqlAtualizarVenda)) {

                    stmt.setInt(1, idVenda);
                    stmt.executeUpdate();
                }

                try (PreparedStatement stmt = conexao.prepareStatement(sqlAtualizarEstoque)) {

                    stmt.setInt(1, novaQuantidade);
                    stmt.setInt(2, idProduto);
                    stmt.executeUpdate();
                }

                try (PreparedStatement stmt = conexao.prepareStatement(sqlAtualizarProduto)) {

                    stmt.setInt(1, novaQuantidade);
                    stmt.setInt(2, idProduto);
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
        
        public java.util.List<Vendas> listarPorPeriodo(
            java.time.LocalDate dataInicial,
            java.time.LocalDate dataFinal) throws SQLException {

        java.util.List<Vendas> vendas = new java.util.ArrayList<>();

        String sql = """
            SELECT *
            FROM venda
            WHERE estornada = FALSE
            AND dataVenda BETWEEN ? AND ?
            ORDER BY dataVenda
            """;

        try (
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql)
        ) {

            java.time.LocalDateTime inicio = dataInicial.atStartOfDay();

            java.time.LocalDateTime fim = dataFinal.atTime(23, 59, 59);

            stmt.setTimestamp(1, java.sql.Timestamp.valueOf(inicio));

            stmt.setTimestamp(2, java.sql.Timestamp.valueOf(fim));

            try (ResultSet rs = stmt.executeQuery()) {

                while (rs.next()) {

                    Vendas venda = new Vendas();

                    venda.setIdVenda(rs.getInt("idVenda"));
                    venda.setQuantidade(rs.getInt("quantidade"));
                    venda.setPagamento(rs.getString("pagamento"));
                    venda.setValorUnitario(rs.getDouble("valorUnitario"));
                    venda.setValorTotal(rs.getDouble("valorTotal"));
                    venda.setDataVenda(rs.getTimestamp("dataVenda").toLocalDateTime());
                    venda.setIdProduto(rs.getInt("idProduto"));
                    venda.setIdUsuario(rs.getInt("idUsuario"));
                    venda.setEstornada(rs.getBoolean("estornada"));

                    vendas.add(venda);
                }
            }
        }

        return vendas;
    }   
}
