/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Victor
 */
public class Controlador {

    ArrayList<Usuario> usuarios = new ArrayList();
    ArrayList<Categoria> categorias = new ArrayList();

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public ArrayList<Categoria> getCategoria() {
        return categorias;
    }
    
//********************************************************************************************************// 
    public void registrarUsuario(String nome, Date dataNascimento, String login, String senha) {
        this.usuarios.add(new Usuario(nome, dataNascimento, login, senha));
        System.out.println("nome : " + nome);
    }
 
 //********************************************************************************************************// 
    public void registrarCategoria( Categoria categoria ) {
        this.categorias.add(categoria);
    }
    
//********************************************************************************************************// 
    public Usuario buscarUsuario( String login ) {
        for( Usuario user: usuarios )
            if( user.getLogin().equals(login) )
                return user;
        
        return null;
    }
 
 //********************************************************************************************************// 
    public Conta buscarConta( Usuario usuario, String numConta ) {
        ArrayList<Conta> contas = usuario.getContas();
        
        for( Conta c: contas )
            if( c.getNumConta().equals( numConta ) )
                return c;
        
        return null;
    }

//********************************************************************************************************// 
    public Cartao buscarCartao( Usuario usuario, Conta conta, String numCartao ) {
        ArrayList<Cartao> aux;
        ArrayList<Conta> contas = usuario.getContas();
        Conta contaCartao = null;
        
        for( Conta c: contas )
            if ( c.equals( conta ) )
                contaCartao = c;
        
        aux = contaCartao.getCartoes();
            
        for( Cartao ca: aux )
            if ( ca.getNumCartao().equals( numCartao )  )
                return ca;
        
        return null;
    }
 
 //********************************************************************************************************// 
    public Renda buscarRenda( Usuario usuario, String descricao ) {
        ArrayList<Renda> rendas = usuario.getRendas();
        
        for( Renda r: rendas )
            if ( r.getDescricao().equals( descricao ) )
                return r;
        
        return null;
    }
    
    
    public String relatorioConta(Usuario usuario){
        String rel="nome ... Nº Conta ... Saldo\n.........................................................................\n";
        ArrayList<Conta> contas = usuario.getContas();
        
        for(int i=0; i<contas.size();i++)
            rel +=contas.get(i).toString();
        
        return rel;
    
    }
    
    
     public String relatorioCartao(Usuario usuario){
        String  rel="\n Bandeira ... Nº Cartão ... data ...  Limite"
                + "\n...................................................................................\n";
       ArrayList<Conta> contas = usuario.getContas();
       
        
        for(int i=0; i<contas.size();i++){
             
            if(contas.get(i).getCartoes().size()>0)
               
            
            for(int j=0;j<contas.get(i).getCartoes().size();j++)
                rel+=contas.get(i).getCartoes().get(j).toString();
        
        }
        return rel;
    
    }
     
     
public ArrayList<Gastos> buscaGastosData(Usuario usuario, Date ini, Date fim){
        
       ArrayList<Gastos> gastosPeriodo = new ArrayList(); 
       ArrayList<Gastos> gastos= usuario.getGastos();
       Date data=null;
       
       for(int i=0; i<gastos.size();i++){
           data = gastos.get(i).getDataEmissao();
           if(data.after(ini) && data.before(fim))
               gastosPeriodo.add(gastos.get(i));
           
                       }
       
       return gastosPeriodo;
       
       
        
    }
    
    public String relatorioGastos(Usuario usuario, Date ini, Date fim){
        
       ArrayList<Gastos> gastosPeriodo= buscaGastosData(usuario,ini,fim);
       String rel = "..:: Relatorio de Gastos por Periodo ::..\n";
       float total=0;
       for(int i=0; i<gastosPeriodo.size();i++){
           rel+= gastosPeriodo.get(i).toString()+"\n";
           total+=gastosPeriodo.get(i).getValor();     
       }
       
       rel+="Total...................................................."+total;
        return rel;
    }
        
    
    
