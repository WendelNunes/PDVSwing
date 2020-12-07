/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.view;

import br.com.wendel.pdv.controller.CidadesController;
import br.com.wendel.pdv.App;
import br.com.wendel.pdv.util.Consulta;
import br.com.wendel.pdv.util.Cores;
import static br.com.wendel.pdv.util.Mensagem.enviarMensagemErro;
import java.awt.event.KeyEvent;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author INLOC01
 */
public class CidadesView extends javax.swing.JPanel {

    private final CidadesController cidadesViewController;
    private final CidadeTableModel cidadeTableModel;
    private final JTableCustom<Map<String, Object>> tabela;

    /**
     * Creates new form HomeView
     *
     * @throws java.lang.Exception
     */
    public CidadesView() throws Exception {
        this.cidadesViewController = new CidadesController();
        this.cidadeTableModel = new CidadeTableModel();
        this.tabela = new JTableCustom<>(this.cidadeTableModel);
        initComponents();
    }

    public void carregaTela() throws Exception {
        this.jPButtonNovo.setBackground(Cores.COR_BOTAO_MENU);
        this.jPButtonEditar.setBackground(Cores.COR_BOTAO_MENU);
        this.jPButtonExcluir.setBackground(Cores.COR_BOTAO_MENU);
        this.atualizaTabela();
    }

    public void atualizaTabela() throws Exception {
        this.cidadesViewController.atualizaLista();
        this.cidadeTableModel.setLista(this.cidadesViewController.getList());
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
        jSPCaixas = new JScrollPane(this.tabela);
        jPButtonCancelar = new javax.swing.JPanel();
        jLButtonCancelar = new javax.swing.JLabel();
        jLIconButtonCancelar = new javax.swing.JLabel();

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

        jPTopo.setBackground(new java.awt.Color(79, 195, 247));
        jPTopo.setPreferredSize(new java.awt.Dimension(85, 35));

        jLTitulo.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLTitulo.setText("Cidades");

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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPButtonExcluirMouseClicked(evt);
            }
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPButtonEditarMouseClicked(evt);
            }
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
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

        jSPCaixas.setBackground(new java.awt.Color(255, 255, 255));
        jSPCaixas.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jSPCaixas.setForeground(new java.awt.Color(255, 255, 255));

        jPButtonCancelar.setBackground(new java.awt.Color(220, 53, 69));
        jPButtonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPButtonCancelar.setPreferredSize(new java.awt.Dimension(106, 35));
        jPButtonCancelar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPButtonCancelarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPButtonCancelarFocusLost(evt);
            }
        });
        jPButtonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPButtonCancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPButtonCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPButtonCancelarMouseExited(evt);
            }
        });
        jPButtonCancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPButtonCancelarKeyPressed(evt);
            }
        });

        jLButtonCancelar.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jLButtonCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLButtonCancelar.setText("Cancelar");

        jLIconButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wendel/pdv/images/icon_cancel.png"))); // NOI18N

        javax.swing.GroupLayout jPButtonCancelarLayout = new javax.swing.GroupLayout(jPButtonCancelar);
        jPButtonCancelar.setLayout(jPButtonCancelarLayout);
        jPButtonCancelarLayout.setHorizontalGroup(
            jPButtonCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPButtonCancelarLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLIconButtonCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPButtonCancelarLayout.setVerticalGroup(
            jPButtonCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(jLIconButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPTopo, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSPCaixas)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSPCaixas, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSPCaixas.getViewport().setBackground(new java.awt.Color(255, 255, 255));
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
            App.getInstance().getPrincipalView().mostraConteudo(new CidadeCadastroView(null));
        } catch (Exception e) {
            enviarMensagemErro(e.getMessage());
        }
    }//GEN-LAST:event_jPButtonNovoMouseClicked

    private void jPButtonEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPButtonEditarMouseClicked
        try {
            Map<String, Object> cidadeSelecionada = this.tabela.getSelected();
            if (cidadeSelecionada != null) {
                App.getInstance().getPrincipalView().mostraConteudo(new CidadeCadastroView((Long) cidadeSelecionada.get("ID")));
            }
        } catch (Exception e) {
            enviarMensagemErro(e.getMessage());
        }
    }//GEN-LAST:event_jPButtonEditarMouseClicked

    private void jPButtonExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPButtonExcluirMouseClicked
        try {
            Map<String, Object> cidadeSelecionado = this.tabela.getSelected();
            if (cidadeSelecionado != null
                    && ConfirmDialog.confirm(App.getInstance().getPrincipalView(), "Exclusão",
                            "<html>Deseja excluir a cidade selecionada?")) {
                this.cidadesViewController.delete((Long) cidadeSelecionado.get("ID"));
                this.carregaTela();
            }
        } catch (Exception e) {
            enviarMensagemErro(e.getMessage());
        }
    }//GEN-LAST:event_jPButtonExcluirMouseClicked

    private void jPButtonCancelarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPButtonCancelarFocusGained
        SwingUtilities.invokeLater(() -> {
            this.jPButtonCancelar.setBorder(BorderFactory.createDashedBorder(null, 1, 5, 5, false));
        });
    }//GEN-LAST:event_jPButtonCancelarFocusGained

    private void jPButtonCancelarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPButtonCancelarFocusLost
        SwingUtilities.invokeLater(() -> {
            this.jPButtonCancelar.setBorder(null);
        });
    }//GEN-LAST:event_jPButtonCancelarFocusLost

    private void jPButtonCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPButtonCancelarMouseClicked
        try {
            this.acaCancelar();
        } catch (Exception e) {
            enviarMensagemErro(e.getMessage());
        }
    }//GEN-LAST:event_jPButtonCancelarMouseClicked

    private void acaCancelar() {
        Consulta consulta = Consulta.getInstance();
        if (consulta.isConsulta()) {
            Object janela = consulta.getJanelaRetorno();
            if (janela instanceof JDialog) {

            } else {

            }
        }
    }


    private void jPButtonCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPButtonCancelarMouseEntered
        SwingUtilities.invokeLater(() -> {
            this.jPButtonCancelar.setBackground(Cores.COR_BOTAO_CANCELAR_ENTERED);
        });
    }//GEN-LAST:event_jPButtonCancelarMouseEntered

    private void jPButtonCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPButtonCancelarMouseExited
        SwingUtilities.invokeLater(() -> {
            this.jPButtonCancelar.setBackground(Cores.COR_BOTAO_CANCELAR);
        });
    }//GEN-LAST:event_jPButtonCancelarMouseExited

    private void jPButtonCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPButtonCancelarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_SPACE) {
            this.jPButtonCancelarMouseClicked(null);
        }
    }//GEN-LAST:event_jPButtonCancelarKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLButtonCancelar;
    private javax.swing.JLabel jLButtonEditar;
    private javax.swing.JLabel jLButtonExcluir;
    private javax.swing.JLabel jLButtonNovo;
    private javax.swing.JLabel jLIconButtonCancelar;
    private javax.swing.JLabel jLIconButtonEditar;
    private javax.swing.JLabel jLIconButtonExcluir;
    private javax.swing.JLabel jLIconButtonNovo;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JPanel jPButtonCancelar;
    private javax.swing.JPanel jPButtonEditar;
    private javax.swing.JPanel jPButtonExcluir;
    private javax.swing.JPanel jPButtonNovo;
    private javax.swing.JPanel jPTopo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jSPCaixas;
    // End of variables declaration//GEN-END:variables
}
