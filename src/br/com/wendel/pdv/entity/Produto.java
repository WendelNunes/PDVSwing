/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.entity;

import java.math.BigDecimal;

/**
 *
 * @author INLOC01
 */
public class Produto {

    private Long id;
    private String codigo;
    private String descricao;
    private Unidade unidade;
    private BigDecimal valor;

    public Produto(Long id, String codigo, String descricao, Unidade unidade, BigDecimal valor) {
        this.id = id;
        this.codigo = codigo;
        this.descricao = descricao;
        this.unidade = unidade;
        this.valor = valor;
    }

    public Produto() {
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Unidade getUnidade() {
        return unidade;
    }

    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
