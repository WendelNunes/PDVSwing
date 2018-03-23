/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.view;

import br.com.wendel.pdv.App;
import br.com.wendel.pdv.controller.LoginController;
import br.com.wendel.pdv.util.BCrypt;
import br.com.wendel.pdv.util.Cores;
import static br.com.wendel.pdv.util.Mensagem.enviarMensagemErro;
import br.com.wendel.pdv.util.Sessao;
import br.com.wendel.pdv.util.TraversalPolicy;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import static java.util.Arrays.asList;
import javax.swing.BorderFactory;
import javax.swing.SwingUtilities;

/**
 *
 * @author INLOC01
 */
public class LoginView extends javax.swing.JFrame {

    private final LoginController loginController;

    /**
     * Creates new form LoginView
     */
    public LoginView() {
        this.loginController = new LoginController();
        initComponents();
        this.setLocationRelativeTo(null);
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
        jPLogin = new javax.swing.JPanel();
        jPTopo = new javax.swing.JPanel();
        jLTitulo = new javax.swing.JLabel();
        jTFUsuario = new javax.swing.JTextField();
        jLUsuario = new javax.swing.JLabel();
        jLSenha = new javax.swing.JLabel();
        jPFSenha = new javax.swing.JPasswordField();
        jPBEntrar = new javax.swing.JPanel();
        jLButtonEntrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicy(new TraversalPolicy(asList(this.jTFUsuario, this.jPFSenha, this.jPBEntrar)));
        setFocusTraversalPolicyProvider(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPLogin.setBackground(new java.awt.Color(255, 255, 255));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setShadowColor(new java.awt.Color(226, 226, 226));
        dropShadowBorder1.setShowLeftShadow(true);
        jPLogin.setBorder(dropShadowBorder1);
        jPLogin.setPreferredSize(new java.awt.Dimension(300, 226));

        jPTopo.setBackground(new java.awt.Color(79, 195, 247));
        jPTopo.setPreferredSize(new java.awt.Dimension(85, 35));

        jLTitulo.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLTitulo.setText("Login");

        javax.swing.GroupLayout jPTopoLayout = new javax.swing.GroupLayout(jPTopo);
        jPTopo.setLayout(jPTopoLayout);
        jPTopoLayout.setHorizontalGroup(
            jPTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTopoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPTopoLayout.setVerticalGroup(
            jPTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jTFUsuario.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTFUsuario.setToolTipText("Sigla da unidade");
        jTFUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFUsuarioFocusGained(evt);
            }
        });
        jTFUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFUsuarioKeyPressed(evt);
            }
        });

        jLUsuario.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLUsuario.setText("Usuário");

        jLSenha.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLSenha.setText("Senha");

        jPFSenha.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jPFSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPFSenhaKeyPressed(evt);
            }
        });

        jPBEntrar.setBackground(new java.awt.Color(0, 123, 255));
        jPBEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPBEntrar.setPreferredSize(new java.awt.Dimension(106, 35));
        jPBEntrar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPBEntrarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPBEntrarFocusLost(evt);
            }
        });
        jPBEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPBEntrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPBEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPBEntrarMouseExited(evt);
            }
        });
        jPBEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPBEntrarKeyPressed(evt);
            }
        });

        jLButtonEntrar.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLButtonEntrar.setForeground(new java.awt.Color(255, 255, 255));
        jLButtonEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLButtonEntrar.setText("Entrar");

        javax.swing.GroupLayout jPBEntrarLayout = new javax.swing.GroupLayout(jPBEntrar);
        jPBEntrar.setLayout(jPBEntrarLayout);
        jPBEntrarLayout.setHorizontalGroup(
            jPBEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBEntrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLButtonEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPBEntrarLayout.setVerticalGroup(
            jPBEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLButtonEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPLoginLayout = new javax.swing.GroupLayout(jPLogin);
        jPLogin.setLayout(jPLoginLayout);
        jPLoginLayout.setHorizontalGroup(
            jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPTopo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
            .addGroup(jPLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFUsuario)
                    .addComponent(jPFSenha)
                    .addGroup(jPLoginLayout.createSequentialGroup()
                        .addGroup(jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLUsuario)
                            .addComponent(jLSenha))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPBEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPLoginLayout.setVerticalGroup(
            jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPLoginLayout.createSequentialGroup()
                .addComponent(jPTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPBEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(300, Short.MAX_VALUE)
                .addComponent(jPLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFUsuarioFocusGained
        SwingUtilities.invokeLater(() -> {
            this.jTFUsuario.selectAll();
        });
    }//GEN-LAST:event_jTFUsuarioFocusGained

    private void jTFUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFUsuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            SwingUtilities.invokeLater(() -> {
                this.jPFSenha.requestFocusInWindow();
            });
        }
    }//GEN-LAST:event_jTFUsuarioKeyPressed

    private void jPBEntrarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPBEntrarFocusGained
        SwingUtilities.invokeLater(() -> {
            this.jPBEntrar.setBorder(BorderFactory.createDashedBorder(null, 1, 5, 5, false));
        });
    }//GEN-LAST:event_jPBEntrarFocusGained

    private void jPBEntrarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPBEntrarFocusLost
        SwingUtilities.invokeLater(() -> {
            this.jPBEntrar.setBorder(null);
        });
    }//GEN-LAST:event_jPBEntrarFocusLost

    private void jPBEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPBEntrarMouseClicked
        this.acaoEntrar();
    }//GEN-LAST:event_jPBEntrarMouseClicked

    private void jPBEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPBEntrarMouseEntered
        SwingUtilities.invokeLater(() -> {
            this.jPBEntrar.setBackground(Cores.COR_BOTAO_SALVAR_ENTERED);
        });
    }//GEN-LAST:event_jPBEntrarMouseEntered

    private void jPBEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPBEntrarMouseExited
        SwingUtilities.invokeLater(() -> {
            this.jPBEntrar.setBackground(Cores.COR_BOTAO_SALVAR);
        });
    }//GEN-LAST:event_jPBEntrarMouseExited

    private void jPBEntrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPBEntrarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_SPACE) {
            this.acaoEntrar();
        }
    }//GEN-LAST:event_jPBEntrarKeyPressed

    private void jPFSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPFSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            SwingUtilities.invokeLater(() -> {
                this.jPBEntrar.requestFocusInWindow();
            });
        }
    }//GEN-LAST:event_jPFSenhaKeyPressed

    private void acaoEntrar() {
        try {
            System.out.println(BCrypt.hashpw(Arrays.toString(this.jPFSenha.getPassword()), BCrypt.gensalt()));
            if (this.loginController.acaoEntrar(this.jTFUsuario.getText(), Arrays.toString(this.jPFSenha.getPassword()))) {
                PrincipalView principalView = new PrincipalView();
                Sessao.USUARIO = this.loginController.getUsuario();
                App.PRINCIPAL_VIEW = principalView;
                principalView.setVisible(true);
            }
        } catch (Exception e) {
            enviarMensagemErro(e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLButtonEntrar;
    private javax.swing.JLabel jLSenha;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLUsuario;
    private javax.swing.JPanel jPBEntrar;
    private javax.swing.JPasswordField jPFSenha;
    private javax.swing.JPanel jPLogin;
    private javax.swing.JPanel jPTopo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFUsuario;
    // End of variables declaration//GEN-END:variables
}
