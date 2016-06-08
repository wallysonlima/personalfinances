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
public class Investimento implements Serializable{
    
    private String descricao;
    private float valorTotal;
    private Date dataPrevistaInvestimento;
    private float valorParcela;
    private int qtdParcela;
    private static final long serialVersionUID = 1L;

    public Investimento(String descricao, float valorTotal, float valorParcela) {
        this.descricao = descricao;
        this.valorTotal = valorTotal;
        this.valorParcela = valorParcela;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public float getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(float valorParcela) {
        this.valorParcela = valorParcela;
    }

    @Override
    public String toString() {
        return (descricao + " " + valorTotal);
    }
}
