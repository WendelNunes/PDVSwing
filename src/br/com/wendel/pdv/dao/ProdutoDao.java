/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.dao;

import br.com.wendel.pdv.entity.Produto;
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
public class ProdutoDao {

    private final Connection connection;

    public ProdutoDao(Connection connection) {
        this.connection = connection;
    }

    public Produto save(Produto produto) throws Exception {
        try (PreparedStatement ps = this.connection.prepareStatement("INSERT INTO produto (codigo, descricao, id_unidade, valor) VALUES (?, ?, ?, ?) RETURNING id")) {
            int index = 0;
            ps.setString(++index, produto.getCodigo());
            ps.setString(++index, produto.getDescricao());
            ps.setLong(++index, produto.getUnidade().getId());
            ps.setBigDecimal(++index, produto.getValor());
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    produto.setId(rs.getLong("id"));
                }
            }
        }
        return produto;
    }

    public void update(Produto produto) throws Exception {
        try (PreparedStatement ps = this.connection.prepareStatement("UPDATE produto SET codigo = ?, descricao = ?, id_unidade = ?, valor = ? WHERE id = ?")) {
            int index = 0;
            ps.setString(++index, produto.getCodigo());
            ps.setString(++index, produto.getDescricao());
            ps.setLong(++index, produto.getUnidade().getId());
            ps.setBigDecimal(++index, produto.getValor());
            ps.setLong(++index, produto.getId());
            ps.executeUpdate();
        }
    }

    public void delete(Long id) throws Exception {
        try (PreparedStatement ps = this.connection.prepareStatement("DELETE FROM produto WHERE id = ?")) {
            int index = 0;
            ps.setLong(++index, id);
            ps.executeUpdate();
        }
    }

    public Produto findById(Long id) throws Exception {
        try (PreparedStatement ps = this.connection.prepareStatement("SELECT id, codigo, descricao, id_unidade, valor FROM produto WHERE id = ?")) {
            ps.setLong(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Produto(rs.getLong("id"),
                            rs.getString("codigo"),
                            rs.getString("descricao"),
                            new UnidadeDao(this.connection).findById(rs.getLong("id_unidade")),
                            rs.getBigDecimal("valor"));
                }
            }
        }
        return null;
    }

    public List<Map<String, Object>> listView(String codigo, String descricao) throws Exception {
        List<Map<String, Object>> list = new ArrayList<>();
        StringBuilder query = new StringBuilder();
        query.append("   SELECT p.id,\n");
        query.append("          p.codigo,\n");
        query.append("          p.descricao,\n");
        query.append("          u.sigla\n");
        query.append("     FROM produto p\n");
        query.append("LEFT JOIN unidade u ON u.id = p.id_unidade\n");
        if ((codigo != null && !codigo.isEmpty()) || (descricao != null && !descricao.isEmpty())) {
            query.append("WHERE\n");
        }
        if (codigo != null && !codigo.isEmpty()) {
            query.append("AND p.codigo = ?\n");
        }
        if (descricao != null && !descricao.isEmpty()) {
            query.append("AND p.descricao LIKE ?\n");
        }
        query.append("ORDER BY descricao");
        try (PreparedStatement ps = this.connection.prepareStatement(query.toString())) {
            if (codigo != null && !codigo.isEmpty()) {
                ps.setString(1, codigo);
            }
            if (descricao != null && !descricao.isEmpty()) {
                ps.setString(2, "%" + descricao + "%");
            }
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Map<String, Object> item = new HashMap<>();
                    item.put("ID", rs.getLong("id"));
                    item.put("CODIGO", rs.getString("codigo"));
                    item.put("DESCRICAO", rs.getString("descricao"));
                    item.put("UNIDADE", rs.getString("sigla"));
                    list.add(item);
                }
            }
        }
        return list;
    }
}
