package org.sge.telas;

import org.sge.dao.MySQLConnector;
import org.sge.dao.AlunoDAO;
import  org.sge.base.Aluno;
import java.sql.Connection;
import org.sge.util.Formater;
import javax.swing.JOptionPane;
import org.sge.util.Validator;

/**
 *
 * @author gabri
 */
public class rf_001 extends javax.swing.JInternalFrame {
    private static final String AWT_FONTE = "Arial";  // Compliant
    
    MySQLConnector connector = new MySQLConnector();
    Connection connection = connector.getConnection();
    
    AlunoDAO alunoDao = new AlunoDAO(connection);
    
    public rf_001() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        novoAlunoInternalLogo = new javax.swing.JLabel();
        cadastroAluno = new javax.swing.JLabel();
        novoAlunoSobrenomeLabel = new javax.swing.JLabel();
        novoAlunoNome = new javax.swing.JTextField();
        novoAlunoLabel = new javax.swing.JLabel();
        novoAlunoSobrenome = new javax.swing.JTextField();
        novoAlunoCPF = new javax.swing.JTextField();
        novoAlunoDNLabel = new javax.swing.JLabel();
        novoAlunoCPFLabel = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        novoAlunoResp = new javax.swing.JLabel();
        novoAlunoRespField = new javax.swing.JTextField();
        novoAlunoCPFRespLabel = new javax.swing.JLabel();
        novoAlunoCPFResp = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        respAviso = new javax.swing.JLabel();
        dataNascimento = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setTitle("Cadastro de Alun@");

        novoAlunoInternalLogo.setFont(new java.awt.Font(AWT_FONTE, 1, 14)); // NOI18N
        novoAlunoInternalLogo.setForeground(new java.awt.Color(51, 51, 51));
        novoAlunoInternalLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/novoAlunoInternal.png"))); // NOI18N

        cadastroAluno.setFont(new java.awt.Font(AWT_FONTE, 1, 14)); // NOI18N
        cadastroAluno.setForeground(new java.awt.Color(51, 51, 51));
        cadastroAluno.setText("Cadastro de Alun@");

        novoAlunoSobrenomeLabel.setFont(new java.awt.Font(AWT_FONTE, 1, 14)); // NOI18N
        novoAlunoSobrenomeLabel.setForeground(new java.awt.Color(51, 51, 51));
        novoAlunoSobrenomeLabel.setText("Sobrenome");

