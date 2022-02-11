/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagnostico;

import javax.swing.JFrame;

/**
 *
 * @author tllach
 */
public class Diagnostico {
    
    
    public static ListaEnlazada listaPersonas;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Pedro", "Perez", 2399229l, 10290f);
        Empleado e2 = new Empleado("Mario", "Morales", 23999l, 2949434f);
        Empleado e3 = new Empleado("Daniela", "Povea", 239929l, 19302f);
        Empleado e4 = new Empleado("Alex", "Russo", 23229l, 10209f);
        Empleado e5 = new Empleado("Selena", "Gomez", 239229l, 9999f);
        
        listaPersonas = new ListaEnlazada();
        
        listaPersonas.agregar(e1);
        listaPersonas.agregar(e2);
        listaPersonas.agregar(e3);
        listaPersonas.agregar(e4);
        listaPersonas.agregar(e5);
        
        Frame frame = new Frame();
        frame.setVisible(true);
        frame.setSize(700,450);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Tu Lista Enlazada");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        listaPersonas.mostrar();
        
    }
    
}
