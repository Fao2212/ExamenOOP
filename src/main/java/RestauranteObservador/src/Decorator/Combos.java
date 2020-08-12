/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

import Modelo.Factura;

/**
 *
 * @author Fernando Alvarez
 */
public interface Combos {
    
    public String getComboInformation();
    public double getComboPrice();    
    public void agregarLinea(String name,double precio);
    public Factura getFactura();
}
