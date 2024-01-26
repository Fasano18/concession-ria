/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projetofinalpoo;
//Leonardo Fasano RA:2564211

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author leona
 */
public class CadFunc extends javax.swing.JFrame {

    private Funcionario f1 = new Funcionario();
    private GerFunc gf = GerFunc.geraGerFunc();
    private static CadFunc cpUnic;

    //Singleton
    public static CadFunc geraCadFunc() {
        if (cpUnic == null) {
            cpUnic = new CadFunc();
        }
        return cpUnic;
    }

    public CadFunc() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btInse = new javax.swing.JButton();
        btAtuali = new javax.swing.JButton();
        lbCadCli = new javax.swing.JLabel();
        btExclu = new javax.swing.JButton();
        lbNome = new javax.swing.JLabel();
        lbCPF = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbFunc = new javax.swing.JTable();
        lbSal = new javax.swing.JLabel();
        lbCargo = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        btConsul = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btInse.setText("INSERIR DADOS");
        btInse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInseActionPerformed(evt);
            }
        });

        btAtuali.setText("ATUALIZAR DADOS");
        btAtuali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualiActionPerformed(evt);
            }
        });

        lbCadCli.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbCadCli.setText("CADASTRO FUNCIONARIO");

        btExclu.setText("EXCLUIR DADOS");
        btExclu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluActionPerformed(evt);
            }
        });

        lbNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNome.setText("NOME");

        lbCPF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbCPF.setText("CPF");

        TbFunc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NOME", "CPF", "SALARIO", "CARGO"
            }
        ));
        TbFunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TbFuncMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TbFunc);

        lbSal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbSal.setText("SALARIO");

        lbCargo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbCargo.setText("CARGO");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });

        txtSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioActionPerformed(evt);
            }
        });

        txtCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargoActionPerformed(evt);
            }
        });

        btConsul.setText("CONSULTAR DADOS");
        btConsul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsulActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbNome)
                                    .addComponent(lbCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbSal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbCargo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btInse)
                        .addGap(38, 38, 38)
                        .addComponent(btAtuali)
                        .addGap(35, 35, 35)
                        .addComponent(btExclu)
                        .addGap(18, 18, 18)
                        .addComponent(btConsul))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(lbCadCli, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lbCadCli))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNome)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCPF)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSal)
                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCargo)
                            .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInse)
                    .addComponent(btAtuali)
                    .addComponent(btExclu)
                    .addComponent(btConsul))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed

    private void txtSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioActionPerformed

    private void txtCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCargoActionPerformed

    private void btInseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInseActionPerformed
        insFunc();
        listTab();
        limpar();
    }//GEN-LAST:event_btInseActionPerformed

    private void btAtualiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualiActionPerformed
        AtuFuncCpf();
        limpar();
        listTab();

    }//GEN-LAST:event_btAtualiActionPerformed

    private void btExcluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluActionPerformed
        excFuncCpf();
        limpar();
        listTab();
    }//GEN-LAST:event_btExcluActionPerformed

    private void btConsulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsulActionPerformed
        consFuncCpf();
        listTab();
    }//GEN-LAST:event_btConsulActionPerformed

    private void TbFuncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbFuncMouseClicked
        selectTab();
    }//GEN-LAST:event_TbFuncMouseClicked

    public void selectTab() {

        String valLinTab = "";

        int posLin = TbFunc.getSelectedRow();
        int col = 0;
        for (col = 0; col < TbFunc.getColumnCount(); col++) {
            valLinTab += TbFunc.getModel().getValueAt(posLin, col).toString();

            if (col + 1 < TbFunc.getColumnCount()) {
                valLinTab += " - ";
            }
        }

        JOptionPane.showMessageDialog(
                null,
                "Conteudo: " + valLinTab,
                "VALORES DA LINHA --> " + col,
                1
        );
    }

    public void listTab() {
        DefaultTableModel modelo = (DefaultTableModel) TbFunc.getModel();
        int posLin = 0;

        modelo.setRowCount(posLin);

        for (Funcionario funcionario : gf.getBdFunc()) { //for each
            modelo.insertRow(posLin, new Object[]{funcionario.getNome(), funcionario.getCpf(), funcionario.getSalario(), funcionario.getCargo()});
            posLin++;
        }
    }

    public void insFunc() {
        try {
            f1 = new Funcionario();

            f1.setCpf(String.valueOf(txtCPF.getText()));
            f1.setNome(txtNome.getText());
            f1.setSalario(Integer.valueOf(txtSalario.getText()));
            f1.setCargo(txtCargo.getText());

            f1 = gf.insFunc(f1);

            if (f1 != null) {
                JOptionPane.showMessageDialog(
                        null,
                        "Funcinario cadastrada com sucesso!",
                        "CADASTRO DE Funcinario",
                        1
                );
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "CPF duplicado",
                        "CADASTRO DE Funcionario",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }//fim try
        catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(
                    null,
                    "Valor do CPF deve ser um inteiro",
                    "Erro de tipo de dados",
                    JOptionPane.ERROR_MESSAGE
            );
            txtCPF.setText("");
            txtCPF.requestFocus();
        }

    }

    public void AtuFuncCpf() {
        try {
            f1 = new Funcionario();

            f1.setCpf(String.valueOf(txtCPF.getText()));

            if (f1.getCpf().equals("")) {
                throw new NumberFormatException();
            }

            f1 = gf.atualizaFuncCpf(f1);

            if (f1 != null) {
                txtCPF.setText(String.valueOf(f1.getCpf()));

                JOptionPane.showMessageDialog(
                        null,
                        "Confira do dados!",
                        "ALTERAÇÃO DE  FUNCIONARIO",
                        1
                );
                limpar();
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "NÃO EXISTE FUNCIONARIO COM ESTE CPF",
                        "ALTERAÇÃO DE CLIENTE",
                        JOptionPane.ERROR_MESSAGE
                );
            }

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(
                    null,
                    "Insira algum Dado",
                    "Erro de tipo de dados",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    public void excFuncCpf() {
        f1 = new Funcionario();

        f1.setCpf(String.valueOf(txtCPF.getText()));

        f1 = gf.delFuncCpf(f1);

        if (f1 == null) {

            JOptionPane.showMessageDialog(
                    null,
                    "Funcionario excluido com sucesso!",
                    "EXCLUSÃO DE Funcionario",
                    1
            );
            limpar();
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "NÃO EXISTE Funcionario COM ESTE CPF",
                    "EXCLUSÃO DE Funcionario",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    public void consFuncCpf() {
        f1 = new Funcionario();

        f1.setCpf(String.valueOf(txtCPF.getText()));

        f1 = gf.consFuncCpf(f1);

        if (f1 != null) {
            txtCPF.setText(String.valueOf(f1.getCpf()));
            txtNome.setText(f1.getNome());
            txtSalario.setText(String.valueOf(f1.getSalario()));
            txtCargo.setText(f1.getCargo());

            JOptionPane.showMessageDialog(
                    null,
                    "Funcionario encontrados com sucesso! - Verifique os dados",
                    "CONSULTA DE FUNCIONARIO",
                    1
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "nÃO EXISTE FUNCIONARIO COM ESTE CPF",
                    "CONSULTA DE FUNCIONARIO",
                    JOptionPane.ERROR_MESSAGE
            );
        }
        limpar();
    }

    public void limpar() {
        txtCPF.setText("");
        txtNome.setText("");
        txtSalario.setText("");
        txtCargo.setText("");

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadFunc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TbFunc;
    private javax.swing.JButton btAtuali;
    private javax.swing.JButton btConsul;
    private javax.swing.JButton btExclu;
    private javax.swing.JButton btInse;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbCadCli;
    private javax.swing.JLabel lbCargo;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbSal;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
