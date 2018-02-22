/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.view;

import static br.com.wendel.pdv.util.Cores.COR_BOTAO_MENU;
import static br.com.wendel.pdv.util.Cores.COR_BOTAO_MENU_ENTERED;
import static br.com.wendel.pdv.util.Cores.COR_BOTAO_MENU_SELECIONADO;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author INLOC01
 */
public class PrincipalView extends javax.swing.JFrame {

    private final List<JPanel> listaMenus = new ArrayList<>();
    private JPanel menuSelecionado;
    private final HomeView telaHome = new HomeView();
    private final ClientesView telaClientes = new ClientesView();
    private final ProdutosView telaProdutos = new ProdutosView();
    private final UnidadesView telaUnidades = new UnidadesView();
    private final AtendimentoView telaAtendimento = new AtendimentoView();

    /**
     * Creates new form HomeView
     */
    public PrincipalView() {
        initComponents();
        this.listaMenus.add(this.jPMenuHome);
        this.listaMenus.add(this.jPMenuClientes);
        this.listaMenus.add(this.jPMenuProdutos);
        this.listaMenus.add(this.jPMenuUnidades);
        this.listaMenus.add(this.jPMenuAtendimento);
        this.listaMenus.add(this.jPMenuRelatorios);
        this.mouseMenuClicked(this.jPMenuHome, this.telaHome);
        this.jPCadastros.setVisible(false);
    }

