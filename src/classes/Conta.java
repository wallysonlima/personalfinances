/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author wally
 */
public class Conta implements Serializable {
    private String numConta, nomeTitular, descricao;
    private float saldo;
    private ArrayList<Cartao> cartoes;
    private static final long serialVersionUID = 1L;

    public Conta( String nomeTitular, String numConta,  float saldo , String descricao) {
        this.nomeTitular = nomeTitular;
        this.numConta = numConta;
        this.saldo = saldo;
        this.cartoes = new ArrayList();
        this.descricao=descricao;
    }
    
    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    
     public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Cartao> getCartoes() {
        return cartoes;
    }

    public void setCartoes(ArrayList<Cartao> cartoes) {
        this.cartoes = cartoes;
    }
    
    public void addCartao( Cartao cartao ) {
        cartoes.add( cartao );
    }
    
    @Override
    public String toString() {
        return (this.nomeTitular + " ... " + this.numConta+" ... "+this.saldo+"\n") ;
    }
    
}
