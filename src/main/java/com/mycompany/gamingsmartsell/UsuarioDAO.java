package com.mycompany.gamingsmartsell;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

        public Usuario cadastrar(Usuario usuario) throws SQLException {

        String sql = """
        INSERT INTO usuario
        (nome, email, cpf, cargo, senha, ativo)
        VALUES (?, ?, ?, ?, ?, ?)
        """;

    try (
        Connection conexao = Conexao.conectar();
        PreparedStatement stmt = conexao.prepareStatement(sql)
    ) {

        stmt.setString(1, usuario.getNome());
        stmt.setString(2, usuario.getEmail());
        stmt.setString(3, usuario.getCpf());
        stmt.setString(4, usuario.getCargo());
        stmt.setString(5, usuario.getSenha());
        stmt.setBoolean(6, usuario.isAtivo());

        stmt.executeUpdate();
    }

    return null;
    }

    public List<Usuario> listarAtivos() throws SQLException {

        List<Usuario> usuarios = new ArrayList<>();

        String sql = """
            SELECT *
            FROM usuario
            WHERE ativo = TRUE
            ORDER BY idUsuario
            """;

        try (
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery()
        ) {

            while (rs.next()) {

                Usuario usuario = new Usuario();

                usuario.setIdUsuario(
                        rs.getInt("idUsuario")
                );

                usuario.setNome(
                        rs.getString("nome")
                );

                usuario.setEmail(
                        rs.getString("email")
                );

                usuario.setCpf(
                        rs.getString("cpf")
                );

                usuario.setCargo(
                        rs.getString("cargo")
                );

                usuario.setSenha(
                        rs.getString("senha")
                );

                usuario.setAtivo(
                        rs.getBoolean("ativo")
                );

                usuarios.add(usuario);
            }
        }

        return usuarios;
    }

    public void atualizar(Usuario usuario) throws SQLException {

        String sql = """
            UPDATE usuario
            SET nome = ?,
                email = ?,
                cpf = ?,
                cargo = ?,
                senha = ?
            WHERE idUsuario = ?
        """;

        try (
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql)
        ) {

            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getCpf());
            stmt.setString(4, usuario.getCargo());
            stmt.setString(5, usuario.getSenha());
            stmt.setInt(6, usuario.getIdUsuario());

            stmt.executeUpdate();
        }
    }

    public void desativar(int idUsuario) throws SQLException {

        String sql = """
            UPDATE usuario
            SET ativo = FALSE
            WHERE idUsuario = ?
        """;

        try (
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql)
        ) {

            stmt.setInt(1, idUsuario);

            stmt.executeUpdate();
        }
    }
    
    public Usuario buscarPorId(int idUsuario) throws SQLException {

        String sql = """
            SELECT *
            FROM usuario
            WHERE idUsuario = ?
        """;

        try (
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql)
        ) {

            stmt.setInt(1, idUsuario);

            try (ResultSet rs = stmt.executeQuery()) {

                if (rs.next()) {

                    Usuario usuario = new Usuario();

                    usuario.setIdUsuario(rs.getInt("idUsuario"));
                    usuario.setNome(rs.getString("nome"));
                    usuario.setEmail(rs.getString("email"));
                    usuario.setCpf(rs.getString("cpf"));
                    usuario.setCargo(rs.getString("cargo"));
                    usuario.setSenha(rs.getString("senha"));
                    usuario.setAtivo(rs.getBoolean("ativo"));

                    return usuario;
            }
        }
    }

    return null;
  }
    
    public java.util.List<Usuario> buscar(String termo) throws SQLException {

    java.util.List<Usuario> usuarios = new java.util.ArrayList<>();

    String sql = """
        SELECT *
        FROM usuario
        WHERE ativo = TRUE
        AND (nome LIKE ? OR email LIKE ? OR cpf LIKE ?)
        ORDER BY nome
        """;

    try (
        Connection conexao = Conexao.conectar();
        PreparedStatement stmt = conexao.prepareStatement(sql)) 
    {

        String pesquisa = "%" + termo + "%";

        stmt.setString(1, pesquisa);
        stmt.setString(2, pesquisa);
        stmt.setString(3, pesquisa);

        try (ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {

                Usuario usuario = new Usuario();

                usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setCargo(rs.getString("cargo"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setAtivo(rs.getBoolean("ativo"));

                usuarios.add(usuario);
            }
        }
    }

    return usuarios;
  }   

    public Usuario autenticar(String email, String senha) throws SQLException {

        String sql = """
            SELECT *
            FROM usuario
            WHERE email = ?
            AND senha = ?
            AND ativo = TRUE
            """;

        try (
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql)
        ) {

            stmt.setString(1, email);
            stmt.setString(2, senha);

            try (ResultSet rs = stmt.executeQuery()) {

                if (rs.next()) {

                    Usuario usuario = new Usuario();

                    usuario.setIdUsuario(rs.getInt("idUsuario"));
                    usuario.setNome(rs.getString("nome"));
                    usuario.setEmail(rs.getString("email"));
                    usuario.setCpf(rs.getString("cpf"));
                    usuario.setCargo(rs.getString("cargo"));
                    usuario.setSenha(rs.getString("senha"));
                    usuario.setAtivo(rs.getBoolean("ativo"));

                    return usuario;
                }
            }
        }

        return null;
    }
    
        public java.util.List<Usuario> listarTodosAtivos() throws SQLException {

        java.util.List<Usuario> usuarios = new java.util.ArrayList<>();

        String sql = """
            SELECT *
            FROM usuario
            WHERE ativo = TRUE
            ORDER BY nome
            """;

        try (
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery()
        ) {

            while (rs.next()) {

                Usuario usuario = new Usuario();

                usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setCargo(rs.getString("cargo"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setAtivo(rs.getBoolean("ativo"));

                usuarios.add(usuario);
            }
        }

        return usuarios;
    }
    
}
