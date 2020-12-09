/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.controller;

import br.com.wendel.pdv.dao.CidadeDao;
import br.com.wendel.pdv.entity.Cidade;
import br.com.wendel.pdv.entity.Pessoa;
import br.com.wendel.pdv.util.Conexao;
import java.sql.Connection;

/**
 *
 * @author Wendel
 */
public class PessoaCadastroController {

    private Pessoa pessoa;

    public PessoaCadastroController(Long id) {
        if (id != null) {

        }
    }

    public Cidade obterCidade(Long idCidade) throws Exception {
        try (Connection connection = Conexao.criarConexao()) {
            return new CidadeDao(connection).procurarPorId(idCidade);
        }
    }

    public Pessoa getPessoa() {
        return pessoa;
    }
}
