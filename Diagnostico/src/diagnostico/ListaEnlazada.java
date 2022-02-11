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
public class ListaEnlazada {
    
    public Nodo ptr;
    public Nodo ult;
    public int tam;
    
    public ListaEnlazada(){
        ptr = new Nodo(null);
        ult = ptr;
        tam = 0;
    }
    
    public void agregar(Persona persona){
        Nodo n = new Nodo(persona);
        if(ptr == null){
            ptr = n;
            ult = n;
        }else{
            ult.link = n;
            ult = n;
        }
        tam++;
    }
    
    public Persona obtener(int index){
        
        if(index >= tam){
            throw new IndexOutOfBoundsException();
        }
        
        Nodo nodo = ptr;
        
        for(int j = 0; j < index; j++){
            nodo = nodo.link;
        }
        
        return nodo.persona;
    }
    
    
    public void mostrar(){
        Nodo current = ptr;
        
        if(current == null){
            System.out.println("The list is empty");
            return;
        }
        System.out.println("The nodes of the singly linked list are: ");
        
        while(current.link != null){
            System.out.print(current.link.persona.getNombre() +" -> ");
            current = current.link;
        }
        if(current == null)
            System.out.print("null\n");
        
    }
    
    public int getTam(){
        return tam;
    }
    
}
