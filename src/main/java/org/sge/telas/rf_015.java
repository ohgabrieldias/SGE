/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.sge.telas;


import org.sge.dao.MySQLConnector;
import org.sge.dao.AlunoDAO;
import org.sge.dao.DisciplinaDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.sge.dao.TurmaDAO;
import org.sge.base.Aluno;
import org.sge.base.Disciplina;
import org.sge.base.Professor;
import org.sge.base.Turma;
import java.awt.Component;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.sge.util.Formater;
/**
 *
 * @author gabri
 */
public class rf_015 extends javax.swing.JInternalFrame {
    private static final String AWT_FONTE = "Arial";  // Compliant
    MySQLConnector connector = new MySQLConnector();
    Connection connection = connector.getConnection();
    
    public rf_015() {
        initComponents();
        preencherlistaTurmas();
    }
    
    private Formater formater = new Formater();
    private TurmaDAO turmaDao = new TurmaDAO(connection);
    private AlunoDAO alunoDao = new AlunoDAO(connection);
    private DisciplinaDAO discDao = new DisciplinaDAO(connection);
    
    private LinkedList<Professor> professores = null; // lista dos professores dessa turma
    private List<Disciplina> discList = discDao.getDisciplinas();
    private List<Aluno> alunoList = alunoDao.buscarListaAluno();
    
    
    
    Turma turmaTmp = null;
    
    public void preencherlistaTurmas(){
        List<Turma> turmas = turmaDao.buscarTurma();
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
    
    public void createDiscCheckboxes(List<Disciplina> discList) {
        for (Disciplina disc : discList) {
            JCheckBox checkBox = new JCheckBox(disc.getNome());
            listaDiscip.add(checkBox);
        }
    }
    
    public void createAlunosCheckboxes(List<Aluno> alunoList) {
        for (Aluno aluno : alunoList) {
            JCheckBox checkBox = new JCheckBox(aluno.getNome() + " CPF: " + aluno.getCpf());
            listaAlunos.add(checkBox);
        }
    }
    
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
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        cabecalho = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnSalvar = new javax.swing.JButton();
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
        listaDiscip = new javax.swing.JPanel();
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
        listaTurmas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaTurmasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaTurmas);

        nomeLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nomeLabel.setText("Nome da Turma");

