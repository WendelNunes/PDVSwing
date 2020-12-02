/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.dao;

import br.com.wendel.pdv.entity.MotivoMovimentacaoEstoque;
import br.com.wendel.pdv.entity.TipoMotivoMovimentacaoEstoque;
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
public class MotivoMovimentacaoEstoqueDao {

    private final Connection connection;

    public MotivoMovimentacaoEstoqueDao(Connection connection) {
        this.connection = connection;
    }

    public MotivoMovimentacaoEstoque salvar(MotivoMovimentacaoEstoque motivoMovimentacaoEstoque) throws Exception {
        try (PreparedStatement ps = this.connection.prepareStatement("INSERT INTO motivo_movim_estoque (codigo, descricao, tipo) VALUES (?, ?, ?) RETURNING id")) {
            int index = 0;
            ps.setString(++index, motivoMovimentacaoEstoque.getCodigo());
            ps.setString(++index, motivoMovimentacaoEstoque.getDescricao());
            ps.setString(++index, motivoMovimentacaoEstoque.getTipo().getId());
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    motivoMovimentacaoEstoque.setId(rs.getLong("id"));
                }
            }
        }
        return motivoMovimentacaoEstoque;
    }

    public void atualizar(MotivoMovimentacaoEstoque motivoMovimentacaoEstoque) throws Exception {
        try (PreparedStatement ps = this.connection.prepareStatement("UPDATE motivo_movim_estoque SET codigo = ?, descricao = ?, tipo = ? WHERE id = ?")) {
            int index = 0;
            ps.setString(++index, motivoMovimentacaoEstoque.getCodigo());
            ps.setString(++index, motivoMovimentacaoEstoque.getDescricao());
            ps.setString(++index, motivoMovimentacaoEstoque.getTipo().getId());
            ps.setLong(++index, motivoMovimentacaoEstoque.getId());
            ps.executeUpdate();
        }
    }

    public void deletar(Long id) throws Exception {
        try (PreparedStatement ps = this.connection.prepareStatement("DELETE FROM motivo_movim_estoque WHERE id = ?")) {
            int index = 0;
            ps.setLong(++index, id);
            ps.executeUpdate();
        }
    }

    public List<Map<String, Object>> listarTela() throws Exception {
        List<Map<String, Object>> list = new ArrayList<>();
        try (PreparedStatement ps = this.connection.prepareStatement("SELECT id, codigo, descricao, tipo FROM motivo_movim_estoque")) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Map<String, Object> item = new HashMap<>();
                    item.put("ID", rs.getLong("id"));
                    item.put("CODIGO", rs.getString("codigo"));
                    item.put("DESCRICAO", rs.getString("descricao"));
                    TipoMotivoMovimentacaoEstoque tipo = TipoMotivoMovimentacaoEstoque.get(rs.getString("tipo"));
                    item.put("ID_TIPO", tipo.getId());
                    item.put("DESC_TIPO", tipo.getDescricao());
                    list.add(item);
                }
            }
        }
        return list;
    }

    public MotivoMovimentacaoEstoque procurarPorId(Long id) throws Exception {
        try (PreparedStatement ps = this.connection.prepareStatement("SELECT id, codigo, descricao, tipo FROM motivo_movim_estoque WHERE id = ?")) {
            ps.setLong(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new MotivoMovimentacaoEstoque(rs.getLong("id"), rs.getString("codigo"), rs.getString("descricao"), TipoMotivoMovimentacaoEstoque.get(rs.getString("tipo")));
                }
            }
        }
        return null;
    }
}
