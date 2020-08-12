/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

import Modelo.Adicional;
import Modelo.Combo;
import Modelo.Factura;

/**
 *
 * @author Fernando Alvarez
 */
public class AddExtraDecorator implements Combos{
    
    Combos combo;
    Adicional adicional;
    Factura factura;
    
    public AddExtraDecorator(Combos combo,Adicional adicional){
        this.combo = combo;
        this.adicional = adicional;
        this.factura = combo.getFactura();
        agregarLinea(adicional.getName(), adicional.getPrecio());
    }

    @Override
    public String getComboInformation() {
        return this.combo.getComboInformation()+"+"+adicional.getName();
    }

    @Override
    public double getComboPrice() {
        return this.combo.getComboPrice()+adicional.getPrecio();
    }

    @Override
    public void agregarLinea(String name, double precio) {
        factura.addToLine(name, precio);
    }

    @Override
    public Factura getFactura() {
        return factura;
    }
    
    @Override
    public String toString(){
        return combo.toString();
    }
    
    
}
