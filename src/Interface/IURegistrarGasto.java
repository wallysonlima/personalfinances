/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import classes.Cartao;
import classes.Categoria;
import classes.Conta;
import classes.Gastos;
import classes.Usuario;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor
 */
public class IURegistrarGasto extends javax.swing.JDialog {
        IUPrincipal principal = new IUPrincipal();
         
        Usuario usuario = principal.getUsuarioCorrente(); 
        
    public IURegistrarGasto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        initComponents();
        //novaCategoria_Text.setVisible(false);
      
        //IUPrincipal.controlador.recuperaCategorias();
        
        ArrayList<Categoria> categorias = IUPrincipal.controlador.getCategoria();

        for (int i = 0; i < categorias.size(); i++) {
            categoria_ComboBox.addItem(categorias.get(i));
        }
        
        ArrayList<Conta> contas = usuario.getContas();

        vincularConta_ComboBox.removeAllItems();
         
        for (int i = 0; i < contas.size(); i++) {
            vincularConta_ComboBox.addItem(contas.get(i));
        }
        
         vincularCartao_ComboBox.removeAllItems();
         ArrayList<Cartao> cartao = contas.get(0).getCartoes();
         vincularCartao_ComboBox.addItem("Nenhum");
         
        for (int i = 0; i < cartao.size(); i++) {
            vincularCartao_ComboBox.addItem(cartao.get(i));
        }
        novaCategoria_Text.setVisible(false);
        registrarCategoria_Button.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        valor_Text = new javax.swing.JTextField();
        dataEmissao_Text = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        categoria_ComboBox = new javax.swing.JComboBox();
        registrarCategoria_Button = new javax.swing.JButton();
        novaCategoria_Text = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        novaCategoria_Button = new javax.swing.JButton();
        vincularConta_ComboBox = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        vincularCartao_ComboBox = new javax.swing.JComboBox();
        registrar_Button = new javax.swing.JButton();
        buttonLimpar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        descricao_Text = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("VALOR");

        jLabel3.setText("DATA");

        jLabel4.setText("CATEGORIA");

