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
public class Gastos implements Serializable{
    private String descricao;
    private float valor;
    private Date dataEmissao;
    private Categoria categoria;
    private static final long serialVersionUID = 1L;

    public Gastos(String descricao, float valor, Date dataEmissao, Categoria categoria) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataEmissao = dataEmissao;
        this.categoria = categoria;
    }

    public String getNomeCategoria() {
        return this.categoria.getNome();
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void alterarGastos(String descricao, float valor, Date dataEmissao, Categoria categoria) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataEmissao = dataEmissao;
        this.categoria = categoria;
    }
    
   
  @Override
    public String toString() {
        String str =this.descricao+"..........."+this.valor;
        return str;
    }
}
