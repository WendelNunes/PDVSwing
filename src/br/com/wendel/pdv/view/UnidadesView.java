/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.view;

import br.com.wendel.pdv.util.Cores;
import java.awt.Color;
import javax.swing.SwingUtilities;

/**
 *
 * @author INLOC01
 */
public class UnidadesView extends javax.swing.JPanel {

    /**
     * Creates new form HomeView
     */
    public UnidadesView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSPUnidades = new javax.swing.JScrollPane();
        jTUnidades = new javax.swing.JTable();
        jPTopo = new javax.swing.JPanel();
        jLTitulo = new javax.swing.JLabel();
        jPButtonNovo = new javax.swing.JPanel();
        jLButtonNovo = new javax.swing.JLabel();
        jLIconButtonNovo = new javax.swing.JLabel();
        jPButtonExcluir = new javax.swing.JPanel();
        jLButtonExcluir = new javax.swing.JLabel();
        jLIconButtonExcluir = new javax.swing.JLabel();
        jPButtonEditar = new javax.swing.JPanel();
        jLButtonEditar = new javax.swing.JLabel();
        jLIconButtonEditar = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));

        jSPUnidades.setBackground(new java.awt.Color(255, 255, 255));
        jSPUnidades.getViewport().setBackground(new java.awt.Color(255, 255, 255));
        jSPUnidades.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jTUnidades.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTUnidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTUnidades.setGridColor(new java.awt.Color(240, 240, 240));
        jTUnidades.setSelectionBackground(new java.awt.Color(79, 195, 247));
        jSPUnidades.setViewportView(jTUnidades);
        if (jTUnidades.getColumnModel().getColumnCount() > 0) {
            jTUnidades.getColumnModel().getColumn(0).setMinWidth(100);
            jTUnidades.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTUnidades.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        jPTopo.setBackground(new java.awt.Color(79, 195, 247));
        jPTopo.setPreferredSize(new java.awt.Dimension(85, 35));

        jLTitulo.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLTitulo.setText("Unidades");

        jPButtonNovo.setBackground(new java.awt.Color(79, 195, 247));
        jPButtonNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPButtonNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPButtonNovoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPButtonNovoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPButtonNovoMouseExited(evt);
            }
        });

        jLButtonNovo.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLButtonNovo.setForeground(new java.awt.Color(255, 255, 255));
        jLButtonNovo.setText("Nova");

        jLIconButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wendel/pdv/images/icon_add.png"))); // NOI18N

        javax.swing.GroupLayout jPButtonNovoLayout = new javax.swing.GroupLayout(jPButtonNovo);
        jPButtonNovo.setLayout(jPButtonNovoLayout);
        jPButtonNovoLayout.setHorizontalGroup(
            jPButtonNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPButtonNovoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLIconButtonNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLButtonNovo)
                .addGap(10, 10, 10))
        );
        jPButtonNovoLayout.setVerticalGroup(
            jPButtonNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLIconButtonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLButtonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPButtonExcluir.setBackground(new java.awt.Color(79, 195, 247));
        jPButtonExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPButtonExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPButtonExcluirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPButtonExcluirMouseExited(evt);
            }
        });

        jLButtonExcluir.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLButtonExcluir.setForeground(new java.awt.Color(255, 255, 255));
        jLButtonExcluir.setText("Excluir");

        jLIconButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wendel/pdv/images/icon_delete.png"))); // NOI18N

        javax.swing.GroupLayout jPButtonExcluirLayout = new javax.swing.GroupLayout(jPButtonExcluir);
        jPButtonExcluir.setLayout(jPButtonExcluirLayout);
        jPButtonExcluirLayout.setHorizontalGroup(
            jPButtonExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPButtonExcluirLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLIconButtonExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLButtonExcluir)
                .addGap(10, 10, 10))
        );
        jPButtonExcluirLayout.setVerticalGroup(
            jPButtonExcluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLIconButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPButtonEditar.setBackground(new java.awt.Color(79, 195, 247));
        jPButtonEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPButtonEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPButtonEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPButtonEditarMouseExited(evt);
            }
        });

        jLButtonEditar.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLButtonEditar.setForeground(new java.awt.Color(255, 255, 255));
        jLButtonEditar.setText("Editar");

        jLIconButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wendel/pdv/images/icon_edit.png"))); // NOI18N

        javax.swing.GroupLayout jPButtonEditarLayout = new javax.swing.GroupLayout(jPButtonEditar);
        jPButtonEditar.setLayout(jPButtonEditarLayout);
        jPButtonEditarLayout.setHorizontalGroup(
            jPButtonEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPButtonEditarLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLIconButtonEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLButtonEditar)
                .addGap(10, 10, 10))
        );
        jPButtonEditarLayout.setVerticalGroup(
            jPButtonEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLIconButtonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLButtonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPTopoLayout = new javax.swing.GroupLayout(jPTopo);
        jPTopo.setLayout(jPTopoLayout);
        jPTopoLayout.setHorizontalGroup(
            jPTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTopoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPTopoLayout.setVerticalGroup(
            jPTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPButtonNovo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPTopo, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSPUnidades, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSPUnidades, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPButtonNovoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPButtonNovoMouseEntered
        SwingUtilities.invokeLater(() -> {
            this.jPButtonNovo.setBackground(Cores.COR_BOTAO_MENU_ENTERED);
        });
    }//GEN-LAST:event_jPButtonNovoMouseEntered

    private void jPButtonNovoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPButtonNovoMouseExited
        SwingUtilities.invokeLater(() -> {
            this.jPButtonNovo.setBackground(Cores.COR_BOTAO_MENU);
        });
    }//GEN-LAST:event_jPButtonNovoMouseExited

    private void jPButtonExcluirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPButtonExcluirMouseEntered
        SwingUtilities.invokeLater(() -> {
            this.jPButtonExcluir.setBackground(Cores.COR_BOTAO_MENU_ENTERED);
        });
    }//GEN-LAST:event_jPButtonExcluirMouseEntered

    private void jPButtonExcluirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPButtonExcluirMouseExited
        SwingUtilities.invokeLater(() -> {
            this.jPButtonExcluir.setBackground(Cores.COR_BOTAO_MENU);
        });
    }//GEN-LAST:event_jPButtonExcluirMouseExited

    private void jPButtonEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPButtonEditarMouseEntered
        SwingUtilities.invokeLater(() -> {
            this.jPButtonEditar.setBackground(Cores.COR_BOTAO_MENU_ENTERED);
        });
    }//GEN-LAST:event_jPButtonEditarMouseEntered

    private void jPButtonEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPButtonEditarMouseExited
        SwingUtilities.invokeLater(() -> {
            this.jPButtonEditar.setBackground(Cores.COR_BOTAO_MENU);
        });
    }//GEN-LAST:event_jPButtonEditarMouseExited

    private void jPButtonNovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPButtonNovoMouseClicked
        try {
            new UnidadeCadastroView().setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jPButtonNovoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLButtonEditar;
    private javax.swing.JLabel jLButtonExcluir;
    private javax.swing.JLabel jLButtonNovo;
    private javax.swing.JLabel jLIconButtonEditar;
    private javax.swing.JLabel jLIconButtonExcluir;
    private javax.swing.JLabel jLIconButtonNovo;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JPanel jPButtonEditar;
    private javax.swing.JPanel jPButtonExcluir;
    private javax.swing.JPanel jPButtonNovo;
    private javax.swing.JPanel jPTopo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jSPUnidades;
    private javax.swing.JTable jTUnidades;
    // End of variables declaration//GEN-END:variables
}
