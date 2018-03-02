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
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SortOrder;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author INLOC01
 */
public class JTableCustom extends JTable {

    private final TableModelCustom tableModelCustom;

    public JTableCustom(TableModelCustom tableModelCustom) {
        super(tableModelCustom);
        this.setBackground(Color.WHITE);
        this.setBorder(null);
        this.setGridColor(Color.WHITE);
        this.setSelectionBackground(new Color(140, 219, 254));
        this.getTableHeader().setPreferredSize(new Dimension(WIDTH, 35));
        this.getTableHeader().setDefaultRenderer(new TableHeader(this.getTableHeader().getDefaultRenderer()));
        this.setDefaultRenderer(Object.class, new TableCell(this.getDefaultRenderer(Object.class)));
        this.setRowHeight(25);
        this.setFont(new Font("Segoe UI", 0, 15));
        this.tableModelCustom = tableModelCustom;
        for (int i = 0; i < this.tableModelCustom.getColumnWidth().length; i++) {
            this.getColumnModel().getColumn(i).setPreferredWidth(this.tableModelCustom.getColumnWidth()[i]);
        }
        this.setRowSorter(new TableRowSorter<>(this.tableModelCustom));
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
            }
            return c;
        }
    }

    private class TableCell extends JLabel implements TableCellRenderer {

        private final TableCellRenderer delegate;

        public TableCell(TableCellRenderer delegate) {
            this.delegate = delegate;
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            JComponent c = (JComponent) this.delegate.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            c.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(241, 241, 241)));
            if (getSelectedRow() != row) {
                if (row % 2 == 0) {
                    c.setBackground(new Color(252, 254, 254));
                } else {
                    c.setBackground(new Color(255, 255, 255));
                }
            }
            return c;
        }
    }
}
