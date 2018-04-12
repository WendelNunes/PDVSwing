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
public enum FormaPagamento {

    DINHEIRO(1, "Dinheiro"),
    CARTAO_DEBITO(2, "Cartão Débito"),
    CARTAO_CREDITO(3, "Cartão Crédito"),
    CHEQUE(4, "Cheque");

    private final Integer id;
    private final String descricao;

    private FormaPagamento(Integer id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public static FormaPagamento get(Integer id) {
        for (FormaPagamento fp : FormaPagamento.values()) {
            if (fp.getId().equals(id)) {
                return fp;
            }
        }
        return null;
    }
}
