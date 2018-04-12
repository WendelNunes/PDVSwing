/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.entity;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author INLOC01
 */
public class FechamentoCaixa {

    private Long id;
    private Date dataHora;
    private AberturaCaixa aberturaCaixa;
    private List<FechamentoCaixaItem> itens;

    public FechamentoCaixa(Long id, Date dataHora, AberturaCaixa aberturaCaixa, List<FechamentoCaixaItem> itens) {
        this.id = id;
        this.dataHora = dataHora;
        this.aberturaCaixa = aberturaCaixa;
        this.itens = itens;
    }

    public FechamentoCaixa() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public AberturaCaixa getAberturaCaixa() {
        return aberturaCaixa;
    }

    public void setAberturaCaixa(AberturaCaixa aberturaCaixa) {
        this.aberturaCaixa = aberturaCaixa;
    }

    public List<FechamentoCaixaItem> getItens() {
        return itens;
    }

    public void setItens(List<FechamentoCaixaItem> itens) {
        this.itens = itens;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.id);
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
        final FechamentoCaixa other = (FechamentoCaixa) obj;
        return Objects.equals(this.id, other.id);
    }
}
