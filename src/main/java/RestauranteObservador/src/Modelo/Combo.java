/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Decorator.Combos;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Fernando Alvarez
 */
public class Combo implements Combos,Cloneable{
    
    String name;
    double price;
    Factura factura;

    public Combo(String name, double price) {
        this.name = name;
        this.price = price;
        this.factura = new Factura();
        factura.addToLine(name, price);
    }
   
    @Override
    protected Combo clone() {
        return new Combo(name, price);
    }

    @Override
    public String getComboInformation() {
        return this.name;
    }

    @Override
    public double getComboPrice() {
        return this.price;
    }
    
    @Override
    public void agregarLinea(String name,double precio){
        factura.addToLine(name, precio);
    }
    
    @Override
    public String toString(){
        return name;
    }

    @Override
    public Factura getFactura() {
        return factura;
    }
    
    
}
