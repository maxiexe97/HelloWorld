/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupos.modelos;

/**
 *
 * @author HP
 */
public class Grupo {
    private String nombre;
    private String descripcion;
    
    public void mostrarGrupo(){
        System.out.println("Nombre: "+nombre+ " || Descripcion: "+descripcion);
    }

    public Grupo(String n, String d) {
        this.nombre = n;
        this.descripcion = d;
    }
    
    // Nombre
    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    // Descripcion
    public String verDescripcion() {
        return descripcion;
    }

    public void asignarDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
