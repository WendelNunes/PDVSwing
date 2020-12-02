/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.controller;

import br.com.wendel.pdv.dao.MotivoMovimentacaoEstoqueDao;
import br.com.wendel.pdv.entity.MotivoMovimentacaoEstoque;
import br.com.wendel.pdv.entity.TipoMotivoMovimentacaoEstoque;
import static br.com.wendel.pdv.util.Conexao.criarConexao;
import static br.com.wendel.pdv.util.Mensagem.enviarMensagemAlerta;
import static br.com.wendel.pdv.util.Mensagem.enviarMensagemErro;
import static br.com.wendel.pdv.util.Mensagem.enviarMensagemInformacao;
import java.sql.Connection;

/**
 *
 * @author INLOC01
 */
public class MotivoMovimentacaoEstoqueCadastroController {

    private MotivoMovimentacaoEstoque motivoMovimentacaoEstoque;

    public MotivoMovimentacaoEstoqueCadastroController(Long id) throws Exception {
        if (id != null) {
            try (Connection connection = criarConexao()) {
                this.motivoMovimentacaoEstoque = new MotivoMovimentacaoEstoqueDao(connection).procurarPorId(id);
            }
        }
    }

    public boolean salvarMotivoMovimentacaoEstqoue(String codigo, String descricao, TipoMotivoMovimentacaoEstoque tipo) throws Exception {
        // VALIDA
        String msgValidacao = "";
        if (codigo == null || codigo.isEmpty()) {
            msgValidacao += "Código deve ser informado!\n";
        }
        if (descricao == null || descricao.isEmpty()) {
            msgValidacao = "Descrição deve ser informada!\n";
        }
        if (tipo == null) {
            msgValidacao = "Tipo deve ser informado!\n";
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
            MotivoMovimentacaoEstoqueDao motivoMovimentacaoEstoqueDao = new MotivoMovimentacaoEstoqueDao(connection);
            boolean insert = false;
            if (insert = this.motivoMovimentacaoEstoque == null) {
                this.motivoMovimentacaoEstoque = new MotivoMovimentacaoEstoque();
            }
            this.motivoMovimentacaoEstoque.setCodigo(codigo);
            this.motivoMovimentacaoEstoque.setDescricao(descricao);
            this.motivoMovimentacaoEstoque.setTipo(tipo);
            if (insert) {
                this.motivoMovimentacaoEstoque = motivoMovimentacaoEstoqueDao.salvar(this.motivoMovimentacaoEstoque);
            } else {
                motivoMovimentacaoEstoqueDao.atualizar(this.motivoMovimentacaoEstoque);
            }
            connection.commit();
            if (this.motivoMovimentacaoEstoque.getId() == null) {
                enviarMensagemErro("Erro ao salvar o motivo de movimentação do estoque por favor tente novamente!");
                return false;
            } else {
                enviarMensagemInformacao("Motivo de movimentação do estoque salvo com sucesso!");
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

    public MotivoMovimentacaoEstoque getMotivoMovimentacaoEstoque() {
        return motivoMovimentacaoEstoque;
    }
}
