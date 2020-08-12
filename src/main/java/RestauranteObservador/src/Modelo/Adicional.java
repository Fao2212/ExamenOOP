/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Fernando Alvarez
 */
public class Adicional implements Cloneable{
    
    String name;
    double precio;

    public Adicional(String name, double precio) {
        this.name = name;
        this.precio = precio;
    }

    
    
    
    @Override
    protected Adicional clone() {
        return new Adicional(name, precio);
    }

    public double getPrecio() {
        return precio;
    }
    
    public String getName(){
        return name;
    }
    
}