    private void mostraTelaConteudo(JPanel tela) {
        jPConteudo.removeAll();
        javax.swing.GroupLayout jPConteudoLayout = new javax.swing.GroupLayout(jPConteudo);
        jPConteudo.setLayout(jPConteudoLayout);
        jPConteudoLayout.setHorizontalGroup(
                jPConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPConteudoLayout.createSequentialGroup()
                        .addComponent(tela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPConteudoLayout.setVerticalGroup(
                jPConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPConteudoLayout.createSequentialGroup()
                        .addComponent(tela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }

    private void setarCorDefaultMenusNaoSelecionados() {
        this.listaMenus.stream().filter(i -> !i.equals(this.menuSelecionado)).forEach(i -> {
            i.setBackground(COR_BOTAO_MENU);
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

        jPTela = new javax.swing.JPanel();
        jPMenu = new javax.swing.JPanel();
        jPMenuHome = new javax.swing.JPanel();
        jLMenuHome = new javax.swing.JLabel();
        jLIconHome = new javax.swing.JLabel();
        jPMenuCadastros = new javax.swing.JPanel();
        jLMenuCadastros = new javax.swing.JLabel();
        jLIconCadastros = new javax.swing.JLabel();
        jPMenuRelatorios = new javax.swing.JPanel();
        jLMenuRelatorios = new javax.swing.JLabel();
        jLIconRelatorios = new javax.swing.JLabel();
        jPMenuAtendimento = new javax.swing.JPanel();
        jLMenuAtendimento = new javax.swing.JLabel();
        jLIconAtendimento = new javax.swing.JLabel();
        jPCadastros = new javax.swing.JPanel();
        jPMenuProdutos = new javax.swing.JPanel();
        jLMenuCadastrosProdutos = new javax.swing.JLabel();
        jPMenuClientes = new javax.swing.JPanel();
        jLMenuCadastrosClientes = new javax.swing.JLabel();
        jPMenuUnidades = new javax.swing.JPanel();
        jLMenuCadastrosUnidades = new javax.swing.JLabel();
        jPTop = new javax.swing.JPanel();
        jPMostraMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPPrincipal = new javax.swing.JPanel();
        jPConteudo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPTela.setBackground(new java.awt.Color(255, 255, 255));

        jPMenu.setBackground(new java.awt.Color(79, 195, 247));

        jPMenuHome.setBackground(new java.awt.Color(79, 195, 247));
        jPMenuHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPMenuHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPMenuHomeMouseClicked(evt);
            }
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

        jLIconHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wendel/pdv/images/icon_home.png"))); // NOI18N

        javax.swing.GroupLayout jPMenuHomeLayout = new javax.swing.GroupLayout(jPMenuHome);
        jPMenuHome.setLayout(jPMenuHomeLayout);
        jPMenuHomeLayout.setHorizontalGroup(
            jPMenuHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPMenuHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLIconHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLMenuHome, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPMenuHomeLayout.setVerticalGroup(
            jPMenuHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLMenuHome, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(jLIconHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPMenuCadastros.setBackground(new java.awt.Color(79, 195, 247));
        jPMenuCadastros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPMenuCadastros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPMenuCadastrosMouseClicked(evt);
            }
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

        jLIconCadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wendel/pdv/images/icon_create.png"))); // NOI18N

        javax.swing.GroupLayout jPMenuCadastrosLayout = new javax.swing.GroupLayout(jPMenuCadastros);
        jPMenuCadastros.setLayout(jPMenuCadastrosLayout);
        jPMenuCadastrosLayout.setHorizontalGroup(
            jPMenuCadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPMenuCadastrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLIconCadastros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLMenuCadastros, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPMenuCadastrosLayout.setVerticalGroup(
            jPMenuCadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLIconCadastros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jLIconRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wendel/pdv/images/icon_excel.png"))); // NOI18N

        javax.swing.GroupLayout jPMenuRelatoriosLayout = new javax.swing.GroupLayout(jPMenuRelatorios);
        jPMenuRelatorios.setLayout(jPMenuRelatoriosLayout);
        jPMenuRelatoriosLayout.setHorizontalGroup(
            jPMenuRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPMenuRelatoriosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLIconRelatorios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLMenuRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPMenuRelatoriosLayout.setVerticalGroup(
            jPMenuRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLMenuRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLIconRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPMenuAtendimento.setBackground(new java.awt.Color(79, 195, 247));
        jPMenuAtendimento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPMenuAtendimento.setPreferredSize(new java.awt.Dimension(148, 35));
        jPMenuAtendimento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPMenuAtendimentoMouseClicked(evt);
            }
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

        jLIconAtendimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/wendel/pdv/images/icon_laptop.png"))); // NOI18N

        javax.swing.GroupLayout jPMenuAtendimentoLayout = new javax.swing.GroupLayout(jPMenuAtendimento);
        jPMenuAtendimento.setLayout(jPMenuAtendimentoLayout);
        jPMenuAtendimentoLayout.setHorizontalGroup(
            jPMenuAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuAtendimentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLIconAtendimento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLMenuAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPMenuAtendimentoLayout.setVerticalGroup(
            jPMenuAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLMenuAtendimento, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addComponent(jLIconAtendimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPCadastros.setBackground(new java.awt.Color(79, 195, 247));

        jPMenuProdutos.setBackground(new java.awt.Color(79, 195, 247));
        jPMenuProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPMenuProdutos.setPreferredSize(new java.awt.Dimension(100, 35));
        jPMenuProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPMenuProdutosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPMenuProdutosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPMenuProdutosMouseExited(evt);
            }
        });

        jLMenuCadastrosProdutos.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLMenuCadastrosProdutos.setForeground(new java.awt.Color(255, 255, 255));
        jLMenuCadastrosProdutos.setText("Produtos");

        javax.swing.GroupLayout jPMenuProdutosLayout = new javax.swing.GroupLayout(jPMenuProdutos);
        jPMenuProdutos.setLayout(jPMenuProdutosLayout);
        jPMenuProdutosLayout.setHorizontalGroup(
            jPMenuProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPMenuProdutosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLMenuCadastrosProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPMenuProdutosLayout.setVerticalGroup(
            jPMenuProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLMenuCadastrosProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPMenuClientes.setBackground(new java.awt.Color(79, 195, 247));
        jPMenuClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPMenuClientes.setPreferredSize(new java.awt.Dimension(100, 35));
        jPMenuClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPMenuClientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPMenuClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPMenuClientesMouseExited(evt);
            }
        });

        jLMenuCadastrosClientes.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLMenuCadastrosClientes.setForeground(new java.awt.Color(255, 255, 255));
        jLMenuCadastrosClientes.setText("Clientes");

        javax.swing.GroupLayout jPMenuClientesLayout = new javax.swing.GroupLayout(jPMenuClientes);
        jPMenuClientes.setLayout(jPMenuClientesLayout);
        jPMenuClientesLayout.setHorizontalGroup(
            jPMenuClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPMenuClientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLMenuCadastrosClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPMenuClientesLayout.setVerticalGroup(
            jPMenuClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLMenuCadastrosClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPMenuUnidades.setBackground(new java.awt.Color(79, 195, 247));
        jPMenuUnidades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPMenuUnidades.setPreferredSize(new java.awt.Dimension(100, 35));
        jPMenuUnidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPMenuUnidadesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPMenuUnidadesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPMenuUnidadesMouseExited(evt);
            }
        });

        jLMenuCadastrosUnidades.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLMenuCadastrosUnidades.setForeground(new java.awt.Color(255, 255, 255));
        jLMenuCadastrosUnidades.setText("Unidades");

        javax.swing.GroupLayout jPMenuUnidadesLayout = new javax.swing.GroupLayout(jPMenuUnidades);
        jPMenuUnidades.setLayout(jPMenuUnidadesLayout);
        jPMenuUnidadesLayout.setHorizontalGroup(
            jPMenuUnidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPMenuUnidadesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLMenuCadastrosUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPMenuUnidadesLayout.setVerticalGroup(
            jPMenuUnidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLMenuCadastrosUnidades, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPCadastrosLayout = new javax.swing.GroupLayout(jPCadastros);
        jPCadastros.setLayout(jPCadastrosLayout);
        jPCadastrosLayout.setHorizontalGroup(
            jPCadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPMenuProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
            .addComponent(jPMenuClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
            .addComponent(jPMenuUnidades, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
        );
        jPCadastrosLayout.setVerticalGroup(
            jPCadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadastrosLayout.createSequentialGroup()
                .addComponent(jPMenuClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPMenuProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPMenuUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPMenuLayout = new javax.swing.GroupLayout(jPMenu);
        jPMenu.setLayout(jPMenuLayout);
        jPMenuLayout.setHorizontalGroup(
            jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPMenuHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPMenuCadastros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPMenuRelatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPMenuAtendimento, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
            .addComponent(jPCadastros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPMenuLayout.setVerticalGroup(
            jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPMenuHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPMenuCadastros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPCadastros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPMenuAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPMenuRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jPPrincipal.setBackground(new java.awt.Color(241, 241, 241));

        jPConteudo.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPConteudoLayout = new javax.swing.GroupLayout(jPConteudo);
        jPConteudo.setLayout(jPConteudoLayout);
        jPConteudoLayout.setHorizontalGroup(
            jPConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        jPConteudoLayout.setVerticalGroup(
            jPConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 297, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPPrincipalLayout = new javax.swing.GroupLayout(jPPrincipal);
        jPPrincipal.setLayout(jPPrincipalLayout);
        jPPrincipalLayout.setHorizontalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPPrincipalLayout.setVerticalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPTelaLayout = new javax.swing.GroupLayout(jPTela);
        jPTela.setLayout(jPTelaLayout);
        jPTelaLayout.setHorizontalGroup(
            jPTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTelaLayout.createSequentialGroup()
                .addComponent(jPMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPTelaLayout.setVerticalGroup(
            jPTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTelaLayout.createSequentialGroup()
                .addComponent(jPTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mouseMenuEntered(JPanel menu) {
        if (!menu.equals(this.menuSelecionado)) {
            SwingUtilities.invokeLater(() -> {
                menu.setBackground(COR_BOTAO_MENU_ENTERED);
            });
        }
    }

    private void mouseMenuExited(JPanel menu) {
        if (!menu.equals(this.menuSelecionado)) {
            SwingUtilities.invokeLater(() -> {
                menu.setBackground(COR_BOTAO_MENU);
            });
        }
    }

    private void mouseMenuClicked(JPanel menu, JPanel tela) {
        if (!menu.equals(this.menuSelecionado)) {
            SwingUtilities.invokeLater(() -> {
                menu.setBackground(COR_BOTAO_MENU_SELECIONADO);
                this.menuSelecionado = menu;
                this.setarCorDefaultMenusNaoSelecionados();
                if (tela != null) {
                    this.mostraTelaConteudo(tela);
                }
            });
        }
    }


    private void jPMenuHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuHomeMouseEntered
        this.mouseMenuEntered(this.jPMenuHome);
    }//GEN-LAST:event_jPMenuHomeMouseEntered

    private void jPMenuHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuHomeMouseExited
        this.mouseMenuExited(this.jPMenuHome);
    }//GEN-LAST:event_jPMenuHomeMouseExited

    private void jPMenuCadastrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuCadastrosMouseEntered
        this.mouseMenuEntered(this.jPMenuCadastros);
    }//GEN-LAST:event_jPMenuCadastrosMouseEntered

    private void jPMenuCadastrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuCadastrosMouseExited
        this.mouseMenuExited(this.jPMenuCadastros);
    }//GEN-LAST:event_jPMenuCadastrosMouseExited

    private void jPMostraMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMostraMenuMouseEntered
        SwingUtilities.invokeLater(() -> {
            this.jPMostraMenu.setBackground(COR_BOTAO_MENU);
        });
    }//GEN-LAST:event_jPMostraMenuMouseEntered

    private void jPMostraMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMostraMenuMouseExited
        SwingUtilities.invokeLater(() -> {
            this.jPMostraMenu.setBackground(new Color(3, 169, 244));
        });
    }//GEN-LAST:event_jPMostraMenuMouseExited

    private void jPMostraMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMostraMenuMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            this.jPMenu.setVisible(!this.jPMenu.isVisible());
        }
    }//GEN-LAST:event_jPMostraMenuMouseClicked

    private void jPMenuAtendimentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuAtendimentoMouseEntered
        this.mouseMenuEntered(this.jPMenuAtendimento);
    }//GEN-LAST:event_jPMenuAtendimentoMouseEntered

    private void jPMenuAtendimentoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuAtendimentoMouseExited
        this.mouseMenuExited(this.jPMenuAtendimento);
    }//GEN-LAST:event_jPMenuAtendimentoMouseExited

    private void jPMenuRelatoriosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuRelatoriosMouseEntered
        this.mouseMenuEntered(this.jPMenuRelatorios);
    }//GEN-LAST:event_jPMenuRelatoriosMouseEntered

    private void jPMenuRelatoriosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuRelatoriosMouseExited
        this.mouseMenuExited(this.jPMenuRelatorios);
    }//GEN-LAST:event_jPMenuRelatoriosMouseExited

    private void jPMenuCadastrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuCadastrosMouseClicked
        this.jPCadastros.setVisible(!this.jPCadastros.isVisible());
    }//GEN-LAST:event_jPMenuCadastrosMouseClicked

    private void jPMenuClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuClientesMouseEntered
        this.mouseMenuEntered(this.jPMenuClientes);
    }//GEN-LAST:event_jPMenuClientesMouseEntered

    private void jPMenuClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuClientesMouseExited
        this.mouseMenuExited(this.jPMenuClientes);
    }//GEN-LAST:event_jPMenuClientesMouseExited

    private void jPMenuProdutosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuProdutosMouseEntered
        this.mouseMenuEntered(this.jPMenuProdutos);
    }//GEN-LAST:event_jPMenuProdutosMouseEntered

    private void jPMenuProdutosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuProdutosMouseExited
        this.mouseMenuExited(this.jPMenuProdutos);
    }//GEN-LAST:event_jPMenuProdutosMouseExited

    private void jPMenuUnidadesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuUnidadesMouseEntered
        this.mouseMenuEntered(this.jPMenuUnidades);
    }//GEN-LAST:event_jPMenuUnidadesMouseEntered

    private void jPMenuUnidadesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuUnidadesMouseExited
        this.mouseMenuExited(this.jPMenuUnidades);
    }//GEN-LAST:event_jPMenuUnidadesMouseExited

    private void jPMenuHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuHomeMouseClicked
        this.mouseMenuClicked(this.jPMenuHome, this.telaHome);
    }//GEN-LAST:event_jPMenuHomeMouseClicked

    private void jPMenuClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuClientesMouseClicked
        this.mouseMenuClicked(this.jPMenuClientes, this.telaClientes);
    }//GEN-LAST:event_jPMenuClientesMouseClicked

    private void jPMenuProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuProdutosMouseClicked
        this.mouseMenuClicked(this.jPMenuProdutos, this.telaProdutos);
    }//GEN-LAST:event_jPMenuProdutosMouseClicked

    private void jPMenuUnidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuUnidadesMouseClicked
        this.mouseMenuClicked(this.jPMenuUnidades, this.telaUnidades);
    }//GEN-LAST:event_jPMenuUnidadesMouseClicked

    private void jPMenuAtendimentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPMenuAtendimentoMouseClicked
        this.mouseMenuClicked(this.jPMenuAtendimento, this.telaAtendimento);
    }//GEN-LAST:event_jPMenuAtendimentoMouseClicked

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
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PrincipalView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLIconAtendimento;
    private javax.swing.JLabel jLIconCadastros;
    private javax.swing.JLabel jLIconHome;
    private javax.swing.JLabel jLIconRelatorios;
    private javax.swing.JLabel jLMenuAtendimento;
    private javax.swing.JLabel jLMenuCadastros;
    private javax.swing.JLabel jLMenuCadastrosClientes;
    private javax.swing.JLabel jLMenuCadastrosProdutos;
    private javax.swing.JLabel jLMenuCadastrosUnidades;
    private javax.swing.JLabel jLMenuHome;
    private javax.swing.JLabel jLMenuRelatorios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPCadastros;
    private javax.swing.JPanel jPConteudo;
    private javax.swing.JPanel jPMenu;
    private javax.swing.JPanel jPMenuAtendimento;
    private javax.swing.JPanel jPMenuCadastros;
    private javax.swing.JPanel jPMenuClientes;
    private javax.swing.JPanel jPMenuHome;
    private javax.swing.JPanel jPMenuProdutos;
    private javax.swing.JPanel jPMenuRelatorios;
    private javax.swing.JPanel jPMenuUnidades;
    private javax.swing.JPanel jPMostraMenu;
    private javax.swing.JPanel jPPrincipal;
    private javax.swing.JPanel jPTela;
    private javax.swing.JPanel jPTop;
    // End of variables declaration//GEN-END:variables
}