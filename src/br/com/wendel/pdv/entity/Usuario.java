/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.entity;

/**
 *
 * @author INLOC01
 */
public class Usuario {

    private Long id;
    private String codigo;
    private String senha;

    public Usuario() {
    }

    public Usuario(Long id, String codigo, String senha) {
        this.id = id;
        this.codigo = codigo;
        this.senha = senha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
