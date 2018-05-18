/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.view;

import br.com.wendel.pdv.App;
import br.com.wendel.pdv.controller.AberturaCaixaCadastroController;
import br.com.wendel.pdv.entity.Caixa;
import br.com.wendel.pdv.entity.Usuario;
import br.com.wendel.pdv.util.Cores;
import static br.com.wendel.pdv.util.Mensagem.enviarMensagemErro;
import br.com.wendel.pdv.util.Sessao;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.SwingUtilities;

/**
 *
 * @author INLOC01
 */
public class AberturaCaixaCadastroView extends javax.swing.JPanel {

    private final AberturaCaixaCadastroController controller;
    private final DecimalFormat formataValor;
    private final SimpleDateFormat formataData;
    private final Date dataHora;
    private final Usuario usuario;

    /**
     * Creates new form HomeView
     *
     * @param id
     * @throws java.lang.Exception
     */
    public AberturaCaixaCadastroView(Long id) throws Exception {
        this.formataValor = new DecimalFormat("#,##0.00");
        this.formataValor.setParseBigDecimal(true);
        this.formataData = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        this.controller = new AberturaCaixaCadastroController(id);
        initComponents();
        this.controller.getListaCaixas().forEach(i -> this.jCBCaixas.addItem(i));
        if (this.controller.getAberturaCaixa() != null) {
            this.usuario = this.controller.getAberturaCaixa().getUsuario();
            this.jTFUsuario.setText(this.controller.getAberturaCaixa().getUsuario().getCodigo());
            this.dataHora = this.controller.getAberturaCaixa().getDataHora();
            this.jTFData.setText(this.formataData.format(this.controller.getAberturaCaixa().getDataHora()));
            for (int i = 0; i < this.jCBCaixas.getItemCount(); i++) {
                if (this.jCBCaixas.getItemAt(i).get("ID").equals(this.controller.getAberturaCaixa().getCaixa().getId())) {
                    this.jCBCaixas.setSelectedIndex(i);
                    break;
                }
            }
            this.jFTFSaldoInicial.setText(this.formataValor.format(this.controller.getAberturaCaixa().getValorFundoCaixa()));
        } else {
            this.usuario = Sessao.getInstance().getUsuario();
            this.jTFUsuario.setText(this.usuario.getCodigo());
            this.dataHora = new Date();
            this.jTFData.setText(this.formataData.format(this.dataHora));
        }
        SwingUtilities.invokeLater(() -> {
            this.jCBCaixas.requestFocusInWindow();
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
        jLUsuario = new javax.swing.JLabel();
        jTFUsuario = new javax.swing.JTextField();
        jTFData = new javax.swing.JTextField();
        jLData = new javax.swing.JLabel();
        jLCaixa = new javax.swing.JLabel();
        jLObrigatorioCaixa = new javax.swing.JLabel();
        jCBCaixas = new javax.swing.JComboBox<>();
        jLSaldoInicial = new javax.swing.JLabel();
        jLObrigatorioSaldoInicial = new javax.swing.JLabel();
        jFTFSaldoInicial = new javax.swing.JFormattedTextField();
        jPButtonSalvar = new javax.swing.JPanel();
        jLButtonSalvar = new javax.swing.JLabel();
        jLIconButtonSalvar = new javax.swing.JLabel();
        jPButtonCancelar = new javax.swing.JPanel();
        jLButtonCancelar = new javax.swing.JLabel();
        jLIconButtonCancelar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPTopo.setBackground(new java.awt.Color(79, 195, 247));
        jPTopo.setPreferredSize(new java.awt.Dimension(85, 35));

        jLTitulo.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLTitulo.setText("Abertura de Caixa");

        javax.swing.GroupLayout jPTopoLayout = new javax.swing.GroupLayout(jPTopo);
        jPTopo.setLayout(jPTopoLayout);
        jPTopoLayout.setHorizontalGroup(
            jPTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTopoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTitulo)
                .addContainerGap(321, Short.MAX_VALUE))
        );
        jPTopoLayout.setVerticalGroup(
            jPTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jLUsuario.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLUsuario.setText("Usuário");

        jTFUsuario.setEditable(false);
        jTFUsuario.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTFUsuario.setToolTipText("Sigla da unidade");
        jTFUsuario.setEnabled(false);

        jTFData.setEditable(false);
        jTFData.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTFData.setToolTipText("Sigla da unidade");
        jTFData.setEnabled(false);

        jLData.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLData.setText("Data");

        jLCaixa.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLCaixa.setText("Caixa");

        jLObrigatorioCaixa.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLObrigatorioCaixa.setForeground(new java.awt.Color(255, 0, 0));
        jLObrigatorioCaixa.setText("*");

        jCBCaixas.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jCBCaixas.setRenderer(new CaixaListCellRender());
        jCBCaixas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCBCaixasKeyPressed(evt);
            }
        });

        jLSaldoInicial.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLSaldoInicial.setText("Saldo Inicial");

        jLObrigatorioSaldoInicial.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLObrigatorioSaldoInicial.setForeground(new java.awt.Color(255, 0, 0));
        jLObrigatorioSaldoInicial.setText("*");

        jFTFSaldoInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(formataValor)));
        jFTFSaldoInicial.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jFTFSaldoInicial.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jFTFSaldoInicial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFTFSaldoInicialFocusGained(evt);
            }
        });
        jFTFSaldoInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFTFSaldoInicialKeyPressed(evt);
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

        jLIconButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wendel/pdv/images/icon_save.png"))); // NOI18N

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
            .addComponent(jPTopo, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFUsuario)
                            .addComponent(jCBCaixas, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLUsuario)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLCaixa)
                                        .addGap(0, 0, 0)
                                        .addComponent(jLObrigatorioCaixa)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLSaldoInicial)
                                .addGap(0, 0, 0)
                                .addComponent(jLObrigatorioSaldoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLData)
                                .addComponent(jTFData, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                .addComponent(jFTFSaldoInicial))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLUsuario)
                            .addComponent(jLData))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTFData, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLCaixa)
                        .addComponent(jLObrigatorioCaixa))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLSaldoInicial)
                        .addComponent(jLObrigatorioSaldoInicial)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCBCaixas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTFSaldoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCBCaixasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCBCaixasKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            SwingUtilities.invokeLater(() -> {
                this.jFTFSaldoInicial.requestFocusInWindow();
            });
        }
    }//GEN-LAST:event_jCBCaixasKeyPressed

    private void jFTFSaldoInicialFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFTFSaldoInicialFocusGained
        SwingUtilities.invokeLater(() -> {
            this.jFTFSaldoInicial.selectAll();
        });
    }//GEN-LAST:event_jFTFSaldoInicialFocusGained

    private void jFTFSaldoInicialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFTFSaldoInicialKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            SwingUtilities.invokeLater(() -> {
                this.jPButtonSalvar.requestFocusInWindow();
            });
        }
    }//GEN-LAST:event_jFTFSaldoInicialKeyPressed

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

    private void jPButtonSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPButtonSalvarMouseClicked
        this.acaoSalvar();
    }//GEN-LAST:event_jPButtonSalvarMouseClicked

    private void acaoSalvar() {
        try {
            Map<String, Object> caixaSelecionado = (Map<String, Object>) this.jCBCaixas.getSelectedItem();
            Caixa caixa = null;
            if (caixaSelecionado != null) {
                caixa = new Caixa();
                caixa.setId((Long) caixaSelecionado.get("ID"));
            }
            BigDecimal valor = BigDecimal.ZERO;
            if (!this.jFTFSaldoInicial.getText().trim().isEmpty()) {
                valor = (BigDecimal) this.formataValor.parse(this.jFTFSaldoInicial.getText());
            }
            if (this.controller.salvarAberturaCaixa(caixa, this.dataHora, this.usuario, valor)) {
                App.getInstance().getPrincipalView().mostraTelaAtendimento();
            }
        } catch (Exception e) {
            enviarMensagemErro(e.getMessage());
        }
    }

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

    private void jPButtonSalvarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPButtonSalvarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_SPACE) {
            this.acaoSalvar();
        }
    }//GEN-LAST:event_jPButtonSalvarKeyPressed

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
            App.getInstance().getPrincipalView().mostraTelaHome();
        } catch (Exception e) {
            enviarMensagemErro(e.getMessage());
        }
    }//GEN-LAST:event_jPButtonCancelarMouseClicked

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
    private javax.swing.JComboBox<Map<String,Object>> jCBCaixas;
    private javax.swing.JFormattedTextField jFTFSaldoInicial;
    private javax.swing.JLabel jLButtonCancelar;
    private javax.swing.JLabel jLButtonSalvar;
    private javax.swing.JLabel jLCaixa;
    private javax.swing.JLabel jLData;
    private javax.swing.JLabel jLIconButtonCancelar;
    private javax.swing.JLabel jLIconButtonSalvar;
    private javax.swing.JLabel jLObrigatorioCaixa;
    private javax.swing.JLabel jLObrigatorioSaldoInicial;
    private javax.swing.JLabel jLSaldoInicial;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLUsuario;
    private javax.swing.JPanel jPButtonCancelar;
    private javax.swing.JPanel jPButtonSalvar;
    private javax.swing.JPanel jPTopo;
    private javax.swing.JTextField jTFData;
    private javax.swing.JTextField jTFUsuario;
    // End of variables declaration//GEN-END:variables

    private class CaixaListCellRender extends DefaultListCellRenderer {

        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            if (value != null && value instanceof Map) {
                this.setText(((Map<String, Object>) value).get("CODIGO") + " - " + ((Map<String, Object>) value).get("DESCRICAO"));
            } else {
                this.setText("");
            }
            return c;
        }
    }
}
