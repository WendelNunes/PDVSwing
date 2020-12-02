/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.controller;

import br.com.wendel.pdv.dao.CidadeDao;
import br.com.wendel.pdv.entity.Cidade;
import br.com.wendel.pdv.entity.Estado;
import static br.com.wendel.pdv.util.Conexao.criarConexao;
import static br.com.wendel.pdv.util.Mensagem.enviarMensagemAlerta;
import static br.com.wendel.pdv.util.Mensagem.enviarMensagemErro;
import static br.com.wendel.pdv.util.Mensagem.enviarMensagemInformacao;
import java.sql.Connection;

/**
 *
 * @author INLOC01
 */
public class CidadeCadastroController {

    private Cidade cidade;

    public CidadeCadastroController(Long id) throws Exception {
        if (id != null) {
            try (Connection connection = criarConexao()) {
                this.cidade = new CidadeDao(connection).procurarPorId(id);
            }
        }
    }

    public boolean salvarCidade(String descricao, Estado estado) throws Exception {
        // VALIDA
        String msgValidacao = "";
        if (descricao == null || descricao.isEmpty()) {
            msgValidacao = "Descrição deve ser informada!\n";
        }
        if (estado == null) {
            msgValidacao = "Estado deve ser informado!\n";
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
            CidadeDao cidadeDao = new CidadeDao(connection);
            boolean insert;
            if (insert = this.cidade == null) {
                this.cidade = new Cidade();
            }
            this.cidade.setDescricao(descricao);
            this.cidade.setEstado(estado);
            if (insert) {
                this.cidade = cidadeDao.salvar(this.cidade);
            } else {
                cidadeDao.atualizar(this.cidade);
            }
            connection.commit();
            if (this.cidade.getId() == null) {
                enviarMensagemErro("Erro ao salvar cidade por favor tente novamente!");
                return false;
            } else {
                enviarMensagemInformacao("Cidade salva com sucesso!");
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

    public Cidade getCidade() {
        return cidade;
    }
}
