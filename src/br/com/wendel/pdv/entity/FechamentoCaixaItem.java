/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.entity;

import java.math.BigDecimal;
import java.util.Objects;

/**
 *
 * @author INLOC01
 */
public class FechamentoCaixaItem {

    private Long id;
    private FechamentoCaixa fechamentoCaixa;
    private FormaPagamento formaPagamento;
    private BigDecimal valor;

    public FechamentoCaixaItem(Long id, FechamentoCaixa fechamentoCaixa, FormaPagamento formaPagamento, BigDecimal valor) {
        this.id = id;
        this.fechamentoCaixa = fechamentoCaixa;
        this.formaPagamento = formaPagamento;
        this.valor = valor;
    }

    public FechamentoCaixaItem() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FechamentoCaixa getFechamentoCaixa() {
        return fechamentoCaixa;
    }

    public void setFechamentoCaixa(FechamentoCaixa fechamentoCaixa) {
        this.fechamentoCaixa = fechamentoCaixa;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FechamentoCaixaItem other = (FechamentoCaixaItem) obj;
        return Objects.equals(this.id, other.id);
    }
}
