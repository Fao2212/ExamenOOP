/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Decorator.AddExtraDecorator;
import Decorator.Combos;
import GUI.PantallaCliente;
import Observer.ISubject;

/**
 *
 * @author Fernando Alvarez
 */
public class Customer implements ISubject{
    
    Restaurante restaurante;
    Combos combo;
    PantallaCliente pantalla;

    public Customer(Restaurante restaurante,String name) {
        this.restaurante = restaurante;
        this.pantalla = new PantallaCliente(this,name);
        this.pantalla.setVisible(true);
    }
    
    public void selectCombo(String string){
        System.out.println(string+"LL");
        if(combo == null)
            combo = restaurante.getCombo(string);
    }
    
    public void agregarAdicional(String string){
        System.out.println(string);
        combo = new AddExtraDecorator(combo,restaurante.getAdicional(string));
        System.out.println(combo.toString());
    }

    @Override
    public void Notify(Combos combo) {
        System.out.println(combo+"xddd");
        restaurante.update(combo);
    }
    
    public Restaurante getRestaurante(){
        return restaurante;
    }
    
    public Combos getCombo(){
        return combo;
    }
    
    public void resetCombo(){
        this.combo = null;
    }
    
}
