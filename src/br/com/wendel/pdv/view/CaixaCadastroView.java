/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.view;

import br.com.wendel.pdv.controller.CaixaCadastroController;
import br.com.wendel.pdv.App;
import br.com.wendel.pdv.util.Cores;
import static br.com.wendel.pdv.util.Mensagem.enviarMensagemErro;
import br.com.wendel.pdv.util.TraversalPolicy;
import java.awt.event.KeyEvent;
import static java.util.Arrays.asList;
import javax.swing.BorderFactory;
import javax.swing.SwingUtilities;

/**
 *
 * @author INLOC01
 */
public class CaixaCadastroView extends javax.swing.JPanel {

    private final CaixaCadastroController controller;

    /**
     * Creates new form CaixaCadastroViewPanel
     *
     * @param id
     * @throws java.lang.Exception
     */
    public CaixaCadastroView(Long id) throws Exception {
        this.controller = new CaixaCadastroController(id);
        initComponents();
        if (this.controller.getCaixa() != null) {
            this.jTFCodigo.setText(this.controller.getCaixa().getCodigo());
            this.jTFDescricao.setText(this.controller.getCaixa().getDescricao());
        }
        SwingUtilities.invokeLater(() -> {
            this.jTFCodigo.requestFocusInWindow();
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPTopo = new javax.swing.JPanel();
        jLTitulo = new javax.swing.JLabel();
        jLDescricao = new javax.swing.JLabel();
        jTFDescricao = new javax.swing.JTextField();
        jLCodigo = new javax.swing.JLabel();
        jTFCodigo = new javax.swing.JTextField();
        jPButtonSalvar = new javax.swing.JPanel();
        jLButtonSalvar = new javax.swing.JLabel();
        jLIconButtonSalvar = new javax.swing.JLabel();
        jPButtonCancelar = new javax.swing.JPanel();
        jLButtonCancelar = new javax.swing.JLabel();
        jLIconButtonCancelar = new javax.swing.JLabel();
        jLCodigoObrigatorio = new javax.swing.JLabel();
        jLDescricaoObrigatoria = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setFocusTraversalPolicy(new TraversalPolicy(asList(this.jTFCodigo, this.jTFDescricao, this.jPButtonSalvar, this.jPButtonCancelar)));
        setFocusTraversalPolicyProvider(true);

        jPTopo.setBackground(new java.awt.Color(79, 195, 247));
        jPTopo.setPreferredSize(new java.awt.Dimension(85, 35));

        jLTitulo.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLTitulo.setText("Cadastro de Caixa");

        javax.swing.GroupLayout jPTopoLayout = new javax.swing.GroupLayout(jPTopo);
        jPTopo.setLayout(jPTopoLayout);
        jPTopoLayout.setHorizontalGroup(
            jPTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTopoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTitulo)
                .addContainerGap(266, Short.MAX_VALUE))
        );
        jPTopoLayout.setVerticalGroup(
            jPTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jLDescricao.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLDescricao.setText("Descrição");

        jTFDescricao.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTFDescricao.setToolTipText("Descrição do caixa");
        jTFDescricao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFDescricaoFocusGained(evt);
            }
        });
        jTFDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFDescricaoKeyPressed(evt);
            }
        });

        jLCodigo.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLCodigo.setText("Código");

        jTFCodigo.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTFCodigo.setToolTipText("Código do caixa");
        jTFCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFCodigoFocusGained(evt);
            }
        });
        jTFCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFCodigoKeyPressed(evt);
            }
        });

        jPButtonSalvar.setBackground(new java.awt.Color(0, 123, 255));
        jPButtonSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPButtonSalvar.setPreferredSize(new java.awt.Dimension(106, 35));
        jPButtonSalvar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPButtonSalvarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPButtonSalvarFocusLost(evt);
            }
        });
        jPButtonSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPButtonSalvarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPButtonSalvarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPButtonSalvarMouseExited(evt);
            }
        });
        jPButtonSalvar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPButtonSalvarKeyPressed(evt);
            }
        });

        jLButtonSalvar.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLButtonSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jLButtonSalvar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLButtonSalvar.setText("Salvar");

        jLIconButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wendel/pdv/images/icon_save.png"))); // NOI18N

        javax.swing.GroupLayout jPButtonSalvarLayout = new javax.swing.GroupLayout(jPButtonSalvar);
        jPButtonSalvar.setLayout(jPButtonSalvarLayout);
        jPButtonSalvarLayout.setHorizontalGroup(
            jPButtonSalvarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPButtonSalvarLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLIconButtonSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        jPButtonSalvarLayout.setVerticalGroup(
            jPButtonSalvarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(jLIconButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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

        jLCodigoObrigatorio.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLCodigoObrigatorio.setForeground(new java.awt.Color(255, 0, 0));
        jLCodigoObrigatorio.setText("*");

        jLDescricaoObrigatoria.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLDescricaoObrigatoria.setForeground(new java.awt.Color(255, 0, 0));
        jLDescricaoObrigatoria.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPTopo, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFCodigo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTFDescricao)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLCodigo)
                                .addGap(0, 0, 0)
                                .addComponent(jLCodigoObrigatorio))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLDescricao)
                                .addGap(0, 0, 0)
                                .addComponent(jLDescricaoObrigatoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCodigo)
                    .addComponent(jLCodigoObrigatorio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDescricao)
                    .addComponent(jLDescricaoObrigatoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPButtonSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPButtonSalvarMouseEntered
        SwingUtilities.invokeLater(() -> {
            this.jPButtonSalvar.setBackground(Cores.COR_BOTAO_SALVAR_ENTERED);
        });
    }//GEN-LAST:event_jPButtonSalvarMouseEntered

    private void jPButtonSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPButtonSalvarMouseExited
        SwingUtilities.invokeLater(() -> {
            this.jPButtonSalvar.setBackground(Cores.COR_BOTAO_SALVAR);
        });
    }//GEN-LAST:event_jPButtonSalvarMouseExited

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

    private void jPButtonSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPButtonSalvarMouseClicked
        this.acaoSalvar();
    }//GEN-LAST:event_jPButtonSalvarMouseClicked

    private void jPButtonCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPButtonCancelarMouseClicked
        try {
            App.getInstance().getPrincipalView().mostraTelaCaixas();
        } catch (Exception e) {
            enviarMensagemErro(e.getMessage());
        }
    }//GEN-LAST:event_jPButtonCancelarMouseClicked

    private void acaoSalvar() {
        try {
            if (this.controller.salvarCaixa(this.jTFCodigo.getText(), this.jTFDescricao.getText())) {
                App.getInstance().getPrincipalView().mostraTelaCaixas();
            }
        } catch (Exception e) {
            enviarMensagemErro(e.getMessage());
        }
    }

    private void jTFDescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFDescricaoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            SwingUtilities.invokeLater(() -> {
                this.jPButtonSalvar.requestFocusInWindow();
            });
        }
    }//GEN-LAST:event_jTFDescricaoKeyPressed

    private void jTFCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCodigoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            SwingUtilities.invokeLater(() -> {
                this.jTFDescricao.requestFocusInWindow();
            });
        }
    }//GEN-LAST:event_jTFCodigoKeyPressed

    private void jPButtonSalvarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPButtonSalvarFocusGained
        SwingUtilities.invokeLater(() -> {
            this.jPButtonSalvar.setBorder(BorderFactory.createDashedBorder(null, 1, 5, 5, false));
        });
    }//GEN-LAST:event_jPButtonSalvarFocusGained

    private void jPButtonSalvarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPButtonSalvarFocusLost
        SwingUtilities.invokeLater(() -> {
            this.jPButtonSalvar.setBorder(null);
        });
    }//GEN-LAST:event_jPButtonSalvarFocusLost

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

    private void jPButtonSalvarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPButtonSalvarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_SPACE) {
            this.acaoSalvar();
        }
    }//GEN-LAST:event_jPButtonSalvarKeyPressed

    private void jPButtonCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPButtonCancelarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_SPACE) {
            this.jPButtonCancelarMouseClicked(null);
        }
    }//GEN-LAST:event_jPButtonCancelarKeyPressed

    private void jTFCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFCodigoFocusGained
        SwingUtilities.invokeLater(() -> {
            this.jTFCodigo.selectAll();
        });
    }//GEN-LAST:event_jTFCodigoFocusGained

    private void jTFDescricaoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFDescricaoFocusGained
        SwingUtilities.invokeLater(() -> {
            this.jTFDescricao.selectAll();
        });
    }//GEN-LAST:event_jTFDescricaoFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLButtonCancelar;
    private javax.swing.JLabel jLButtonSalvar;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLCodigoObrigatorio;
    private javax.swing.JLabel jLDescricao;
    private javax.swing.JLabel jLDescricaoObrigatoria;
    private javax.swing.JLabel jLIconButtonCancelar;
    private javax.swing.JLabel jLIconButtonSalvar;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JPanel jPButtonCancelar;
    private javax.swing.JPanel jPButtonSalvar;
    private javax.swing.JPanel jPTopo;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFDescricao;
    // End of variables declaration//GEN-END:variables
}
