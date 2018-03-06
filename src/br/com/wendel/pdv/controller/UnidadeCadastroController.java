/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.controller;

import br.com.wendel.pdv.dao.UnidadeDao;
import br.com.wendel.pdv.entity.Unidade;
import static br.com.wendel.pdv.util.Conexao.criarConexao;
import static br.com.wendel.pdv.util.Mensagem.enviarMensagemAlerta;
import static br.com.wendel.pdv.util.Mensagem.enviarMensagemErro;
import static br.com.wendel.pdv.util.Mensagem.enviarMensagemInformacao;
import java.sql.Connection;

/**
 *
 * @author INLOC01
 */
public class UnidadeCadastroController {

    private Unidade unidade;

    public UnidadeCadastroController(Unidade unidade) {
        this.unidade = unidade;
    }

    public boolean salvarUnidade(String descricao, String sigla) throws Exception {
        // VALIDA
        String msgValidacao = "";
        if (descricao == null || descricao.isEmpty()) {
            msgValidacao = "Descrição deve ser informada!\n";
        }
        if (sigla == null || sigla.isEmpty()) {
            msgValidacao += "Sigla deve ser informada!\n";
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
            UnidadeDao unidadeDao = new UnidadeDao(connection);
            boolean insert = false;
            if (insert = this.unidade == null) {
                this.unidade = new Unidade();
            }
            this.unidade.setDescricao(descricao);
            this.unidade.setSigla(sigla);
            if (insert) {
                this.unidade = unidadeDao.save(this.unidade);
            } else {
                unidadeDao.update(this.unidade);
            }
            connection.commit();
            if (this.unidade.getId() == null) {
                enviarMensagemErro("Erro ao salvar unidade por favor tente novamente!");
                return false;
            } else {
                enviarMensagemInformacao("Unidade salva com sucesso!");
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

    public Unidade getUnidade() {
        return unidade;
    }
}
