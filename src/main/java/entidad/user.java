/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class user {
    private String name;
    private String tipeUser;
    private ArrayList<listaTablas> listaTable;
    
    
    
}

class listaTablas{
    String nombre;
    String tipoDatos;
    int cantDatos;
    
    public listaTablas(String name, String tipoDato, int cantDato){
        this.nombre=name;
        this.tipoDatos = tipoDato;
        this.cantDatos = cantDato;
        
        
        
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
    }
    
    
}
