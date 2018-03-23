/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv;

import static br.com.wendel.pdv.util.Mensagem.enviarMensagemErro;
import br.com.wendel.pdv.view.LoginView;
import br.com.wendel.pdv.view.PrincipalView;
import javax.swing.UIManager;

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
            LoginView loginView = new LoginView();
            java.awt.EventQueue.invokeLater(() -> {
                loginView.setVisible(true);
            });
        } catch (Exception e) {
            enviarMensagemErro(e.getMessage());
        }
    }
}
