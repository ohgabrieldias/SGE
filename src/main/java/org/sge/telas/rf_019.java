/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.sge.telas;

import org.sge.dao.MySQLConnector;
import org.sge.dao.DisciplinaDAO;
import org.sge.dao.ProfessorDAO;
import org.sge.base.Professor;
import java.sql.Connection;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.sge.util.Formater;

/**
 *
 * @author gabri
 */
public class rf_019 extends javax.swing.JInternalFrame {
    private static final String AWT_FONTE = "Arial";  // Compliant
    MySQLConnector connector = new MySQLConnector();
    Connection connection = connector.getConnection();

    /**
     * Creates new form rf_010
     */
    Professor professorTmp = null;
    Formater formater = new Formater();
    ProfessorDAO professorDao = new ProfessorDAO(connection);
    DisciplinaDAO discpDao = new DisciplinaDAO(connection);
    
    public rf_019() {
        initComponents();
        preencherTabelaProfessores();
    }
    
    public void preencherTabelaProfessores() {
        List<Professor> professores = professorDao.buscarListaProfessor();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("CPF");
        model.addColumn("NOME");

        for (Professor professor : professores) {
            Object[] rowData = new Object[8];
            rowData[0] = professor.getId();
            rowData[1] = professor.getCpf();
            rowData[2] = professor.getNome();
            model.addRow(rowData);
        }
        
        tabelaProfessores.setModel(model);
        
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
        titulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pesquisaNomeLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProfessores = new javax.swing.JTable();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        nomeLabel = new javax.swing.JLabel();
        nomeCampo = new javax.swing.JTextField();
        nomeLabel1 = new javax.swing.JLabel();
        sobrenomeCampo = new javax.swing.JTextField();
        cpfLabel = new javax.swing.JLabel();
        cpfCampo = new javax.swing.JTextField();
        dnLabel = new javax.swing.JLabel();
        dnCampo = new com.toedter.calendar.JDateChooser();
        nomeLabel2 = new javax.swing.JLabel();
        enderecoCampo = new javax.swing.JTextField();
        btnEditar1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Movimentação de Professores");
        setToolTipText("");

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/movimentacoes.png"))); // NOI18N

        titulo.setFont(new java.awt.Font(AWT_FONTE, 1, 14)); // NOI18N
        titulo.setText("Movimentação de Professores(as)");

        pesquisaNomeLabel.setFont(new java.awt.Font(AWT_FONTE, 1, 14)); // NOI18N
        pesquisaNomeLabel.setText("Selecione um professor(a)");

        tabelaProfessores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "CPF", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaProfessores.setColumnSelectionAllowed(true);
        tabelaProfessores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProfessoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaProfessores);
        tabelaProfessores.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        nomeLabel.setFont(new java.awt.Font(AWT_FONTE, 1, 14)); // NOI18N
        nomeLabel.setText("Nome");

        nomeCampo.setEnabled(false);

        nomeLabel1.setFont(new java.awt.Font(AWT_FONTE, 1, 14)); // NOI18N
        nomeLabel1.setText("Sobrenome");

        sobrenomeCampo.setEnabled(false);

        cpfLabel.setFont(new java.awt.Font(AWT_FONTE, 1, 14)); // NOI18N
        cpfLabel.setText("CPF");

        cpfCampo.setEnabled(false);

        dnLabel.setFont(new java.awt.Font(AWT_FONTE, 1, 14)); // NOI18N
        dnLabel.setText("Data de Nascimento");

        dnCampo.setDateFormatString("dd/MM/yyyy");
        dnCampo.setEnabled(false);

        nomeLabel2.setFont(new java.awt.Font(AWT_FONTE, 1, 14)); // NOI18N
        nomeLabel2.setText("Endereço");

        enderecoCampo.setEnabled(false);

