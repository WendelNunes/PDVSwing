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
public enum TipoMotivoMovimentacaoEstoque {

    ENTRADA("E", "Entrada"), //
    SAIDA("S", "Saída"); // 

    private final String id;
    private final String descricao;

    private TipoMotivoMovimentacaoEstoque(String id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public String getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoMotivoMovimentacaoEstoque get(String id) {
        for (TipoMotivoMovimentacaoEstoque value : values()) {
            if (value.getId().equals(id)) {
                return value;
            }
        }
        return null;
    }
}
