/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.controller;

import br.com.wendel.pdv.dao.UsuarioDao;
import br.com.wendel.pdv.entity.Usuario;
import static br.com.wendel.pdv.util.BCrypt.checkpw;
import static br.com.wendel.pdv.util.Conexao.criarConexao;
import static br.com.wendel.pdv.util.Mensagem.enviarMensagemAlerta;
import java.sql.Connection;

/**
 *
 * @author INLOC01
 */
public class LoginController {

    private Usuario usuario;

    public boolean acaoEntrar(String codigo, String senha) throws Exception {
        try (Connection connection = criarConexao()) {
            this.usuario = new UsuarioDao(connection).findByCodigo(codigo);
            if (this.usuario != null && checkpw(senha, this.usuario.getSenha())) {
                return true;
            }
            enviarMensagemAlerta("Usuário ou senha incorretos!");
        }
        return false;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }
}
