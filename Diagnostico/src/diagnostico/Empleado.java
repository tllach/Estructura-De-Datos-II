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
public class Empleado extends Persona{
    
    private float salario;
    
    public Empleado(String nombre, String apellido, long id, float salario){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setId(id);
        this.salario = salario;
    }
    
    public float getSalario(){
        return this.salario;
    }
    
    public void setSalario(float salario){
        this.salario = salario;
    }
}
