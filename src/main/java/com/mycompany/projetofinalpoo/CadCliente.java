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
public class CadCliente extends javax.swing.JFrame {

    private Cliente c1 = new Cliente();
    private GerCli gc = GerCli.geraGerCli();
    private static CadCliente cpUnic;

    public CadCliente() {
        initComponents();
    }

    //Singleton
    public static CadCliente geraCadCli() {
        if (cpUnic == null) {
            cpUnic = new CadCliente();
        }
        return cpUnic;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbCadCli = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        lbCPF = new javax.swing.JLabel();
        lbCart = new javax.swing.JLabel();
        lbCategoria = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtCartei = new javax.swing.JTextField();
        txtCatego = new javax.swing.JTextField();
        btInse = new javax.swing.JButton();
        btAtuali = new javax.swing.JButton();
        btExclu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbCli = new javax.swing.JTable();
        btConsul = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbCadCli.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbCadCli.setText("CADASTRO CLIENTE");

        lbNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNome.setText("NOME");

        lbCPF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbCPF.setText("CPF");

        lbCart.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbCart.setText("CARTEIRA");

        lbCategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbCategoria.setText("CATEGORIA");

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

        btExclu.setText("EXCLUIR DADOS");
        btExclu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluActionPerformed(evt);
            }
        });

        TbCli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NOME", "CPF", "CARTEIRA", "CATEGORIA"
            }
        ));
        TbCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TbCliMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TbCli);

        btConsul.setText("CONSULTAR");
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
                                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbCart)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCartei, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbCategoria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCatego, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(lbCadCli, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btInse)
                        .addGap(38, 38, 38)
                        .addComponent(btAtuali)
                        .addGap(35, 35, 35)
                        .addComponent(btExclu)
                        .addGap(35, 35, 35)
                        .addComponent(btConsul))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(130, Short.MAX_VALUE))
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
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCart)
                            .addComponent(txtCartei, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCategoria)
                            .addComponent(txtCatego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInse)
                    .addComponent(btAtuali)
                    .addComponent(btExclu)
                    .addComponent(btConsul))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btInseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInseActionPerformed
        insCli();
        listTab();
        limpar();

    }//GEN-LAST:event_btInseActionPerformed

    private void btAtualiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualiActionPerformed
        AtuCliCpf();
        listTab();
        limpar();
    }//GEN-LAST:event_btAtualiActionPerformed

    private void btExcluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluActionPerformed
        excCliCpf();
        listTab();
        limpar();

    }//GEN-LAST:event_btExcluActionPerformed

    private void btConsulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsulActionPerformed
        consCliCpf();
        listTab();

    }//GEN-LAST:event_btConsulActionPerformed

    private void TbCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbCliMouseClicked
        selectTab();
    }//GEN-LAST:event_TbCliMouseClicked

    public void selectTab() {

        String valLinTab = "";

        int posLin = TbCli.getSelectedRow();
        int col = 0;
        for (col = 0; col < TbCli.getColumnCount(); col++) {
            valLinTab += TbCli.getModel().getValueAt(posLin, col).toString();

            if (col + 1 < TbCli.getColumnCount()) {
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
        DefaultTableModel modelo = (DefaultTableModel) TbCli.getModel();
        int posLin = 0;

        modelo.setRowCount(posLin);

        for (Cliente Cliente : gc.getBdCli()) { //for each
            modelo.insertRow(posLin, new Object[]{Cliente.getNome(), Cliente.getCpf(), Cliente.getCarteira(), Cliente.getCategoria()});
            posLin++;
        }
    }

    public void insCli() {
        try {
            c1 = new Cliente();

            c1.setCpf(String.valueOf(txtCpf.getText()));
            c1.setNome(txtNome.getText());
            c1.setCarteira(txtCartei.getText());
            c1.setCategoria(txtCatego.getText());

            if (c1.getCpf().equals("")) {
                throw new NumberFormatException();
            }

            c1 = gc.insCli(c1);

            if (c1 != null) {
                JOptionPane.showMessageDialog(
                        null,
                        "Cliente cadastrado com sucesso!",
                        "CADASTRO DE CLIENTE",
                        1
                );
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "CPF duplicado",
                        "CADASTRO DE CLIENTE",
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
            txtCpf.setText("");
            txtCpf.requestFocus();
        }

    }

    public void AtuCliCpf() {
        try {
            c1 = new Cliente();

            c1.setCpf(String.valueOf(txtCpf.getText()));

            if (c1.getCpf().equals("")) {
                throw new NumberFormatException();
            }

            c1 = gc.atualizaCliCpf(c1);

            if (c1 != null) {
                txtCpf.setText(String.valueOf(c1.getCpf()));

                JOptionPane.showMessageDialog(
                        null,
                        "Confira do dados!",
                        "ALTERAÇÃO DE CLIENTE",
                        1
                );
                limpar();
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "NÃO EXISTE CLIENTE COM ESTE CPF",
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

    public void excCliCpf() {
        c1 = new Cliente();

        c1.setCpf(String.valueOf(txtCpf.getText()));

        c1 = gc.delCliCpf(c1);

        if (c1 == null) {

            JOptionPane.showMessageDialog(
                    null,
                    "Cliente excluida com sucesso!",
                    "EXCLUSÃO DE CLIENTE",
                    1
            );
            limpar();
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "NÃO EXISTE CLIENTE COM ESTE CPF",
                    "EXCLUSÃO DE CLIENTE",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    public void consCliCpf() {
        c1 = new Cliente();

        c1.setCpf(String.valueOf(txtCpf.getText()));

        c1 = gc.consCliCpf(c1);

        if (c1 != null) {
            txtCpf.setText(String.valueOf(c1.getCpf()));
            txtNome.setText(c1.getNome());
            txtCartei.setText(c1.getCarteira());
            txtCatego.setText(c1.getCategoria());

            JOptionPane.showMessageDialog(
                    null,
                    "Pessoa encontradas com sucesso! - Verifique os dados",
                    "CONSULTA DE PESSOA",
                    1
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "nÃO EXISTE PESSOA COM ESTE CPF",
                    "CONSULTA DE PESSOA",
                    JOptionPane.ERROR_MESSAGE
            );
        }
        limpar();
    }

    public void limpar() {
        txtCpf.setText("");
        txtNome.setText("");
        txtCatego.setText("");
        txtCartei.setText("");

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
            java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TbCli;
    private javax.swing.JButton btAtuali;
    private javax.swing.JButton btConsul;
    private javax.swing.JButton btExclu;
    private javax.swing.JButton btInse;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbCadCli;
    private javax.swing.JLabel lbCart;
    private javax.swing.JLabel lbCategoria;
    private javax.swing.JLabel lbNome;
    private javax.swing.JTextField txtCartei;
    private javax.swing.JTextField txtCatego;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
