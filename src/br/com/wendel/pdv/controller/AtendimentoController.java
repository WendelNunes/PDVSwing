/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.controller;

import br.com.wendel.pdv.dao.AberturaCaixaDao;
import br.com.wendel.pdv.entity.AberturaCaixa;
import br.com.wendel.pdv.entity.Usuario;
import static br.com.wendel.pdv.util.Conexao.criarConexao;
import java.sql.Connection;

/**
 *
 * @author INLOC01
 */
public class AtendimentoController {

    private final AberturaCaixa aberturaCaixa;
    private Usuario usuario;

    public AtendimentoController(Usuario usuario) throws Exception {
        try (Connection connection = criarConexao()) {
            this.aberturaCaixa = new AberturaCaixaDao(connection)
                    .procurarCaixaAbertoPorUsuario(usuario);
        }
    }

    public boolean isCaixaAberto() {
        return this.aberturaCaixa != null;
    }
}
