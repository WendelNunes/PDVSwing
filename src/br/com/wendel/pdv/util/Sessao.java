/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.util;

import br.com.wendel.pdv.entity.Usuario;

/**
 *
 * @author INLOC01
 */
public class Sessao {

    private static final Sessao INSTANCE = new Sessao();

    private Usuario usuario;

    public static Sessao getInstance() {
        return INSTANCE;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
