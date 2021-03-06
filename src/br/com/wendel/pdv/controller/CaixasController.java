/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.controller;

import br.com.wendel.pdv.dao.CaixaDao;
import static br.com.wendel.pdv.util.Conexao.criarConexao;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author INLOC01
 */
public class CaixasController {

    List<Map<String, Object>> list = new ArrayList<>();

    public final void atualizaLista() throws Exception {
        try (Connection connection = criarConexao()) {
            this.list = new CaixaDao(connection).listarTela();
        }
    }

    public void delete(Long id) throws Exception {
        Connection connection = null;
        try {
            connection = criarConexao();
            connection.setAutoCommit(false);
            new CaixaDao(connection).deletar(id);
            connection.commit();
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

    public List<Map<String, Object>> getList() {
        return list;
    }
}
