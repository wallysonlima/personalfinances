/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

import java.io.Serializable;

/**
 *
 * @author Victor
 */
public class Renda implements Serializable{
    private String descricao;
    private float valor;

    private static final long serialVersionUID = 1L;

    public Renda(String descricao, float valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    public void alterarRenda(String descricao, float valor){
        this.descricao=descricao;
        this.valor=valor;
    }
    
    @Override
    public String toString() {
        return (descricao + " " + valor);
    }
    
}
