/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv;

import br.com.wendel.pdv.view.PrincipalView;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author INLOC01
 */
public class App {

    public static PrincipalView PRINCIPAL_VIEW;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            PRINCIPAL_VIEW = new PrincipalView();
            java.awt.EventQueue.invokeLater(() -> {
                PRINCIPAL_VIEW.setVisible(true);
            });
        } catch (Exception e) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
