/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package sge;

import java.util.List;

import javax.swing.table.DefaultTableModel;

import DAO.AlunoDAO;
import DAO.TurmaDAO;
import baseCoding.Aluno;
import baseCoding.Pessoa;
import baseCoding.Turma;
import kotlin.random.Random.Default;

/**
 *
 * @author gabri
 */
public class rf_015 extends javax.swing.JInternalFrame {

    public rf_015() {
        initComponents();
        preencherlistaTurmas();
    }

    public void preencherlistaTurmas(){
        TurmaDAO turmaDAO = new TurmaDAO();
        List<Turma> turmas = turmaDAO.buscarTurma();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Turma");

        for (Turma turma : turmas) {
            Object[] rowData = new Object[8];
            rowData[0] = turma.getId();
            rowData[1] = turma.getNome();
            model.addRow(rowData);
        }

        listaTurmas.setModel(model);
    }

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void nomeCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeCampoActionPerformed

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelSelecao = new javax.swing.JTabbedPane();
        dadosPainel = new javax.swing.JPanel();
        pesquisaNomeLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTurmas = new javax.swing.JTable();
        nomeLabel = new javax.swing.JLabel();
        nomeCampo = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        cabecalho = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        alunosPainel = new javax.swing.JPanel();
        cabecalho1 = new javax.swing.JPanel();
        logo1 = new javax.swing.JLabel();
        titulo1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        pesquisaNomeLabel2 = new javax.swing.JLabel();
        listaAlunos = new javax.swing.JPanel();
        btnSalvarAlunos = new javax.swing.JButton();
        disciplinasPainel = new javax.swing.JPanel();
        cabecalho2 = new javax.swing.JPanel();
        logo2 = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        disciplinasLabel = new javax.swing.JLabel();
        alunosLista = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Movimentação de turma");

        pesquisaNomeLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pesquisaNomeLabel.setText("Pesquisa por nome");

        listaTurmas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Turma"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaTurmas.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(listaTurmas);
        listaTurmas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (listaTurmas.getColumnModel().getColumnCount() > 0) {
            listaTurmas.getColumnModel().getColumn(1).setResizable(false);
        }

        nomeLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nomeLabel.setText("Nome da Turma");

        nomeCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeCampoActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(255, 102, 102));
        btnExcluir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir turma");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/movimentacoes.png"))); // NOI18N

        titulo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        titulo.setText("Movimentação de Turmas");

        javax.swing.GroupLayout cabecalhoLayout = new javax.swing.GroupLayout(cabecalho);
        cabecalho.setLayout(cabecalhoLayout);
        cabecalhoLayout.setHorizontalGroup(
            cabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cabecalhoLayout.createSequentialGroup()
                        .addComponent(logo)
                        .addGap(42, 42, 42)
                        .addComponent(titulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator2))
                .addContainerGap())
        );
        cabecalhoLayout.setVerticalGroup(
            cabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cabecalhoLayout.createSequentialGroup()
                        .addComponent(logo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cabecalhoLayout.createSequentialGroup()
                        .addComponent(titulo)
                        .addGap(27, 27, 27)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout dadosPainelLayout = new javax.swing.GroupLayout(dadosPainel);
        dadosPainel.setLayout(dadosPainelLayout);
        dadosPainelLayout.setHorizontalGroup(
            dadosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPainelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(dadosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(dadosPainelLayout.createSequentialGroup()
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                        .addComponent(btnSalvar))
                    .addComponent(nomeLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pesquisaNomeLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(nomeCampo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        dadosPainelLayout.setVerticalGroup(
            dadosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPainelLayout.createSequentialGroup()
                .addComponent(cabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(pesquisaNomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(dadosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        painelSelecao.addTab("Dados da Turma", dadosPainel);

        logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/movimentacoes.png"))); // NOI18N

        titulo1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        titulo1.setText("Movimentação de Turmas");

        javax.swing.GroupLayout cabecalho1Layout = new javax.swing.GroupLayout(cabecalho1);
        cabecalho1.setLayout(cabecalho1Layout);
        cabecalho1Layout.setHorizontalGroup(
            cabecalho1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabecalho1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cabecalho1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cabecalho1Layout.createSequentialGroup()
                        .addComponent(logo1)
                        .addGap(42, 42, 42)
                        .addComponent(titulo1)
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addComponent(jSeparator3))
                .addContainerGap())
        );
        cabecalho1Layout.setVerticalGroup(
            cabecalho1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabecalho1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cabecalho1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cabecalho1Layout.createSequentialGroup()
                        .addComponent(logo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cabecalho1Layout.createSequentialGroup()
                        .addComponent(titulo1)
                        .addGap(27, 27, 27)))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pesquisaNomeLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pesquisaNomeLabel2.setText("Alunos da turma");

        listaAlunos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        listaAlunos.setLayout(new javax.swing.BoxLayout(listaAlunos, javax.swing.BoxLayout.Y_AXIS));

        btnSalvarAlunos.setText("Salvar");

        javax.swing.GroupLayout alunosPainelLayout = new javax.swing.GroupLayout(alunosPainel);
        alunosPainel.setLayout(alunosPainelLayout);
        alunosPainelLayout.setHorizontalGroup(
            alunosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alunosPainelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(alunosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(alunosPainelLayout.createSequentialGroup()
                        .addComponent(pesquisaNomeLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alunosPainelLayout.createSequentialGroup()
                        .addGroup(alunosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(alunosPainelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnSalvarAlunos))
                            .addComponent(listaAlunos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cabecalho1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(19, 19, 19))))
        );
        alunosPainelLayout.setVerticalGroup(
            alunosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alunosPainelLayout.createSequentialGroup()
                .addComponent(cabecalho1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pesquisaNomeLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvarAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        painelSelecao.addTab("Alunos", alunosPainel);

        logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/movimentacoes.png"))); // NOI18N

        titulo2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        titulo2.setText("Movimentação de Turmas");

        javax.swing.GroupLayout cabecalho2Layout = new javax.swing.GroupLayout(cabecalho2);
        cabecalho2.setLayout(cabecalho2Layout);
        cabecalho2Layout.setHorizontalGroup(
            cabecalho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabecalho2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cabecalho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cabecalho2Layout.createSequentialGroup()
                        .addComponent(logo2)
                        .addGap(42, 42, 42)
                        .addComponent(titulo2)
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addComponent(jSeparator4))
                .addContainerGap())
        );
        cabecalho2Layout.setVerticalGroup(
            cabecalho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabecalho2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cabecalho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cabecalho2Layout.createSequentialGroup()
                        .addComponent(logo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cabecalho2Layout.createSequentialGroup()
                        .addComponent(titulo2)
                        .addGap(27, 27, 27)))
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        disciplinasLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        disciplinasLabel.setText("Disciplinas da turma");

        alunosLista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        alunosLista.setLayout(new javax.swing.BoxLayout(alunosLista, javax.swing.BoxLayout.Y_AXIS));

        jButton1.setText("Salvar");

        javax.swing.GroupLayout disciplinasPainelLayout = new javax.swing.GroupLayout(disciplinasPainel);
        disciplinasPainel.setLayout(disciplinasPainelLayout);
        disciplinasPainelLayout.setHorizontalGroup(
            disciplinasPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(disciplinasPainelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(disciplinasPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(disciplinasPainelLayout.createSequentialGroup()
                        .addComponent(disciplinasLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, disciplinasPainelLayout.createSequentialGroup()
                        .addGroup(disciplinasPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(disciplinasPainelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addComponent(alunosLista, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cabecalho2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(19, 19, 19))))
        );
        disciplinasPainelLayout.setVerticalGroup(
            disciplinasPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(disciplinasPainelLayout.createSequentialGroup()
                .addComponent(cabecalho2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(disciplinasLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alunosLista, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        painelSelecao.addTab("Disciplinas", disciplinasPainel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelSelecao, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelSelecao, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel alunosLista;
    private javax.swing.JPanel alunosPainel;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvarAlunos;
    private javax.swing.JPanel cabecalho;
    private javax.swing.JPanel cabecalho1;
    private javax.swing.JPanel cabecalho2;
    private javax.swing.JPanel dadosPainel;
    private javax.swing.JLabel disciplinasLabel;
    private javax.swing.JPanel disciplinasPainel;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel listaAlunos;
    private javax.swing.JTable listaTurmas;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logo1;
    private javax.swing.JLabel logo2;
    private javax.swing.JTextField nomeCampo;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTabbedPane painelSelecao;
    private javax.swing.JLabel pesquisaNomeLabel;
    private javax.swing.JLabel pesquisaNomeLabel2;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    // End of variables declaration//GEN-END:variables
}
