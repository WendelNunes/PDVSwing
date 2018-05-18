/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.controller;

import br.com.wendel.pdv.dao.CaixaDao;
import br.com.wendel.pdv.dao.AberturaCaixaDao;
import br.com.wendel.pdv.entity.Caixa;
import br.com.wendel.pdv.entity.AberturaCaixa;
import br.com.wendel.pdv.entity.Usuario;
import static br.com.wendel.pdv.util.Conexao.criarConexao;
import static br.com.wendel.pdv.util.Mensagem.enviarMensagemAlerta;
import static br.com.wendel.pdv.util.Mensagem.enviarMensagemErro;
import java.math.BigDecimal;
import java.sql.Connection;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * @author INLOC01
 */
public class AberturaCaixaCadastroController {

    private AberturaCaixa aberturaCaixa;
    private final List<Map<String, Object>> listaCaixas;

    public AberturaCaixaCadastroController(Long id) throws Exception {
        try (Connection connection = criarConexao()) {
            if (id != null) {
                this.aberturaCaixa = new AberturaCaixaDao(connection).procurarPorId(id);
            }
            this.listaCaixas = new CaixaDao(connection).listarTela();
        }
    }

    public boolean salvarAberturaCaixa(Caixa caixa, Date dataHora, Usuario usuario, BigDecimal valorFundoCaixa) throws Exception {
        // VALIDA
        String msgValidacao = "";
        if (usuario == null || usuario.getId() == null) {
            msgValidacao += "Usuário deve ser informado!\n";
        }
        if (caixa == null || caixa.getId() == null) {
            msgValidacao = "Caixa deve ser informado!\n";
        }
        if (dataHora == null) {
            msgValidacao += "Data deve ser informada!\n";
        }
        if (valorFundoCaixa == null) {
            msgValidacao += "Saldo incial deve ser informado!\n";
        }
        if (!msgValidacao.isEmpty()) {
            enviarMensagemAlerta(msgValidacao);
            return false;
        }
        // PERSISTI
        Connection connection = null;
        try {
            connection = criarConexao();
            connection.setAutoCommit(false);
            AberturaCaixaDao aberturaCaixaDao = new AberturaCaixaDao(connection);
            this.aberturaCaixa = new AberturaCaixa(null, caixa, dataHora, usuario, valorFundoCaixa);
            this.aberturaCaixa.setCaixa(caixa);
            this.aberturaCaixa.setDataHora(dataHora);
            this.aberturaCaixa.setUsuario(usuario);
            this.aberturaCaixa.setValorFundoCaixa(valorFundoCaixa);
            this.aberturaCaixa = aberturaCaixaDao.salvar(this.aberturaCaixa);
            connection.commit();
            if (this.aberturaCaixa.getId() == null) {
                enviarMensagemErro("Erro ao abrir o caixa por favor tente novamente!");
                return false;
            }
            return true;
        } catch (Exception e) {
            if (connection != null) {
                connection.rollback();
            }
            throw e;
        } finally {
            if (connection != null) {
                connection.setAutoCommit(true);
                connection.close();
            }
        }
    }

    public AberturaCaixa getAberturaCaixa() {
        return aberturaCaixa;
    }

    public List<Map<String, Object>> getListaCaixas() {
        return listaCaixas;
    }
}
