/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JTable;

/**
 *
 * @author INLOC01
 */
public class TabelaUnidade extends JTable {

    private final String[] columnNames = {"Código", "Descrição"};
    private List<Map<String, Object>> itens = new ArrayList<>();

    public TabelaUnidade() {
    }

    public List<Map<String, Object>> getItens() {
        return itens;
    }

    public void setItens(List<Map<String, Object>> itens) {
        this.itens = itens;
    }
}
