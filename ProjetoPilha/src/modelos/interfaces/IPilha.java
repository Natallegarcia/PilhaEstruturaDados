/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelos.interfaces;

/**
 *
 * @author natalle.santos
 */
public interface IPilha {
    
    public void incluir (int elemento ) throws Exception;
    public void remover ()throws Exception;
    public int  acessar()throws Exception;
    public  boolean estaVazia();
    public boolean estaCheia();        
    public int obterOcupacao(); // quase um get
    public String obterTodosOsElementos () throws Exception;
    
    
}