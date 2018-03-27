/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.view;

import br.com.wendel.pdv.App;
import br.com.wendel.pdv.controller.ProdutosController;
import br.com.wendel.pdv.util.Cores;
import static br.com.wendel.pdv.util.Mensagem.enviarMensagemErro;
import java.awt.event.KeyEvent;
import java.util.Map;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author INLOC01
 */
public class ProdutosView extends javax.swing.JPanel {

    private final ProdutosController produtosViewController;
    private final ProdutoTableModel produtoTableModel;
    private final JTableCustom<Map<String, Object>> tabela;

    /**
     * Creates new form HomeView
     */
    public ProdutosView() {
        this.produtosViewController = new ProdutosController();
        this.produtoTableModel = new ProdutoTableModel();
        this.tabela = new JTableCustom<>(this.produtoTableModel);
        initComponents();
    }

    public void carregaTela() throws Exception {
        this.jPButtonNovo.setBackground(Cores.COR_BOTAO_MENU);
        this.jPButtonEditar.setBackground(Cores.COR_BOTAO_MENU);
        this.jPButtonExcluir.setBackground(Cores.COR_BOTAO_MENU);
    }

    public void atualizaTabela() throws Exception {
        this.produtosViewController.pesquisar(TOOL_TIP_TEXT_KEY, TOOL_TIP_TEXT_KEY);
        this.produtoTableModel.setLista(this.produtosViewController.getList());
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
        jPButtonNovo = new javax.swing.JPanel();
        jLButtonNovo = new javax.swing.JLabel();
        jLIconButtonNovo = new javax.swing.JLabel();
        jPButtonExcluir = new javax.swing.JPanel();
        jLButtonExcluir = new javax.swing.JLabel();
        jLIconButtonExcluir = new javax.swing.JLabel();
        jPButtonEditar = new javax.swing.JPanel();
        jLButtonEditar = new javax.swing.JLabel();
        jLIconButtonEditar = new javax.swing.JLabel();
        jSPProdutos = new JScrollPane(this.tabela);
        jTFCodigo = new javax.swing.JTextField();
        jLCodigo = new javax.swing.JLabel();
        jTFDescricao = new javax.swing.JTextField();
        jLDescricao = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPTopo.setBackground(new java.awt.Color(79, 195, 247));
        jPTopo.setPreferredSize(new java.awt.Dimension(85, 35));

        jLTitulo.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLTitulo.setText("Produtos");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
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

        jSPProdutos.setBackground(new java.awt.Color(255, 255, 255));
        jSPProdutos.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jSPProdutos.setForeground(new java.awt.Color(255, 255, 255));

        jTFCodigo.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTFCodigo.setToolTipText("Sigla da unidade");
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

        jLCodigo.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLCodigo.setText("Código");

        jTFDescricao.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTFDescricao.setToolTipText("Sigla da unidade");
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

        jLDescricao.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLDescricao.setText("Descrição");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPTopo, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSPProdutos)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLCodigo)
                            .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLDescricao)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTFDescricao))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSPProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSPProdutos.getViewport().setBackground(new java.awt.Color(255, 255, 255));
    }// </editor-fold>//GEN-END:initComponents

    private void jPButtonNovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPButtonNovoMouseClicked
        try {
//            App.PRINCIPAL_VIEW.mostraConteudo(new UnidadeCadastroView(null));
        } catch (Exception e) {
            enviarMensagemErro(e.getMessage());
        }
    }//GEN-LAST:event_jPButtonNovoMouseClicked

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

    private void jPButtonExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPButtonExcluirMouseClicked
        try {
            Map<String, Object> produtoSelecionado = this.tabela.getSelected();
            if (produtoSelecionado != null
                    && ConfirmDialog.confirm(App.PRINCIPAL_VIEW, "Exclusão",
                            "<html>Deseja excluir o produto selecionado?")) {
                this.produtosViewController.delete((Long) produtoSelecionado.get("ID"));
                this.atualizaTabela();
            }
        } catch (Exception e) {
            enviarMensagemErro(e.getMessage());
        }
    }//GEN-LAST:event_jPButtonExcluirMouseClicked

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

    private void jPButtonEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPButtonEditarMouseClicked
        try {
            Map<String, Object> unidadeSelecionada = this.tabela.getSelected();
            if (unidadeSelecionada != null) {
//                App.PRINCIPAL_VIEW.mostraConteudo(new UnidadeCadastroView((Long) unidadeSelecionada.get("ID")));
            }
        } catch (Exception e) {
            enviarMensagemErro(e.getMessage());
        }
    }//GEN-LAST:event_jPButtonEditarMouseClicked

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

    private void jTFCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFCodigoFocusGained
        SwingUtilities.invokeLater(() -> {
            this.jTFCodigo.selectAll();
        });
    }//GEN-LAST:event_jTFCodigoFocusGained

    private void jTFCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCodigoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            SwingUtilities.invokeLater(() -> {
                this.jTFDescricao.requestFocusInWindow();
            });
        }
    }//GEN-LAST:event_jTFCodigoKeyPressed

    private void jTFDescricaoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFDescricaoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFDescricaoFocusGained

    private void jTFDescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFDescricaoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFDescricaoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLButtonEditar;
    private javax.swing.JLabel jLButtonExcluir;
    private javax.swing.JLabel jLButtonNovo;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLDescricao;
    private javax.swing.JLabel jLIconButtonEditar;
    private javax.swing.JLabel jLIconButtonExcluir;
    private javax.swing.JLabel jLIconButtonNovo;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JPanel jPButtonEditar;
    private javax.swing.JPanel jPButtonExcluir;
    private javax.swing.JPanel jPButtonNovo;
    private javax.swing.JPanel jPTopo;
    private javax.swing.JScrollPane jSPProdutos;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFDescricao;
    // End of variables declaration//GEN-END:variables
}
