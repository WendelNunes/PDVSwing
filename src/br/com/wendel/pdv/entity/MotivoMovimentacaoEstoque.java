/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.entity;

/**
 *
 * @author INLOC
 */
public class MotivoMovimentacaoEstoque {

    public Long id;
    public String codigo;
    public String descricao;
    private TipoMotivoMovimentacaoEstoque tipo;

    public MotivoMovimentacaoEstoque() {
    }

    public MotivoMovimentacaoEstoque(Long id, String codigo, String descricao, TipoMotivoMovimentacaoEstoque tipo) {
        this.id = id;
        this.codigo = codigo;
        this.descricao = descricao;
        this.tipo = tipo;
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

    public TipoMotivoMovimentacaoEstoque getTipo() {
        return tipo;
    }

    public void setTipo(TipoMotivoMovimentacaoEstoque tipo) {
        this.tipo = tipo;
    }
}
