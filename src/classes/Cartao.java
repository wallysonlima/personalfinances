/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Victor
 */
public class Cartao implements Serializable {
    private String bandeira, numCartao, senha;
    private Date vencimento;
    private float limite;
    private static final long serialVersionUID = 1L;
    
    public Cartao( String bandeira, String numCartao, String senha, Date vencimento, float limite ) {
        this.bandeira = bandeira;
        this.numCartao = numCartao;
        this.senha = senha;
        this.vencimento = vencimento;
        this.limite = limite;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        int dia = vencimento.getDay();
                //Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        int mes = 
                vencimento.getMonth()+1;
        int ano = vencimento.getYear();
                //Calendar.getInstance().get(Calendar.YEAR);
        String data = dia + "/" + mes + "/" + ano;
        return ( bandeira + " ... " + numCartao+" ... "+data+" ... " + limite );
    }
    
}
