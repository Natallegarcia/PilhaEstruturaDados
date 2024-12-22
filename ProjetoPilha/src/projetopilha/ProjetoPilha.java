/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetopilha;
import modelos.classes.Pilha;

/**
 *
 * @author natalle.santos
 */
public class ProjetoPilha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        Pilha teste = new Pilha (4);
        teste.incluir(1);
        teste.incluir(2);
        //teste.incluir(3);
        teste.obterTodosOsElementos();
        
        
    }
    
}
 