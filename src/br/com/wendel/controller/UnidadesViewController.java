/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.controller;

import br.com.wendel.dao.UnidadeDao;
import br.com.wendel.pdv.util.Conexao;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author INLOC01
 */
public class UnidadesViewController {

    List<Map<String, Object>> list = new ArrayList<>();

    public UnidadesViewController() throws Exception {
    }

    public final void atualizaLista() throws Exception {
        try (Connection connection = Conexao.criarConexao()) {
            this.list = new UnidadeDao(connection).listView();
        }
    }

    public List<Map<String, Object>> getList() {
        return list;
    }
}
