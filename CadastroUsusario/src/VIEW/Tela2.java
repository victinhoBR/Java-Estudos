/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;
import java.sql.*;
import DAL.Conexao;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author e
 */
public class Tela2 extends javax.swing.JFrame {
Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public Tela2() {
        initComponents();
        conexao = Conexao.conector();
       
        if(conexao != null){
            jLmsg.setText("Conectado");
        }else{
            jLmsg.setText("NaO CONECTADO");
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

        jLmsg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTn1 = new javax.swing.JTextField();
        jTn3 = new javax.swing.JTextField();
        jTn2 = new javax.swing.JTextField();
        jBs = new javax.swing.JButton();
        jBd = new javax.swing.JButton();
        jBl = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTab = new javax.swing.JTable();
        jBa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome:");

        jLabel2.setText("Código:");

        jLabel3.setText("Endereço:");

        jTn1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTn1KeyReleased(evt);
            }
        });

        jTn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTn2ActionPerformed(evt);
            }
        });

        jBs.setIcon(new javax.swing.ImageIcon("C:\\Users\\e\\Documents\\icons8-adicionar-usuário-masculino-50.png")); // NOI18N
        jBs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsActionPerformed(evt);
            }
        });

        jBd.setIcon(new javax.swing.ImageIcon("C:\\Users\\e\\Downloads\\icons8-excluir-50.png")); // NOI18N
        jBd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBdActionPerformed(evt);
            }
        });

        jBl.setIcon(new javax.swing.ImageIcon("C:\\Users\\e\\Downloads\\icons8-check-48.png")); // NOI18N
        jBl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlActionPerformed(evt);
            }
        });

        jTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "nome", "Código", "Endereço"
            }
        ));
        jTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTab);

        jBa.setText("Atualizar");
        jBa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLmsg)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTn2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTn1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTn3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(110, 110, 110)
                                        .addComponent(jBa)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBs)
                                    .addComponent(jBd))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBl))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addComponent(jBs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBd)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLmsg)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jBl))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jTn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(jTn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jBa)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTn2ActionPerformed

    private void jBsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsActionPerformed
        salvar();
    }//GEN-LAST:event_jBsActionPerformed

    private void jBdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdActionPerformed
        deletar();
    }//GEN-LAST:event_jBdActionPerformed

    private void jBlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlActionPerformed
        listar();
    }//GEN-LAST:event_jBlActionPerformed

    private void jBaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBaActionPerformed
    atualizar();
    }//GEN-LAST:event_jBaActionPerformed

    private void jTn1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTn1KeyReleased
    try {
        pesquisarUsuario();
    } catch (SQLException ex) {
        Logger.getLogger(Tela2.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jTn1KeyReleased

    private void jTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabMouseClicked
        buscarDados();
    }//GEN-LAST:event_jTabMouseClicked

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
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBa;
    private javax.swing.JButton jBd;
    private javax.swing.JButton jBl;
    private javax.swing.JButton jBs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLmsg;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTab;
    private javax.swing.JTextField jTn1;
    private javax.swing.JTextField jTn2;
    private javax.swing.JTextField jTn3;
    // End of variables declaration//GEN-END:variables

    private void salvar() {
        String sql="INSERT INTO usuario(nome, endereco,cod )VALUES(?, ?, ?)";//(?)- para o usuario botar a informação
        try{
            pst=conexao.prepareStatement(sql);
            pst.setString(1,jTn1.getText());
            pst.setString(2,jTn2.getText());
            pst.setInt(3,(Integer.parseInt(jTn3.getText())));
            System.out.println(pst);
            
            int resultado=pst.executeUpdate();
            if (resultado==1){
                JOptionPane.showMessageDialog(null, "Usuario Cadastrado.");
            }else{
                JOptionPane.showMessageDialog(null, "Usuario Nao Cadastrado.");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
    }
}

    private void deletar() {
        String sql="DELETE FROM usuario where cod=?";
        try{
            pst=conexao.prepareStatement(sql);
            pst.setInt(1,(Integer.parseInt(jTn3.getText())));
            System.out.println(pst);
            
            int resultado=pst.executeUpdate();
            if (resultado==1){
                JOptionPane.showMessageDialog(null, "Usuario Deletado.");
            }else{
                JOptionPane.showMessageDialog(null, "Usuario Nao Deletado.");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
    }
    }

    private void listar() {
        String sql="select * from usuario where cod=?";
        
        try{
            pst=conexao.prepareStatement(sql);
            pst.setString(1,jTn3.getText());
            rs=pst.executeQuery();
        if(rs.next()){
            jTn1.setText(rs.getString("nome"));
            jTn2.setText(rs.getString("endereco"));
        }else{
            JOptionPane.showMessageDialog(null, "Usuario Nao Encontrado.");
            jTn1.setText(null);
            jTn2.setText(null);
        }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
            System.out.println(e);
        }
        }

    private void atualizar() {
        String sql="update usuario SET nome=?, endereco=?,cod=?";
    try{
        pst=conexao.prepareStatement(sql);
            pst.setString(1,jTn1.getText());
            pst.setString(2,jTn2.getText());
            pst.setInt(3,(Integer.parseInt(jTn3.getText())));
            System.out.println(pst);
            
            int atualizado=pst.executeUpdate();
            
            if(atualizado==1){
                JOptionPane.showMessageDialog(null,"Atualizado com sucesso");
            jTn1.setText(null);
            jTn2.setText(null);
    }else{
             JOptionPane.showMessageDialog(null,"Nao atualizado");
            }
    }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
    }
    }

    private void pesquisarUsuario() throws SQLException {
        String sql="select * from usuario where nome like?";
        try{
        pst=conexao.prepareStatement(sql);
            pst.setString(1,jTn1.getText()+ "%");
            System.out.println(pst);
            rs=pst.executeQuery();
            jTab.setModel(DbUtils.resultSetToTableModel(rs));
            
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null,e);
    }
        }        

    private void buscarDados() {
       int buscar=jTab.getSelectedRow();
       
       jTn1.setText(jTab.getModel().getValueAt(buscar, 1).toString());
       jTn2.setText(jTab.getModel().getValueAt(buscar, 2).toString());
    }
}




    
