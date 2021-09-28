/*
 * Copyright (C) 2021 HP
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package palabrasclaves.modelos;

/**
 *
 * @author HP
 */
public class PalabraClave {
    private String nombre;
    //Constructor
    public PalabraClave(String n) {
        this.nombre = n;
    }
    //ToString
    @Override
    public String toString(){
        return "Palabra Clave: "+nombre;
    }

    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

}
