/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.controller;

import br.com.wendel.pdv.dao.ProdutoDao;
import br.com.wendel.pdv.dao.UnidadeDao;
import br.com.wendel.pdv.entity.Produto;
import br.com.wendel.pdv.entity.Unidade;
import static br.com.wendel.pdv.util.Conexao.criarConexao;
import static br.com.wendel.pdv.util.Mensagem.enviarMensagemAlerta;
import static br.com.wendel.pdv.util.Mensagem.enviarMensagemErro;
import static br.com.wendel.pdv.util.Mensagem.enviarMensagemInformacao;
import java.math.BigDecimal;
import java.sql.Connection;
import java.util.List;
import java.util.Map;

/**
 *
 * @author INLOC01
 */
public class ProdutoCadastroController {

    private Produto produto;
    private final List<Map<String, Object>> listaUnidades;

    public ProdutoCadastroController(Long id) throws Exception {
        try (Connection connection = criarConexao()) {
            if (id != null) {
                this.produto = new ProdutoDao(connection).procurarPorId(id);
            }
            this.listaUnidades = new UnidadeDao(connection).listarTela();
        }
    }

    public boolean salvarProduto(String codigo, String descricao, Unidade unidade, BigDecimal valor) throws Exception {
        // VALIDA
        String msgValidacao = "";
        if (codigo == null || codigo.isEmpty()) {
            msgValidacao = "Código deve ser informado!\n";
        }
        if (descricao == null || descricao.isEmpty()) {
            msgValidacao += "Descrição deve ser informada!\n";
        }
        if (unidade == null || unidade.getId() == null) {
            msgValidacao += "Unidade deve ser informada!\n";
        }
        if (valor == null) {
            msgValidacao += "Valor deve ser informado!\n";
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
            ProdutoDao produtoDao = new ProdutoDao(connection);
            boolean insert = false;
            if (insert = this.produto == null) {
                this.produto = new Produto();
            }
            this.produto.setCodigo(codigo);
            this.produto.setDescricao(descricao);
            this.produto.setUnidade(unidade);
            this.produto.setValor(valor);
            if (insert) {
                this.produto = produtoDao.salvar(this.produto);
            } else {
                produtoDao.atualizar(this.produto);
            }
            connection.commit();
            if (this.produto.getId() == null) {
                enviarMensagemErro("Erro ao salvar o produto por favor tente novamente!");
                return false;
            } else {
                enviarMensagemInformacao("Produto salvo com sucesso!");
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

    public List<Map<String, Object>> getListaUnidades() {
        return listaUnidades;
    }

    public Produto getProduto() {
        return produto;
    }
}
