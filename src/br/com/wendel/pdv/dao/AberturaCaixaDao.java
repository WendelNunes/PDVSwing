/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.dao;

import br.com.wendel.pdv.entity.AberturaCaixa;
import br.com.wendel.pdv.entity.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

/**
 *
 * @author INLOC01
 */
public class AberturaCaixaDao {

    private final Connection connection;
    private final CaixaDao caixaDao;
    private final UsuarioDao usuarioDao;

    public AberturaCaixaDao(Connection connection) {
        this.connection = connection;
        this.caixaDao = new CaixaDao(connection);
        this.usuarioDao = new UsuarioDao(connection);
    }

    public AberturaCaixa salvar(AberturaCaixa aberturaCaixa) throws Exception {
        try (PreparedStatement ps = this.connection.prepareStatement(
                "INSERT INTO abertura_caixa (data_hora, id_caixa, id_usuario, valor_fundo_caixa) VALUES (?, ?, ?, ?) RETURNING id")) {
            int index = 0;
            ps.setTimestamp(++index, new Timestamp(aberturaCaixa.getDataHora().getTime()));
            ps.setLong(++index, aberturaCaixa.getCaixa().getId());
            ps.setLong(++index, aberturaCaixa.getUsuario().getId());
            ps.setBigDecimal(++index, aberturaCaixa.getValorFundoCaixa());
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    aberturaCaixa.setId(rs.getLong("id"));
                }
            }
        }
        return aberturaCaixa;
    }

    public AberturaCaixa procurarPorId(Long id) throws Exception {
        try (PreparedStatement ps = this.connection.prepareStatement(
                "SELECT id, data_hora, id_caixa, id_usuario, valor_fundo_caixa FROM aberturaCaixa WHERE id = ?")) {
            ps.setLong(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new AberturaCaixa(rs.getLong("id"), this.caixaDao.procurarPorId(rs.getLong("id_caixa")), rs.getTimestamp("data_hora"),
                            this.usuarioDao.procurarPorId(rs.getLong("id_usuario")), rs.getBigDecimal("valor_fundo_caixa"));
                }
            }
        }
        return null;
    }

    public AberturaCaixa procurarCaixaAbertoPorUsuario(Usuario usuario) throws Exception {
        try (PreparedStatement ps = this.connection.prepareStatement(
                "SELECT id, data_hora, id_caixa, id_usuario, valor_fundo_caixa FROM aberturaCaixa WHERE id = ?")) {
            ps.setLong(1, usuario.getId());
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new AberturaCaixa(rs.getLong("id"), this.caixaDao.procurarPorId(rs.getLong("id_caixa")), rs.getTimestamp("data_hora"),
                            this.usuarioDao.procurarPorId(rs.getLong("id_usuario")), rs.getBigDecimal("valor_fundo_caixa"));
                }
            }
        }
        return null;
    }
}
