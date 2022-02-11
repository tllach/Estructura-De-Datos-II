/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagnostico;

/**
 *
 * @author tllach
 */
public class Nodo {
    
    public Persona persona;
    public Nodo link;
    
    public Nodo(Persona dato){
        this.persona = dato;
        this.link = null;
    }
    
    
}
