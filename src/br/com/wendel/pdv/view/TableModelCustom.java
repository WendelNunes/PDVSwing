/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.view;

import java.util.List;
import javax.swing.table.TableModel;

/**
 *
 * @author INLOC01
 * @param <T>
 */
public interface TableModelCustom<T> extends TableModel {

    public void setLista(List<T> lista);

    public int[] getColumnWidth();

    public List<T> getLista();

    public String format(Object value, int columnIndex);
}
