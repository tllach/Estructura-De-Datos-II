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
public class Cliente extends Persona {
    
    private int compras;
    
    public Cliente(String nombre, String apellido, long id, int compras){
        this.setTipo("Cliente");
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setId(id);
        this.compras = compras;
    }
    
    public int getCompras(){
        return this.compras;
    }
    
    public void setCompras(int compras){
        this.compras = compras;
    }
    
}
