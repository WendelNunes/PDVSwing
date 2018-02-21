/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.view;

import java.awt.Color;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

/**
 *
 * @author INLOC01
 */
public class HomeView extends javax.swing.JFrame {

    /**
     * Creates new form HomeView
     */
    public HomeView() {
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
        jPMenu = new javax.swing.JPanel();
        jPMenuHome = new javax.swing.JPanel();
        jLMenuHome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPMenuCadastros = new javax.swing.JPanel();
        jLMenuCadastros = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPMenuRelatorios = new javax.swing.JPanel();
        jLMenuRelatorios = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPMenuAtendimento = new javax.swing.JPanel();
        jLMenuAtendimento = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPTop = new javax.swing.JPanel();
        jPMostraMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPMenu.setBackground(new java.awt.Color(79, 195, 247));

        jPMenuHome.setBackground(new java.awt.Color(79, 195, 247));
        jPMenuHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPMenuHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPMenuHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPMenuHomeMouseExited(evt);
            }
        });

        jLMenuHome.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLMenuHome.setForeground(new java.awt.Color(255, 255, 255));
        jLMenuHome.setText("Home");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wendel/pdv/images/icon_home.png"))); // NOI18N

        javax.swing.GroupLayout jPMenuHomeLayout = new javax.swing.GroupLayout(jPMenuHome);
        jPMenuHome.setLayout(jPMenuHomeLayout);
        jPMenuHomeLayout.setHorizontalGroup(
            jPMenuHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPMenuHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLMenuHome, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPMenuHomeLayout.setVerticalGroup(
            jPMenuHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLMenuHome, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPMenuCadastros.setBackground(new java.awt.Color(79, 195, 247));
        jPMenuCadastros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPMenuCadastros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPMenuCadastrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPMenuCadastrosMouseExited(evt);
            }
        });

        jLMenuCadastros.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLMenuCadastros.setForeground(new java.awt.Color(255, 255, 255));
        jLMenuCadastros.setText("Cadastros");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wendel/pdv/images/icon_create.png"))); // NOI18N

        javax.swing.GroupLayout jPMenuCadastrosLayout = new javax.swing.GroupLayout(jPMenuCadastros);
        jPMenuCadastros.setLayout(jPMenuCadastrosLayout);
        jPMenuCadastrosLayout.setHorizontalGroup(
            jPMenuCadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPMenuCadastrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLMenuCadastros, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPMenuCadastrosLayout.setVerticalGroup(
            jPMenuCadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLMenuCadastros, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPMenuRelatorios.setBackground(new java.awt.Color(79, 195, 247));
        jPMenuRelatorios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPMenuRelatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPMenuRelatoriosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPMenuRelatoriosMouseExited(evt);
            }
        });

        jLMenuRelatorios.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLMenuRelatorios.setForeground(new java.awt.Color(255, 255, 255));
        jLMenuRelatorios.setText("Relatórios");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wendel/pdv/images/icon_excel.png"))); // NOI18N

        javax.swing.GroupLayout jPMenuRelatoriosLayout = new javax.swing.GroupLayout(jPMenuRelatorios);
        jPMenuRelatorios.setLayout(jPMenuRelatoriosLayout);
        jPMenuRelatoriosLayout.setHorizontalGroup(
            jPMenuRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPMenuRelatoriosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLMenuRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPMenuRelatoriosLayout.setVerticalGroup(
            jPMenuRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLMenuRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPMenuAtendimento.setBackground(new java.awt.Color(79, 195, 247));
        jPMenuAtendimento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPMenuAtendimento.setPreferredSize(new java.awt.Dimension(148, 35));
        jPMenuAtendimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPMenuAtendimentoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPMenuAtendimentoMouseExited(evt);
            }
        });

        jLMenuAtendimento.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLMenuAtendimento.setForeground(new java.awt.Color(255, 255, 255));
        jLMenuAtendimento.setText("Atendimento");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wendel/pdv/images/icon_laptop.png"))); // NOI18N

        javax.swing.GroupLayout jPMenuAtendimentoLayout = new javax.swing.GroupLayout(jPMenuAtendimento);
        jPMenuAtendimento.setLayout(jPMenuAtendimentoLayout);
        jPMenuAtendimentoLayout.setHorizontalGroup(
            jPMenuAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPMenuAtendimentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLMenuAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPMenuAtendimentoLayout.setVerticalGroup(
            jPMenuAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLMenuAtendimento, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPMenuLayout = new javax.swing.GroupLayout(jPMenu);
        jPMenu.setLayout(jPMenuLayout);
        jPMenuLayout.setHorizontalGroup(
            jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPMenuHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPMenuCadastros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPMenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPMenuAtendimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPMenuRelatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPMenuLayout.setVerticalGroup(
            jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPMenuHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPMenuCadastros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPMenuAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPMenuRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );

        jPTop.setBackground(new java.awt.Color(3, 169, 244));

        jPMostraMenu.setBackground(new java.awt.Color(3, 169, 244));
        jPMostraMenu.setPreferredSize(new java.awt.Dimension(160, 50));
        jPMostraMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPMostraMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPMostraMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPMostraMenuMouseExited(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wendel/pdv/images/icon_menu.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPMostraMenuLayout = new javax.swing.GroupLayout(jPMostraMenu);
        jPMostraMenu.setLayout(jPMostraMenuLayout);
        jPMostraMenuLayout.setHorizontalGroup(
            jPMostraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMostraMenuLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addGap(5, 5, 5))
        );
        jPMostraMenuLayout.setVerticalGroup(
            jPMostraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPTopLayout = new javax.swing.GroupLayout(jPTop);
        jPTop.setLayout(jPTopLayout);
        jPTopLayout.setHorizontalGroup(
            jPTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTopLayout.createSequentialGroup()
                .addComponent(jPMostraMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPTopLayout.setVerticalGroup(
            jPTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPTopLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPMostraMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(244, 244, 244));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

    private void jPMenuHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuHomeMouseEntered
        SwingUtilities.invokeLater(() -> {
            this.jPMenuHome.setBackground(new Color(3, 169, 244));
        });
    }//GEN-LAST:event_jPMenuHomeMouseEntered

    private void jPMenuHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuHomeMouseExited
        SwingUtilities.invokeLater(() -> {
            this.jPMenuHome.setBackground(new Color(79, 195, 247));
        });
    }//GEN-LAST:event_jPMenuHomeMouseExited

    private void jPMenuCadastrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuCadastrosMouseEntered
        SwingUtilities.invokeLater(() -> {
            this.jPMenuCadastros.setBackground(new Color(3, 169, 244));
        });
    }//GEN-LAST:event_jPMenuCadastrosMouseEntered

    private void jPMenuCadastrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuCadastrosMouseExited
        SwingUtilities.invokeLater(() -> {
            this.jPMenuCadastros.setBackground(new Color(79, 195, 247));
        });
    }//GEN-LAST:event_jPMenuCadastrosMouseExited

    private void jPMostraMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMostraMenuMouseEntered
        SwingUtilities.invokeLater(() -> {
            this.jPMostraMenu.setBackground(new Color(79, 195, 247));
        });
    }//GEN-LAST:event_jPMostraMenuMouseEntered

    private void jPMostraMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMostraMenuMouseExited
        this.jPMostraMenu.setBackground(new Color(3, 169, 244));
    }//GEN-LAST:event_jPMostraMenuMouseExited

    private void jPMostraMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMostraMenuMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            if (this.jPMenu.isVisible()) {
                this.jPMenu.setVisible(false);
            } else {
                this.jPMenu.setVisible(true);
            }
        }
    }//GEN-LAST:event_jPMostraMenuMouseClicked

    private void jPMenuAtendimentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuAtendimentoMouseEntered
        SwingUtilities.invokeLater(() -> {
            this.jPMenuAtendimento.setBackground(new Color(3, 169, 244));
        });
    }//GEN-LAST:event_jPMenuAtendimentoMouseEntered

    private void jPMenuAtendimentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuAtendimentoMouseExited
        SwingUtilities.invokeLater(() -> {
            this.jPMenuAtendimento.setBackground(new Color(79, 195, 247));
        });
    }//GEN-LAST:event_jPMenuAtendimentoMouseExited

    private void jPMenuRelatoriosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuRelatoriosMouseEntered
        SwingUtilities.invokeLater(() -> {
            this.jPMenuRelatorios.setBackground(new Color(3, 169, 244));
        });
    }//GEN-LAST:event_jPMenuRelatoriosMouseEntered

    private void jPMenuRelatoriosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuRelatoriosMouseExited
        SwingUtilities.invokeLater(() -> {
            this.jPMenuRelatorios.setBackground(new Color(79, 195, 247));
        });
    }//GEN-LAST:event_jPMenuRelatoriosMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new HomeView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLMenuAtendimento;
    private javax.swing.JLabel jLMenuCadastros;
    private javax.swing.JLabel jLMenuHome;
    private javax.swing.JLabel jLMenuRelatorios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPMenu;
    private javax.swing.JPanel jPMenuAtendimento;
    private javax.swing.JPanel jPMenuCadastros;
    private javax.swing.JPanel jPMenuHome;
    private javax.swing.JPanel jPMenuRelatorios;
    private javax.swing.JPanel jPMostraMenu;
    private javax.swing.JPanel jPTop;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
