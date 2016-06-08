/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Victor
 */
public class Usuario implements Serializable{
    
    private String nome;
    private Date data_Nas;
    private String login;
    private String senha;
    private ArrayList<Conta> contas;
    private ArrayList<Renda> rendas;
    private ArrayList<Investimento> investimentos;
    private ArrayList<Gastos> gastos;
    private float saldoTotal;
    private float gastoTotal;
    private static final long serialVersionUID = 1L;

    public Usuario(String nome, Date data_Nas, String login, String senha) {
        this.nome = nome;
        this.data_Nas = data_Nas;
        this.login = login;
        this.senha = senha;
        this.contas = new ArrayList<Conta>();
        this.rendas = new ArrayList<Renda>();
        this.investimentos = new ArrayList<Investimento>();
        this.gastos = new ArrayList<Gastos>();
        saldoTotal = 0.0f;
        gastoTotal = 0.0f;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData_Nas() {
        return data_Nas;
    }

    public void setData_Nas(Date data_Nas) {
        this.data_Nas = data_Nas;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public ArrayList<Renda> getRendas() {
        return rendas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }

    public void setRendas(ArrayList<Renda> rendas) {
        this.rendas = rendas;
    }

    public void setInvestimentos(ArrayList<Investimento> investimentos) {
        this.investimentos = investimentos;
    }

    public void setGastos(ArrayList<Gastos> gastos) {
        this.gastos = gastos;
    }

    public ArrayList<Investimento> getInvestimentos() {
        return investimentos;
    }

    public ArrayList<Gastos> getGastos() {
        return gastos;
    }

    public float getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(float saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public float getGastoTotal() {
        return gastoTotal;
    }

    public void setGastoTotal(float gastoTotal) {
        this.gastoTotal = gastoTotal;
    }
   
    public void addConta( Conta conta ) {
        contas.add( conta );
        saldoTotal += conta.getSaldo();
    }
    
    public void addRenda( Renda renda ) {
        rendas.add(renda);
        saldoTotal += renda.getValor();
    }
    
    public void addInvestimento( Investimento investimento ) {
        investimentos.add( investimento );
    }
    
    public void addGastos( Gastos gasto ) {
        gastos.add( gasto );
        saldoTotal -= gasto.getValor();
        gastoTotal += gasto.getValor();
    }
}