 //********************************************************************************************************// 
   public Float buscarLimiteTotalCartao( Usuario usuario ) {
       ArrayList<Conta> contas = usuario.getContas();
       ArrayList<Cartao> cartao = new ArrayList<Cartao>();
       float limiteTotal = 0.0f;
       
       for( Conta c: contas )
           for( Cartao cart: c.getCartoes() )
               cartao.add( cart );
       
       for( Cartao c: cartao )
           limiteTotal += c.getLimite();
       
       return limiteTotal;
   } 
    
//********************************************************************************************************// 
    public void registrarConta( Usuario usuario, Conta conta ) {
        usuario.addConta(conta);
    }
 
 //********************************************************************************************************// 
   public void registrarCartao( Usuario usuario, Conta conta, Cartao cartao ) {
       ArrayList<Conta> contas = usuario.getContas();
       
       for( Conta c: contas )
           if( c.equals( conta ) ) {
               c.addCartao(cartao);
           }
   }
   
 //********************************************************************************************************// 
   public void registrarRenda( Usuario usuario, Renda renda ) {
       usuario.addRenda(renda);
   }
    
//********************************************************************************************************// 
    public short autenticarUsuario(String login, String senha) {
        Usuario user;
        boolean possuiUsuario = false;
        
        for (int i = 0; i < usuarios.size(); i++) {
            if( usuarios.get(i).getLogin().equals(login) )
                possuiUsuario = true;
            
            if (usuarios.get(i).getLogin().equals(login) && usuarios.get(i).getSenha().equals(senha)) {
                return 1;
            }
        }
        
        if ( possuiUsuario == true )
            return 0;
        else
            return -1;
    }


//********************************************************************************************************//      
    public void AlterarUsuario ( String nome, Date aniversario, String login, String senha, Usuario usuario ) {
        usuario.setNome(nome);
        usuario.setData_Nas(aniversario);
        usuario.setLogin(login);
        usuario.setSenha(senha);
    }
    
//********************************************************************************************************//      
    public void deletarCartao( Usuario usuario, Cartao cartao ) {
        ArrayList<Conta> contas = usuario.getContas();
        ArrayList<Cartao> cartoes;
        
        for( Conta c: contas ) {
            cartoes = c.getCartoes();
            
            for( int i = 0; i < cartoes.size(); i++ )
                if( cartoes.get(i).equals( cartao ) ) {
                    cartoes.remove(i);
                    break;
            }
        }     
    }
    
//********************************************************************************************************//      
    public void deletarInvestimento( Usuario usuario, Investimento investimento ) {
        ArrayList<Investimento> investimentos = usuario.getInvestimentos();
        
        for( int i = 0; i < investimentos.size(); i++ )
            if( investimentos.get(i).equals( investimento ) ) {
                investimentos.remove(i);
                break;
            }
    }
    
//********************************************************************************************************//      
    public void deletarConta( Usuario usuario, Conta conta ) {
        ArrayList<Conta> contas = usuario.getContas();
        
        for( int i = 0; i < contas.size(); i++ )
            if( contas.get(i).equals( conta) ) {
                contas.remove(i);
                break;
            } 
    }
    
//********************************************************************************************************//      
    public void deletarRenda( Usuario usuario, Renda renda ) {
        ArrayList<Renda> rendas = usuario.getRendas();
        
        for( int i = 0; i < rendas.size(); i++ )
            if( rendas.get(i).equals( renda ) ) {
                rendas.remove(i);
                break;
            } 
    }    
    
//********************************************************************************************************//      
    public void armazenarUsuarios() {
        String nomeArquivo = "usuarios.txt";
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(nomeArquivo);
            oos = new ObjectOutputStream(fos);
            oos.writeInt(usuarios.size());
            for (int i = 0; i < usuarios.size(); i++) {
                oos.writeObject(usuarios.get(i));
            }
        } catch (IOException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                oos.close();
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

//********************************************************************************************************//    
    
    public void recuperarUsuario() {
        String nomeArquivo = "usuarios.txt";
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(nomeArquivo);
            ois = new ObjectInputStream(fis);
            this.usuarios.clear();
            int tamanho = ois.readInt();
            
            for (int i = 0; i < tamanho; i++) {
                Usuario user = (Usuario) ois.readObject();
                usuarios.add(user);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ois.close();
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

//********************************************************************************************************//      
   
    public void armazenarGastos( Usuario usuario ) {
        String nomeArquivo = "gastos.txt";
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        ArrayList<Gastos> gastos = usuario.getGastos();
        try {
            fos = new FileOutputStream(nomeArquivo);
            oos = new ObjectOutputStream(fos);
            oos.writeInt(gastos.size());
            for (int i = 0; i < gastos.size(); i++) {
                oos.writeObject(gastos.get(i));
            }
        } catch (IOException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                oos.close();
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

 //********************************************************************************************************//    
   
    public void recuperaGastos( Usuario usuario ) {
        String nomeArquivo = "gastos.txt";
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        ArrayList<Gastos> gastos = new ArrayList<Gastos>();
        
        try {
            fis = new FileInputStream(nomeArquivo);
            ois = new ObjectInputStream(fis);
            gastos.clear();
            int numLivros = ois.readInt();
            for (int i = 0; i < numLivros; i++) {
                Gastos gasto = (Gastos) ois.readObject();
                gastos.add(gasto);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ois.close();
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        usuario.setGastos(gastos);
    }

//********************************************************************************************************//      
  
    public void armazenarRendas( Usuario usuario ) {
        String nomeArquivo = "rendas.txt";
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        ArrayList<Renda> rendas = usuario.getRendas();
        try {
            fos = new FileOutputStream(nomeArquivo);
            oos = new ObjectOutputStream(fos);
            oos.writeInt(rendas.size());
            for (int i = 0; i < rendas.size(); i++) {
                oos.writeObject(rendas.get(i));
            }
        } catch (IOException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                oos.close();
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

 //********************************************************************************************************//    
    public void recuperaRendas( Usuario usuario ) {
        String nomeArquivo = "rendas.txt";
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        ArrayList<Renda> rendas = new ArrayList<Renda>();
        
        try {
            fis = new FileInputStream(nomeArquivo);
            ois = new ObjectInputStream(fis);
            rendas.clear();
            int numLivros = ois.readInt();
            for (int i = 0; i < numLivros; i++) {
                Renda renda = (Renda) ois.readObject();
                rendas.add(renda);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ois.close();
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        usuario.setRendas(rendas);
    }
    
     public void armazenarConta( Usuario usuario ) {
        String nomeArquivo = "contas.txt";
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        ArrayList<Conta> contas = usuario.getContas();
        try {
            fos = new FileOutputStream(nomeArquivo);
            oos = new ObjectOutputStream(fos);
            oos.writeInt(contas.size());
            for (int i = 0; i < contas.size(); i++) {
                oos.writeObject(contas.get(i));
            }
        } catch (IOException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                oos.close();
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
     
     
     
     public float planejarInvestimento(float valor, float valorMensal){
        
        return valor/valorMensal;
    }

 //********************************************************************************************************//    
    public void recuperaConta( Usuario usuario ) {
        String nomeArquivo = "contas.txt";
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        ArrayList<Conta> contas = new ArrayList<Conta>();
        try {
            fis = new FileInputStream(nomeArquivo);
            ois = new ObjectInputStream(fis);
            contas.clear();
            int numLivros = ois.readInt();
            for (int i = 0; i < numLivros; i++) {
                Conta conta = (Conta) ois.readObject();
                contas.add(conta);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ois.close();
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        usuario.setContas(contas);
    }
    
  //********************************************************************************************************//    
    public void armazenarCategorias() {
        String nomeArquivo = "categorias.txt";
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(nomeArquivo);
            oos = new ObjectOutputStream(fos);
            oos.writeInt(categorias.size());
            for (int i = 0; i < categorias.size(); i++) {
                oos.writeObject(categorias.get(i));
            }
        } catch (IOException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                oos.close();
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    
    //********************************************************************************************************//
    public float gastosPorCategoria(Usuario usuario, Categoria categoria){
        float totalGasto=0;
        
        ArrayList<Gastos> gastos = usuario.getGastos();
        
        for(int i=0; i<gastos.size();i++)
        {
            if(gastos.get(i).getCategoria().getNome().equals(categoria.getNome()))
                totalGasto += gastos.get(i).getValor();
                
        }
              
        
        return totalGasto;
        
    }
    
    
    public DefaultPieDataset dadosGrafico(Usuario usuario){
        
        DefaultPieDataset result = new DefaultPieDataset(); 
        float totalGasto=0;
             
        for(int i=0;i<categorias.size();i++){            
            totalGasto = gastosPorCategoria(usuario,categorias.get(i));
            
            if(totalGasto>0)
            result.setValue(categorias.get(i).getNome(), totalGasto);
             
        }
        return result;
    }

 //********************************************************************************************************//    
    public void recuperaCategorias() {
        String nomeArquivo = "categorias.txt";
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(nomeArquivo);
            ois = new ObjectInputStream(fis);
            this.categorias.clear();
            int numLivros = ois.readInt();
            for (int i = 0; i < numLivros; i++) {
                Categoria categoria = (Categoria) ois.readObject();
                categorias.add(categoria);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ois.close();
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

  //********************************************************************************************************//     
  /*  public ArrayList<Gastos> buscaGastosData(Usuario usuario, Date ini, Date fim){
        
       ArrayList<Gastos> gastosPeriodo = new ArrayList(); 
       ArrayList<Gastos> gastos= usuario.getGastos();
       Date data=null;
       
       for(int i=0; i<gastos.size();i++){
           data = gastos.get(i).getDataEmissao();
           if(data.after(ini) && data.before(fim))
               gastosPeriodo.add(gastos.get(i));
           
                       }
       
       return gastosPeriodo;
    }*/
//********************************************************************************************************//
    public ArrayList<Gastos> buscaGastosMes( Usuario usuario ) {
        ArrayList<Gastos> gastos = usuario.getGastos();
        ArrayList<Gastos> retorno = new ArrayList<Gastos>();
        Date dataAtual = new Date(), data;
        //SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        
        if ( gastos != null )
        for( int i = 0; i < gastos.size(); i++ )
            if (  gastos.get(i).getDataEmissao().getMonth() == dataAtual.getMonth() )
                retorno.add( gastos.get(i) );
        
        return retorno;
    }
    
    
   /* public String relatorioGastos(Usuario usuario, Date ini, Date fim){
        
       ArrayList<Gastos> gastosPeriodo= buscaGastosData(usuario,ini,fim);
       String rel = "..:: Relatorio de Gastos por Periodo ::..\n";
       float total=0;
       for(int i=0; i<gastosPeriodo.size();i++){
           rel+= gastosPeriodo.get(i).toString()+"\n";
           total+=gastosPeriodo.get(i).getValor();
       
       }
       
       rel+="Total...................................................."+total;
        return rel;
    }
    
    
    
  */  
} 


/*
    public void registrarUsuario(String nome, Date dataNascimento, String login, String senha) {
        this.usuarios.add(new Usuario(nome, dataNascimento, login, senha));
        System.out.println("nome : " + nome);

    }

    public void registrarRenda(String descricao, float valor) {
        this.rendas.add(new Renda(descricao, valor));
        System.out.println("renda : " + descricao);

    }


    public void registrarGasto(String descricao, float valor, Date dataEmissao, Categoria categoria) {
        this.gastos.add(new Gastos(descricao, valor, dataEmissao, categoria));
        System.out.println("gasto : " + descricao);

    }
    
    public void registrarCategoria(String nome) {
        this.categorias.add(new Categoria(nome));
        System.out.println("nome : " + nome);

    }    
    

    public void registrarConta( Conta conta ) {
        this.contas.add( conta );
    }
    
    public Usuario buscarUsuario( String nome ) {
        for( Usuario user: usuarios )
            if( user.getNome().equals(nome) )
                return user;
        
        return null;
    }
    
    public Conta buscarConta( String numConta ) {
        for( Conta cont: contas )
            if( cont.getNumConta().equals(numConta) )
                return cont;
        
        return null;
    }
    


    public short autenticarUsuario(String nome, String senha) {
        Usuario user;
        boolean possuiUsuario = false;
        
        for (int i = 0; i < usuarios.size(); i++) {
            if( usuarios.get(i).getNome().equals(nome) )
                possuiUsuario = true;
            
            if (usuarios.get(i).getNome().equals(nome) && usuarios.get(i).getSenha().equals(senha)) {
                return 1;
            }
        }
        
        if ( possuiUsuario == true )
            return 0;
        else
            return -1;
    }

    */