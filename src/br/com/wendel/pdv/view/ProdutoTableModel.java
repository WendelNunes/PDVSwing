/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.view;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author INLOC01
 */
public class ProdutoTableModel extends AbstractTableModel implements TableModelCustom<Map<String, Object>> {

    private final String[] columnNames = {"Código", "Descrição", "Unidade", "Valor"};
    private List<Map<String, Object>> lista;
    private final DecimalFormat formatValor;

    public ProdutoTableModel() {
        this.lista = new ArrayList<>();
        this.formatValor = new DecimalFormat("#,##0.00");
    }

    @Override
    public int getRowCount() {
        return this.lista == null ? 0 : this.lista.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return this.lista.get(rowIndex).get("CODIGO");
            case 1:
                return this.lista.get(rowIndex).get("DESCRICAO");
            case 2:
                return this.lista.get(rowIndex).get("UNIDADE");
            case 3:
                return this.lista.get(rowIndex).get("VALOR");
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return this.columnNames[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 3:
                return BigDecimal.class;
            default:
                return String.class;
        }
    }

    @Override
    public void setLista(List<Map<String, Object>> lista) {
        this.lista = lista;
        fireTableDataChanged();
    }

    public void remove(Map<String, Object> item) {
        this.lista.remove(item);
        fireTableDataChanged();
    }

    @Override
    public List<Map<String, Object>> getLista() {
        return lista;
    }

    @Override
    public int[] getColumnWidth() {
        return new int[]{30, 500, 30, 100};
    }

    @Override
    public String format(Object value, int columnIndex) {
        switch (columnIndex) {
            case 3:
                return value != null ? this.formatValor.format(value) : "";
            default:
                return value != null ? value.toString() : "";
        }
    }
}
