/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package sge;

import DAO.FuncionarioDAO;
import baseCoding.Funcionario;
import baseCoding.Funcionario;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import util.Formater;

/**
 *
 * @author gabri
 */
public class rf_016 extends javax.swing.JInternalFrame {
    private static final String AWT_FONTE = "Arial";  // Compliant

    /**
     * Creates new form rf_016
     */
    Funcionario funcionarioTmp = null;
    Formater formater = new Formater();
    FuncionarioDAO funcionarioDao = new FuncionarioDAO();
    
    public rf_016() {
        initComponents();
        preencherTabelaFuncionarios();
    }
    
    public void preencherTabelaFuncionarios() {
        List<Funcionario> funcionarios = funcionarioDao.buscarListaFuncionario();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("CPF");
        model.addColumn("NOME");

        for (Funcionario funcionario : funcionarios) {
            Object[] rowData = new Object[8];
            rowData[0] = funcionario.getId();
            rowData[1] = funcionario.getCpf();
            rowData[2] = funcionario.getNome();
            model.addRow(rowData);
        }
        
        jTable1.setModel(model);
        
    }
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                               
        btnEditar.setEnabled(true);
        btnExcluir.setEnabled(true);
        
        int selectedRow = jTable1.getSelectedRow();
        int selectedColumn = jTable1.getSelectedColumn();
        int id = (Integer)jTable1.getValueAt(selectedRow, selectedColumn);
        
