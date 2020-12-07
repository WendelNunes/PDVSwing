/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Wendel
 */
public class Consulta {

    private static final Consulta INSTANCE = new Consulta();
    private List<Map<String, Object>> navegacao = new ArrayList<>();

    public void adicionarJanela(Object janela, String parametroRetorno) {
        Map<String, Object> item = new HashMap<>();
        item.put("JANELA_RETORNO", janela);
        item.put("PARAMETRO_RETORNO", parametroRetorno);
        this.navegacao.add(item);
    }

    public void removerJanela() {
        if (this.isConsulta()) {
            this.navegacao.remove(this.navegacao.size() - 1);
        }
    }

    public Object getJanelaRetorno() {
        return this.isConsulta() ? this.navegacao.get(this.navegacao.size() - 1).get("JANELA_RETORNO") : null;
    }

    public String getParametroRetorno() {
        return this.isConsulta() ? this.navegacao.get(this.navegacao.size() - 1).get("PARAMETRO_RETORNO").toString() : null;
    }

    public boolean isConsulta() {
        return this.navegacao != null && !this.navegacao.isEmpty();
    }

    public static Consulta getInstance() {
        return INSTANCE;
    }
}
