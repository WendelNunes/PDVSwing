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
import br.com.wendel.pdv.util.TraversalPolicy;
import java.awt.event.KeyEvent;
import static java.util.Arrays.asList;
import java.util.Map;
import javax.swing.BorderFactory;
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
        SwingUtilities.invokeLater(() -> {
            this.jTFCodigo.requestFocusInWindow();
        });
    }

    public void carregaTela() throws Exception {
        this.jPButtonNovo.setBackground(Cores.COR_BOTAO_MENU);
        this.jPButtonEditar.setBackground(Cores.COR_BOTAO_MENU);
        this.jPButtonExcluir.setBackground(Cores.COR_BOTAO_MENU);
        SwingUtilities.invokeLater(() -> {
            this.jTFCodigo.requestFocusInWindow();
        });
        if (tabela.getRowCount() > 0) {
            this.atualizaTabela();
        }
    }

    public void atualizaTabela() throws Exception {
        this.produtosViewController.pesquisar(this.jTFCodigo.getText(), this.jTFDescricao.getText());
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
        jPButtonPesquisar = new javax.swing.JPanel();
        jLButtonPesquisar = new javax.swing.JLabel();
        jLIconButtonPesquisar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setFocusTraversalPolicy(new TraversalPolicy(asList(this.jTFCodigo, this.jTFDescricao, this.jPButtonPesquisar, this.tabela)));
        setFocusTraversalPolicyProvider(true);

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

        jPButtonPesquisar.setBackground(new java.awt.Color(0, 123, 255));
        jPButtonPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPButtonPesquisar.setPreferredSize(new java.awt.Dimension(106, 35));
        jPButtonPesquisar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPButtonPesquisarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPButtonPesquisarFocusLost(evt);
            }
        });
        jPButtonPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPButtonPesquisarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPButtonPesquisarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPButtonPesquisarMouseExited(evt);
            }
        });
        jPButtonPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPButtonPesquisarKeyPressed(evt);
            }
        });

        jLButtonPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLButtonPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        jLButtonPesquisar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLButtonPesquisar.setText("Pesquisar");

        jLIconButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wendel/pdv/images/icon_save.png"))); // NOI18N

        javax.swing.GroupLayout jPButtonPesquisarLayout = new javax.swing.GroupLayout(jPButtonPesquisar);
        jPButtonPesquisar.setLayout(jPButtonPesquisarLayout);
        jPButtonPesquisarLayout.setHorizontalGroup(
            jPButtonPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPButtonPesquisarLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLIconButtonPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLButtonPesquisar)
                .addGap(10, 10, 10))
        );
        jPButtonPesquisarLayout.setVerticalGroup(
            jPButtonPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLButtonPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(jLIconButtonPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(jLCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFDescricao)
                            .addComponent(jLDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addComponent(jTFDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSPProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSPProdutos.getViewport().setBackground(new java.awt.Color(255, 255, 255));
    }// </editor-fold>//GEN-END:initComponents

    private void jPButtonNovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPButtonNovoMouseClicked
        try {
            App.getInstance().getPrincipalView().mostraConteudo(new ProdutoCadastroView(null));
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
                    && ConfirmDialog.confirm(App.getInstance().getPrincipalView(), "Exclusão",
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
            Map<String, Object> produtoSelecionado = this.tabela.getSelected();
            if (produtoSelecionado != null) {
                App.getInstance().getPrincipalView().mostraConteudo(new ProdutoCadastroView((Long) produtoSelecionado.get("ID")));
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
        SwingUtilities.invokeLater(() -> {
            this.jTFDescricao.selectAll();
        });
    }//GEN-LAST:event_jTFDescricaoFocusGained

    private void jTFDescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFDescricaoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            SwingUtilities.invokeLater(() -> {
                this.jPButtonPesquisar.requestFocusInWindow();
            });
        }
    }//GEN-LAST:event_jTFDescricaoKeyPressed

    private void jPButtonPesquisarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPButtonPesquisarFocusGained
        SwingUtilities.invokeLater(() -> {
            this.jPButtonPesquisar.setBorder(BorderFactory.createDashedBorder(null, 1, 5, 5, false));
        });
    }//GEN-LAST:event_jPButtonPesquisarFocusGained

    private void jPButtonPesquisarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPButtonPesquisarFocusLost
        SwingUtilities.invokeLater(() -> {
            this.jPButtonPesquisar.setBorder(null);
        });
    }//GEN-LAST:event_jPButtonPesquisarFocusLost

    private void jPButtonPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPButtonPesquisarMouseClicked
        this.acaoPesquisar();
    }//GEN-LAST:event_jPButtonPesquisarMouseClicked

    private void jPButtonPesquisarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPButtonPesquisarMouseEntered
        SwingUtilities.invokeLater(() -> {
            this.jPButtonPesquisar.setBackground(Cores.COR_BOTAO_SALVAR_ENTERED);
        });
    }//GEN-LAST:event_jPButtonPesquisarMouseEntered

    private void jPButtonPesquisarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPButtonPesquisarMouseExited
        SwingUtilities.invokeLater(() -> {
            this.jPButtonPesquisar.setBackground(Cores.COR_BOTAO_SALVAR);
        });
    }//GEN-LAST:event_jPButtonPesquisarMouseExited

    private void jPButtonPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPButtonPesquisarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_SPACE) {
            this.acaoPesquisar();
        }
    }//GEN-LAST:event_jPButtonPesquisarKeyPressed

    public void acaoPesquisar() {
        try {
            this.atualizaTabela();
            this.jTFCodigo.requestFocusInWindow();
        } catch (Exception e) {
            enviarMensagemErro(e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLButtonEditar;
    private javax.swing.JLabel jLButtonExcluir;
    private javax.swing.JLabel jLButtonNovo;
    private javax.swing.JLabel jLButtonPesquisar;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLDescricao;
    private javax.swing.JLabel jLIconButtonEditar;
    private javax.swing.JLabel jLIconButtonExcluir;
    private javax.swing.JLabel jLIconButtonNovo;
    private javax.swing.JLabel jLIconButtonPesquisar;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JPanel jPButtonEditar;
    private javax.swing.JPanel jPButtonExcluir;
    private javax.swing.JPanel jPButtonNovo;
    private javax.swing.JPanel jPButtonPesquisar;
    private javax.swing.JPanel jPTopo;
    private javax.swing.JScrollPane jSPProdutos;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFDescricao;
    // End of variables declaration//GEN-END:variables
}
