/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projetofinalpoo;
//Leonardo Fasano RA:2564211
import javax.swing.JOptionPane;

/**
 *
 * @author leona
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form CadPrincipal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbCad = new javax.swing.JLabel();
        btCdCarro = new javax.swing.JButton();
        btCdMoto = new javax.swing.JButton();
        btCdCli = new javax.swing.JButton();
        btCdFunc = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        MnAgra = new javax.swing.JMenuItem();
        MnSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbCad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbCad.setText(" CADASTRO CONCESSIONÁRIA");

        btCdCarro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btCdCarro.setText("CADASTRAR CARRO");
        btCdCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCdCarroActionPerformed(evt);
            }
        });

        btCdMoto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btCdMoto.setText("CADASTRAR MOTO");
        btCdMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCdMotoActionPerformed(evt);
            }
        });

        btCdCli.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btCdCli.setText("CADASTRAR CLIENTE");
        btCdCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCdCliActionPerformed(evt);
            }
        });

        btCdFunc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btCdFunc.setText("CADASTRAR FUNCIONARIO ");
        btCdFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCdFuncActionPerformed(evt);
            }
        });

        jMenu3.setText("Menu");

        MnAgra.setText("AGRADECIMENTOS");
        MnAgra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnAgraActionPerformed(evt);
            }
        });
        jMenu3.add(MnAgra);

        MnSair.setText("SAIR");
        MnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnSairActionPerformed(evt);
            }
        });
        jMenu3.add(MnSair);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(lbCad, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btCdCarro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btCdMoto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btCdCli, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btCdFunc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(345, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lbCad)
                .addGap(53, 53, 53)
                .addComponent(btCdCarro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btCdMoto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btCdCli)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btCdFunc)
                .addContainerGap(452, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCdCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCdCarroActionPerformed
      btnCadCarro();
    }//GEN-LAST:event_btCdCarroActionPerformed

    private void btCdMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCdMotoActionPerformed
       btnCadMoto();
    }//GEN-LAST:event_btCdMotoActionPerformed

    private void btCdCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCdCliActionPerformed
      btnCadCli();
    }//GEN-LAST:event_btCdCliActionPerformed

    private void btCdFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCdFuncActionPerformed
        btnCadFunc();
    }//GEN-LAST:event_btCdFuncActionPerformed

    private void MnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnSairActionPerformed
        sair();
    }//GEN-LAST:event_MnSairActionPerformed

    private void MnAgraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnAgraActionPerformed
        agradecimento();
    }//GEN-LAST:event_MnAgraActionPerformed

    public void sair(){
        int resp = JOptionPane.showConfirmDialog(
                null,
                "Deseja realmente sair?",
                "SAIR",
                JOptionPane.YES_NO_OPTION
        );
        if(resp == 0){
            dispose();
        }
    }
    
    
    public void agradecimento(){
        int agra = JOptionPane.showConfirmDialog(
                null,
                "Agradeço demais por tornar POO tão interessante! Suas aulas são incríveis! ME FEZ GOSTAR DE JAVA",
                "Agradecimento",
                JOptionPane.YES_NO_OPTION
        );
    }
    

    
    
    public void btnCadCarro() {
    // Cria uma instância da interface cadCarro
    CadCarro cadCarroForm = CadCarro.geraCadCarro();
   
    // Torna a interface visível
    cadCarroForm.setVisible(true);
    
    }
    
    
    public void btnCadMoto(){
    // Cria uma instância da interface CadMoto
    CadMoto cadMotoForm = new CadMoto();
    
    // Torna a interface visível
    cadMotoForm.setVisible(true);
    }
    
    public void btnCadCli() {
    // Cria uma instância da interface CadCliente
    CadCliente cadClienteForm = new CadCliente();
    
    // Torna a interface visível
    cadClienteForm.setVisible(true);
    }
    
    
    public void btnCadFunc(){
     // Cria uma instância da interface CadFuncionario
    CadFunc cadFuncionarioForm = new CadFunc();
    
    // Torna a interface visível
    cadFuncionarioForm.setVisible(true);
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MnAgra;
    private javax.swing.JMenuItem MnSair;
    private javax.swing.JButton btCdCarro;
    private javax.swing.JButton btCdCli;
    private javax.swing.JButton btCdFunc;
    private javax.swing.JButton btCdMoto;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbCad;
    // End of variables declaration//GEN-END:variables
}