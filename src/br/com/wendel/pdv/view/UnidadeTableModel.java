/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author INLOC01
 */
public class UnidadeTableModel extends AbstractTableModel implements TableModelCustom<Map<String, Object>> {

    private final String[] columnNames = {"Sigla", "Descrição"};
    private List<Map<String, Object>> lista;

    public UnidadeTableModel() {
        this.lista = new ArrayList<>();
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
                return this.lista.get(rowIndex).get("SIGLA");
            case 1:
                return this.lista.get(rowIndex).get("DESCRICAO");
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
            case 0:
                return String.class;
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
        return new int[]{80, 800};
    }

    @Override
    public String format(Object value, String columnName) {
        return value != null ? value.toString() : "";
    }
}
