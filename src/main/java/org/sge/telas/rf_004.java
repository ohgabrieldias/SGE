/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.sge.telas;

import org.sge.dao.MySQLConnector;
import org.sge.dao.AlunoDAO;
import org.sge.dao.DisciplinaDAO;
import org.sge.dao.TurmaDAO;
import org.sge.base.Aluno;
import org.sge.base.Disciplina;
import org.sge.base.Turma;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author gabri
 */
public class rf_004 extends javax.swing.JInternalFrame {
    private static final String AWT_FONTE = "Arial";  // Compliant
    MySQLConnector connector = new MySQLConnector();
    Connection connection = connector.getConnection();
    /**
     * Creates new form rf_004
     */
    private TurmaDAO turmaDao = new TurmaDAO(connection);
    private DisciplinaDAO discDao = new DisciplinaDAO(connection);
    private AlunoDAO alunoDao = new AlunoDAO(connection);
    private List<Disciplina> discList = discDao.getDisciplinas();
    private List<Aluno> alunoList = alunoDao.buscarListaAluno();
    
    public rf_004() {
        initComponents();
        
        createDiscCheckboxes(discList);
        createAlunoCheckboxes(alunoDao.buscarNomesAlunos());
        
    }
    
    public void createDiscCheckboxes(List<Disciplina> discList) {
        for (Disciplina disc : discList) {
            JCheckBox checkBox = new JCheckBox(disc.getNome());
            listaDisciplinas.add(checkBox);
        }
    }
    
   
    public List<Disciplina> getDisciplinaIds(List<Disciplina> disciplinas, List<String> nomes) {
        List<Disciplina> discipTmp = new ArrayList<>();

        for (String nome : nomes) {
            for (Disciplina disciplina : disciplinas) {
                if (disciplina.getNome().equals(nome)) {
                    discipTmp.add(disciplina);
                    System.out.println(disciplina.getId());
                    break;
                }
            }
        }

        return discipTmp;
    }
    
    public List<Aluno> getAlunosIds(List<Aluno> alunos, List<String> nomes) {
        List<Aluno> alunoTmp = new ArrayList<>();

        for (String nome : nomes) {
            for (Aluno aluno : alunos) {
                String cpfPart = nome.substring(nome.indexOf("CPF: ") + 5); // Obtém a parte após "CPF: "
    //            System.out.print(cpfPart);
                if (aluno.getCpf().equals(cpfPart)) {
                    alunoTmp.add(aluno);
                    System.out.println(aluno.getId());
                    break;
                }
            }
        }

        return alunoTmp;
    }

    public List<String> getSelectedCheckboxValues(JPanel panel) {
        List<String> selectedValues = new ArrayList<>();

        for (int i = 0; i < panel.getComponentCount(); i++) {
            if (panel.getComponent(i) instanceof JCheckBox) {
                JCheckBox checkBox = (JCheckBox) panel.getComponent(i);
                if (checkBox.isSelected()) {
                    selectedValues.add(checkBox.getText());
                }
            }
        }

        return selectedValues;
    }
    
    public void createAlunoCheckboxes(List<String> stringList) {
        for (String str : stringList) {
            JCheckBox checkBox = new JCheckBox(str);
            listaAlunos.add(checkBox);
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
        nomeLabel = new javax.swing.JLabel();
        nomeCampo = new javax.swing.JTextField();
        scrollDisciplinas = new javax.swing.JScrollPane();
        listaDisciplinas = new javax.swing.JPanel();
        disciplinasLabel = new javax.swing.JLabel();
        disciplinasLabel1 = new javax.swing.JLabel();
        scrollAlunos = new javax.swing.JScrollPane();
        listaAlunos = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastro de Turma");

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/turmaLogo.png"))); // NOI18N

        titulo.setFont(new java.awt.Font(AWT_FONTE, 1, 14)); // NOI18N
        titulo.setText("Cadastro de Turma");

        nomeLabel.setFont(new java.awt.Font(AWT_FONTE, 1, 14)); // NOI18N
        nomeLabel.setText("Nome da turma");

        nomeCampo.setFont(new java.awt.Font(AWT_FONTE, 0, 12)); // NOI18N
        nomeCampo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nomeCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeCampoActionPerformed(evt);
            }
        });

        scrollDisciplinas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        scrollDisciplinas.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        listaDisciplinas.setBackground(new java.awt.Color(255, 255, 255));
        listaDisciplinas.setLayout(new javax.swing.BoxLayout(listaDisciplinas, javax.swing.BoxLayout.Y_AXIS));
        scrollDisciplinas.setViewportView(listaDisciplinas);

        disciplinasLabel.setFont(new java.awt.Font(AWT_FONTE, 1, 14)); // NOI18N
        disciplinasLabel.setText("Selecione as Disciplinas desta turma");

        disciplinasLabel1.setFont(new java.awt.Font(AWT_FONTE, 1, 14)); // NOI18N
        disciplinasLabel1.setText("Selecione os Alunos desta turma");

        scrollAlunos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        scrollAlunos.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        listaAlunos.setBackground(new java.awt.Color(255, 255, 255));
        listaAlunos.setLayout(new javax.swing.BoxLayout(listaAlunos, javax.swing.BoxLayout.Y_AXIS));
        scrollAlunos.setViewportView(listaAlunos);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                        .addComponent(titulo)
                        .addGap(152, 152, 152))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nomeLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(disciplinasLabel1)
                            .addComponent(disciplinasLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(scrollAlunos, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollDisciplinas, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeCampo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(titulo)
                        .addGap(28, 28, 28)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(disciplinasLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(disciplinasLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        String tmp = nomeCampo.getText();
        List<String> discSelected = getSelectedCheckboxValues(listaDisciplinas);
        List<String> alunosSelected = getSelectedCheckboxValues(listaAlunos);
        
        List<Disciplina> selectedDiscip = getDisciplinaIds(discList, discSelected);
        List<Aluno> selectedAlunos = getAlunosIds(alunoList, alunosSelected);
        
        if(!(discSelected.isEmpty() || alunosSelected.isEmpty() || tmp.isEmpty())){
            Turma turma = new Turma(tmp, "EC11", "2023-03-01", "2023-06-01", selectedAlunos, selectedDiscip);

            if(turmaDao.cadastrarTurma(turma)){

               JOptionPane.showMessageDialog(this, "Cadastro bem sucedido!");
               // Feche o formulário
               dispose();
               }
               else JOptionPane.showMessageDialog(this, "Cadastro mal sucedido!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        else JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void nomeCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeCampoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JLabel disciplinasLabel;
    private javax.swing.JLabel disciplinasLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel listaAlunos;
    private javax.swing.JPanel listaDisciplinas;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField nomeCampo;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JScrollPane scrollAlunos;
    private javax.swing.JScrollPane scrollDisciplinas;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}