        btnEditar1.setFont(new java.awt.Font(AWT_FONTE, 0, 12)); // NOI18N
        btnEditar1.setText("Editar");
        btnEditar1.setEnabled(false);
        btnEditar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditar1MouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font(AWT_FONTE, 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Excluir cadastro");
        jButton1.setEnabled(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font(AWT_FONTE, 0, 12)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarMouseClicked(evt);
            }
        });

        jLayeredPane1.setLayer(nomeLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(nomeCampo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(nomeLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(sobrenomeCampo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cpfLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cpfCampo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(dnLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(dnCampo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(nomeLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(enderecoCampo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnEditar1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnSalvar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomeLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeLabel1)
                            .addComponent(sobrenomeCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpfCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpfLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dnLabel)
                            .addComponent(dnCampo, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)))
                    .addComponent(nomeLabel2)
                    .addComponent(enderecoCampo)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLabel)
                    .addComponent(nomeLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sobrenomeCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfLabel)
                    .addComponent(dnLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dnCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cpfCampo, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(nomeLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enderecoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisaNomeLabel)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logo)
                        .addGap(66, 66, 66)
                        .addComponent(titulo)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(titulo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pesquisaNomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaProfessoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProfessoresMouseClicked
        btnEditar1.setEnabled(true);
        jButton1.setEnabled(true);
        
        int selectedRow = tabelaProfessores.getSelectedRow();
        int selectedColumn = tabelaProfessores.getSelectedColumn();
        int id = (Integer)tabelaProfessores.getValueAt(selectedRow, selectedColumn);
        
        professorTmp = professorDao.buscarPorId(id);
        if (professorTmp != null) {
            nomeCampo.setText(professorTmp.getNome());
            sobrenomeCampo.setText(professorTmp.getSobrenome());
            cpfCampo.setText(professorTmp.getCpf());
            enderecoCampo.setText(professorTmp.getEndereco());
            
            Date data = formater.converteStringToDate(professorTmp.getDataNasc());
            dnCampo.setDate(data);
         }
    }//GEN-LAST:event_tabelaProfessoresMouseClicked

    private void btnEditar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditar1MouseClicked
        //ALTERAR CADASTRO DO ALUNO APOS CLICLAR NO BOTA EDITAR	
        nomeCampo.setEnabled(true);
        sobrenomeCampo.setEnabled(true);
        cpfCampo.setEnabled(true);
        enderecoCampo.setEnabled(true);
        dnCampo.setEnabled(true);
        btnSalvar.setEnabled(true); 
    }//GEN-LAST:event_btnEditar1MouseClicked
    
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        int selectedRow = tabelaProfessores.getSelectedRow();
        int selectedColumn = tabelaProfessores.getSelectedColumn();
        int id = (Integer)tabelaProfessores.getValueAt(selectedRow, selectedColumn);
        
        if(discpDao.checkVinculo(professorTmp.getNome())){
           if(professorDao.excluirProfessor(id)){
            JOptionPane.showMessageDialog(null, "Professor excluído com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            dispose();
           }
            else JOptionPane.showMessageDialog(null, "Exclusão falhou!", "Erro", JOptionPane.ERROR_MESSAGE);         
        }
        else JOptionPane.showMessageDialog(null, "Professor vinculado a uma disciplina", "Erro", JOptionPane.ERROR_MESSAGE); 

    }//GEN-LAST:event_jButton1MouseClicked

    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked
        professorTmp.setNome(nomeCampo.getText());
        professorTmp.setSobrenome(sobrenomeCampo.getText());
        professorTmp.setCpf(cpfCampo.getText());
        professorTmp.setEndereco(enderecoCampo.getText());
        professorTmp.setDataNasc(formater.formatarData2(dnCampo));
        
        if(professorDao.alterarProfessor(professorTmp)){
            JOptionPane.showMessageDialog(null, "Professor alterado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
        else
            JOptionPane.showMessageDialog(null, "Alteração falhou!!!", "Erro", JOptionPane.ERROR_MESSAGE);

        
    }//GEN-LAST:event_btnSalvarMouseClicked
    
    private void btnSalvar1MouseClicked(java.awt.event.MouseEvent evt) {                                        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar1;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField cpfCampo;
    private javax.swing.JLabel cpfLabel;
    private com.toedter.calendar.JDateChooser dnCampo;
    private javax.swing.JLabel dnLabel;
    private javax.swing.JTextField enderecoCampo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField nomeCampo;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JLabel nomeLabel1;
    private javax.swing.JLabel nomeLabel2;
    private javax.swing.JLabel pesquisaNomeLabel;
    private javax.swing.JTextField sobrenomeCampo;
    private javax.swing.JTable tabelaProfessores;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}