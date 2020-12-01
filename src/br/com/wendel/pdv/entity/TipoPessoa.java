/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.entity;

/**
 *
 * @author Wendel
 */
public enum TipoPessoa {

    FISICA("1", "Física"), //
    JURIDICA("2", "Jurídica"); //

    private final String id;
    private final String descricao;

    private TipoPessoa(String id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public String getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoPessoa get(String id) {
        for (TipoPessoa value : values()) {
            if (value.getId().equals(id)) {
                return value;
            }
        }
        return null;
    }
}
