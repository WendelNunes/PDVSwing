/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.RowSorter;
import javax.swing.RowSorter.SortKey;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author INLOC01
 * @param <T>
 */
public class JTableCustom<T> extends JTable {

    private final TableModelCustom<T> tableModelCustom;
    private final ImageIcon iconAscending = new javax.swing.ImageIcon(getClass().getResource("/br/com/wendel/pdv/images/icon_sort_down.png"));
    private final ImageIcon iconDescending = new javax.swing.ImageIcon(getClass().getResource("/br/com/wendel/pdv/images/icon_sort_up.png"));
    private final ImageIcon iconUnsorted = new javax.swing.ImageIcon(getClass().getResource("/br/com/wendel/pdv/images/icon_sort.png"));

    public JTableCustom(TableModelCustom<T> tableModelCustom) {
        super(tableModelCustom);
        this.setBackground(Color.WHITE);
        this.setBorder(null);
        this.setGridColor(Color.WHITE);
        this.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.setSelectionBackground(new Color(140, 219, 254));
        this.getTableHeader().setPreferredSize(new Dimension(WIDTH, 35));
        this.getTableHeader().setDefaultRenderer(new TableHeader(this.getTableHeader().getDefaultRenderer()));
        this.setDefaultRenderer(Object.class, new TableCell());
        this.setDefaultRenderer(BigDecimal.class, new TableCell());
        this.setRowHeight(25);
        this.setFont(new Font("Segoe UI", 0, 15));
        this.tableModelCustom = tableModelCustom;
        for (int i = 0; i < this.tableModelCustom.getColumnWidth().length; i++) {
            this.getColumnModel().getColumn(i).setPreferredWidth(this.tableModelCustom.getColumnWidth()[i]);
        }
        TableRowSorter<TableModelCustom> sorter = new TableRowSorter<>(this.tableModelCustom);
        this.setRowSorter(sorter);
        List<RowSorter.SortKey> sortKeys = new ArrayList<>();
        for (int i = 0; i < this.tableModelCustom.getColumnCount(); i++) {
            sortKeys.add(new RowSorter.SortKey(i, SortOrder.UNSORTED));
        }
        sorter.setSortKeys(sortKeys);
    }

    private class TableHeader extends JLabel implements TableCellRenderer {

        private final TableCellRenderer delegate;

        public TableHeader(TableCellRenderer delegate) {
            this.delegate = delegate;
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component c = this.delegate.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            if (c instanceof JLabel) {
                JLabel label = (JLabel) c;
                label.setFont(new Font("Segoe UI", Font.BOLD, 15));
                label.setOpaque(true);
                label.setBackground(new Color(255, 255, 255));
                label.setForeground(new Color(3, 169, 244));
                label.setBorder(BorderFactory.createMatteBorder(1, 0, 3, 0, new Color(241, 241, 241)));
                label.setIcon(getSortIcon(table, column));
            }
            return c;
        }

        private ImageIcon getSortIcon(JTable table, int column) {
            SortOrder sortOrder = getColumnSortOrder(table, column);
            if (SortOrder.UNSORTED == sortOrder) {
                return iconUnsorted;
            }
            return SortOrder.ASCENDING == sortOrder ? iconAscending : iconDescending;
        }

        private SortOrder getColumnSortOrder(JTable table, int column) {
            if (table == null || table.getRowSorter() == null) {
                return SortOrder.UNSORTED;
            }
            List<? extends SortKey> keys = table.getRowSorter().getSortKeys();
            if (keys.size() > 0) {
                SortKey key = keys.get(0);
                if (key.getColumn() == table.convertColumnIndexToModel(column)) {
                    return key.getSortOrder();
                }
            }
            return SortOrder.UNSORTED;
        }
    }

    private class TableCell extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            this.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(241, 241, 241)));
            this.setText(tableModelCustom.format(value, table.getColumnName(column)));
            if (getSelectedRow() != row) {
                if (row % 2 == 0) {
                    this.setBackground(new Color(252, 254, 254));
                } else {
                    this.setBackground(new Color(255, 255, 255));
                }
            }
            return this;
        }
    }

    public T getSelected() {
        if (this.getSelectedRow() >= 0) {
            return this.tableModelCustom.getLista().get(this.convertRowIndexToModel(this.getSelectedRow()));
        }
        return null;
    }
}
