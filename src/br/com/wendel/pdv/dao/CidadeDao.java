/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.dao;

import br.com.wendel.pdv.entity.Cidade;
import br.com.wendel.pdv.entity.Estado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author INLOC
 */
public class CidadeDao {

    private final Connection connection;

    public CidadeDao(Connection connection) {
        this.connection = connection;
    }

    public Cidade salvar(Cidade cidade) throws Exception {
        try (PreparedStatement ps = this.connection.prepareStatement("INSERT INTO cidade (descricao, estado) VALUES (?, ?) RETURNING id")) {
            int index = 0;
            ps.setString(++index, cidade.getDescricao());
            ps.setString(++index, cidade.getEstado().getId());
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    cidade.setId(rs.getLong("id"));
                }
            }
        }
        return cidade;
    }

    public void atualizar(Cidade cidade) throws Exception {
        try (PreparedStatement ps = this.connection.prepareStatement("UPDATE cidade SET descricao = ?, estado = ? WHERE id = ?")) {
            int index = 0;
            ps.setString(++index, cidade.getDescricao());
            ps.setString(++index, cidade.getEstado().getId());
            ps.setLong(++index, cidade.getId());
            ps.executeUpdate();
        }
    }

    public void deletar(Long id) throws Exception {
        try (PreparedStatement ps = this.connection.prepareStatement("DELETE FROM cidade WHERE id = ?")) {
            int index = 0;
            ps.setLong(++index, id);
            ps.executeUpdate();
        }
    }

    public List<Map<String, Object>> listarTela(String descricao, Estado estado, Integer limit) throws Exception {
        List<Map<String, Object>> list = new ArrayList<>();
        StringBuilder query = new StringBuilder();
        query.append("  SELECT id,\n");
        query.append("         descricao,\n");
        query.append("         estado\n");
        query.append("    FROM cidade\n");
        StringBuilder filtro = new StringBuilder();
        if (descricao != null && !descricao.isEmpty()) {
            filtro.append("LOWER(descricao) LIKE ?\n");
        }
        if (estado != null) {
            filtro.append(!filtro.toString().isEmpty() ? "AND " : "").append("estado = ?\n");
        }
        if (!filtro.toString().isEmpty()) {
            query.append("WHERE ").append(filtro);
        }
        query.append("ORDER BY descricao");
        if (limit != null && limit > 0) {
            query.append("   LIMIT ").append(limit);
        }
        try (PreparedStatement ps = this.connection.prepareStatement(query.toString())) {
            Integer index = 0;
            if (descricao != null && !descricao.isEmpty()) {
                ps.setString(++index, (descricao.trim().length() > 3 ? "%" : "") + descricao.trim().toLowerCase() + "%");
            }
            if (estado != null) {
                ps.setString(++index, estado.getId());
            }
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Map<String, Object> item = new HashMap<>();
                    item.put("ID", rs.getLong("id"));
                    item.put("DESCRICAO", rs.getString("descricao"));
                    Estado es = Estado.get(rs.getString("estado"));
                    item.put("ID_ESTADO", es.getId());
                    item.put("DESC_ESTADO", es.getDescricao());
                    list.add(item);
                }
            }
        }
        return list;
    }

    public Cidade procurarPorId(Long id) throws Exception {
        try (PreparedStatement ps = this.connection.prepareStatement("SELECT id, descricao, estado FROM cidade WHERE id = ?")) {
            ps.setLong(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Cidade(rs.getLong("id"), rs.getString("descricao"), Estado.get(rs.getString("estado")));
                }
            }
        }
        return null;
    }
}
