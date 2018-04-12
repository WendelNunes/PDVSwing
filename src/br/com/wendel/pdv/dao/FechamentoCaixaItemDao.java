/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.dao;

import br.com.wendel.pdv.entity.FechamentoCaixa;
import br.com.wendel.pdv.entity.FechamentoCaixaItem;
import br.com.wendel.pdv.entity.FormaPagamento;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author INLOC01
 */
public class FechamentoCaixaItemDao {

    private final Connection connection;

    public FechamentoCaixaItemDao(Connection connection) {
        this.connection = connection;
    }

    public FechamentoCaixaItem salvar(FechamentoCaixaItem fechamentoCaixaItem) throws Exception {
        try (PreparedStatement ps = this.connection.prepareStatement(
                "INSERT INTO fechamento_caixa_item (id_fechamento_caixa, forma_pagamento, valor) VALUES (?, ?) RETURNING id")) {
            int index = 0;
            ps.setLong(++index, fechamentoCaixaItem.getFechamentoCaixa().getId());
            ps.setInt(++index, fechamentoCaixaItem.getFormaPagamento().getId());
            ps.setBigDecimal(++index, fechamentoCaixaItem.getValor());
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    fechamentoCaixaItem.setId(rs.getLong("id"));
                }
            }
        }
        return fechamentoCaixaItem;
    }

    public List<FechamentoCaixaItem> listarPorIdFechamento(Long idFechamentoCaixa) throws SQLException {
        List<FechamentoCaixaItem> lista = new ArrayList<>();
        try (PreparedStatement ps = this.connection.prepareStatement(
                "SELECT id, forma_pagamento, valor FROM fechamento_caixa_item WHERE id_fechamento_caixa = ?")) {
            int index = 0;
            ps.setLong(++index, idFechamentoCaixa);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    lista.add(new FechamentoCaixaItem(rs.getLong("id"), null, FormaPagamento.get(rs.getInt("forma_pagamento")),
                            rs.getBigDecimal("valor")));
                }
            }
        }
        return lista;
    }
}