        categoria_ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoria_ComboBoxActionPerformed(evt);
            }
        });

        registrarCategoria_Button.setText("Registrar Categoria");
        registrarCategoria_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarCategoria_ButtonActionPerformed(evt);
            }
        });

        jLabel8.setText("VINCULAR CONTA");

        novaCategoria_Button.setText("nova Categoria");
        novaCategoria_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaCategoria_ButtonActionPerformed(evt);
            }
        });

        vincularConta_ComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vincularConta_ComboBoxMouseClicked(evt);
            }
        });
        vincularConta_ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vincularConta_ComboBoxActionPerformed(evt);
            }
        });
        vincularConta_ComboBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                vincularConta_ComboBoxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                vincularConta_ComboBoxFocusLost(evt);
            }
        });

        jLabel9.setText("VINCULAR CARTÃO");

        vincularCartao_ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nenhum" }));
        vincularCartao_ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vincularCartao_ComboBoxActionPerformed(evt);
            }
        });

        registrar_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/registrar.png"))); // NOI18N
        registrar_Button.setText("Registrar");
        registrar_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrar_ButtonActionPerformed(evt);
            }
        });

        buttonLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/delete.png"))); // NOI18N
        buttonLimpar.setText("Limpar");
        buttonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addGap(62, 62, 62)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(valor_Text)
                                    .addComponent(dataEmissao_Text)
                                    .addComponent(categoria_ComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(registrarCategoria_Button))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel8)
                                            .addComponent(novaCategoria_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(vincularConta_ComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(novaCategoria_Text))))
                                .addGap(1, 1, 1)))
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(registrar_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vincularCartao_ComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(38, 38, 38))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valor_Text)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataEmissao_Text)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoria_ComboBox)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novaCategoria_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(novaCategoria_Text))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registrarCategoria_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(vincularConta_ComboBox))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vincularCartao_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(registrar_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel2.setText("DESCRIÇÃO");

        descricao_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descricao_TextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(64, 64, 64)
                .addComponent(descricao_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(descricao_Text))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimparActionPerformed
        descricao_Text.setText("");
        valor_Text.setText("");
        dataEmissao_Text.setText("");
        categoria_ComboBox.setSelectedIndex(0);
        novaCategoria_Text.setText("");
        vincularConta_ComboBox.setSelectedIndex(0);
        vincularCartao_ComboBox.setSelectedIndex(0);
    }//GEN-LAST:event_buttonLimparActionPerformed

    private void registrar_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrar_ButtonActionPerformed
        // TODO add your handling code here:
        //Controlador controlador = new Controlador();

        String descricao = descricao_Text.getText();
        //String dataEmissao = dataEmissao_Text.getText();
        float valor = Float.valueOf(valor_Text.getText());
        //        String data = dataEmissao_Text.getText();
        //        DateFormat formate = new SimpleDateFormat("dd/MM/yyyy");
        //
        //        try {
            //            Date dataEmissao = (java.util.Date) formate.parse(data);
            //        } catch (ParseException ex) {
            //            Logger.getLogger(IURegistrarGasto.class.getName()).log(Level.SEVERE, null, ex);
            //        }

        Categoria categoria = (Categoria) categoria_ComboBox.getSelectedItem();

        //        Calendar c = Calendar.getInstance();
        //        c.set(2013, Calendar.FEBRUARY, 28);
        Date dataEmissao = new Date();
        //

        try {
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            dataEmissao = (Date) formatter.parse( dataEmissao_Text.getText() );
        } catch (ParseException ex) {
            Logger.getLogger(IUCartao.class.getName()).log(Level.SEVERE, null, ex);
        }

        if((vincularCartao_ComboBox.getSelectedIndex()==0)){

            Conta conta =((Conta)vincularConta_ComboBox.getSelectedItem());

            float saldo = conta.getSaldo();

            //if ((saldo-valor)<0) JOptionPane.showMessageDialog(null, "você esta entrando no limite da sua conta");
            conta.setSaldo(saldo-valor);

        } else{
            Cartao cartao =((Cartao)vincularCartao_ComboBox.getSelectedItem());
            float limite  = cartao.getLimite();

            cartao.setLimite(limite-valor);

        }

        usuario.addGastos(new Gastos(descricao,valor, dataEmissao,categoria));
        
        principal.controlador.armazenarUsuarios();
        principal.addInformacoes();

        /*
        IUPrincipal.controlador.registrarGasto(descricao, valor, dataEmissao, categoria);
        IUPrincipal.controlador.armazenarGastos();
        IUPrincipal.controlador.armazenarCategorias();
        */
        this.dispose();
    }//GEN-LAST:event_registrar_ButtonActionPerformed

    private void vincularCartao_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vincularCartao_ComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vincularCartao_ComboBoxActionPerformed

    private void vincularConta_ComboBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vincularConta_ComboBoxFocusLost
        // TODO add your handling code here:
        /* vicularCartao_ComboBox.removeAllItems();
        Conta conta = (Conta)vincularConta_ComboBox.getSelectedItem();

        ArrayList<Cartao> cartao = conta.getCartoes();

        if(cartao.size()<1)  vicularCartao_ComboBox.addItem("Nenhum");
        for (int i = 0; i < cartao.size(); i++) {
            vicularCartao_ComboBox.addItem(cartao.get(i));
        }*/
    }//GEN-LAST:event_vincularConta_ComboBoxFocusLost

    private void vincularConta_ComboBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vincularConta_ComboBoxFocusGained
        // TODO add your handling code here:
        /*vicularCartao_ComboBox.removeAllItems();
        Conta conta = (Conta)vincularConta_ComboBox.getSelectedItem();

        ArrayList<Cartao> cartao = conta.getCartoes();
        if(cartao.size()<1)  vicularCartao_ComboBox.addItem("Nenhum");
        for (int i = 0; i < cartao.size(); i++) {
            vicularCartao_ComboBox.addItem(cartao.get(i));
        }*/

    }//GEN-LAST:event_vincularConta_ComboBoxFocusGained

    private void vincularConta_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vincularConta_ComboBoxActionPerformed
        // TODO add your handling code here:
        vincularCartao_ComboBox.removeAllItems();
        Conta conta = (Conta)vincularConta_ComboBox.getSelectedItem();

        ArrayList<Cartao> cartao = conta.getCartoes();

        vincularCartao_ComboBox.addItem("Nenhum");
        for (int i = 0; i < cartao.size(); i++) {
            vincularCartao_ComboBox.addItem(cartao.get(i));
        }
    }//GEN-LAST:event_vincularConta_ComboBoxActionPerformed

    private void vincularConta_ComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vincularConta_ComboBoxMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_vincularConta_ComboBoxMouseClicked

    private void novaCategoria_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaCategoria_ButtonActionPerformed
        // TODO add your handling code here:

        novaCategoria_Text.setVisible(true);
        registrarCategoria_Button.setVisible(true);
        novaCategoria_Button.setVisible(false);
    }//GEN-LAST:event_novaCategoria_ButtonActionPerformed

    private void registrarCategoria_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarCategoria_ButtonActionPerformed
        // TODO add your handling code here:
        novaCategoria_Text.setVisible(true);
        Categoria novaCategoria = new Categoria(novaCategoria_Text.getText());
        IUPrincipal.controlador.registrarCategoria(novaCategoria);
        IUPrincipal.controlador.armazenarCategorias();
        ArrayList<Categoria> categorias = IUPrincipal.controlador.getCategoria();

        categoria_ComboBox.removeAllItems();
        for (int i = 0; i < categorias.size(); i++) {
            categoria_ComboBox.addItem(categorias.get(i));
        }

        novaCategoria_Text.setVisible(false);
        registrarCategoria_Button.setVisible(false);
        novaCategoria_Button.setVisible(true);
        novaCategoria_Text.setText("");
    }//GEN-LAST:event_registrarCategoria_ButtonActionPerformed

    private void categoria_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoria_ComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoria_ComboBoxActionPerformed

    private void descricao_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descricao_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descricao_TextActionPerformed

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
            java.util.logging.Logger.getLogger(IURegistrarGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IURegistrarGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IURegistrarGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IURegistrarGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IURegistrarGasto dialog = new IURegistrarGasto(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox categoria_ComboBox;
    private javax.swing.JTextField dataEmissao_Text;
    private javax.swing.JTextField descricao_Text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton novaCategoria_Button;
    private javax.swing.JTextField novaCategoria_Text;
    private javax.swing.JButton registrarCategoria_Button;
    private javax.swing.JButton registrar_Button;
    private javax.swing.JTextField valor_Text;
    private javax.swing.JComboBox vincularCartao_ComboBox;
    private javax.swing.JComboBox vincularConta_ComboBox;
    // End of variables declaration//GEN-END:variables
}