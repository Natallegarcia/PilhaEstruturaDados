/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.classes;
import java.util.Random;
import  modelos.classes.Pilha;

/**
 *
 * @author natalle.santos
 */

public class OrdenacaoPilha  {
    
    
  private int tamanho ;
    private int [] arrayOriginal = null; //array aleatório
    
    private Pilha pilha;
    
    
public OrdenacaoPilha (int tamanho) throws Exception {
    if (tamanho <=0) throw new Exception ("Tamanho não pode ser <=0");
    this.tamanho = tamanho; 
    
    arrayOriginal = new int [tamanho];

    

    Random aleatorios = new Random ();
    
    
            for (int pos = 0; pos < tamanho; pos++){
                arrayOriginal[pos] = aleatorios.nextInt(1000);
              
            }
            
         pilha = new Pilha(tamanho);
            
}    
public String obterConjunto(){
    // conjunto aleatório que será armazenado no array 
String saida = " ";
    for (int pos = 0; pos < tamanho; pos++){
        saida +=arrayOriginal [pos] + " | ";
    }
    return saida;
}

   public void ordenarComPilha() throws Exception {
        // Passo 1: Inserir elementos no array original na pilha de forma ordenada
        for (int i = 0; i < tamanho; i++) {
            inserirOrdenadoNaPilha(arrayOriginal[i]);
        }

        // Passo 2: Remover elementos da pilha e colocá-los de volta no array
        for (int i = 0; i < tamanho; i++) {
            arrayOriginal[i] = pilha.acessar(); // Acessa o topo da pilha
            pilha.remover(); // Remove o elemento do topo
        }
    }



  private void inserirOrdenadoNaPilha(int elemento) throws Exception {
        //cópia da pilha principal 
        
        Pilha pilhaTemporaria = new Pilha(tamanho);
          //verifica se a pilha principal está vazia 
          while (!pilha.estaVazia() && pilha.acessar() > elemento) {
        pilhaTemporaria.incluir(pilha.acessar());
        pilha.remover();
    }

   
    pilha.incluir(elemento);

   
    while (!pilhaTemporaria.estaVazia()) {
        pilha.incluir(pilhaTemporaria.acessar());
        pilhaTemporaria.remover();
    }
}
  
 public String obterOdernado (){
             
    
     StringBuilder saida = new StringBuilder();
        for (int pos = 0; pos < tamanho; pos++) {
            saida.append(arrayOriginal[pos]).append(" | ");
        }
        return saida.toString();

} 
          
}
