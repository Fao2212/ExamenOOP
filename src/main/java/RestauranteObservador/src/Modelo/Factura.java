/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Fernando Alvarez
 */
public class Factura {
    
    String factura;

    public Factura() {
        factura = "Factura\n";
    }
    
    public void addToLine(String name,double precio){
        factura+=name+" "+String.valueOf(precio)+"\n";
    }
    
    
    public String getFactura(){
        return factura;
    }
}
