/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.sge.telas;

import org.sge.dao.MySQLConnector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author gabriel dias
 */
public class rf_login extends javax.swing.JFrame {
    private static final String AWT_FONTE = "Arial";  // Compliant
    Logger logger = Logger.getLogger(getClass().getName());

    private MySQLConnector connector;
    /**
     * Creates new form rf_login
     */
    public rf_login() {
        initComponents();
        connector = new MySQLConnector();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        loginPanel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        loginIsidePanel = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        loginUserLabel = new javax.swing.JLabel();
        loginUserPass = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SGE - Login");
        setMinimumSize(null);
        setResizable(false);

        loginPanel.setFont(new java.awt.Font(AWT_FONTE, 0, 12)); // NOI18N
        loginPanel.setMinimumSize(null);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.png"))); // NOI18N

        loginIsidePanel.setMinimumSize(new java.awt.Dimension(250, 250));
        loginIsidePanel.setName(""); // NOI18N
        loginIsidePanel.setPreferredSize(new java.awt.Dimension(250, 250));

        loginButton.setFont(new java.awt.Font(AWT_FONTE, 0, 14)); // NOI18N
        loginButton.setText("Acessar");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        loginUserLabel.setFont(new java.awt.Font(AWT_FONTE, 1, 14)); // NOI18N
        loginUserLabel.setText("Usuário");

        loginUserPass.setFont(new java.awt.Font(AWT_FONTE, 1, 14)); // NOI18N
        loginUserPass.setText("Senha");

        jTextField1.setFont(new java.awt.Font(AWT_FONTE, 0, 12)); // NOI18N

        jPasswordField1.setFont(new java.awt.Font(AWT_FONTE, 0, 12)); // NOI18N

        javax.swing.GroupLayout loginIsidePanelLayout = new javax.swing.GroupLayout(loginIsidePanel);
        loginIsidePanel.setLayout(loginIsidePanelLayout);
        loginIsidePanelLayout.setHorizontalGroup(
            loginIsidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginIsidePanelLayout.createSequentialGroup()
                .addGroup(loginIsidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(loginIsidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginIsidePanelLayout.createSequentialGroup()
                            .addGap(140, 140, 140)
                            .addComponent(loginButton))
                        .addGroup(loginIsidePanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(loginIsidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(loginUserLabel)
                                .addComponent(loginUserPass))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, loginIsidePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(loginIsidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        loginIsidePanelLayout.setVerticalGroup(
            loginIsidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginIsidePanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(loginUserLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginUserPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logo)
                .addGap(81, 81, 81))
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginIsidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginIsidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("SGE - Login");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        String username = jTextField1.getText();
        String password = String.valueOf(jPasswordField1.getPassword());

        if (connector.authenticateUser(username, password)) {
            JOptionPane.showMessageDialog(this, "Login bem-sucedido!");

            // Fechar a tela de login
            dispose();

            // Abrir a interface da classe Main
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new main().setVisible(true);
                }
            });
        } else {
            JOptionPane.showMessageDialog(this, "Login inválido. Tente novamente.");
        }
    }
    
    public static void main(String[] args) {
        // Set the look and feel of the Swing application
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
        Logger.getLogger(rf_login.class.getName()).log(Level.SEVERE, "Erro ao definir o look and feel da aplicação", ex);        }

        // Create and display the login form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rf_login().setVisible(true);
            }
        });
    }
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify                     
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginIsidePanel;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel loginUserLabel;
    private javax.swing.JLabel loginUserPass;
    private javax.swing.JLabel logo;
    // End of variables declaration                   
}