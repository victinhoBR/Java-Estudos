/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.visao;

import br.com.controle.ContaPoupanca;
import javax.swing.JOptionPane;

/**
 *
 * @author e
 */
public class Agencia extends javax.swing.JFrame {

    ContaPoupanca cp = new ContaPoupanca();
    /**
     * Creates new form Agencia
     */
    public Agencia() {
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

        jBdep = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTv = new javax.swing.JTextField();
        jLres = new javax.swing.JLabel();
        jBsaq = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBdep.setText("Deposito");
        jBdep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBdepActionPerformed(evt);
            }
        });

        jLabel1.setText("Digite um valor :");

        jTv.setColumns(6);

        jLres.setText("0:00");

        jBsaq.setText("Saque");
        jBsaq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsaqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLres)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBdep)
                        .addGap(47, 47, 47)))
                .addComponent(jBsaq)
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBdep)
                    .addComponent(jBsaq))
                .addGap(61, 61, 61)
                .addComponent(jLres)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBdepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdepActionPerformed
        // TODO add your handling code here:
        cp.setDeposito(0);
        jLres.setText(""+cp.getSaldo());
            if(jTv.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Obrigatorio");
            jTv.requestFocus();}
        else{
            try{
                    //cast
        cp.setDeposito(Double.valueOf(jTv.getText()));//Double com "d" ?? 
        jLres.setText(" "+cp.getSaldo());
            }
        catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Digite apenas numeros");
                jTv.requestFocus();
                }
            }
    }//GEN-LAST:event_jBdepActionPerformed

    private void jBsaqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsaqActionPerformed

            if(jTv.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Obrigatorio");
            jTv.requestFocus();}
        else{
            try{
                    //cast
        cp.setSaque(Double.valueOf(jTv.getText()));//Double com "d" ?? 
        jLres.setText(" "+cp.getSaldo());
            }
        catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Digite apenas numeros");
                jTv.requestFocus();
                }
            }
    }//GEN-LAST:event_jBsaqActionPerformed

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
            java.util.logging.Logger.getLogger(Agencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBdep;
    private javax.swing.JButton jBsaq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLres;
    private javax.swing.JTextField jTv;
    // End of variables declaration//GEN-END:variables
}
