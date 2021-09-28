/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idiomas.modelos;

/**
 *
 * @author HP
 */
public class idioma {
    private String nombre;

    //Constructor
    public idioma(String n) {
        this.nombre = n;
    }
    
    
    @Override
    public String toString(){
        return "idioma: "+ nombre;
    }

    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
