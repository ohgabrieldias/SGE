/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sge;

import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author gabri
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/imagens/desktopFrameBg.png"));
        Image image = icon.getImage();
        areaTrabalhoMain = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
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
        menuFinanceiro = new javax.swing.JMenu();
        menuRelatorios = new javax.swing.JMenu();
        rf_006Menu = new javax.swing.JMenuItem();
        rf_007Menu = new javax.swing.JMenuItem();
        rf_008Menu = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SGE - Sistema de Gestão Escolar");
        setExtendedState(6);
        setMinimumSize(new java.awt.Dimension(400, 300));

        areaTrabalhoMain.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        logoMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logoMain.png"))); // NOI18N

        areaTrabalhoMain.setLayer(logoMain, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout areaTrabalhoMainLayout = new javax.swing.GroupLayout(areaTrabalhoMain);
        areaTrabalhoMain.setLayout(areaTrabalhoMainLayout);
        areaTrabalhoMainLayout.setHorizontalGroup(
            areaTrabalhoMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaTrabalhoMainLayout.createSequentialGroup()
                .addContainerGap(472, Short.MAX_VALUE)
                .addComponent(logoMain)
                .addContainerGap())
        );
        areaTrabalhoMainLayout.setVerticalGroup(
            areaTrabalhoMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaTrabalhoMainLayout.createSequentialGroup()
                .addContainerGap(205, Short.MAX_VALUE)
                .addComponent(logoMain)
                .addContainerGap())
        );

        mainMenu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mainMenu.setMargin(new java.awt.Insets(4, 4, 4, 4));

        menuCadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menuCadastrar.png"))); // NOI18N
        menuCadastros.setText("Cadastrar");
        menuCadastros.setActionCommand("Cadastros");
        menuCadastros.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        rf_001Menu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rf_001Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/aluno.png"))); // NOI18N
        rf_001Menu.setText("Aluno");
        rf_001Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rf_001MenuActionPerformed(evt);
            }
        });
        menuCadastros.add(rf_001Menu);

        rf_002Menu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rf_002Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/professor.png"))); // NOI18N
        rf_002Menu.setText("Professor");
        rf_002Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rf_002MenuActionPerformed(evt);
            }
        });
        menuCadastros.add(rf_002Menu);

        rf_003Menu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rf_003Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/turma.png"))); // NOI18N
        rf_003Menu.setText("Turma");
        menuCadastros.add(rf_003Menu);

        rf_004Menu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rf_004Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/curso.png"))); // NOI18N
        rf_004Menu.setText("Disciplina");
        rf_004Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rf_004MenuActionPerformed(evt);
            }
        });
        menuCadastros.add(rf_004Menu);

        rf_005Menu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
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
        menuMovimentar.setText("Movimentar");
        menuMovimentar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        rf_009.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rf_009.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/aluno.png"))); // NOI18N
        rf_009.setText("Alunos");
        rf_009.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rf_009ActionPerformed(evt);
            }
        });
        menuMovimentar.add(rf_009);

        mainMenu.add(menuMovimentar);

        menuFinanceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menuFinanceiro.png"))); // NOI18N
        menuFinanceiro.setText("Financeiro");
        menuFinanceiro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mainMenu.add(menuFinanceiro);

        menuRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menuRelatorios.png"))); // NOI18N
        menuRelatorios.setText("Relatórios");
        menuRelatorios.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        rf_006Menu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rf_006Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/notas.png"))); // NOI18N
        rf_006Menu.setText("Financeiro");
        menuRelatorios.add(rf_006Menu);

        rf_007Menu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rf_007Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/notas.png"))); // NOI18N
        rf_007Menu.setText("Notas");
        menuRelatorios.add(rf_007Menu);

        rf_008Menu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rf_008Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/frequencias.png"))); // NOI18N
        rf_008Menu.setText("Frequências");
        menuRelatorios.add(rf_008Menu);

        mainMenu.add(menuRelatorios);

        menuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menuSair.png"))); // NOI18N
        menuSair.setText("Sair");
        menuSair.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        menuSair.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        menuSair.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        mainMenu.add(menuSair);

        setJMenuBar(mainMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(areaTrabalhoMain)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(areaTrabalhoMain)
        );

        getAccessibleContext().setAccessibleDescription("SGE - Sistema de Gestão Escolar");

        setSize(new java.awt.Dimension(622, 379));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rf_003MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rf_003MenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rf_003MenuActionPerformed

    private void rf_006MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rf_006MenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rf_006MenuActionPerformed

    private void rf_001MenuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rf_001MenuActionPerformed
        rf_001 rfNovoAluno = new rf_001();
        areaTrabalhoMain.add(rfNovoAluno);
        rfNovoAluno.setVisible(true);
    }// GEN-LAST:event_rf_001MenuActionPerformed

    private void rf_004MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rf_004MenuActionPerformed
        rf_005 rfNovaDisciplina = new rf_005();
        areaTrabalhoMain.add(rfNovaDisciplina);
        rfNovaDisciplina.setVisible(true);
    }//GEN-LAST:event_rf_004MenuActionPerformed

    private void rf_002MenuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_rf_002MenuActionPerformed
        rf_002 rfNovoProfessor = new rf_002();
        areaTrabalhoMain.add(rfNovoProfessor);
        rfNovoProfessor.setVisible(true);
    }// GEN-LAST:event_rf_002MenuActionPerformed

    private void rf_005MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rf_005MenuActionPerformed
        rf_003 rfNovoFunc = new rf_003();
        areaTrabalhoMain.add(rfNovoFunc);
        rfNovoFunc.setVisible(true);
    }//GEN-LAST:event_rf_005MenuActionPerformed

    private void rf_009ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rf_009ActionPerformed
        rf_009 rfMovimentAaluno = new rf_009();
        areaTrabalhoMain.add(rfMovimentAaluno);
        rfMovimentAaluno.setVisible(true);
    }//GEN-LAST:event_rf_009ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
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
    // End of variables declaration//GEN-END:variables
}
