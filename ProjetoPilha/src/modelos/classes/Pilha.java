/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.classes;
import modelos.interfaces.IPilha;


/**
 *
 * @author natalle.santos
 */


public class Pilha  implements IPilha {
    //Atributos 
    
    private int tamanho = 0;
    private int [] array = null;
    private int topo = -1; 
    
     
    
    
    //Métodos
    
public Pilha (int tamanho)throws Exception{ // throws vai ser implementado dentro de um try catch
    if(tamanho <=0 ) throw new Exception ("Tamanho da pilha não pode ser <=0");
    // se o tamanho for maior que 0 segue 
    array = new int [tamanho]; // criando o array
        if (array == null) throw new Exception ("Pilha não será criada"); // pensando em uma exceção caso dê errado a criação do array
    this.tamanho = tamanho; // armazenando o valor do tamanho no array.
              
}    

    @Override
    public void incluir(int elemento) throws Exception {
         if (estaCheia() ){
             throw new Exception("A pilha está cheia");
        }    
        topo = topo+1;
         array[topo] = elemento; 
       }
       
    

    @Override
    public void remover() throws Exception {
        if (estaVazia()) {
            throw new Exception("A pilha está vazia");
        }
        topo--;        
}

    @Override
    public int acessar()throws Exception {
        if (estaVazia()) {
            throw new Exception("Pilha está vazia");
        }
        return array [topo];        
    } 

    @Override
    public boolean estaVazia() {
        
      return topo== -1;
      
       
    }

    @Override
    public boolean estaCheia() {
        return topo == tamanho -1; 
        
       
    }

    @Override
    public int obterOcupacao() {
        return topo + 1; 
    }

    @Override
    public String obterTodosOsElementos() throws Exception {
        if (estaVazia()) {
            throw new Exception("A pilha está errada");
        }
        StringBuilder elementos = new StringBuilder();
        for (int i = 0; i <= topo; i++) {
            elementos.append(array[i]).append(" ");
        }
        return elementos.toString().trim();
    }
    
}
