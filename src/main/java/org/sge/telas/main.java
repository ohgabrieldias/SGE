package org.sge.telas;

import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class main extends javax.swing.JFrame {
    private static final String AWT_FONTE = "Arial";  // Compliant
    
    public main() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/imagens/desktopFrameBg.png"));
        Image image = icon.getImage();
        areaTrabalhoMain = new javax.swing.JDesktopPane() {
            public void paintComponent(Graphics g) {
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        logoMain = new javax.swing.JLabel();
        mainMenu = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        rf_001Menu = new javax.swing.JMenuItem();
        rf_002Menu = new javax.swing.JMenuItem();
        rf_003Menu = new javax.swing.JMenuItem();
        rf_004Menu = new javax.swing.JMenuItem();
        rf_005Menu = new javax.swing.JMenuItem();
        menuMovimentar = new javax.swing.JMenu();
        rf_009 = new javax.swing.JMenuItem();
        rf_019 = new javax.swing.JMenuItem();
        rf_015 = new javax.swing.JMenuItem();
        rf_014 = new javax.swing.JMenuItem();
        rf_016 = new javax.swing.JMenuItem();
        menuFinanceiro = new javax.swing.JMenu();
        menuRelatorios = new javax.swing.JMenu();
        rf_006Menu = new javax.swing.JMenuItem();
        rf_007Menu = new javax.swing.JMenuItem();
        rf_008Menu = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SGE - Sistema de Gestão Escolar");
        setExtendedState(6);
        setMinimumSize(new java.awt.Dimension(900, 700));
        setPreferredSize(new java.awt.Dimension(900, 700));

        areaTrabalhoMain.setFont(new java.awt.Font(AWT_FONTE, 0, 12)); // NOI18N

        logoMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logoMain.png"))); // NOI18N

        areaTrabalhoMain.setLayer(logoMain, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout areaTrabalhoMainLayout = new javax.swing.GroupLayout(areaTrabalhoMain);
        areaTrabalhoMain.setLayout(areaTrabalhoMainLayout);
        areaTrabalhoMainLayout.setHorizontalGroup(
                areaTrabalhoMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                areaTrabalhoMainLayout.createSequentialGroup()
                                        .addContainerGap(472, Short.MAX_VALUE)
                                        .addComponent(logoMain)
                                        .addContainerGap()));
        areaTrabalhoMainLayout.setVerticalGroup(
                areaTrabalhoMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                areaTrabalhoMainLayout.createSequentialGroup()
                                        .addContainerGap(205, Short.MAX_VALUE)
                                        .addComponent(logoMain)
                                        .addContainerGap()));

        mainMenu.setFont(new java.awt.Font(AWT_FONTE, 0, 14)); // NOI18N
        mainMenu.setMargin(new java.awt.Insets(4, 4, 4, 4));

        menuCadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menuCadastrar.png"))); // NOI18N
        menuCadastros.setText("Cadastrar");
        menuCadastros.setActionCommand("Cadastros");
        menuCadastros.setFont(new java.awt.Font(AWT_FONTE, 0, 14)); // NOI18N

        rf_001Menu.setFont(new java.awt.Font(AWT_FONTE, 0, 14)); // NOI18N
        rf_001Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/aluno.png"))); // NOI18N
        rf_001Menu.setText("Aluno");
        rf_001Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rf_001MenuActionPerformed(evt);
            }
        });
        menuCadastros.add(rf_001Menu);

        rf_002Menu.setFont(new java.awt.Font(AWT_FONTE, 0, 14)); // NOI18N
        rf_002Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/professor.png"))); // NOI18N
        rf_002Menu.setText("Professor");
        rf_002Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rf_002MenuActionPerformed(evt);
            }
        });
        menuCadastros.add(rf_002Menu);

        rf_003Menu.setFont(new java.awt.Font(AWT_FONTE, 0, 14)); // NOI18N
        rf_003Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/turma.png"))); // NOI18N
        rf_003Menu.setText("Turma");
        rf_003Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rf_003MenuActionPerformed(evt);
            }
        });
        menuCadastros.add(rf_003Menu);

        rf_004Menu.setFont(new java.awt.Font(AWT_FONTE, 0, 14)); // NOI18N
        rf_004Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/curso.png"))); // NOI18N
        rf_004Menu.setText("Disciplina");
        rf_004Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rf_004MenuActionPerformed(evt);
            }
        });
        menuCadastros.add(rf_004Menu);

        rf_005Menu.setFont(new java.awt.Font(AWT_FONTE, 0, 14)); // NOI18N
        rf_005Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/funcionario.png"))); // NOI18N
        rf_005Menu.setText("Funcionário");
        rf_005Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rf_005MenuActionPerformed(evt);
            }
        });
        menuCadastros.add(rf_005Menu);

        mainMenu.add(menuCadastros);

        menuMovimentar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/movimentar.png"))); // NOI18N
        menuMovimentar.setText("Alterar");
        menuMovimentar.setFont(new java.awt.Font(AWT_FONTE, 0, 14)); // NOI18N

        rf_009.setFont(new java.awt.Font(AWT_FONTE, 0, 14)); // NOI18N
        rf_009.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/aluno.png"))); // NOI18N
        rf_009.setText("Alunos");
        rf_009.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rf_009ActionPerformed(evt);
            }
        });
        menuMovimentar.add(rf_009);

        rf_019.setFont(new java.awt.Font(AWT_FONTE, 0, 14)); // NOI18N
        rf_019.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/professor.png"))); // NOI18N
        rf_019.setText("Professores");
        rf_019.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rf_019ActionPerformed(evt);
            }
        });
        menuMovimentar.add(rf_019);

        rf_015.setFont(new java.awt.Font(AWT_FONTE, 0, 14)); // NOI18N
        rf_015.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/turma.png"))); // NOI18N
        rf_015.setText("Turmas");
        rf_015.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rf_015ActionPerformed(evt);
            }
        });
        menuMovimentar.add(rf_015);

        rf_014.setFont(new java.awt.Font(AWT_FONTE, 0, 14)); // NOI18N
        rf_014.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/curso.png"))); // NOI18N
        rf_014.setText("Disciplinas");
        rf_014.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rf_014ActionPerformed(evt);
            }
        });
        menuMovimentar.add(rf_014);

        rf_016.setFont(new java.awt.Font(AWT_FONTE, 0, 14)); // NOI18N
        rf_016.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/funcionario.png"))); // NOI18N
        rf_016.setText("Funcionários");
        rf_016.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rf_016ActionPerformed(evt);
            }
        });
        menuMovimentar.add(rf_016);

        mainMenu.add(menuMovimentar);

        menuFinanceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menuFinanceiro.png"))); // NOI18N
        menuFinanceiro.setText("Financeiro");
        menuFinanceiro.setFont(new java.awt.Font(AWT_FONTE, 0, 14)); // NOI18N
        mainMenu.add(menuFinanceiro);

        menuRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menuRelatorios.png"))); // NOI18N
        menuRelatorios.setText("Relatórios");
        menuRelatorios.setFont(new java.awt.Font(AWT_FONTE, 0, 14)); // NOI18N

        rf_006Menu.setFont(new java.awt.Font(AWT_FONTE, 0, 14)); // NOI18N
        rf_006Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/notas.png"))); // NOI18N
        rf_006Menu.setText("Financeiro");
        menuRelatorios.add(rf_006Menu);

        rf_007Menu.setFont(new java.awt.Font(AWT_FONTE, 0, 14)); // NOI18N
        rf_007Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/notas.png"))); // NOI18N
        rf_007Menu.setText("Notas");
        menuRelatorios.add(rf_007Menu);

        rf_008Menu.setFont(new java.awt.Font(AWT_FONTE, 0, 14)); // NOI18N
        rf_008Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/frequencias.png"))); // NOI18N
        rf_008Menu.setText("Frequências");
        menuRelatorios.add(rf_008Menu);

        mainMenu.add(menuRelatorios);

        menuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menuSair.png"))); // NOI18N
        menuSair.setText("Sair");
        menuSair.setFont(new java.awt.Font(AWT_FONTE, 0, 14)); // NOI18N
        menuSair.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        menuSair.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        mainMenu.add(menuSair);

        setJMenuBar(mainMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(areaTrabalhoMain));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(areaTrabalhoMain));

        getAccessibleContext().setAccessibleDescription("SGE - Sistema de Gestão Escolar");

        setSize(new java.awt.Dimension(622, 379));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void rf_003MenuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rf_003MenuActionPerformed
        rf_004 rfNovaTurma = new rf_004();
        areaTrabalhoMain.add(rfNovaTurma);
        rfNovaTurma.setVisible(true);
    }// GEN-LAST:event_rf_003MenuActionPerformed

    private void rf_006MenuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rf_006MenuActionPerformed
        // TODO
    }// GEN-LAST:event_rf_006MenuActionPerformed

    private void rf_001MenuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rf_001MenuActionPerformed
        rf_001 rfNovoAluno = new rf_001();
        areaTrabalhoMain.add(rfNovoAluno);
        rfNovoAluno.setVisible(true);
    }// GEN-LAST:event_rf_001MenuActionPerformed

    private void rf_004MenuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rf_004MenuActionPerformed
        rf_005 rfNovaDisciplina = new rf_005();
        areaTrabalhoMain.add(rfNovaDisciplina);
        rfNovaDisciplina.setVisible(true);
    }// GEN-LAST:event_rf_004MenuActionPerformed

    private void rf_002MenuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rf_002MenuActionPerformed
        rf_002 rfNovoProfessor = new rf_002();
        areaTrabalhoMain.add(rfNovoProfessor);
        rfNovoProfessor.setVisible(true);
    }// GEN-LAST:event_rf_002MenuActionPerformed

    private void rf_005MenuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rf_005MenuActionPerformed
        rf_003 rfNovoFunc = new rf_003();
        areaTrabalhoMain.add(rfNovoFunc);
        rfNovoFunc.setVisible(true);
    }// GEN-LAST:event_rf_005MenuActionPerformed

    private void rf_009ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rf_009ActionPerformed
        rf_012 rfAlterarAaluno = new rf_012();
        areaTrabalhoMain.add(rfAlterarAaluno);
        rfAlterarAaluno.setVisible(true);
    }// GEN-LAST:event_rf_009ActionPerformed

    private void rf_019ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rf_019ActionPerformed
        rf_019 rfAlterarProfessor = new rf_019();
        areaTrabalhoMain.add(rfAlterarProfessor);
        rfAlterarProfessor.setVisible(true);
    }// GEN-LAST:event_rf_019ActionPerformed

    private void rf_015ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rf_015ActionPerformed
        rf_015 rfAlterarTurmas = new rf_015();
        areaTrabalhoMain.add(rfAlterarTurmas);
        rfAlterarTurmas.setVisible(true);
    }// GEN-LAST:event_rf_015ActionPerformed

    private void rf_014ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rf_014ActionPerformed
        // rf_014 rfAlterarDisciplinas = new rf_014();
        // areaTrabalhoMain.add(rfAlterarDisciplinas);
        // rfAlterarDisciplinas.setVisible(true);
    }// GEN-LAST:event_rf_014ActionPerformed

    private void rf_016ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rf_016ActionPerformed
        rf_016 rfAlterarFuncionario = new rf_016();
        areaTrabalhoMain.add(rfAlterarFuncionario);
        rfAlterarFuncionario.setVisible(true);
    }// GEN-LAST:event_rf_016ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem1ActionPerformed
        rf_019 rfMovimentaProfessor = new rf_019();
        areaTrabalhoMain.add(rfMovimentaProfessor);
        rfMovimentaProfessor.setVisible(true);
    }// GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jMenuItem1MouseClicked
        // TODO add your handling code here:
    }// GEN-LAST:event_jMenuItem1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane areaTrabalhoMain;
    private javax.swing.JLabel logoMain;
    private javax.swing.JMenuBar mainMenu;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenu menuFinanceiro;
    private javax.swing.JMenu menuMovimentar;
    private javax.swing.JMenu menuRelatorios;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenuItem rf_001Menu;
    private javax.swing.JMenuItem rf_002Menu;
    private javax.swing.JMenuItem rf_003Menu;
    private javax.swing.JMenuItem rf_004Menu;
    private javax.swing.JMenuItem rf_005Menu;
    private javax.swing.JMenuItem rf_006Menu;
    private javax.swing.JMenuItem rf_007Menu;
    private javax.swing.JMenuItem rf_008Menu;
    private javax.swing.JMenuItem rf_009;
    private javax.swing.JMenuItem rf_014;
    private javax.swing.JMenuItem rf_015;
    private javax.swing.JMenuItem rf_016;
    private javax.swing.JMenuItem rf_019;
    // End of variables declaration//GEN-END:variables
}