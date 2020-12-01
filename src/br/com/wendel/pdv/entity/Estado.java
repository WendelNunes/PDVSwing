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
public enum Estado {

    GO("GO", "Goiás");

    private final String id;
    private final String descricao;

    private Estado(String id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public String getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Estado get(String id) {
        for (Estado value : values()) {
            if (value.getId().equals(id)) {
                return value;
            }
        }
        return null;
    }
}
