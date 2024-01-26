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
public class CadMoto extends javax.swing.JFrame {

    private Moto m1 = new Moto();
    private GerMoto gm = GerMoto.geraGerMot();
    private static CadMoto cpUnic;

    //Singleton
    public static CadMoto geraCadMoto() {
        if (cpUnic == null) {
            cpUnic = new CadMoto();
        }
        return cpUnic;
    }

    public CadMoto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbMarc = new javax.swing.JLabel();
        lbMod = new javax.swing.JLabel();
        lbPreço = new javax.swing.JLabel();
        txtMarc = new javax.swing.JTextField();
        txtMod = new javax.swing.JTextField();
        txtCilin = new javax.swing.JTextField();
        lbPreco1 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMoto = new javax.swing.JTable();
        btInserir = new javax.swing.JButton();
        btAtua = new javax.swing.JButton();
        btExclu = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("CADASTRO MOTO");

        lbMarc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbMarc.setText("MARCA");

        lbMod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbMod.setText("MODELO");

        lbPreço.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbPreço.setText("CILINDRADA");

        txtMarc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcActionPerformed(evt);
            }
        });

        txtCilin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCilinActionPerformed(evt);
            }
        });

        lbPreco1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbPreco1.setText("PREÇO");

        txtTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("TIPO");

        tbMoto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "MARCA", "MODELO", "PRECO", "CILINDRADA", "TIPO", "PLACA"
            }
        ));
        tbMoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMotoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbMoto);

        btInserir.setText("INSERIR DADOS");
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        btAtua.setText("ATUALIZAR DADOS ");
        btAtua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtuaActionPerformed(evt);
            }
        });

        btExclu.setText("EXCLUIR DADOS");
        btExclu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluActionPerformed(evt);
            }
        });

        jButton1.setText("CONSULTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("PLACA");

        txtPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(226, 226, 226))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbPreço, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCilin, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbPreco1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbMod))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(lbMarc))
                                .addGap(26, 26, 26)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPreco, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(txtMod)
                            .addComponent(txtMarc)
                            .addComponent(txtPlaca)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btInserir)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAtua)
                        .addGap(18, 18, 18)
                        .addComponent(btExclu)
                        .addGap(28, 28, 28)
                        .addComponent(jButton1)))
                .addGap(250, 250, 250))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMarc)
                    .addComponent(txtMarc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbMod)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPreco1)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPreço)
                    .addComponent(txtCilin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInserir)
                    .addComponent(btAtua)
                    .addComponent(btExclu)
                    .addComponent(jButton1))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMarcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcActionPerformed

    private void txtTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoActionPerformed

    private void txtCilinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCilinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCilinActionPerformed

    private void txtPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacaActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        try {
            insMot();
            listTab();
            limpar();
        } catch (ModelogrdException erro) {
            JOptionPane.showMessageDialog(
                    null,
                    "Erro",
                    "Erro de tipo de dados",
                    JOptionPane.ERROR_MESSAGE
            );
        }

    }//GEN-LAST:event_btInserirActionPerformed

    private void btAtuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtuaActionPerformed
        AtuMotPlaca();
        listTab();
        limpar();

    }//GEN-LAST:event_btAtuaActionPerformed

    private void btExcluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluActionPerformed
        excMotPlaca();
        listTab();
        limpar();
    }//GEN-LAST:event_btExcluActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        consMotPlaca();
        listTab();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbMotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMotoMouseClicked
        selectTab();
    }//GEN-LAST:event_tbMotoMouseClicked

    public void selectTab() {

        String valLinTab = "";

        int posLin = tbMoto.getSelectedRow();
        int col = 0;
        for (col = 0; col < tbMoto.getColumnCount(); col++) {
            valLinTab += tbMoto.getModel().getValueAt(posLin, col).toString();

            if (col + 1 < tbMoto.getColumnCount()) {
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
        DefaultTableModel modelo = (DefaultTableModel) tbMoto.getModel();
        int posLin = 0;

        modelo.setRowCount(posLin);

        for (Moto moto : gm.getBdMot()) { //for each
            modelo.insertRow(posLin, new Object[]{moto.getMarca(), moto.getModelo(), moto.getPreco(), moto.getCilindrada(), moto.getTipo(), moto.getPlaca()});
            posLin++;
        }
    }

    public void insMot() throws ModelogrdException {
        try {
            Moto m1 = new Moto();

            m1.setMarca(txtMarc.getText());
            m1.setPlaca(Integer.valueOf(txtPlaca.getText()));

            m1.setModelo(txtMod.getText());
            m1.setPreco(Double.valueOf(txtPreco.getText()));

            m1.setCilindrada(Integer.valueOf(txtCilin.getText()));
            m1.setTipo((txtTipo.getText()));

            m1 = gm.insMoto(m1);

            if (m1 != null) {
                JOptionPane.showMessageDialog(
                        null,
                        "Moto Cadastrada com Sucesso!",
                        "CADASTRO DE MOTO",
                        1
                );
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "PLACA DUPLICADA",
                        "CADASTRO DE MOTO",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }//fim try
        catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(
                    null,
                    "Valor do Placa deve ser um inteiro",
                    "Erro de tipo de dados",
                    JOptionPane.ERROR_MESSAGE
            );

            txtPlaca.requestFocus();
        } catch (ModelogrdException erro) {
            JOptionPane.showMessageDialog(
                    null,
                    "Erro",
                    "Erro de tipo de dados",
                    JOptionPane.ERROR_MESSAGE
            );
            limpar();
        }

    }

    public void excMotPlaca() {
        m1 = new Moto();

        m1.setPlaca(Integer.parseInt(txtPlaca.getText()));

        m1 = gm.delMotPlaca(m1);

        if (m1 == null) {

            JOptionPane.showMessageDialog(
                    null,
                    "Moto excluida com sucesso!",
                    "EXCLUSÃO DE MOTO",
                    1
            );
            limpar();
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "NÃO EXISTE MOTO COM ESTA PlACA",
                    "EXCLUSÃO DE MOTO",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    public void AtuMotPlaca() {
        try {
            m1 = new Moto();

            m1.setPlaca(Integer.parseInt(txtPlaca.getText()));
            m1.setModelo(txtMod.getText());

            m1 = gm.atualizaMotPlaca(m1);

            if (m1 != null) {
                txtPlaca.setText(Integer.toString(m1.getPlaca()));

                JOptionPane.showMessageDialog(
                        null,
                        "Confira do dados!",
                        "ALTERAÇÃO DE PLACA",
                        1
                );
                limpar();
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "NÃO EXISTE CARRO COM ESTA PLACA",
                        "ALTERAÇÃO DE CARRO",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        } catch (ModelogrdException erro) {
            JOptionPane.showMessageDialog(
                    null,
                    "Insira algum Dado",
                    "Erro de tipo de dados",
                    JOptionPane.ERROR_MESSAGE
            );
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(
                    null,
                    "Insira algum Dado",
                    "Erro de tipo de dados",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    public void consMotPlaca() {
        m1 = new Moto();

        m1.setPlaca(Integer.parseInt(txtPlaca.getText()));

        m1 = gm.consMotoPlaca(m1);

        if (m1 != null) {

            txtMarc.setText(m1.getMarca());
            txtPreco.setText(String.valueOf(m1.getPreco()));
            txtMod.setText(m1.getModelo());
            txtCilin.setText(String.valueOf(m1.getCilindrada()));
            txtTipo.setText((m1.getTipo()));
            txtPlaca.setText(Integer.toString(m1.getPlaca()));

            JOptionPane.showMessageDialog(
                    null,
                    "Placa encontradas com sucesso! - Verifique os dados",
                    "CONSULTA DE PLACA",
                    1
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "nÃO EXISTE MOTO COM ESTA PLACA",
                    "CONSULTA DE PLACA",
                    JOptionPane.ERROR_MESSAGE
            );
        }
        limpar();
    }

    public void limpar() {
        txtPlaca.setText("");
        txtMarc.setText("");
        txtPreco.setText("");
        txtMod.setText("");
        txtCilin.setText("");
        txtTipo.setText("");
        txtPlaca.requestFocus();
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
            java.util.logging.Logger.getLogger(CadMoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadMoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadMoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadMoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadMoto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtua;
    private javax.swing.JButton btExclu;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbMarc;
    private javax.swing.JLabel lbMod;
    private javax.swing.JLabel lbPreco1;
    private javax.swing.JLabel lbPreço;
    private javax.swing.JTable tbMoto;
    private javax.swing.JTextField txtCilin;
    private javax.swing.JTextField txtMarc;
    private javax.swing.JTextField txtMod;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
