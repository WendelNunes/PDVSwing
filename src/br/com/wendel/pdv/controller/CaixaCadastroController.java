/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.controller;

import br.com.wendel.pdv.dao.CaixaDao;
import br.com.wendel.pdv.entity.Caixa;
import static br.com.wendel.pdv.util.Conexao.criarConexao;
import static br.com.wendel.pdv.util.Mensagem.enviarMensagemAlerta;
import static br.com.wendel.pdv.util.Mensagem.enviarMensagemErro;
import static br.com.wendel.pdv.util.Mensagem.enviarMensagemInformacao;
import java.sql.Connection;

/**
 *
 * @author INLOC01
 */
public class CaixaCadastroController {

    private Caixa caixa;

    public CaixaCadastroController(Long id) throws Exception {
        if (id != null) {
            try (Connection connection = criarConexao()) {
                this.caixa = new CaixaDao(connection).procurarPorId(id);
            }
        }
    }

    public boolean salvarCaixa(String codigo, String descricao) throws Exception {
        // VALIDA
        String msgValidacao = "";
        if (codigo == null || codigo.isEmpty()) {
            msgValidacao += "Código deve ser informado!\n";
        }
        if (descricao == null || descricao.isEmpty()) {
            msgValidacao = "Descrição deve ser informada!\n";
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
            CaixaDao caixaDao = new CaixaDao(connection);
            boolean insert = false;
            if (insert = this.caixa == null) {
                this.caixa = new Caixa();
            }
            this.caixa.setCodigo(codigo);
            this.caixa.setDescricao(descricao);
            if (insert) {
                this.caixa = caixaDao.salvar(this.caixa);
            } else {
                caixaDao.atualizar(this.caixa);
            }
            connection.commit();
            if (this.caixa.getId() == null) {
                enviarMensagemErro("Erro ao salvar caixa por favor tente novamente!");
                return false;
            } else {
                enviarMensagemInformacao("Caixa salvo com sucesso!");
                return true;
            }
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

    public Caixa getCaixa() {
        return caixa;
    }
}
