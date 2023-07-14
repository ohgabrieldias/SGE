/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.sge.telas;

import org.sge.dao.MySQLConnector;
import org.sge.dao.DisciplinaDAO;
import org.sge.dao.ProfessorDAO;
import org.sge.base.Disciplina;
import java.sql.Connection;
import java.util.List;
import javax.swing.JOptionPane;
import org.sge.util.Formater;
import org.sge.util.Validator;

/**
 *
 * @author gabri
 */
public class rf_005 extends javax.swing.JInternalFrame {
    private static final String AWT_FONTE = "Arial";  // Compliant
    MySQLConnector connector = new MySQLConnector();
    Connection connection = connector.getConnection();
    DisciplinaDAO discipDao = new DisciplinaDAO(connection);
    ProfessorDAO professordao = new ProfessorDAO(connection);

    /**
     * Creates new form rf_005
     */
    public rf_005() {
        initComponents();
        preencherComboProfessor();
    }

    private void preencherComboProfessor() {
        List<String> dados = professordao.buscarNomesProfessores();
        professorCampo.addItem("-- Selecione --");
        for (String elemento : dados) {
            professorCampo.addItem(elemento);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo = new javax.swing.JLabel();
        cadastroAluno = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        nomeLabel = new javax.swing.JLabel();
        nomeCampo = new javax.swing.JTextField();
        dataInicioLabel = new javax.swing.JLabel();
        dataInicioCampo = new com.toedter.calendar.JDateChooser();
        dataFimLabel = new javax.swing.JLabel();
        dataFimCampo = new com.toedter.calendar.JDateChooser();
        professorLabel = new javax.swing.JLabel();
        professorCampo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastrar Disciplina");

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cursoLogo.png"))); // NOI18N

        cadastroAluno.setFont(new java.awt.Font(AWT_FONTE, 1, 14)); // NOI18N
        cadastroAluno.setForeground(new java.awt.Color(51, 51, 51));
        cadastroAluno.setText("Cadastro de Disciplina");

        nomeLabel.setFont(new java.awt.Font(AWT_FONTE, 1, 14)); // NOI18N
        nomeLabel.setForeground(new java.awt.Color(51, 51, 51));
        nomeLabel.setText("Nome da Disciplina");

        dataInicioLabel.setFont(new java.awt.Font(AWT_FONTE, 1, 14)); // NOI18N
        dataInicioLabel.setForeground(new java.awt.Color(51, 51, 51));
        dataInicioLabel.setText("Início do Curso");

        dataInicioCampo.setDateFormatString("dd/MM/yyyy");
        dataInicioCampo.setFont(new java.awt.Font(AWT_FONTE, 0, 12)); // NOI18N

        dataFimLabel.setFont(new java.awt.Font(AWT_FONTE, 1, 14)); // NOI18N
        dataFimLabel.setForeground(new java.awt.Color(51, 51, 51));
        dataFimLabel.setText("Fim do Curso");

        dataFimCampo.setDateFormatString("dd/MM/yyyy");
        dataFimCampo.setFont(new java.awt.Font(AWT_FONTE, 0, 12)); // NOI18N

        professorLabel.setFont(new java.awt.Font(AWT_FONTE, 1, 14)); // NOI18N
        professorLabel.setForeground(new java.awt.Color(51, 51, 51));
        professorLabel.setText("Professor responsável");

        professorCampo.setFont(new java.awt.Font(AWT_FONTE, 0, 12)); // NOI18N

        jButton1.setFont(new java.awt.Font(AWT_FONTE, 0, 12)); // NOI18N
        jButton1.setText("Cadastrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nomeLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cadastroAluno)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataInicioCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataInicioLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataFimLabel)
                            .addComponent(dataFimCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(nomeCampo)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(professorCampo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(professorLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cadastroAluno)
                        .addGap(31, 31, 31)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataInicioLabel)
                    .addComponent(dataFimLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataInicioCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataFimCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(professorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(professorCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nome = nomeCampo.getText();
        String dataInicio = "";
        String dataFim= "";
        dataInicio = Formater.formatarData2(dataInicioCampo);
        dataFim = Formater.formatarData2(dataFimCampo);
        
        if (Validator.validarNome(nome) && Validator.validarData(dataInicio) && Validator.validarData(dataFim) ) {
            
            Disciplina disc = new Disciplina(nome, dataInicio, dataFim,(String)professorCampo.getSelectedItem());
            if(discipDao.cadastrarDisciplinas(disc)){
            
                JOptionPane.showMessageDialog(this, "Cadastro bem sucedido!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                // Feche o formulário
                dispose();
            }
            else JOptionPane.showMessageDialog(this, "Cadastro mal sucedido!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void professorCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_professorCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_professorCampoActionPerformed

    private void professorCampoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_professorCampoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_professorCampoAncestorAdded

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cadastroAluno;
    private com.toedter.calendar.JDateChooser dataFimCampo;
    private javax.swing.JLabel dataFimLabel;
    private com.toedter.calendar.JDateChooser dataInicioCampo;
    private javax.swing.JLabel dataInicioLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField nomeCampo;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JComboBox<String> professorCampo;
    private javax.swing.JLabel professorLabel;
    // End of variables declaration//GEN-END:variables
}
