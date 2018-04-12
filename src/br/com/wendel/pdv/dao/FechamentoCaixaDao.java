/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.dao;

import br.com.wendel.pdv.entity.FechamentoCaixa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

/**
 *
 * @author INLOC01
 */
public class FechamentoCaixaDao {

    private final Connection connection;
    private final AberturaCaixaDao aberturaCaixaDao;
    private final FechamentoCaixaItemDao fechamentoCaixaItemDao;

    public FechamentoCaixaDao(Connection connection) {
        this.connection = connection;
        this.aberturaCaixaDao = new AberturaCaixaDao(connection);
        this.fechamentoCaixaItemDao = new FechamentoCaixaItemDao(connection);
    }

    public FechamentoCaixa salvar(FechamentoCaixa fechamentoCaixa) throws Exception {
        try (PreparedStatement ps = this.connection.prepareStatement(
                "INSERT INTO fechamento_caixa (data_hora, id_abertura_caixa) VALUES (?, ?) RETURNING id")) {
            int index = 0;
            ps.setTimestamp(++index, new Timestamp(fechamentoCaixa.getDataHora().getTime()));
            ps.setLong(++index, fechamentoCaixa.getAberturaCaixa().getId());
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    fechamentoCaixa.setId(rs.getLong("id"));
                }
            }
        }
        return fechamentoCaixa;
    }

    public FechamentoCaixa procurarPorId(Long id) throws Exception {
        try (PreparedStatement ps = this.connection.prepareStatement(
                "SELECT id, data_hora, id_abertura_caixa FROM fechamento_caixa WHERE id = ?")) {
            ps.setLong(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new FechamentoCaixa(rs.getLong("id"), rs.getTimestamp("data_hora"),
                            this.aberturaCaixaDao.procurarPorId(rs.getLong("id_abertura_caixa")),
                            this.fechamentoCaixaItemDao.listarPorIdFechamento(rs.getLong("id")));
                }
            }
        }
        return null;
    }
}
