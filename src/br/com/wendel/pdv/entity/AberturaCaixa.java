/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author INLOC01
 */
public class AberturaCaixa {

    private Long id;
    private Caixa caixa;
    private Date dataHora;
    private Usuario usuario;
    private BigDecimal valorFundoCaixa;

    public AberturaCaixa(Long id, Caixa caixa, Date dataHora, Usuario usuario, BigDecimal valorFundoCaixa) {
        this.id = id;
        this.caixa = caixa;
        this.dataHora = dataHora;
        this.usuario = usuario;
        this.valorFundoCaixa = valorFundoCaixa;
    }

    public AberturaCaixa() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public BigDecimal getValorFundoCaixa() {
        return valorFundoCaixa;
    }

    public void setValorFundoCaixa(BigDecimal valorFundoCaixa) {
        this.valorFundoCaixa = valorFundoCaixa;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.id);
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
        final AberturaCaixa other = (AberturaCaixa) obj;
        return Objects.equals(this.id, other.id);
    }
}
