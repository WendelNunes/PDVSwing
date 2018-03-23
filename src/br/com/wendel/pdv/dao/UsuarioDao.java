/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.dao;

import br.com.wendel.pdv.entity.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author INLOC01
 */
public class UsuarioDao {

    private final Connection connection;

    public UsuarioDao(Connection connection) {
        this.connection = connection;
    }

    public Usuario save(Usuario usuario) throws Exception {
        try (PreparedStatement ps = this.connection.prepareStatement("INSERT INTO usuario (codigo, senha) VALUES (?, ?) RETURNING id")) {
            int index = 0;
            ps.setString(++index, usuario.getCodigo());
            ps.setString(++index, usuario.getSenha());
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    usuario.setId(rs.getLong("id"));
                }
            }
        }
        return usuario;
    }

    public void update(Usuario usuario) throws Exception {
        try (PreparedStatement ps = this.connection.prepareStatement("UPDATE usuario SET codigo = ?, senha = ? WHERE id = ?")) {
            int index = 0;
            ps.setString(++index, usuario.getCodigo());
            ps.setString(++index, usuario.getSenha());
            ps.setLong(++index, usuario.getId());
            ps.executeUpdate();
        }
    }

    public void delete(Long id) throws Exception {
        try (PreparedStatement ps = this.connection.prepareStatement("DELETE FROM usuario WHERE id = ?")) {
            int index = 0;
            ps.setLong(++index, id);
            ps.executeUpdate();
        }
    }

    public List<Map<String, Object>> listView() throws Exception {
        List<Map<String, Object>> list = new ArrayList<>();
        try (PreparedStatement ps = this.connection.prepareStatement("SELECT id, codigo, senha FROM usuario")) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Map<String, Object> item = new HashMap<>();
                    item.put("ID", rs.getLong("id"));
                    item.put("CODIGO", rs.getString("codigo"));
                    item.put("SENHA", rs.getString("senha"));
                    list.add(item);
                }
            }
        }
        return list;
    }

    public Usuario findById(Long id) throws Exception {
        try (PreparedStatement ps = this.connection.prepareStatement("SELECT id, codigo, senha FROM usuario WHERE id = ?")) {
            ps.setLong(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Usuario(rs.getLong("id"), rs.getString("codigo"), rs.getString("senha"));
                }
            }
        }
        return null;
    }

    public Usuario findByCodigo(String codigo) throws Exception {
        try (PreparedStatement ps = this.connection.prepareStatement("SELECT id, codigo, senha FROM usuario WHERE codigo = ?")) {
            ps.setString(1, codigo);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Usuario(rs.getLong("id"), rs.getString("codigo"), rs.getString("senha"));
                }
            }
        }
        return null;
    }
}
