/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;

import classes.Controlador;
import classes.Usuario;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor
 */
public class IUAlterarUsuario extends javax.swing.JDialog {
    IUPrincipal principal = new IUPrincipal();
    Usuario usuario = principal.getUsuarioCorrente();
    /**
     * Creates new form IURegistrarUsuario
     */
    public IUAlterarUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        textUsuarioAtual.setText( usuario.getLogin() );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nome_Text = new javax.swing.JTextField();
        login_Text = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        passwordSenha = new javax.swing.JPasswordField();
        buttonLimpar = new javax.swing.JButton();
        buttonRegistrar = new javax.swing.JButton();
        textData = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textUsuarioAtual = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("NOME");

        nome_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_TextActionPerformed(evt);
            }
        });

        jLabel2.setText("DATA NASCIMENTO");

        jLabel3.setText("LOGIN");

        jLabel4.setText("SENHA");

        buttonLimpar.setIcon(new javax.swing.ImageIcon("/home/wally/Documentos/Engenharia Software I/trabalho/SistemaFinancasPessoal/imagens/delete.png")); // NOI18N
        buttonLimpar.setText("Limpar");
        buttonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimparActionPerformed(evt);
            }
        });

        buttonRegistrar.setIcon(new javax.swing.ImageIcon("/home/wally/Documentos/Engenharia Software I/trabalho/SistemaFinancasPessoal/imagens/registrar.png")); // NOI18N
        buttonRegistrar.setText("Alterar");
        buttonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarActionPerformed(evt);
            }
        });

        jLabel5.setText("USUÁRIO ATUAL");

        textUsuarioAtual.setEditable(false);
        textUsuarioAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUsuarioAtualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(118, 118, 118))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(buttonRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(54, 54, 54)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textUsuarioAtual)
                    .addComponent(nome_Text)
                    .addComponent(passwordSenha)
                    .addComponent(buttonLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(login_Text, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textData))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textUsuarioAtual))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nome_Text))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(login_Text))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(passwordSenha))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nome_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_TextActionPerformed

    private void buttonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimparActionPerformed
        nome_Text.setText("");
        passwordSenha.setText("");
        login_Text.setText("");
    }//GEN-LAST:event_buttonLimparActionPerformed

    private void buttonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarActionPerformed
        String nome = nome_Text.getText();
        String login = login_Text.getText();
        String senha = new String( passwordSenha.getPassword() );
        String data = textData.getText();
        
        Date aniversario = new Date();
        try {
            aniversario = new SimpleDateFormat("dd/mm/yyyy").parse( data );
        } catch (ParseException ex) {
            Logger.getLogger(IUAlterarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if ( !nome.equals("") && !login.equals("") && !senha.equals("") && !data.equals("") ) {
                principal.controlador.AlterarUsuario(nome, aniversario, login, senha, usuario);
                principal.controlador.armazenarUsuarios();
                JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso !", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                
                this.dispose();
        }
            
        else
            JOptionPane.showMessageDialog(null, "Preencha Todos os campos !", "Erro", JOptionPane.ERROR_MESSAGE);  
        
        
                
        /*principal.setTitle("Sistema de Finanças Pessoais");
        principal.setExtendedState(JFrame.MAXIMIZED_BOTH);
        principal.setVisible(true);        
        principal.toFront();
        principal.setVisible(true); */
        
        IUPrincipal.controlador.armazenarUsuarios();
        this.dispose();
    }//GEN-LAST:event_buttonRegistrarActionPerformed

    private void textUsuarioAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUsuarioAtualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textUsuarioAtualActionPerformed

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
            java.util.logging.Logger.getLogger(IUAlterarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IUAlterarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IUAlterarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IUAlterarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IUAlterarUsuario dialog = new IUAlterarUsuario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLimpar;
    private javax.swing.JButton buttonRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField login_Text;
    private javax.swing.JTextField nome_Text;
    private javax.swing.JPasswordField passwordSenha;
    private javax.swing.JTextField textData;
    private javax.swing.JTextField textUsuarioAtual;
    // End of variables declaration//GEN-END:variables
}