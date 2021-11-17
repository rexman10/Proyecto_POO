/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alex_
 */
public class Persona {
    protected String nombre;
    protected String direccion;
    protected String telefono;
    protected Ciudad ciudad;

    public Persona(){
        
    }

    public Persona(String n, String d, String t, Ciudad c){
        this.nombre = n;
        this.direccion = d;
        this.telefono = t;
        this.ciudad = c;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) {
            return true;            
        }
        if (obj != null && obj instanceof Persona) {
            Persona comparacion = (Persona) obj;
            return nombre.equals(comparacion.nombre);       
        }
        return false;
    }

}
