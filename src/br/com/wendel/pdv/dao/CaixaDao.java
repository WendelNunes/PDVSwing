/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.dao;

import br.com.wendel.pdv.entity.Caixa;
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
public class CaixaDao {

    private final Connection connection;

    public CaixaDao(Connection connection) {
        this.connection = connection;
    }

    public Caixa salvar(Caixa caixa) throws Exception {
        try (PreparedStatement ps = this.connection.prepareStatement("INSERT INTO caixa (codigo, descricao) VALUES (?, ?) RETURNING id")) {
            int index = 0;
            ps.setString(++index, caixa.getCodigo());
            ps.setString(++index, caixa.getDescricao());
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    caixa.setId(rs.getLong("id"));
                }
            }
        }
        return caixa;
    }

    public void atualizar(Caixa caixa) throws Exception {
        try (PreparedStatement ps = this.connection.prepareStatement("UPDATE caixa SET codigo = ?, descricao = ? WHERE id = ?")) {
            int index = 0;
            ps.setString(++index, caixa.getCodigo());
            ps.setString(++index, caixa.getDescricao());
            ps.setLong(++index, caixa.getId());
            ps.executeUpdate();
        }
    }

    public void deletar(Long id) throws Exception {
        try (PreparedStatement ps = this.connection.prepareStatement("DELETE FROM caixa WHERE id = ?")) {
            int index = 0;
            ps.setLong(++index, id);
            ps.executeUpdate();
        }
    }

    public List<Map<String, Object>> listarTela() throws Exception {
        List<Map<String, Object>> list = new ArrayList<>();
        try (PreparedStatement ps = this.connection.prepareStatement("SELECT id, codigo, descricao FROM caixa")) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Map<String, Object> item = new HashMap<>();
                    item.put("ID", rs.getLong("id"));
                    item.put("CODIGO", rs.getString("codigo"));
                    item.put("DESCRICAO", rs.getString("descricao"));
                    list.add(item);
                }
            }
        }
        return list;
    }

    public Caixa procurarPorId(Long id) throws Exception {
        try (PreparedStatement ps = this.connection.prepareStatement("SELECT id, codigo, descricao FROM caixa WHERE id = ?")) {
            ps.setLong(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Caixa(rs.getLong("id"), rs.getString("codigo"), rs.getString("descricao"));
                }
            }
        }
        return null;
    }
}