        novoAlunoNome.setFont(new java.awt.Font(AWT_FONTE, 0, 12)); // NOI18N
        novoAlunoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoAlunoNomeActionPerformed(evt);
            }
        });

        novoAlunoLabel.setFont(new java.awt.Font(AWT_FONTE, 1, 14)); // NOI18N
        novoAlunoLabel.setForeground(new java.awt.Color(51, 51, 51));
        novoAlunoLabel.setText("Nome");

        novoAlunoSobrenome.setFont(new java.awt.Font(AWT_FONTE, 0, 12)); // NOI18N
        novoAlunoSobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoAlunoSobrenomeActionPerformed(evt);
            }
        });

        novoAlunoCPF.setFont(new java.awt.Font(AWT_FONTE, 0, 12)); // NOI18N

        novoAlunoDNLabel.setFont(new java.awt.Font(AWT_FONTE, 1, 14)); // NOI18N
        novoAlunoDNLabel.setForeground(new java.awt.Color(51, 51, 51));
        novoAlunoDNLabel.setText("Data de Nascimento");

        novoAlunoCPFLabel.setFont(new java.awt.Font(AWT_FONTE, 1, 14)); // NOI18N
        novoAlunoCPFLabel.setForeground(new java.awt.Color(51, 51, 51));
        novoAlunoCPFLabel.setText("CPF");

        btnCadastrar.setFont(new java.awt.Font(AWT_FONTE, 0, 12)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        novoAlunoResp.setFont(new java.awt.Font(AWT_FONTE, 1, 14)); // NOI18N
        novoAlunoResp.setForeground(new java.awt.Color(51, 51, 51));
        novoAlunoResp.setText("Responsável");

        novoAlunoRespField.setFont(new java.awt.Font(AWT_FONTE, 0, 12)); // NOI18N
        novoAlunoRespField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoAlunoRespFieldActionPerformed(evt);
            }
        });

        novoAlunoCPFRespLabel.setFont(new java.awt.Font(AWT_FONTE, 1, 14)); // NOI18N
        novoAlunoCPFRespLabel.setForeground(new java.awt.Color(51, 51, 51));
        novoAlunoCPFRespLabel.setText("CPF Responsável");

        novoAlunoCPFResp.setFont(new java.awt.Font(AWT_FONTE, 0, 12)); // NOI18N

        respAviso.setFont(new java.awt.Font(AWT_FONTE, 1, 12)); // NOI18N
        respAviso.setForeground(new java.awt.Color(51, 51, 51));
        respAviso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        respAviso.setText("Somente se necessário um responsável");
        respAviso.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        dataNascimento.setDateFormatString("dd/MM/yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(novoAlunoInternalLogo)
                        .addGap(60, 60, 60)
                        .addComponent(cadastroAluno))
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(novoAlunoLabel)
                                    .addComponent(novoAlunoDNLabel)
                                    .addComponent(novoAlunoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(novoAlunoCPFLabel)
                            .addComponent(novoAlunoSobrenomeLabel)
                            .addComponent(novoAlunoSobrenome, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(novoAlunoCPF)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(novoAlunoRespField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(novoAlunoResp))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(novoAlunoCPFRespLabel)
                            .addComponent(novoAlunoCPFResp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(respAviso, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(novoAlunoInternalLogo)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(cadastroAluno)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(novoAlunoSobrenomeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(novoAlunoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novoAlunoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(novoAlunoSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novoAlunoDNLabel)
                    .addComponent(novoAlunoCPFLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(novoAlunoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(respAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(novoAlunoResp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(novoAlunoRespField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(novoAlunoCPFRespLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(novoAlunoCPFResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void novoAlunoSobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoAlunoSobrenomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_novoAlunoSobrenomeActionPerformed

    private void novoAlunoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoAlunoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_novoAlunoNomeActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        String nome = novoAlunoNome.getText();
        String sobrenome = novoAlunoSobrenome.getText();
        String dataNasc = "";
        String cpf = novoAlunoCPF.getText();
        String cpfResp = novoAlunoCPFResp.getText();
        String resp = novoAlunoResp.getText();
        String end = "";
        dataNasc = Formater.formatarData2(dataNascimento);
      
        if (Validator.validarNome(nome) && Validator.validarSobrenome(sobrenome) && Validator.validarCPF(cpf)) {

        Aluno aluno = new Aluno(nome, sobrenome, dataNasc, cpf, "Av n sei onde", resp,cpfResp, 2110102629);
        
        if(alunoDao.cadastrarAluno(aluno)){
            JOptionPane.showMessageDialog(this, "Cadastro bem sucedido!", "Cadastro bem sucessdido", JOptionPane.INFORMATION_MESSAGE);  
            dispose();
        }
            else JOptionPane.showMessageDialog(this, "Cadastro mal sucedido!", "Cadastro mal sucessdido", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void novoAlunoRespFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoAlunoRespFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_novoAlunoRespFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JLabel cadastroAluno;
    private com.toedter.calendar.JDateChooser dataNascimento;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField novoAlunoCPF;
    private javax.swing.JLabel novoAlunoCPFLabel;
    private javax.swing.JTextField novoAlunoCPFResp;
    private javax.swing.JLabel novoAlunoCPFRespLabel;
    private javax.swing.JLabel novoAlunoDNLabel;
    private javax.swing.JLabel novoAlunoInternalLogo;
    private javax.swing.JLabel novoAlunoLabel;
    private javax.swing.JTextField novoAlunoNome;
    private javax.swing.JLabel novoAlunoResp;
    private javax.swing.JTextField novoAlunoRespField;
    private javax.swing.JTextField novoAlunoSobrenome;
    private javax.swing.JLabel novoAlunoSobrenomeLabel;
    private javax.swing.JLabel respAviso;
    // End of variables declaration//GEN-END:variables
}
