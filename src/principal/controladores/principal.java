/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.controladores;

import idiomas.modelos.idioma;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class principal {
    public static void main(String[] args) {
        
        /*Grupo g=new Grupo("GrupoA","Laboratorios");
        g.mostrarGrupo();
        */
        idioma idd1=new idioma("Italiano");
        idioma idd2=new idioma("Frances");
        idioma idd3=new idioma("Portugues");
        //System.out.println(idd1);
        ArrayList<idioma> l_idd=new ArrayList<>();
        l_idd.add(idd1);
        l_idd.add(idd2);
        l_idd.add(idd3);
        for(idioma d: l_idd){
            System.out.println(d);
        }
        
    /*
        Lugar l = new Lugar("Congreso");
        System.out.println(l);
        
        PalabraClave pc=new PalabraClave("Tecnología");
        System.out.println(pc);
        
        // Falta Tipo
        
        Profesor pro=new Profesor(99999999, "Lopez", "Maxi", "1234", "Full");
        pro.mostrarProf();
     */
    }
}
