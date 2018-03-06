/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.dao;

import br.com.wendel.pdv.entity.Unidade;
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
public class UnidadeDao {

    private final Connection connection;

    public UnidadeDao(Connection connection) {
        this.connection = connection;
    }

    public Unidade save(Unidade unidade) throws Exception {
        try (PreparedStatement ps = this.connection.prepareStatement("INSERT INTO unidade (descricao, sigla) VALUES (?, ?) RETURNING id")) {
            int index = 0;
            ps.setString(++index, unidade.getDescricao());
            ps.setString(++index, unidade.getSigla());
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    unidade.setId(rs.getLong("id"));
                }
            }
        }
        return unidade;
    }

    public void update(Unidade unidade) throws Exception {
        try (PreparedStatement ps = this.connection.prepareStatement("UPDATE unidade SET descricao = ?, sigla = ? WHERE id = ?")) {
            int index = 0;
            ps.setString(++index, unidade.getDescricao());
            ps.setString(++index, unidade.getSigla());
            ps.setLong(++index, unidade.getId());
            ps.executeUpdate();
        }
    }

    public List<Map<String, Object>> listView() throws Exception {
        List<Map<String, Object>> list = new ArrayList<>();
        try (PreparedStatement ps = this.connection.prepareStatement("SELECT id, descricao, sigla FROM unidade")) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Map<String, Object> item = new HashMap<>();
                    item.put("ID", rs.getLong("id"));
                    item.put("SIGLA", rs.getString("sigla"));
                    item.put("DESCRICAO", rs.getString("descricao"));
                    list.add(item);
                }
            }
        }
        return list;
    }
}