        nomeCampo.setEnabled(false);
        nomeCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeCampoActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(255, 102, 102));
        btnExcluir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir turma");
        btnExcluir.setEnabled(false);
        btnExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExcluirMouseClicked(evt);
            }
        });
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
                        .addGap(0, 13, Short.MAX_VALUE))
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

        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout dadosPainelLayout = new javax.swing.GroupLayout(dadosPainel);
        dadosPainel.setLayout(dadosPainelLayout);
        dadosPainelLayout.setHorizontalGroup(
            dadosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosPainelLayout.createSequentialGroup()
                .addGroup(dadosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dadosPainelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(dadosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(dadosPainelLayout.createSequentialGroup()
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvar))
                            .addComponent(nomeLabel)
                            .addComponent(pesquisaNomeLabel)
                            .addComponent(cabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nomeCampo)))
                    .addGroup(dadosPainelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGap(0, 0, Short.MAX_VALUE))
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
        listaAlunos.setEnabled(false);
        listaAlunos.setLayout(new javax.swing.BoxLayout(listaAlunos, javax.swing.BoxLayout.Y_AXIS));

        btnSalvarAlunos.setText("Salvar");
        btnSalvarAlunos.setEnabled(false);
        btnSalvarAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarAlunosMouseClicked(evt);
            }
        });

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
                        .addGap(0, 0, Short.MAX_VALUE))
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

        listaDiscip.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        listaDiscip.setEnabled(false);
        listaDiscip.setLayout(new javax.swing.BoxLayout(listaDiscip, javax.swing.BoxLayout.Y_AXIS));

        jButton1.setText("Salvar");
        jButton1.setEnabled(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

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
                            .addComponent(listaDiscip, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(listaDiscip, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
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

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
  
    }//GEN-LAST:event_btnEditarActionPerformed
    
    public List<String> obterNomeCpfAlunos(List<Aluno> listaAlunos) {
        List<String> nomeCpfAlunos = new ArrayList<>();

        for (Aluno aluno : listaAlunos) {
            String nomeCpf = aluno.getNome() + " CPF: " + aluno.getCpf();
            nomeCpfAlunos.add(nomeCpf);
        }

        return nomeCpfAlunos;
    }
    
    public static List<String> obterNomesDisciplinas(List<Disciplina> listaDisciplinas) {
        List<String> nomesDisciplinas = new ArrayList<>();

        for (Disciplina disciplina : listaDisciplinas) {
            String nomeDisciplina = disciplina.getNome();
            nomesDisciplinas.add(nomeDisciplina);
        }

        return nomesDisciplinas;
    }
    
    public List<Aluno> encontrarAlunosComuns(List<Aluno> lista1, List<Aluno> lista2) {
        List<Aluno> alunosComuns = new ArrayList<>();

        for (Aluno aluno1 : lista1) {
            for (Aluno aluno2 : lista2) {
                if (aluno1.getId() == aluno2.getId()) {
                    alunosComuns.add(aluno1);
                    break; // Pode interromper a iteração interna, pois já encontrou um aluno comum
                }
            }
        }

        return alunosComuns;
    }
    
    public List<Disciplina> encontrarDisciplinasComuns(List<Disciplina> lista1, List<Disciplina> lista2) {
        List<Disciplina> disciplinasComuns = new ArrayList<>();

        for (Disciplina disciplina1 : lista1) {
            for (Disciplina disciplina2 : lista2) {
                if (disciplina1.getId() == disciplina2.getId()) {
                    disciplinasComuns.add(disciplina1);
                    break; // Pode interromper a iteração interna, pois já encontrou uma disciplina comum
                }
            }
        }

        return disciplinasComuns;
    }
    
    public void marcarJCheckBoxes(List<String> nomes, JPanel panel) {
        Component[] components = panel.getComponents();

        for (Component component : components) {
            if (component instanceof JCheckBox) {
                JCheckBox checkBox = (JCheckBox) component;
                String textoCheckBox = checkBox.getText();

                if (nomes.contains(textoCheckBox)) {
                    checkBox.setSelected(true);
                }
            }
        }
    }


    private void listaTurmasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaTurmasMouseClicked
        // click na Tabela
        int selectedRow = listaTurmas.getSelectedRow();
        int selectedColumn = listaTurmas.getSelectedColumn();
        int id = (Integer)listaTurmas.getValueAt(selectedRow, selectedColumn);
        
        listaAlunos.removeAll();
        listaAlunos.revalidate();
        listaAlunos.repaint();
        
        listaDiscip.removeAll();
        listaDiscip.revalidate();
        listaDiscip.repaint();
        
        turmaTmp = turmaDao.buscarPorId(id);
        btnEditar.setEnabled(true);
        btnExcluir.setEnabled(true);
        if (turmaTmp != null) {
            List<Aluno> tmpAlun = encontrarAlunosComuns(turmaTmp.getAlunos(),alunoList);
            List<Disciplina> tmpDicp = encontrarDisciplinasComuns(turmaTmp.getDisciplinas(), discList);
            
            createAlunosCheckboxes(alunoList);
            createDiscCheckboxes(discList);
            
            List<String> tmpList = obterNomeCpfAlunos(tmpAlun);            
            marcarJCheckBoxes(tmpList,listaAlunos);
            
            tmpList = obterNomesDisciplinas(tmpDicp);
            marcarJCheckBoxes(tmpList,listaDiscip);
         }
    }//GEN-LAST:event_listaTurmasMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        listaAlunos.setEnabled(true);
        listaDiscip.setEnabled(true);
        btnSalvar.setEnabled(true);
        nomeCampo.setEnabled(true);
        jButton1.setEnabled(true);
        btnSalvarAlunos.setEnabled(true);
        
        nomeCampo.setText(turmaTmp.getNome());
    }//GEN-LAST:event_btnEditarMouseClicked
    
    public List<Integer> getDisciplinaIds(List<Disciplina> disciplinas, List<String> nomes) {
        List<Integer> discipTmp = new ArrayList<>();

        for (String nome : nomes) {
            for (Disciplina disciplina : disciplinas) {
                if (disciplina.getNome().equals(nome)) {
                    discipTmp.add(disciplina.getId());
                    System.out.println(disciplina.getId());
                    break;
                }
            }
        }

        return discipTmp;
    }
    
    public List<Integer> getAlunosIds(List<Aluno> alunos, List<String> nomes) {
        List<Integer> alunoTmp = new ArrayList<>();

        for (String nome : nomes) {
            for (Aluno aluno : alunos) {
                String cpfPart = nome.substring(nome.indexOf("CPF: ") + 5); // Obtém a parte após "CPF: "
    //            System.out.print(cpfPart);
                if (aluno.getCpf().equals(cpfPart)) {
                    alunoTmp.add(aluno.getId());
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
    private void btnExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMouseClicked
        if((turmaTmp.getAlunos().isEmpty() || turmaTmp.getDisciplinas().isEmpty())){
            if(turmaDao.excluirTurma(turmaTmp.getId())) {
                JOptionPane.showMessageDialog(this, "Turma excluida!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                
                listaTurmas.removeAll();
                listaTurmas.revalidate();
                listaTurmas.repaint();
                
                preencherlistaTurmas();
                
                btnEditar.setEnabled(false);
                btnExcluir.setEnabled(false);
                btnSalvar.setEnabled(false);
                jButton1.setEnabled(false);
                
            }
            else JOptionPane.showMessageDialog(this, "Exclusão falhou!!!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(this, "Turma não está vazia!", "Erro", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnExcluirMouseClicked

    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked
        String tmp = nomeCampo.getText();

        if(!(tmp.isEmpty())){
            if(turmaDao.atualizarNomeTurma(turmaTmp.getId(),tmp)) JOptionPane.showMessageDialog(this, "Turma alterada com sucesso!");
            else JOptionPane.showMessageDialog(this, "Alteração falhou!");
        }
        else
            JOptionPane.showMessageDialog(this, "Campos obrigatorios não preenchidos!", "Erro", JOptionPane.ERROR_MESSAGE);
                
    }//GEN-LAST:event_btnSalvarMouseClicked

    private void btnSalvarAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarAlunosMouseClicked
        List<String> alunosSelected = getSelectedCheckboxValues(listaAlunos);

        if (alunosSelected.isEmpty()) {
            int resposta = JOptionPane.showConfirmDialog(this, "A lista de alunos está vazia. Deseja remover todos os alunos da turma?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                boolean sucesso = turmaDao.atualizarListaAlunosTurma(turmaTmp.getId(), new ArrayList<>());
                if (sucesso) {
                    JOptionPane.showMessageDialog(this, "Todos os alunos foram removidos da turma.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Ocorreu um erro ao remover os alunos da turma.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
            return;
        }

    List<Integer> selectedAlunos = getAlunosIds(turmaTmp.getAlunos(), alunosSelected);

    boolean sucesso = false;
    if (!selectedAlunos.isEmpty()) {
        sucesso = turmaDao.atualizarListaAlunosTurma(turmaTmp.getId(), selectedAlunos);
    }

        if (sucesso) JOptionPane.showMessageDialog(this, "Lista de alunos atualizada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        else JOptionPane.showMessageDialog(this, "Ocorreu um erro ao atualizar a lista de alunos.", "Erro", JOptionPane.ERROR_MESSAGE);
        
    }//GEN-LAST:event_btnSalvarAlunosMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        List<String> discSelected = getSelectedCheckboxValues(listaDiscip);

        if (discSelected.isEmpty()) {
            int resposta = JOptionPane.showConfirmDialog(this, "A lista de disciplinas está vazia. Deseja remover todas as disciplinas da turma?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                boolean sucesso = turmaDao.atualizarListaDisciplinasTurma(turmaTmp.getId(), new ArrayList<>());
                if (sucesso) {
                    JOptionPane.showMessageDialog(this, "Todas as disciplinas foram removidas da turma.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Ocorreu um erro ao remover as disciplinas da turma.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
            return;
        }

        List<Integer> selectedDiscip = getDisciplinaIds(turmaTmp.getDisciplinas(), discSelected);
        boolean sucesso = false;
        if (!selectedDiscip.isEmpty()) {
            sucesso = turmaDao.atualizarListaDisciplinasTurma(turmaTmp.getId(), selectedDiscip);
        }

        if (sucesso) {
            JOptionPane.showMessageDialog(this, "Lista de disciplinas atualizada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro ao atualizar a lista de disciplinas.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void nomeCampoActionPerformed(java.awt.event.ActionEvent evt) {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel alunosPainel;
    private javax.swing.JButton btnEditar;
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
    private javax.swing.JPanel listaDiscip;
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
