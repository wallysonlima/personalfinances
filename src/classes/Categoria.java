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
public class Categoria implements Serializable{
    private String nome;
    private static final long serialVersionUID = 1L;

    public Categoria(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
     @Override
    public String toString() {
        return this.nome;
    }
    
    
    
    
}
