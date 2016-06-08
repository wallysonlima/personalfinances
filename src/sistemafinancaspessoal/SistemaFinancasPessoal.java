/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemafinancaspessoal;

import Interface.IULogin;
import Interface.IULogin;
import Interface.IUPrincipal;
import Interface.IURegistrarUsuario;
import classes.Controlador;
import javax.swing.JFrame;

/**
 *
 * @author Victor
 */
public class SistemaFinancasPessoal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Controlador controlador= new Controlador();   
        
        IULogin login = new IULogin();
        login.setTitle("Login do Sistema");
//        principal.setExtendedState(JFrame.MAXIMIZED_BOTH);
        login.setLocationRelativeTo(null);
        login.toFront();
        login.setVisible(true);
    }
    
}
