package sge;

import util.Validator;
import javax.swing.JOptionPane;
import baseCoding.Professor;
import util.Formater;


public class rf_002 extends javax.swing.JInternalFrame {
    private static final String AWT_FONTE = "Arial";  // Compliant
    public rf_002() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        logo = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        nomeLabel = new javax.swing.JLabel();
        nomeCampo = new javax.swing.JTextField();
        sobrenomeLabel = new javax.swing.JLabel();
        sobrenomeCampo = new javax.swing.JTextField();
        dnLabel = new javax.swing.JLabel();
        cpfLabel = new javax.swing.JLabel();
        cpfCampo = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        dataNascimento = new com.toedter.calendar.JDateChooser();

        setClosable(true);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/professorLogo.png"))); // NOI18N

        titulo.setFont(new java.awt.Font(AWT_FONTE, 1, 14)); // NOI18N
        titulo.setForeground(new java.awt.Color(51, 51, 51));
        titulo.setText("Cadastro de Professor(a)");

        nomeLabel.setFont(new java.awt.Font(AWT_FONTE, 1, 14)); // NOI18N
        nomeLabel.setForeground(new java.awt.Color(51, 51, 51));
        nomeLabel.setText("Nome");

        nomeCampo.setFont(new java.awt.Font(AWT_FONTE, 0, 12)); // NOI18N
        nomeCampo.addActionListener(evt -> nomeCampoActionPerformed(evt));


        sobrenomeLabel.setFont(new java.awt.Font(AWT_FONTE, 1, 14)); // NOI18N
        sobrenomeLabel.setForeground(new java.awt.Color(51, 51, 51));
        sobrenomeLabel.setText("Sobrenome");

        sobrenomeCampo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sobrenomeCampo.addActionListener(evt -> sobrenomeCampoActionPerformed(evt));


        dnLabel.setFont(new java.awt.Font(AWT_FONTE, 1, 14)); // NOI18N
        dnLabel.setForeground(new java.awt.Color(51, 51, 51));
        dnLabel.setText("Data de Nascimento");

        cpfLabel.setFont(new java.awt.Font(AWT_FONTE, 1, 14)); // NOI18N
        cpfLabel.setForeground(new java.awt.Color(51, 51, 51));
        cpfLabel.setText("CPF");

        cpfCampo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cpfCampo.addActionListener(evt -> cpfCampoActionPerformed(evt));


        btnCadastrar.setFont(new java.awt.Font(AWT_FONTE, 0, 12)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(evt -> btnCadastrarActionPerformed(evt));


        dataNascimento.setDateFormatString("dd'/'MM'/'yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(logo)
                        .addGap(39, 39, 39)
                        .addComponent(titulo))
                    .addComponent(btnCadastrar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeCampo)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomeLabel)
                                    .addComponent(dnLabel))
                                .addGap(0, 11, Short.MAX_VALUE))
                            .addComponent(dataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpfCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(sobrenomeLabel)
                                .addComponent(sobrenomeCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cpfLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
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
                        .addGap(31, 31, 31)
                        .addComponent(titulo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLabel)
                    .addComponent(sobrenomeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sobrenomeCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dnLabel)
                    .addComponent(cpfLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cpfCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeCampoActionPerformed
        if(nomeCampo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo nome vazio!");
        }else{
            String nome = nomeCampo.getText();
            //System.out.println(nome);
        }
    }

    private void sobrenomeCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobrenomeCampoActionPerformed
        if(sobrenomeCampo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo sobrenome vazio!");
        }else{
            String sobrenome = sobrenomeCampo.getText();
            
           // System.out.println(sobrenome);
        }
    }

    private void cpfCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfCampoActionPerformed
        if(cpfCampo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo CPF vazio!");
        }else{
            String cpf = cpfCampo.getText();
        }
    }

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if(nomeCampo.getText().equals("") || sobrenomeCampo.getText().equals("") || cpfCampo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        }else{
            
            String nome = nomeCampo.getText();
            String sobrenome = sobrenomeCampo.getText();
            String cpf = cpfCampo.getText();
            String dataNasc = Formater.formatarData2(dataNascimento);
        if(Validator.validarNome(nome) && Validator.validarNome(sobrenome) && Validator.validarCPF(cpf) && Validator.validarData(dataNasc)){
            Professor professor = new Professor(nome, sobrenome, dataNasc, cpf, "Rua 01");  
        if(professor.cadastrarProfessor(professor)){
            JOptionPane.showMessageDialog(null, "Professor cadastrado com sucesso!");
            this.dispose();
        }else{  
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar professor!");
        }
      }
    }
    }//GEN-LAST:event_btnCadastrarActionPerformed
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JTextField cpfCampo;
    private javax.swing.JLabel cpfLabel;
    private com.toedter.calendar.JDateChooser dataNascimento;
    private javax.swing.JLabel dnLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField nomeCampo;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField sobrenomeCampo;
    private javax.swing.JLabel sobrenomeLabel;
    private javax.swing.JLabel titulo;

    // End of variables declaration//GEN-END:variables
}