        funcionarioTmp = funcionarioDao.buscarPorId(id);
        if (funcionarioTmp != null) {
            nomeCampo.setText(funcionarioTmp.getNome());
            sobrenomeCampo.setText(funcionarioTmp.getSobrenome());
            cpfCampo.setText(funcionarioTmp.getCpf());
//            senhaCampo.setText(funcionarioTmp.getPassword());
            
            Date data = formater.converteStringToDate(funcionarioTmp.getDataNasc());
            jDateChooser1.setDate(data);
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
        titulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        selecioneLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        painelInformacoes = new javax.swing.JPanel();
        nomeLabel = new javax.swing.JLabel();
        nomeCampo = new javax.swing.JTextField();
        sobrenomeCampo = new javax.swing.JTextField();
        sobrenomeLabel = new javax.swing.JLabel();
        cpfCampo = new javax.swing.JTextField();
        cpfLabel = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        cpfLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        infoSenha = new javax.swing.JLabel();
        senhaCampo = new javax.swing.JTextField();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Alteração de Funcionários");

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/movimentacoes.png"))); // NOI18N

        titulo.setFont(new java.awt.Font(AWT_FONTE, 1, 14)); // NOI18N
        titulo.setText("Movimentação de Funcionários");

        selecioneLabel.setFont(new java.awt.Font(AWT_FONTE, 1, 14)); // NOI18N
        selecioneLabel.setText("Selecione um funcionário");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Funcionário", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        painelInformacoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        nomeLabel.setFont(new java.awt.Font(AWT_FONTE, 1, 14)); // NOI18N
        nomeLabel.setText("Nome");

        nomeCampo.setFont(new java.awt.Font(AWT_FONTE, 0, 12)); // NOI18N
        nomeCampo.setEnabled(false);

        sobrenomeCampo.setFont(new java.awt.Font(AWT_FONTE, 0, 12)); // NOI18N
        sobrenomeCampo.setEnabled(false);

        sobrenomeLabel.setFont(new java.awt.Font(AWT_FONTE, 1, 14)); // NOI18N
        sobrenomeLabel.setText("Sobrenome");

        cpfCampo.setFont(new java.awt.Font(AWT_FONTE, 0, 12)); // NOI18N
        cpfCampo.setEnabled(false);

        cpfLabel.setFont(new java.awt.Font(AWT_FONTE, 1, 14)); // NOI18N
        cpfLabel.setText("CPF");

        jDateChooser1.setDateFormatString("dd/MM/yyyy");
        jDateChooser1.setEnabled(false);

        cpfLabel1.setFont(new java.awt.Font(AWT_FONTE, 1, 14)); // NOI18N
        cpfLabel1.setText("Data de nascimento");

        infoSenha.setFont(new java.awt.Font(AWT_FONTE, 0, 12)); // NOI18N
        infoSenha.setForeground(new java.awt.Color(204, 0, 0));
        infoSenha.setText("Somente insira uma senha nova se for necessário trocar");

        senhaCampo.setEnabled(false);

        javax.swing.GroupLayout painelInformacoesLayout = new javax.swing.GroupLayout(painelInformacoes);
        painelInformacoes.setLayout(painelInformacoesLayout);
        painelInformacoesLayout.setHorizontalGroup(
            painelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInformacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(painelInformacoesLayout.createSequentialGroup()
                        .addGroup(painelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(painelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sobrenomeCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sobrenomeLabel)))
                    .addGroup(painelInformacoesLayout.createSequentialGroup()
                        .addGroup(painelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpfCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpfLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelInformacoesLayout.createSequentialGroup()
                                .addComponent(cpfLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(painelInformacoesLayout.createSequentialGroup()
                        .addComponent(infoSenha)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(senhaCampo))
                .addContainerGap())
        );
        painelInformacoesLayout.setVerticalGroup(
            painelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInformacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLabel)
                    .addComponent(sobrenomeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sobrenomeCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfLabel)
                    .addComponent(cpfLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(cpfCampo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnExcluir.setBackground(new java.awt.Color(255, 51, 51));
        btnExcluir.setFont(new java.awt.Font(AWT_FONTE, 0, 12)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir funcionário");
        btnExcluir.setEnabled(false);
        btnExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExcluirMouseClicked(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(titulo)
                        .addGap(59, 59, 59))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(selecioneLabel)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addComponent(painelInformacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvar)))
                        .addContainerGap(27, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(titulo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selecioneLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        nomeCampo.setEnabled(true);
        sobrenomeCampo.setEnabled(true);
        cpfCampo.setEnabled(true);
        senhaCampo.setEnabled(true);
        jDateChooser1.setEnabled(true);
        btnSalvar.setEnabled(true); 
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMouseClicked
        int selectedRow = jTable1.getSelectedRow();
        int selectedColumn = jTable1.getSelectedColumn();
        int id = (Integer)jTable1.getValueAt(selectedRow, selectedColumn);
        
        if(funcionarioDao.excluirFuncionario(id)){
            JOptionPane.showMessageDialog(null, "Funcionario excluído com sucesso!");
            dispose();
        }
        else JOptionPane.showMessageDialog(null, "Exclusão falhou!", "Erro", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnExcluirMouseClicked

    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked
        String tmpUsername = nomeCampo.getText() + "." + sobrenomeCampo.getText();
        funcionarioTmp.setNome(nomeCampo.getText());
        funcionarioTmp.setSobrenome(sobrenomeCampo.getText());
        funcionarioTmp.setCpf(cpfCampo.getText());
        funcionarioTmp.setDataNasc(formater.formatarData2(jDateChooser1));
        funcionarioTmp.setPassowrd(senhaCampo.getText());
        funcionarioTmp.setUsername(tmpUsername);
        
        if(funcionarioDao.alterarFuncionario(funcionarioTmp)){
            JOptionPane.showMessageDialog(null, "Funcionario alterado com sucesso!");
            dispose();
        }
        else
            JOptionPane.showMessageDialog(null, "Alteração falhou!!!", "Erro", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnSalvarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField cpfCampo;
    private javax.swing.JLabel cpfLabel;
    private javax.swing.JLabel cpfLabel1;
    private javax.swing.JLabel infoSenha;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField nomeCampo;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JPanel painelInformacoes;
    private javax.swing.JLabel selecioneLabel;
    private javax.swing.JTextField senhaCampo;
    private javax.swing.JTextField sobrenomeCampo;
    private javax.swing.JLabel sobrenomeLabel;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
