/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lugares.modelos;

/**
 *
 * @author HP
 */
public class Lugar {
    private String nombre;

    // Constructor
    public Lugar(String n) {
        this.nombre = n;
    }
    //ToString
    @Override
    public String toString(){
        return "Lugar: "+nombre;
    }
    
    
    
    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
